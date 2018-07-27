package BasePageOptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Customers {
	WebDriver driver;
	
	public Customers(WebDriver driver) {
		this.driver=driver;
	}
	
	private String allCustomers="//div[text()='All customers']";
	private String opted_marketing="//div[text()='Opted in for marketing']";
	private String search_customer="//input[@name='customers']";
	private String search_button="//button[@class='search-btn']";
	
	public void clickAllCustomers() {
		driver.findElement(By.xpath(allCustomers)).click();
	}
	
	public void clickOptedMarketing() {
		driver.findElement(By.xpath(opted_marketing)).click();
	}
	
	public void searchCustomer(String customer) {
		driver.findElement(By.xpath(search_customer)).sendKeys(""+customer);
	}
	
	public void clickSearchButton() {
		driver.findElement(By.xpath(search_button)).click();
	}
}
