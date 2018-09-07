package PageBuilder;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentOptionsPage {
	WebDriver driver;
	
	private String next="//a[text()='Next']";
	private String enable_payment_option="//button[text()='Enable']";
	private String save_and_enable_payment_option_domestic="//div[@id='payment_options']/div[2]/div/div/div[4]/div/div[3]/div/div/button";
	private String save_and_enable_payment_option_international="//div[@id='payment_options']/div[2]/div/div/div[7]/div/div[3]/div/div/button";

	private String edit_offline_payment_option="//button[text()='Edit']";
	private String close_button="//button[contains(@class,'close')]";
	private String offlineInstructions_domestic="//div[4]/div/div[2]/div/div/div[2]/textarea[@class='offline-payment-instructions-textarea']";
	private String offlineInstructions_international="//div[7]/div/div[2]/div/div/div[2]/textarea[@class='offline-payment-instructions-textarea']";
	
	public void enableCODPayment() {
		driver.findElement(By.xpath("//div[contains(@class,'cash-on-delivery')]/div/div[contains(@class,'text-center')]/div/div/button")).click();
	}
	
	public void enableCitrusPayment() {
		driver.findElement(By.xpath("//div[contains(@class,'citrus')]/div/div[contains(@class,'text-center')]/div/div/button")).click();
	}
	
	public void enablePayPalPayment() {
		driver.findElement(By.xpath("//div[contains(@class,'paypal')]/div/div[3]/div/div/button")).click();
	}
	
	public void enableNeoPayment() {
		driver.findElement(By.xpath("//div[contains(@class,'network-international')]/div/div[3]/div/div/button")).click();
	}

	public PaymentOptionsPage(WebDriver driver) {
		this.driver=driver;
		new WebDriverWait(driver, 30);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
	
	public void clickNext() {
		driver.findElement(By.xpath(next)).click();
	}
	
	public void clickEnablePayment(int payment_option_num) {
		driver.findElement(By.xpath(""+enable_payment_option+"["+payment_option_num+"]")).click();
	}
	
	public void clickSaveAndEnablePayment_Domestic() throws InterruptedException {
		driver.findElement(By.xpath(save_and_enable_payment_option_domestic)).click();
		Thread.sleep(2000);
	}
	
	public void clickSaveAndEnablePayment_International() {
		driver.findElement(By.xpath(save_and_enable_payment_option_international)).click();
	}
	
	public void clickClose() {
		driver.findElement(By.xpath(close_button));
	}
	
	public void clickEditOfflinePaymentOption(int payment_option_num) {
		driver.findElement(By.xpath(""+edit_offline_payment_option+"["+payment_option_num+"]")).click();	
	}
	
	public void addOfflineInstructionForDomesticPayment(String instructions) {
		driver.findElement(By.xpath(offlineInstructions_domestic)).sendKeys(""+instructions);
	}
	
	public void addOfflineInstructionForInternationalPayment(String instructions) {
		driver.findElement(By.xpath(offlineInstructions_international)).sendKeys(""+instructions);
	}

}
