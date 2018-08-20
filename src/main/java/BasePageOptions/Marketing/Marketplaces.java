package BasePageOptions.Marketing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Marketplaces {
	WebDriver driver;

	public Marketplaces(WebDriver driver) {
		this.driver = driver;
	}
	
	private String enableMarketPlaces_lazada="//a[contains(@href,'lazada_sg')]";
	private String enableMarketPlaces_qoo10="//a[contains(@href,'qoo10/add')]";
	private String enableMarketPlaces_ebay_us="//a[contains(@href,'ebay_us')]";
	private String enableMarketPlaces_amazon_us="//a[contains(@href,'amazon_us')]";
	private String enableMarketPlaces_ebay_in="//a[contains(@href,'ebay_india')]";
	private String enableMarketPlaces_amazon_in="//a[contains(@href,'amazon_india')]";
	private String enableMarketPlaces_elala="//a[contains(@href,'elala')]";
	
	
	public void clickEnableMarketPlaces_lazada() {
		driver.findElement(By.xpath(enableMarketPlaces_lazada)).click();
	}
	
	public void clickEnableMarketPlaces_qoo10() {
		driver.findElement(By.xpath(enableMarketPlaces_qoo10)).click();
	}
	
	public void clickEnableMarketPlaces_ebay_us() {
		driver.findElement(By.xpath(enableMarketPlaces_ebay_us)).click();
	}
	
	public void clickEnableMarketPlaces_amazon_us() {
		driver.findElement(By.xpath(enableMarketPlaces_amazon_us)).click();
	}
	
	public void clickEnableMarketPlaces_ebay_in() {
		driver.findElement(By.xpath(enableMarketPlaces_ebay_in)).click();
	}
	
	public void clickEnableMarketPlaces_amazon_in() {
		driver.findElement(By.xpath(enableMarketPlaces_amazon_in)).click();
	}
	
	public void clickEnableMarketPlaces_elala() {
		driver.findElement(By.xpath(enableMarketPlaces_elala)).click();
	}
	
}
