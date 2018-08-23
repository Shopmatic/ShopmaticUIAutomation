package PageBuilder.Shipping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Shipyaari {
	WebDriver driver;

	public Shipyaari(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	private String account="//a[@href='https://seller.shipyaari.com/avn_ci/siteadmin']/button/span";
	private String username="//input[@placeholder='API Username']";
	private String client_id="//input[@placeholder='Client ID']";
    private String update="//button[text()='Update']";

	public void clickAccount() {
		driver.findElement(By.xpath(account)).click();
	}
	
	public void clickUpdate() {
		driver.findElement(By.xpath(update)).click();
	}
	
	public void addUsername() {
		driver.findElement(By.xpath(username)).sendKeys("welldone009@gmail.com");
	}
	
	public void addClientId() {
		driver.findElement(By.xpath(client_id)).sendKeys("2107");
	}
}
