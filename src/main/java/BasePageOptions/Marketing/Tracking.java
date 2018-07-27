package BasePageOptions.Marketing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tracking {
	
	WebDriver driver;

	public Tracking(WebDriver driver) {
		this.driver = driver;
	}
	
	private String inputTextForTracking="//div[contains(@class,'input-group')]/textarea";
	private String saveInputTextForTracking="//div[contains(@class,'input-group')]/input[@value='Save']";
	
	public void addText(String text, int num) {
		driver.findElement(By.xpath(""+inputTextForTracking+"["+num+"]")).sendKeys(""+text);
	}
	
	public void clickSave(int num) {
		driver.findElement(By.xpath(""+saveInputTextForTracking+"["+num+"]")).click();
	}

}
