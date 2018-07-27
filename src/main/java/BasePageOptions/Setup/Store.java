package BasePageOptions.Setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Store {
	WebDriver driver;

	public Store(WebDriver driver) {
		this.driver = driver;
	}
	
	private String enable_ecommerce="//a[contains(@data-target,'commerce-options')]/span";
	private String product="//div[@data-commerce='products_enabled']";
	private String productAndPayment="//div[@data-commerce='payment_enabled']";
	private String productPaymentAndShipping="//div[@data-commerce='shipping_enabled']";
	private String enableCommerceWithSelectedOption="//a[text()='Enable commerce with selected option']";

	public void clickToggleEnableEcommerce() {
		driver.findElement(By.xpath(enable_ecommerce)).click();
	}
	
	public void clickProduct() {
		driver.findElement(By.xpath(product)).click();
	}
	
	public void clickProductAndPayment() {
		driver.findElement(By.xpath(productAndPayment)).click();
	}
	
	public void clickProductPaymentAndShipping() {
		driver.findElement(By.xpath(productPaymentAndShipping)).click();
	}
	
	public void clickEnableCommerceWithSelectedOption() {
		driver.findElement(By.xpath(enableCommerceWithSelectedOption)).click();
	}
}
