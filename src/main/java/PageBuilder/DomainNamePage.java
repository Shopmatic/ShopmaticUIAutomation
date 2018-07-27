package PageBuilder;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DomainNamePage {
	WebDriver driver;
	
	private String domain_name="//input[@name='subdomain']";
	private String confirm_domain_name="//input[@type='submit']/parent::div[@class='submit']";
	//input[@type='submit']/ancestor::div[@class='domain-name-setup']
	
	public DomainNamePage(WebDriver driver) {
		this.driver=driver;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	public void addDomainName(String name) {
		driver.findElement(By.xpath(domain_name)).sendKeys(""+name);
	}
	
	public void confirmDomainName() {
		driver.findElement(By.xpath(confirm_domain_name)).click();
	}

}
