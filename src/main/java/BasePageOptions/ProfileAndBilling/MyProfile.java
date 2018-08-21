package BasePageOptions.ProfileAndBilling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyProfile {
	WebDriver driver;

	public MyProfile(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	//Business Information
	public void addCompanyName(String name) {
		driver.findElement(By.id("businessName")).sendKeys(""+name);
	}
	
	public void addCompanyAddress(String addr) {
		driver.findElement(By.id("business-address-line")).sendKeys(""+addr);
	}
	
	public void addBusinessRegistrationNumber(String num) {
		driver.findElement(By.id("businessRegistrationNumber")).sendKeys(""+num);
	}
	
	//My Account
	public void addFirstName(String name) {
		driver.findElement(By.id("firstName")).sendKeys(""+name);
	}
	
	public void addLastName(String name) {
		driver.findElement(By.id("lastName")).sendKeys(""+name);
	}
	
	public void addPhoneNumber(String num) {
		driver.findElement(By.id("phoneNumber")).sendKeys(""+num);
	}
	
	public void addNotificationEmail(String email) {
		driver.findElement(By.id("notificationEmail")).sendKeys(""+email);
	}
	
	private String save_btn="//div[@id='profile']/div/button[text()='Save']";
	private String cancel_btn="//div[@id='profile']/div/button[text()='Cancel']";

	public void clickSave() {
		driver.findElement(By.xpath(save_btn)).click();
	}
	
	public void clickCancel() {
		driver.findElement(By.xpath(cancel_btn)).click();
	}
}
