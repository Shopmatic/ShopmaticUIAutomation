package marketplaces;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BaseClass.BaseClass_Login;

public class Elala extends BaseClass_Login{
	WebDriver driver;

	public Elala(WebDriver driver) throws IOException, InvalidFormatException {
		super();
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	private String uname="//input[@id='credentials_seller_id']";
	private String password="//input[@id='credentials_auth_token']";
	private String save_button="//button[text()='Save']";
	
	private String input_uname="";
	private String input_password="";
	
	public void add_uname() {
		driver.findElement(By.xpath(uname)).sendKeys(""+input_uname);
	}
	
	public void add_password() {
		driver.findElement(By.xpath(password)).sendKeys(""+input_password);
	}
	
	public void clickSave() {
		driver.findElement(By.xpath(save_button)).click();
	}

}
