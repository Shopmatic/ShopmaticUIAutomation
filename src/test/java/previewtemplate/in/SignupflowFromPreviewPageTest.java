package previewtemplate.in;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import BaseClass.BaseClass_Login;
import BaseClass.Navigation;
import BasePageOptions.Products;
import PageBuilder.DomainNamePage;
import PageBuilder.PaymentOptionsPage;
import PageBuilder.ReadyToPublishPage;
import SignUp.BusinessInfo;
import SignUp.SignUp;
import SignUp.SignUpWindow;
import TemplateActions.LayoutPreview;
import TemplateCategories.BeautyAndWellnessTemplate;
import TemplateCategories.ClothingTemplate;
import imageprocessing.ImageCompareUtils;

public class SignupflowFromPreviewPageTest extends BaseClass_Login{
	File dstFile,srcFile;
	Logger logger = Logger.getLogger(BeautyAndWellnessPreviewTest.class);
	String templateName="ClothingTemplate";
	ClothingTemplate b;
	public SignupflowFromPreviewPageTest( ) throws InvalidFormatException, IOException {
		super();
	}
	
	@Test
	public void testMethod() throws InterruptedException, IOException, InvalidFormatException {
		signup();
		Thread.sleep(2000);
		previewTemplate(templateName);
		Thread.sleep(2000);
		getSrcFilePath();
		ImageCompareUtils i = new ImageCompareUtils(driver);
		Assert.assertTrue(i.compareImage(srcFile,dstFile));
		
		LayoutPreview l = new LayoutPreview(driver);
		l.clickEditThisLayout();
		Thread.sleep(10000);
		signupAndOnboard();
	}

	String productName="Product1";
	String productSellingPrice="100.00";
	String firstName=RandomStringUtils.randomAlphabetic(5), lastName=RandomStringUtils.randomAlphabetic(3);
	
	
	private void signupAndOnboard() throws InterruptedException{
		// TODO Auto-generated method stub
		SignUp s = new SignUp(driver);
		
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

	private void previewTemplate(String template) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		b =new ClothingTemplate(driver);
		b.clickCategory();
		Thread.sleep(5000);
		b.clickPreview(1);
		Thread.sleep(10000);
		
		Date date = new Date() ;
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss") ;
		
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		dstFile = new File("./screenshots/dst_screenshot_"+dateFormat.format(date)+".jpg");
		System.out.println("Screenshot file: "+dstFile.getAbsolutePath());
		FileUtils.copyFile(srcFile, dstFile);
	}
	
	private void getSrcFilePath() {
		String expImage="./src/main/resources/templateimages/";
		expImage+=templateName;
		expImage+=".jpg";
		System.out.println(expImage);
		srcFile = new File(expImage);
	}

	private void signup() {
		// TODO Auto-generated method stub
		SignUp s = new SignUp(driver);
		s.clickSignUpGetStarted();
		
		driver.manage().window().maximize();
	}
}
