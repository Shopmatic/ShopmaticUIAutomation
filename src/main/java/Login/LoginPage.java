package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private String email="//input[@id='email']";
    private String password = "//input[@id='password']";
    private String login="//button[contains(@class,'login')]";
    private String stayLoggedIn="//input[@id='remember_me']";
    private String forgotPasswordLink="//a[contains(@href,'password_resets')]";
    private String loginViaFaceBookButton = "//a[@class='facebook_login']";
    private String loginViaGoogleButton = "//a[@class='google_login']";

    public void addEmail(String email_address) {
    	driver.findElement(By.xpath(email)).sendKeys(email_address);
    }
    
    public void addPassword(String pwd) {
    	driver.findElement(By.xpath(password)).sendKeys(pwd);
    }
    
    public void clickLogin() {
    	driver.findElement(By.xpath(login)).click();
    }
    public void clickFBLogin() {
    	driver.findElement(By.xpath(loginViaFaceBookButton)).click();
    }
    public void clickGoogleLogin() {
    	driver.findElement(By.xpath(loginViaGoogleButton)).click();
    }
    
    public void clickStayLoggedIn() {
    	driver.findElement(By.xpath(stayLoggedIn)).click();
    }
    
    public void clickForgotPasswordLink() {
    	driver.findElement(By.xpath(forgotPasswordLink)).click();
    }

}
