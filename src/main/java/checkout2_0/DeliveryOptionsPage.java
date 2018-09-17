package checkout2_0;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeliveryOptionsPage {
	public DeliveryOptionsPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	WebDriver driver;
	
	private String edit_button="//button[contains(@class,'switch-to-edit-mode-btn')]";
	private String shipping_option_1="//div[contains(text(),'";
	private String shipping_option_2="')]/ancestor::div[@class='shipping-option']/input";
	private String shipping_price="')]/following-sibling::div[@class='price']";
	private String note_seller="//div[@class='leave-a-note-for-seller']/div/div[contains(@class,'-input__group')]/input";
	private String continue_to_payment="//span[text()='Continue to payment']";
	
	public void clickContinueToPayment() {
		driver.findElement(By.xpath(continue_to_payment)).click();
	}
	
	public void clickEdit() {
		driver.findElement(By.xpath(edit_button)).click();
	}
	
	public void selectShippingOption(String option) {
		driver.findElement(By.xpath(shipping_option_1+option+shipping_option_2)).click();
	}
	
	public String getShippingPrice(String option) {
		return driver.findElement(By.xpath(shipping_option_1+option+shipping_price)).getText();
	}
	
	public void addNoteToASeller(String note) {
		driver.findElement(By.xpath(note_seller)).sendKeys(""+note);
	}
}
