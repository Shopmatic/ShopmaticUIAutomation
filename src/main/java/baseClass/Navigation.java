
package BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Navigation {
	private static String pageTitle="//div[@class='title']";
	private static String next="//nav[@id='nav']/div[2]/div";
	private static String publish="//div[contains(@class,'publish-switch')]";
	private static String viewSite="//div[contains(@class,'preview-btn')]";
	private static String subscribeLink="//strong[text()='Subscribe']";
	
	public  static String getTitle(WebDriver driver) {
		return driver.findElement(By.xpath(pageTitle)).getText();
	}
	
	public static void clickNext(WebDriver driver) {
		driver.findElement(By.xpath(next)).click();
	}
	
	public static void clickPublish(WebDriver driver) {
		driver.findElement(By.xpath(publish)).click();
	}
	
	public static void clickViewSite(WebDriver driver) {
		driver.findElement(By.xpath(viewSite)).click();
	}
	
	public static void clickSubscribeLink(WebDriver driver) {
		try {
		driver.findElement(By.xpath(subscribeLink)).isEnabled();
	}catch(Exception e) {
		System.out.println("Subscribe link not visible");
		}
		driver.findElement(By.xpath(subscribeLink)).click();
	}
		

}
