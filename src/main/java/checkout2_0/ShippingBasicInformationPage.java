package checkout2_0;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShippingBasicInformationPage {
	WebDriver driver;

	public ShippingBasicInformationPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	private String email="//div[@class='basic-information-form']/form/div/div/div[contains(@class,'input__group')]/input";

	public void addemail(String input_email) {
		driver.findElement(By.xpath(email)).sendKeys(""+input_email);
	}
}
