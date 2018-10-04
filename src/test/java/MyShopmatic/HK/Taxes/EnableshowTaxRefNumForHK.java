package MyShopmatic.HK.Taxes;

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

public class EnableshowTaxRefNumForHK extends BaseClass{
	
	String vatRate="6.5";
	TaxesPage tax;
	String productName="Product1";
	String productSellingPrice="100.00";
	String firstName=RandomStringUtils.randomAlphabetic(5), lastName=RandomStringUtils.randomAlphabetic(3);

	public EnableshowTaxRefNumForHK() throws IOException, InvalidFormatException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void enableVAT() throws InterruptedException {
		SignUp s = new SignUp(driver);
		s.clickSignUpGetStarted();
		String currentUrl=driver.getCurrentUrl();
		currentUrl = currentUrl.substring(0, currentUrl.length()-2);
		currentUrl = currentUrl+region;
		driver.navigate().to(currentUrl);
		Thread.sleep(20000);
		
		AllTemplate blankTemplate = new AllTemplate(driver);
		Thread.sleep(3000);
		blankTemplate.clickEditClothingTemplate(1);		
		
		SignUpWindow signUpWindow=new SignUpWindow(driver);
		String email="testshop_"+RandomStringUtils.randomAlphanumeric(5)+"@testshop.com";
		System.out.println("\nEmail: "+email+"\nPassword: Tester123\n");
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
		paymentOptionsPage.enableCODPayment();
	    Thread.sleep(5000);
		Navigation.clickNext(driver);
		Thread.sleep(10000);
		
		Navigation.clickNext(driver);
		Thread.sleep(10000);
		AssertJUnit.assertTrue(Navigation.getTitle(driver).contentEquals("Ready to publish"));
		
		ReadyToPublishPage readyToPublishPage = new ReadyToPublishPage(driver);
		readyToPublishPage.clickAddMoreProducts();
		Thread.sleep(5000);
		
		PageBuilderPage pageBuilderPage=new PageBuilderPage(driver);
		pageBuilderPage.clickDashboard();
		pageBuilderPage.selectSetUp();
		pageBuilderPage.clickTaxes();
		Thread.sleep(5000);
		
		tax=new TaxesPage(driver);
		tax.showVatNumCheckbox();
		tax.clickSaveChanges();
		Thread.sleep(2000);
		AssertJUnit.assertTrue(tax.getMessage().contentEquals("Your changes have been saved."));
	}
	
}
