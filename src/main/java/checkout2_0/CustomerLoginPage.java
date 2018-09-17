package checkout2_0;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerLoginPage {
	WebDriver driver;

	public CustomerLoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	private String email="//form[@class='login-form']/div[contains(@class,'email-field')]/div/input";
	private String password="//form[@class='login-form']/div[contains(@class,'password-field')]/div/input";
	private String log_in="//form[@class='login-form']/button[contains(@class,'submit-btn')]/div/span";
	private String register="//button[@class='sign-up-btn']";
	private String forgot_password_link="//button[@class='forgot-password-btn']";
	
	public void addemail(String input_email) {
		driver.findElement(By.xpath(email)).sendKeys(""+input_email);
	}
	
	public void addPassword(String pwd) {
		driver.findElement(By.xpath(password)).sendKeys(""+pwd);
	}

	public void clickLogIn() {
		driver.findElement(By.xpath(log_in)).click();
	}
	
	public void clickSignUp() {
		driver.findElement(By.xpath(register)).click();
	}
	
	public void clickForgotPassword() {
		driver.findElement(By.xpath(forgot_password_link)).click();
	}
}
