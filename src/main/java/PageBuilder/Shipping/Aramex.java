package PageBuilder.Shipping;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Aramex {
	WebDriver driver;

	public Aramex(WebDriver driver) {
		super();
		this.driver = driver;
	}

	private String account="//a[@href='https://www.aramex.com/']/button/span";
	private String username="//input[@placeholder='Username']";
	private String pwd="//input[@placeholder='Password']";
	private String ac_num="//input[@placeholder='Account number']";
	private String ac_pin="//input[@placeholder='Account pin']";
    private String entity="//div[text()='Aramex entity']";
    private String update="//button[text()='Update']";
    
	public void clickAccount() {
		driver.findElement(By.xpath(account)).click();
	}
	
	public void clickUpdate() {
		driver.findElement(By.xpath(update)).click();
	}
	
	public void addUsername() {
		driver.findElement(By.xpath(username)).sendKeys("kris@goshopmatic.com");
	}
	
	public void addPassword() {
		driver.findElement(By.xpath(pwd)).sendKeys("Hana0308");
	}
	
	public void addAccountNumber() {
		driver.findElement(By.xpath(ac_num)).sendKeys("40212782");
	}
	
	public void addAccountPin() {
		driver.findElement(By.xpath(ac_pin)).sendKeys("564431");
	}
	
	public void selectAramexEntity() throws InterruptedException {
		driver.findElement(By.xpath(entity)).click();
		driver.findElement(By.xpath("//div[@class='Select-option']")).click();
		Thread.sleep(10000);
	}
}
