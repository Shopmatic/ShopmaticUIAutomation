package stage.Orders.IN;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
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
import OrderShippingOptions.ShipViaShipyaari;
import PageBuilder.DomainNamePage;
import PageBuilder.PageBuilderPage;
import PageBuilder.PaymentOptionsPage;
import PageBuilder.ReadyToPublishPage;
import PageBuilder.ShippingOptionsPage;
import PageBuilder.Shipping.Shipyaari;
import SignUp.BusinessInfo;
import SignUp.SignUp;
import SignUp.SignUpWindow;
import TemplateCategories.AllTemplate;
import Website.HomePage;
import Website.ProductShippingDetails;
import Website.WebPayments;

public class CreateOrdersAndScheduletoShipViaShipyaari extends BaseClass_Login{
	
	String productName="Product1";
	String productSellingPrice="100.00";
	String firstName=RandomStringUtils.randomAlphabetic(5), lastName=RandomStringUtils.randomAlphabetic(3);
	String order_id="";
	
	PageBuilderPage pb;

	public CreateOrdersAndScheduletoShipViaShipyaari() throws IOException, InvalidFormatException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void testMethod() throws InterruptedException, InvalidFormatException, IOException {
		signup_test();
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		enableShipyaari();
	    driver.switchTo().window(tabs.get(1));
		createOrder();
		driver.switchTo().window(tabs.get(0));
		shipOrderViaShipyaari();
	}
	
	public void enableShipyaari() throws InterruptedException {
		pb=new PageBuilderPage(driver);
		pb.clickDashboard();
		pb.selectSetUp();
		pb.clickShipping();
		Thread.sleep(5000);
		
		ShippingOptionsPage shippingOptionsPage= new ShippingOptionsPage(driver);
		shippingOptionsPage.clickShipyaari_Domestic();
		Thread.sleep(2000);
		Shipyaari shipyaari= new Shipyaari(driver);
		Thread.sleep(2000);
		shipyaari.clickAccount();
		Thread.sleep(2000);
		shipyaari.addUsername();
		shipyaari.addClientId();
		shipyaari.clickUpdate();
		Thread.sleep(5000);
	}
	
	public void signup_test() throws InterruptedException {
		SignUp s = new SignUp(driver);
		s.clickSignUpGetStarted();
		
		AllTemplate blankTemplate = new AllTemplate(driver);
		Thread.sleep(3000);
		blankTemplate.clickEditClothingTemplate(1);		
		
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
		businessInfo.addBusinessCity("Bangalore");
		businessInfo.addBusinessState("Karnataka");
		businessInfo.addBusiness_Pincode("560095");
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
		
		AssertJUnit.assertTrue(Navigation.getTitle(driver).contentEquals("Ready to publish"));
		
		ReadyToPublishPage readyToPublishPage = new ReadyToPublishPage(driver);
		readyToPublishPage.clickPublishSite();
	}
	
	public String cust_fname=RandomStringUtils.randomAlphabetic(6);
	public String cust_lname=RandomStringUtils.randomAlphabetic(4);
	public String cust_street=RandomStringUtils.randomAlphanumeric(20);
	public String cust_city="Bangalore City";
	public String cust_state="Karnataka";
	public String cust_pincode="560103";
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

	
	public void shipOrderViaShipyaari() throws InterruptedException, InvalidFormatException, IOException{
		pb=new PageBuilderPage(driver);
		pb.clickDashboard();
		pb.clickOrders();
		
		Orders orders=new Orders(driver);
		orders.selectActionsForOrder(order_id);
		Thread.sleep(2000);
		orders.clickShipViaShipyaari(order_id);
		Thread.sleep(2000);
		
		ShipViaShipyaari ship = new ShipViaShipyaari(driver);
		ship.clickScheduleViaShipyaari();
	}
	

}
