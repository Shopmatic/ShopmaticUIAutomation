package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SingtelLogin {
	WebDriver driver;

	public SingtelLogin(WebDriver driver) {
		this.driver = driver;
	}
	
	private String email="//input[@id='user_email']";
    private String env_passcode="//input[@id='env_passcode']";
    private String login="//input[@type='submit' and @value='Login']";
	
	 public void addEmail(String email_address) 
	 {
	    	driver.findElement(By.xpath(email)).sendKeys(email_address);
	 }
	 
	 public void addEnvPassCode() 
	 {
	  		driver.findElement(By.xpath(env_passcode)).sendKeys("tempura");
	 }
	 
	 public void clickLogin() 
	 {
	    	driver.findElement(By.xpath(login)).click();
	 }

}
