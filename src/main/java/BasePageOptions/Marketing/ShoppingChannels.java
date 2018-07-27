package BasePageOptions.Marketing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingChannels {
	WebDriver driver;

	public ShoppingChannels(WebDriver driver) {
		this.driver = driver;
	}
	
	private String enableFaceBook="//a[contains(@href,'facebook') and text()='Enable']";
	private String linkToCreateFaceBookBusinessPage="//a[contains(@href,'facebook') and text()='Click here']";
	private String linktoSocialChannelsList="//a[contains(@href,'shopmatic-facebook') and text()='click here']";
	
	public void clickEnableFaceBook() {
		driver.findElement(By.xpath(enableFaceBook)).click();
	}
	
	public void clickLinkToCreateFaceBookBusinessPage() {
		driver.findElement(By.xpath(linkToCreateFaceBookBusinessPage)).click();
	}
	public void clickLinktoSocialChannelsList() {
		driver.findElement(By.xpath(linktoSocialChannelsList)).click();
	}

}
