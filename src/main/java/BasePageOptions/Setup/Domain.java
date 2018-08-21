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
	
	private String godaddy_radio_btn="//input[@id='connect-godaddy-domain-radio-input']";
	private String others_radio_btn="//input[@id='connect-custon-domain-radio-input']";
	
	private String input_godaddy="//input[@id='connect-godaddy-domain-radio-input']/following-sibling::form/div/input[@name='domain']";
	private String input_others="//input[@id='connect-custon-domain-radio-input']/following-sibling::form/div/input[@name='domain']";

	private String connect_godaddy="//input[@id='connect-godaddy-domain-radio-input']/following-sibling::form/div[@class='submit']/input";
	private String connect_others="//input[@id='connect-custon-domain-radio-input']/following-sibling::form/div[@class='submit']/input";
	
	
	public void clickConnectCustomDomain() {
		driver.findElement(By.xpath(connectCustomDomain)).click();
	}
	
	public void clickBuyNewDomain() {
		driver.findElement(By.xpath(buyNewDomain)).click();
	}
	
	public void clickGodaddy() {
		driver.findElement(By.xpath(godaddy_radio_btn)).click();
	}
	
	public void clickOthers() {
		driver.findElement(By.xpath(others_radio_btn)).click();
	}
	
	public void clickConnectGodaddy() {
		driver.findElement(By.xpath(connect_godaddy)).click();
	}
	
	public void clickConnectOthers() {
		driver.findElement(By.xpath(connect_others)).click();
	}
	
	public void addGodaddyDomain(String addr) {
		driver.findElement(By.xpath(input_godaddy)).sendKeys(""+addr);
	}
	
	public void addCustomDomain(String addr) {
		driver.findElement(By.xpath(input_others)).sendKeys(""+addr);
	}
	

}
