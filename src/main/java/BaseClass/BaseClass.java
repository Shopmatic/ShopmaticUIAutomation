package BaseClass;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.*;
import java.text.SimpleDateFormat; 

public class BaseClass {
	FileReader reader;
	public String browser;
	public WebDriver driver;
	public String baseurl,region;
	Properties properties;
	
	String property_file_name="";
	String property_file_path="";
	protected FileInputStream fileInput;
	Workbook wb;
	File DestFile;
	protected Sheet sheet;
	public BaseClass() throws IOException, InvalidFormatException
	{
		reader=new FileReader("./src/main/resources/LoginConfig.properties");
		properties=new Properties();
		properties.load(reader);
		browser = properties.getProperty("browser");
		baseurl = properties.getProperty("url"); 
		region = properties.getProperty("region");
		/*if(properties.getProperty("testdata_file_path")!=null) {
			fileInput = new FileInputStream(properties.getProperty("testdata_file_path"));
			wb = new XSSFWorkbook();
			wb = WorkbookFactory.create(fileInput);
			sheet = wb.getSheetAt(0);
			
		}*/
		
	}
	
	@BeforeTest(alwaysRun = true)
	public void setProperties() {
		if(browser.contentEquals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/mac/chromedriver");
			driver = new ChromeDriver();
			
		}
		else if(browser.contentEquals("safari")){
			driver= new SafariDriver();
		}
		else if(browser.contentEquals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/mac/geckodriver");
			driver= new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.navigate().to(baseurl);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	}
	
	@AfterTest(alwaysRun = true)
	public void takeScreenshot() throws IOException {
		Date date = new Date() ;
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss") ;
		
		driver.manage().window().maximize();
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File dstFile = new File("./screenshots/screenshot_"+dateFormat.format(date)+".jpg");
		System.out.println("Screenshot file: "+dstFile.getAbsolutePath());
		FileUtils.copyFile(srcFile, dstFile);
	}
	
	@AfterTest(alwaysRun = true, dependsOnMethods= {"takeScreenshot"})
	public void closeWindow() {
		driver.quit();
	}
	
}
