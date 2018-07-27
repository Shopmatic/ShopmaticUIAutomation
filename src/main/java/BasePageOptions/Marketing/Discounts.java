package BasePageOptions.Marketing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Discounts {
	
	public Discounts(WebDriver driver) {
		this.driver = driver;
	}

	WebDriver driver;
	
	private String addDiscount="//a[contains(@class,'discount')]";
	private String discountName="//input[@name='discount[name]']";
	private String discountCode="//input[@name='discount[code]']";
	private String radioButtonFlatDiscount="//span[text()='Flat discount']";
	private String radioButtonPercentageDiscount="//span[text()='Percentage discount']";
	private String radioButtonFreeShippingDiscount="//span[text()='Free shipping discount']";
	private String flatDiscountAmount="//input[@name='discount[discount_amount]']";
	private String flatDiscountPercentage="//input[@name='discount[discount_percentage]']";
	private String minOrderDiscount="//input[@name='discount[min_order]']";
	private String discountStartDate="//input[@name='discount[start_date]']";
	private String discountEndDate="//input[@name='discount[end_date]']";
	private String addDiscountButton="//input[@class='add-a-discount']";
	
	public void clickAddDiscount() {
		driver.findElement(By.xpath(addDiscount)).click();
	}
	
	public void clickradioButtonFlatDiscount() {
		driver.findElement(By.xpath(radioButtonFlatDiscount)).click();
	}
	public void clickradioButtonPercentageDiscount() {
		driver.findElement(By.xpath(radioButtonPercentageDiscount)).click();
	}
	public void clickradioButtonFreeShippingDiscount() {
		driver.findElement(By.xpath(radioButtonFreeShippingDiscount)).click();
	}
	
	public void clickAddADiscountButton() {
		driver.findElement(By.xpath(addDiscountButton)).click();
	}
	
	public void addDiscountName(String name) {
		driver.findElement(By.xpath(discountName)).sendKeys(""+name);
	}
	public void addDiscountCode(String code) {
		driver.findElement(By.xpath(discountCode)).sendKeys(""+code);
	}
	
	public void addFlatDiscountAmount(Float amt) {
		driver.findElement(By.xpath(flatDiscountAmount)).sendKeys(""+amt);
	}
	public void addFlatDiscountPercentage(Float perc) {
		driver.findElement(By.xpath(flatDiscountPercentage)).sendKeys(""+perc);
	}
	
	public void addminOrderDiscount(Float amt) {
		driver.findElement(By.xpath(minOrderDiscount)).sendKeys(""+amt);
	}
	
	public void addDiscountStartDate(String date) {
		driver.findElement(By.xpath(discountStartDate)).sendKeys(""+date);
	}
	
	public void addDiscountEndDate(String date) {
		driver.findElement(By.xpath(discountEndDate)).sendKeys(""+date);
	}

}
