/***
 * 1) Launch the URL - goshopmatic.com.
2) Click on Signup
3) Choose category as ' Blank Template'
4) Hover on blank template > click on 'Edit with this template'
5) fill signup form with details (email, password and phone)
6) Add sample product with minimum details (Product name, selling price)
7) Click ' Skip Editing'
8)Add customized domain name and click confirm.
9) Enable 'offline payment' for domestic -> click Next
8) Click Next on 'Shipping setup'
9) Click on 'Publish site'
10) Switch to another tab and verify the website address
 */
package MyShopmatic.NI;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import BaseClass.BaseClass;
import BaseClass.Navigation;
import BasePageOptions.Products;
import BasePageOptions.Setup.Store;
import BasePageOptions.Setup.TaxesPage;
import PageBuilder.DomainNamePage;
import PageBuilder.PageBuilderPage;
import PageBuilder.PaymentOptionsPage;
import PageBuilder.ReadyToPublishPage;
import PageBuilder.ShippingOptionsPage;
import PageBuilder.Shipping.Aramex;
import PageBuilder.payments.NeoPage;
import SignUp.BusinessInfo;
import SignUp.SignUp;
import SignUp.SignUpWindow;
import TemplateCategories.AllTemplate;
import Website.HomePage;
import Website.ProductShippingDetails;
import Website.WebPayments;

public class SignUpWithBlankTemplateNeoEnabledAllShippingOptions extends BaseClass{
	
	String productName="Product1";
	String productSellingPrice="100.00";
	String firstName=RandomStringUtils.randomAlphabetic(5), lastName=RandomStringUtils.randomAlphabetic(3);
	String email="testshop_"+RandomStringUtils.randomAlphanumeric(5)+"@testshop.com";
	
	String productName1="Product9";
	String sellingPrice="132.00";
	String originalPrice="150";
	String productDesc="productDesc";
	String categoryName="category1";
	String qty="100";
	
	String vatRate="6.5";
	TaxesPage tax;
	PageBuilderPage pb;
	
	public SignUpWithBlankTemplateNeoEnabledAllShippingOptions() throws IOException, InvalidFormatException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void testMethod_stage() throws InterruptedException {
		SignUp s = new SignUp(driver);
		s.clickSignUpGetStarted();
		
		AllTemplate blankTemplate = new AllTemplate(driver);
		Thread.sleep(3000);
		blankTemplate.clickEditClothingTemplate(1);		
		
		SignUpWindow signUpWindow=new SignUpWindow(driver);
		signUpWindow.addEmail(email);
		System.out.println("email: "+email+"\npassword: "+"Tester123*");
		signUpWindow.addPassword("Tester123*");
		signUpWindow.addPhone("111111111");
		
		signUpWindow.selectTos();
		signUpWindow.clickSubmit();
		Thread.sleep(5000);
		AssertJUnit.assertEquals(Navigation.getTitle(driver), "Welcome to Go-Online");
		
		BusinessInfo businessInfo = new BusinessInfo(driver);
		businessInfo.addFirstName(firstName);
		businessInfo.addLastName(lastName);
		businessInfo.addStoreName(firstName+"store");
		businessInfo.clickNext();
		Thread.sleep(3000);
		
		businessInfo.clickBusinessAddressSearchButton();
		Thread.sleep(1000);
		businessInfo.addBusinessStreet(firstName);
		businessInfo.addBusinessCity(RandomStringUtils.randomAlphabetic(4));
		businessInfo.addBusinessPONumber(RandomStringUtils.randomNumeric(5));
		businessInfo.clickBusinessFormAddressNextButton();
		Thread.sleep(10000);
		
		Products products = new Products(driver);
		products.clickProductsOption();
		Thread.sleep(3000);
		products.addProductsName(productName);
		products.addSellingPrice(productSellingPrice);
		products.clickSave();
		Thread.sleep(3000);
		products.clickSkipEditing();
		Thread.sleep(3000);
		
		DomainNamePage domainNamePage = new DomainNamePage(driver);
		Thread.sleep(3000);
		domainNamePage.confirmDomainName();
		Thread.sleep(3000);
		
		Assert.assertTrue(Navigation.getTitle(driver).contentEquals("Ready to publish"));
		
		ReadyToPublishPage readyToPublishPage = new ReadyToPublishPage(driver);
		readyToPublishPage.clickPublishSite();
		
		 Thread.sleep(2000);
		
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	    driver.close();
	    driver.switchTo().window(tabs.get(0));
	    Thread.sleep(5000);
	    
		pb = new PageBuilderPage(driver);
		pb.clickDashboard();
		pb.selectSetUp();
		pb.clickPayment();
		Thread.sleep(5000);
		
		PaymentOptionsPage paymentOptionsPage= new PaymentOptionsPage(driver);
		paymentOptionsPage.enableNeoPayment();
		Thread.sleep(5000);
		
		NeoPage neoPage=new NeoPage(driver);
		neoPage.clickMerchantId();
		neoPage.clickSecretKey();
		neoPage.clickSubmit();
		
		pb.clickDashboard();
		pb.selectSetUp();
		pb.clickShipping();
		
		ShippingOptionsPage  shippingOptionsPage =  new ShippingOptionsPage(driver);
		shippingOptionsPage.clickAramex_Domestic();
		Thread.sleep(2000);
		
		 Aramex aramex=new Aramex(driver);
		 aramex.clickAccount();
		 Thread.sleep(3000);
		 tabs = new ArrayList<String> (driver.getWindowHandles());
		 driver.switchTo().window(tabs.get(1));
		 driver.close();
		 driver.switchTo().window(tabs.get(0));
		 aramex.addUsername();
		 aramex.addPassword();
		 aramex.addAccountNumber();
		 aramex.addAccountPin();
		 aramex.selectAramexEntity();
		 aramex.clickUpdate();
		 Thread.sleep(5000);
		 
		 shippingOptionsPage.addSelfCollectDetails("Tenth-12th Floors, Baniyas Road, Deira, PO Box 594, Dubai, UAE\n" + 
		 		"Telephone: (4) 223 0000. Fax: (4) 223 0022.");
		 shippingOptionsPage.clickEnableSelfCollect();
		 Thread.sleep(2000);
		 
		 shippingOptionsPage.clickInternatioanlShippingTab();		 
		 shippingOptionsPage.clickOwnShipping_International();
		 shippingOptionsPage.clickConfirm();
				 Thread.sleep(5000);
				 
		addProducts();
		enableTaxes();
		enableStore();
		//addDiscount();
		readyToPublishPage.clickViewSite();
		Thread.sleep(5000);
		tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
		createOrder();
	}
	String discountName=RandomStringUtils.randomAlphabetic(8);
	String discount=RandomStringUtils.randomNumeric(1);
	
