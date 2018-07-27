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
package MyShopmatic.HK;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import BaseClass.Navigation;
import BasePageOptions.Products;
import PageBuilder.DomainNamePage;
import PageBuilder.PageBuilderPage;
import PageBuilder.PaymentOptionsPage;
import PageBuilder.ReadyToPublishPage;
import PageBuilder.ShippingOptionsPage;
import PageBuilder.payments.CitrusPage;
import SignUp.BusinessInfo;
import SignUp.SignUp;
import SignUp.SignUpWindow;
import TemplateCategories.BlankTemplate;

public class SignUpWithBlankTemplateWithOfflinePaymentSelfCollectStdShippingInternational extends BaseClass{
	
	String productName="Product1";
	String productSellingPrice="100.00";
	String firstName=RandomStringUtils.randomAlphabetic(5), lastName=RandomStringUtils.randomAlphabetic(3);

	public SignUpWithBlankTemplateWithOfflinePaymentSelfCollectStdShippingInternational() throws IOException, InvalidFormatException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void testMethod_stage() throws InterruptedException {
		SignUp s = new SignUp(driver);
		s.clickSignUpGetStarted();
		String currentUrl=driver.getCurrentUrl();
		currentUrl = currentUrl.substring(0, currentUrl.length()-2);
		currentUrl = currentUrl+region;
		driver.navigate().to(currentUrl);
		Thread.sleep(20000);
		
		BlankTemplate blankTemplate = new BlankTemplate(driver);
		blankTemplate.clickEditTemplate();		
		
		SignUpWindow signUpWindow=new SignUpWindow(driver);
		signUpWindow.addEmail("testshop_"+RandomStringUtils.randomAlphanumeric(5)+"@testshop.com");
		signUpWindow.addPassword("Tester123*");
		signUpWindow.addPhone("1111111111");
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
		businessInfo.addBusinessDistrict(RandomStringUtils.randomAlphabetic(5));
		businessInfo.clickBusinessFormAddressNextButton_sg();
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
		paymentOptionsPage.addOfflineInstructionForDomesticPayment("hjwefguy3rf");
		paymentOptionsPage.clickSaveAndEnablePayment_Domestic();
	    Thread.sleep(5000);
		Navigation.clickNext(driver);
		Thread.sleep(10000);
		ShippingOptionsPage shippingOptionsPage = new ShippingOptionsPage(driver);
		shippingOptionsPage.addSelfCollectDetails("euweuyrgw");
		shippingOptionsPage.clickEnableSelfCollect();
		Thread.sleep(10000);		
		
		shippingOptionsPage.clickStdShipping_International_SG();
		shippingOptionsPage.clickConfirm();
		Thread.sleep(5000);
		Navigation.clickNext(driver);
		Thread.sleep(10000);
		Assert.assertTrue(Navigation.getTitle(driver).contentEquals("Ready to publish"));
		
		ReadyToPublishPage readyToPublishPage = new ReadyToPublishPage(driver);
		readyToPublishPage.clickPublishSite();
	    
	}

}
