package marketplaces;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BaseClass.BaseClass_Login;

public class ebay extends BaseClass_Login{
	WebDriver driver;

	public ebay(WebDriver driver) throws IOException, InvalidFormatException {
		super();
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	private String uname="//input[@name='userid']";
	private String password="//input[@name='pass']";
	private String sign_in="//input[@id='sgnBt']";
	
	private String input_uname_us="supernine@gmail.com";
	private String input_password_us="shopmatic2018";
	
	private String input_uname_in="chavitamatic_01@yahoo.com";
	private String input_password_in="12345678Ab";
	
	public void add_uname() {
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
	
	public void clickSignIN() {
		driver.findElement(By.xpath(sign_in)).click();
	}

}
