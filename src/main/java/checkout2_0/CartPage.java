package checkout2_0;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
	
	public CartPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	WebDriver driver;
	
	private String promo_code_link="//div[@class='promo-code-input']";
	private String promo_code_input="//div[@class='input-groups']/input";
	private String apply="//div[@class='input-groups']/button";
	private String error_msg="//div[@class='error-message']";
	
	public void clickApply() {
		driver.findElement(By.xpath(apply)).click();
	}
	
	public void clickPromoCodeLink() {
		driver.findElement(By.xpath(promo_code_link)).click();
	}
	
	public void addPromoCode(String code) {
		driver.findElement(By.xpath(promo_code_input)).sendKeys(""+code);
	}
	
	public String discountErrorMessage() {
		return driver.findElement(By.xpath(error_msg)).getText();
	}
	
	// Totals
	private String subtotal="//div[text()='Subtotal:']/following-sibling::div";
	private String taxes="//div[text()='Taxes:']/following-sibling::div";
	private String shipping_fee="//div[text()='Shipping fee:']/following-sibling::div";
	
	public String getShippingFee() {
		return driver.findElement(By.xpath(shipping_fee)).getText();
	}
	public String getTaxes() {
		return driver.findElement(By.xpath(taxes)).getText();
	}
	public String getSubTotal() {
		return driver.findElement(By.xpath(subtotal)).getText();
	}

}
