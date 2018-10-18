package PageBuilder.payments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaytmPage {
	WebDriver driver;
	
	public PaytmPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	private String enable="//div[@data-provider-id='paytm']/div/div[3]/div/div/button[text()='Enable']";
	private String disable="//div[@data-provider-id='paytm']/div/div[3]/div/div/button[contains(@class,'disable')]"; 
	private String edit="//div[@data-provider-id='paytm']/div/div[3]/div/div/button[contains(@class,'edit')]";
	private String save="//div[@class='edit-modal-paytm']/form/input[@class='button']";
	private String merchant_key="//input[@placeholder='Merchant Key']";
	private String merchant_id="//input[@placeholder='Merchant ID']";
	private String industry_type_id="//input[@placeholder='Industry Type ID']";
	
	public void clickEnable() {
		driver.findElement(By.xpath(enable)).click();
	}
	
	public void clickDisable() {
		driver.findElement(By.xpath(disable)).click();
	}
	public void clickEdit() {
		driver.findElement(By.xpath(edit)).click();
	}
	public void clickSave() {
		driver.findElement(By.xpath(save)).click();
	}
	
	public void addMerchantKey() {
		driver.findElement(By.xpath(merchant_key)).sendKeys("z!h6PoDt3Iq#ktut");
	}
	
	public void addMerchantId() {
		driver.findElement(By.xpath(merchant_id)).sendKeys("SHOPMA88608605448668");
	}
	
	public void addIndustryTypeId() {
		driver.findElement(By.xpath(industry_type_id)).sendKeys("Retail");
	}
	
}
