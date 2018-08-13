package stage.Orders.IN;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import BaseClass.BaseClass_Login;
import BaseClass.Navigation;
import BasePageOptions.Orders;
import BasePageOptions.Products;
import PageBuilder.DomainNamePage;
import PageBuilder.PageBuilderPage;
import PageBuilder.PaymentOptionsPage;
import PageBuilder.ReadyToPublishPage;
import SignUp.BusinessInfo;
import SignUp.SignUp;
import SignUp.SignUpWindow;
import TemplateCategories.BlankTemplate;
import Website.HomePage;
import Website.ProductShippingDetails;
import Website.WebPayments;

public class MarkAsDeliveredForOrder extends BaseClass_Login{
	
	String productName="Product1";
	String productSellingPrice="100.00";
	String firstName=RandomStringUtils.randomAlphabetic(5), lastName=RandomStringUtils.randomAlphabetic(3);
	String order_id="";

	public MarkAsDeliveredForOrder() throws IOException, InvalidFormatException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void testMethod() throws InterruptedException {
		signup_test();
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
		createOrder();
		driver.switchTo().window(tabs.get(0));
		cancelOrder();
	}
	
	public void signup_test() throws InterruptedException {
		SignUp s = new SignUp(driver);
		s.clickSignUpGetStarted();
		
		BlankTemplate blankTemplate = new BlankTemplate(driver);
		blankTemplate.clickEditTemplate();		
		
		SignUpWindow signUpWindow=new SignUpWindow(driver);
		signUpWindow.addEmail("testshop_"+RandomStringUtils.randomAlphanumeric(5)+"@testshop.com");
		signUpWindow.addPassword("Tester123*");
		signUpWindow.addPhone("1111111111");
		signUpWindow.addEnvPassCode();
		signUpWindow.clickSubmit();
		Thread.sleep(5000);
		AssertJUnit.assertEquals(Navigation.getTitle(driver), "Welcome to Shopmatic");
		
		BusinessInfo businessInfo = new BusinessInfo(driver);
		businessInfo.addFirstName(firstName);
		businessInfo.addLastName(lastName);
		businessInfo.addStoreName(firstName+"store");
		businessInfo.clickNext();
		Thread.sleep(3000);
		
		businessInfo.clickBusinessAddressSearchButton();
		Thread.sleep(1000);
		businessInfo.addBusinessStreet(firstName);
		businessInfo.addBusinessCity(RandomStringUtils.randomAlphabetic(5));
		businessInfo.addBusinessState(RandomStringUtils.randomAlphabetic(5));
		businessInfo.addBusiness_Pincode(RandomStringUtils.randomNumeric(6));
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
		
		PaymentOptionsPage paymentOptionsPage = new PaymentOptionsPage(driver);
		paymentOptionsPage.enableCODPayment();
	    Thread.sleep(10000);
	    
	    Navigation.clickNext(driver);
		Thread.sleep(10000);
		
		Navigation.clickNext(driver);
		Thread.sleep(10000);
		
		Assert.assertTrue(Navigation.getTitle(driver).contentEquals("Ready to publish"));
		
		ReadyToPublishPage readyToPublishPage = new ReadyToPublishPage(driver);
		readyToPublishPage.clickPublishSite();
	}
	
	public String cust_fname=RandomStringUtils.randomAlphabetic(6);
	public String cust_lname=RandomStringUtils.randomAlphabetic(4);
	public String cust_street=RandomStringUtils.randomAlphanumeric(20);
	public String cust_city="Ranebennur Bazar";
	public String cust_state="Karnataka";
	public String cust_pincode=RandomStringUtils.randomNumeric(6);
	public String cust_phone=RandomStringUtils.randomNumeric(10);
	
	public void createOrder() throws InterruptedException {
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
	    webPayments.choosePaymentMethod("CASH ON DELIVERY");
	    Thread.sleep(3000);
	    webPayments.clickPlaceOrder();
	    Thread.sleep(5000);
	    order_id=productShippingDetails.getOrderID();
	}
	
	public void cancelOrder() throws InterruptedException {
		PageBuilderPage pb=new PageBuilderPage(driver);
		pb.clickDashboard();
		pb.clickOrders();
		
		Orders orders=new Orders(driver);
		orders.selectActionsForOrder(order_id);
		orders.clickMarkAsDeliveredForOrder(order_id);
		orders.clickConfirm();
		Thread.sleep(5000);
		Assert.assertTrue(orders.getMessage().contentEquals("Order #"+order_id+" is marked as delivered"));
	}
	

}
