package previewtemplate.in;

import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import BaseClass.BaseClass_Login;
import SignUp.SignUp;
import TemplateCategories.BeautyAndWellnessTemplate;
import imageprocessing.ImageCompareUtils;

public class BeautyAndWellnessPreviewTest extends BaseClass_Login{
	
	File dstFile,srcFile;
	Logger logger = Logger.getLogger(BeautyAndWellnessPreviewTest.class);
	String templateName="BeautyAndWellnessTemplate";
	public BeautyAndWellnessPreviewTest() throws IOException, InvalidFormatException {
		super();
		// TODO Auto-generated constructor stub
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
	}

	private void previewTemplate(String template) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		BeautyAndWellnessTemplate b =new BeautyAndWellnessTemplate(driver);
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