	public String cust_fname=RandomStringUtils.randomAlphabetic(6);
	public String cust_lname=RandomStringUtils.randomAlphabetic(4);
	public String cust_street="Mussafah Industial Area";
	public String cust_city="Ranebennur Bazar";
	public String cust_state="Karnataka";
	public String cust_pincode=RandomStringUtils.randomNumeric(6);
	public String cust_phone=RandomStringUtils.randomNumeric(10);
	String order_id="";
	
	private void createOrder() throws InterruptedException{
		// TODO Auto-generated method stub
		HomePage homePage=new HomePage(driver);
	    homePage.clickAllProducts();
	    homePage.clickSelectProduct(1);	    
	    Thread.sleep(3000);
	    
	    ProductShippingDetails productShippingDetails = new ProductShippingDetails(driver);
	    productShippingDetails.clickAddToCart();
	    Thread.sleep(3000);
	    productShippingDetails.clickCheckout();
	    productShippingDetails.addEmailToCart(RandomStringUtils.randomAlphanumeric(5)+"@"+RandomStringUtils.randomAlphabetic(5)+".com");
	    productShippingDetails.clickContinue();
	    productShippingDetails.addFirstName(cust_fname);
	    productShippingDetails.addLastName(cust_lname);
	    productShippingDetails.addStreetAddr(cust_street);
	    productShippingDetails.addCity(cust_city);
	    productShippingDetails.addState(cust_state);
	    productShippingDetails.addPostCode(cust_pincode);
	    productShippingDetails.addPhone(cust_phone);
	    Thread.sleep(2000);
	    
	    productShippingDetails.clickShippingContinue();
	    Thread.sleep(2000);
	    
	    productShippingDetails.selectShippingMethod("standard_shipping");
	    productShippingDetails.clickShippingContinue();
	    Thread.sleep(2000);
	    
	    WebPayments webPayments=new WebPayments(driver);
	    webPayments.choosePaymentMethod("CREDIT / DEBIT CARD");
	    Thread.sleep(3000);
	   /* webPayments.clickPlaceOrder();
	    Thread.sleep(5000);
	    order_id=productShippingDetails.getOrderID();*/
	}

	private void enableStore() throws InterruptedException{
		// TODO Auto-generated method stub
		pb=new PageBuilderPage(driver);
		pb.clickDashboard();
		pb.selectSetUp();
		pb.clickStore();
		Thread.sleep(5000);
		
		Store s = new Store(driver);
		s.clickProductPaymentAndShipping();
		Thread.sleep(5000);
		s.clickEnableCommerceWithSelectedOption();
		Thread.sleep(2000);
	}

	private void enableTaxes() throws InterruptedException{
		// TODO Auto-generated method stub
		pb=new PageBuilderPage(driver);
		pb.clickDashboard();
		pb.selectSetUp();
		pb.clickTaxes();
		Thread.sleep(5000);
		
		tax=new TaxesPage(driver);
		tax.clickVATCheckbox();
		tax.addVatRate(vatRate);
		tax.showVatNumCheckbox();
		tax.addVatNum("VAT635456");
		tax.clickSaveChanges();
		Thread.sleep(3000);
		Assert.assertTrue(tax.getMessage().contains("The default VAT/Tax tax is successfully changed to "));
	}

	private void addProducts() throws InterruptedException{
		// TODO Auto-generated method stub
		pb = new PageBuilderPage(driver);
		Thread.sleep(2000);
		pb.clickDashboard();
		pb.clickProducts();
		
		Products products = new Products(driver);
		products.clickAddProduct();
		Thread.sleep(2000);
		products.addProductsName(productName1);
		products.addSellingPrice(sellingPrice);
		products.addOriginalPrice(originalPrice);
		products.addProductDescription(productDesc);
		products.addCategory(categoryName);
		products.addTotalStockQty(qty);
		Thread.sleep(7000);
		products.clickSave();
		Thread.sleep(5000);
		Assert.assertTrue(products.isProductPresent(productName), "Product is not present in the list");
	}

}
