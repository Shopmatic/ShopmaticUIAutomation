package previewtemplate.in;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseClass.BaseClass_Login;
import SignUp.SignUp;
import TemplateCategories.AllTemplate;
import TemplateCategories.WeddingsAndEventsTemplate;

public class testCompare2 extends BaseClass_Login{
	File dstFile,srcFile;

	public testCompare2() throws IOException, InvalidFormatException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void testMethod() throws InterruptedException, IOException {
		SignUp s = new SignUp(driver);
		s.clickSignUpGetStarted();
		
		driver.manage().window().maximize();
		
		WeddingsAndEventsTemplate w=new WeddingsAndEventsTemplate(driver);
		w.clickCategory();
		Thread.sleep(10000);
		w.clickPreview(2);
		
		/*AllTemplate allTemplate=new AllTemplate(driver);
		allTemplate.clickEditFashionAccessoriesTemplate(1);*/
		Thread.sleep(20000);
		
		Date date = new Date() ;
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss") ;
		
		driver.manage().window().maximize();
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		dstFile = new File("./screenshots/screenshot_"+dateFormat.format(date)+".jpg");
		System.out.println("Screenshot file: "+dstFile.getAbsolutePath());
		FileUtils.copyFile(srcFile, dstFile);
		compare();
	}
	
	public void compare() {
		BufferedImage imgA = null;
        BufferedImage imgB = null;
        String scrShot=dstFile.getPath().toString();
        String expImage="/Users/swetha/git/ShopmaticUIAutomation/src/main/resources/templateimages/BeautyAndWellnesstemplate.jpg";
        try
        {
            File fileA = new File(scrShot);
            File fileB = new File(expImage);
            System.out.println(fileA.getPath());
 
            imgA = ImageIO.read(fileA);
            imgB = ImageIO.read(fileB);
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
        int width1 = imgA.getWidth();
        int width2 = imgB.getWidth();
        int height1 = imgA.getHeight();
        int height2 = imgB.getHeight();
 
        if ((width1 != width2) || (height1 != height2))
            System.out.println("Error: Images dimensions"+
                                             " mismatch");
        else
        {
            long difference = 0;
            for (int y = 0; y < height1; y++)
            {
                for (int x = 0; x < width1; x++)
                {
                    int rgbA = imgA.getRGB(x, y);
                    int rgbB = imgB.getRGB(x, y);
                    int redA = (rgbA >> 16) & 0xff;
                    int greenA = (rgbA >> 8) & 0xff;
                    int blueA = (rgbA) & 0xff;
                    int redB = (rgbB >> 16) & 0xff;
                    int greenB = (rgbB >> 8) & 0xff;
                    int blueB = (rgbB) & 0xff;
                    difference += Math.abs(redA - redB);
                    difference += Math.abs(greenA - greenB);
                    difference += Math.abs(blueA - blueB);
                }
            }
 
            // Total number of red pixels = width * height
            // Total number of blue pixels = width * height
            // Total number of green pixels = width * height
            // So total number of pixels = width * height * 3
            double total_pixels = width1 * height1 * 3;
 
            // Normalizing the value of different pixels
            // for accuracy(average pixels per color
            // component)
            double avg_different_pixels = difference /
                                          total_pixels;
 
            // There are 255 values of pixels in total
            double percentage = (avg_different_pixels /
                                            255) * 100;
 
            System.out.println("Difference Percentage-->" +
                                                percentage);
            if(percentage==0.0)
            	System.out.println("images are same");
            else
            	System.out.println("images are different");
        }
		
    }
	}


