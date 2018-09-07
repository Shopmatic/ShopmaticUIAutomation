package PageBuilder.payments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CitrusPage {
	WebDriver driver;

	public CitrusPage(WebDriver driver) {
		super();
		this.driver = driver;
		new WebDriverWait(driver, 30);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	private String account="//span[@class='ico-signin']";
	private String chkoutURL="//input[@placeholder='Checkout page URL']";
	private String accessKey="//input[@placeholder='Access Key']";
	private String secretKey="//input[@placeholder='Secret Key']";
	private String saveButton="//input[@value='Save']";
	
	public void clickAccount() {
		driver.findElement(By.xpath(account)).click();
	}
	
	public void clickSave() {
		driver.findElement(By.xpath(saveButton)).click();
	}
	
	public void addChkoutURL() {
		driver.findElement(By.xpath(chkoutURL)).clear();
		driver.findElement(By.xpath(chkoutURL)).sendKeys("xori8whs98");
	}
	public void addAccessKey() {
		driver.findElement(By.xpath(accessKey)).clear();
		driver.findElement(By.xpath(accessKey)).sendKeys("DSJXV8JRFAKU5V5ACK7O");
	}
	public void addSecretKey() {
		driver.findElement(By.xpath(secretKey)).clear();
		driver.findElement(By.xpath(secretKey)).sendKeys("7354b97a3fc7bb429c92c884d08aca69ef021915");
	}
	

}
