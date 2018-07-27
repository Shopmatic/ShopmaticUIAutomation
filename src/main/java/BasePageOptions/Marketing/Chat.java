package BasePageOptions.Marketing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Chat {
	WebDriver driver;

	public Chat(WebDriver driver) {
		this.driver = driver;
	}
	
	private String inputTextForChat="//div[@class='placeholder']";
	private String saveInputTextForChat="//button[text()='Save']";
	
	public void addText(String text, int num) {
		driver.findElement(By.xpath(""+inputTextForChat+"["+num+"]")).sendKeys(""+text);
	}
	
	public void clickSave(int num) {
		driver.findElement(By.xpath(""+inputTextForChat+"["+num+"]")).click();
	}
}
