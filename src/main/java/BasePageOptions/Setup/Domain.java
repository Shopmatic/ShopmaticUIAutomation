package BasePageOptions.Setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Domain {
	WebDriver driver;

	public Domain(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	private String connectCustomDomain="//a[text()='Connect a custom domain']";
	private String buyNewDomain="//a[text()='Buy a new domain']";

	public void clickConnectCustomDomain() {
		driver.findElement(By.xpath(connectCustomDomain)).click();
	}
	
	public void clickBuyNewDomain() {
		driver.findElement(By.xpath(buyNewDomain)).click();
	}
	

}
