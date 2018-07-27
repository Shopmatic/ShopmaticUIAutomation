package BasePageOptions.Marketing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Marketplaces {
	WebDriver driver;

	public Marketplaces(WebDriver driver) {
		this.driver = driver;
	}

	private String enableMarketPlaces="//a[text()='Enable']";
	
	public void clickEnableMarketPlaces(int num) {
		driver.findElement(By.xpath(""+enableMarketPlaces+"["+num+"]")).click();
	}
}
