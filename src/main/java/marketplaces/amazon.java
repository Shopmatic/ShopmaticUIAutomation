package marketplaces;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BaseClass.BaseClass_Login;

public class amazon extends BaseClass_Login{
	WebDriver driver;

	public amazon(WebDriver driver) throws IOException, InvalidFormatException {
		super();
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	private String uname="//input[@id='credentials_SellerId']]";
	private String password="//input[@id='credentials_MWSAuthToken']";
	private String save="//button[text()='Save']";
	
	private String input_uname_us="taocheng.lim@goshopmatic.com";
	private String input_password_us="shopmatic2018";
	
	private String input_uname_in="chavitamatic_01@yahoo.com";
	private String input_password_in="12345678Ab";
	
	public void add_uname(String region) {
		if(region.contentEquals("IN")) 
		{
			driver.findElement(By.xpath(uname)).sendKeys(""+input_uname_in);
		}
		else
		{
			driver.findElement(By.xpath(uname)).sendKeys(""+input_uname_us);
		}
	}
	
	public void add_password() {
		if(region.contentEquals("IN")) 
		{
			driver.findElement(By.xpath(password)).sendKeys(""+input_password_in);
		}
		else
		{
			driver.findElement(By.xpath(password)).sendKeys(""+input_password_us);
		}
	}
	
	public void clickSave() {
		driver.findElement(By.xpath(save)).click();
	}


}
