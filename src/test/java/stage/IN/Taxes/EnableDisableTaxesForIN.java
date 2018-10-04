package stage.IN.Taxes;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import BaseClass.Navigation;
import BasePageOptions.Products;
import BasePageOptions.Setup.TaxesPage;
import PageBuilder.DomainNamePage;
import PageBuilder.PageBuilderPage;
import PageBuilder.PaymentOptionsPage;
import PageBuilder.ReadyToPublishPage;
import SignUp.BusinessInfo;
import SignUp.SignUp;
import SignUp.SignUpWindow;
import TemplateCategories.AllTemplate;

public class EnableDisableTaxesForIN extends BaseClass{
	
	String gstNum="GST624523462334", gstRate="12.34";
	String productName="Product1";
	String productSellingPrice="100.00",email="testshop_"+RandomStringUtils.randomAlphanumeric(5)+"@testshop.com";
	String firstName=RandomStringUtils.randomAlphabetic(5), lastName=RandomStringUtils.randomAlphabetic(3);

	public EnableDisableTaxesForIN() throws IOException, InvalidFormatException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void testEnableGST() throws InterruptedException {
		SignUp s = new SignUp(driver);
		s.clickSignUpGetStarted();
		
		AllTemplate blankTemplate = new AllTemplate(driver);
		Thread.sleep(3000);
		blankTemplate.clickEditClothingTemplate(1);		
		
		SignUpWindow signUpWindow=new SignUpWindow(driver);
		signUpWindow.addEmail(email);
		System.out.println("Email: "+email+"\nPassword: Tester123");
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
		Thread.sleep(5000);
		
		Navigation.clickNext(driver);
		Thread.sleep(10000);
		
		Navigation.clickNext(driver);
		Thread.sleep(10000);
		
		ReadyToPublishPage readyToPublishPage = new ReadyToPublishPage(driver);
		readyToPublishPage.clickAddMoreProducts();
		Thread.sleep(5000);
		
		PageBuilderPage pageBuilderPage=new PageBuilderPage(driver);
		pageBuilderPage.clickDashboard();
		pageBuilderPage.selectSetUp();
		pageBuilderPage.clickTaxes();
		
		TaxesPage tax=new TaxesPage(driver);
		tax.clickGSTRegisteredYesCheckbox();
		tax.addGstNum(gstNum);
		tax.addGstRate(gstRate);
		tax.clickSaveChanges();
		Assert.assertTrue(tax.getMessage().contains("The default GST tax is successfully changed to "), "Tax changes are failed to save.");
		Thread.sleep(10000);
	}
	
	@Test(dependsOnMethods = { "testEnableGST" })
	public void testDisableGST() throws InterruptedException {
		TaxesPage tax=new TaxesPage(driver);
		tax.clickGSTRegisteredNoCheckbox();
		tax.clickSaveChanges();
		Thread.sleep(3000);
		Assert.assertTrue(tax.getMessage().contains("Your changes have been saved."), "Tax changes are failed to save.");
	}

}
