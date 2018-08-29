package PageBuilder.payments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NeoPage {
	WebDriver driver;
	
	public NeoPage(WebDriver driver) 
	{
		super();
		this.driver = driver;
	}

	private String merchantId="//input[@placeholder='Merchant ID']";
	private String secretKey="//input[@placeholder='Secret Key']";
	private String submitButton="//input[@type='submit']";
	
	public void clickMerchantId() {
		driver.findElement(By.xpath(merchantId)).sendKeys("201702091000003");
	}
	
	public void clickSecretKey() {
		driver.findElement(By.xpath(secretKey)).sendKeys("98dXHJAgcxAAadKods8EcuC9ZPbNVx5sCodfJWF0E1g=");
	}
	
	public void clickSubmit() {
		driver.findElement(By.xpath(submitButton)).click();
	}
		
}
