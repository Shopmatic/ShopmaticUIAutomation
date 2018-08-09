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
    private String env_passcode="//input[@id='env_passcode']";
    private String login_shoptiq="//button[contains(@name,'Login')]";
    
    
    //shoptiq
    private String manage_your_store="//button[contains(text(),'Manage')]";
    private String view_your_store="//button[contains(text(),'View')]";
    
    
    public void clickManageYourStore() {
    	driver.findElement(By.xpath(manage_your_store)).click();
    }
    
    public void clickViewYourStore() {
    	driver.findElement(By.xpath(view_your_store)).click();
    }
    
    public void loginShoptiq() {
    	driver.findElement(By.xpath(login_shoptiq)).click();
    }
    
    public void addEnvPassCode() {
  		driver.findElement(By.xpath(env_passcode)).sendKeys("tempura");
  	}

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
