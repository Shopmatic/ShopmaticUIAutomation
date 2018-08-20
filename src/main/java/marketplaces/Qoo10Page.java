package marketplaces;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BaseClass.BaseClass_Login;

public class Qoo10Page extends BaseClass_Login{
	WebDriver driver;

	public Qoo10Page(WebDriver driver) throws IOException, InvalidFormatException {
		super();
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	private String uname="//input[@id='credentials_user']";
	private String password="//input[@id='credentials_password']";
	private String api_key="//input[@id='credentials_apiKey']";
	private String save_button="//button[text()='Save']";
	
	private String input_uname="fr3dle";
	private String input_password="7273fwFW";
	private String input_api_key="BhiQeRsAhG0BKyVNpgUFXChJ6Lr84RscIUydXslqtUY_g_3_";
	
	public void add_uname() {
		driver.findElement(By.xpath(uname)).sendKeys(""+input_uname);
	}
	
	public void add_password() {
		driver.findElement(By.xpath(password)).sendKeys(""+input_password);
	}
	
	public void add_api_key() {
		driver.findElement(By.xpath(api_key)).sendKeys(""+input_api_key);
	}
	
	public void clickSave() {
		driver.findElement(By.xpath(save_button)).click();
	}
}
