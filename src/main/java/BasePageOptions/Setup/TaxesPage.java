package BasePageOptions.Setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TaxesPage {
	public TaxesPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	WebDriver driver;
	private String gst_rate="//input[@id='gstRate']";
	private String gst_Num="//input[@id='gstNumber']";
	private String save_changes_button="//button[contains(text(),'Save')]";
	private String msg_bar="//p[@class='message']";
	
	public String getMessage() {
		return driver.findElement(By.xpath(msg_bar)).getText();
	}
	
	public void addGstNum(String num) {
		driver.findElement(By.xpath(gst_Num)).sendKeys(""+num);
	}
	
	public void clickSaveChanges() {
		driver.findElement(By.xpath(save_changes_button)).click();
	}
	
	public void addGstRate(String rate) {
		driver.findElement(By.xpath(gst_rate)).sendKeys(""+rate);
	}

	
	//SG
	private String sg_gst_checkbox="//input[@id='tax_option_charge_gst']/parent::div[contains(@class,'checkbox')]";
	private String sg_show_Gst_num="//input[@id='tax_option_show_gst_number']/parent::div[contains(@class,'checkbox')]";
	
	public void clickGSTCheckbox() {
		driver.findElement(By.xpath(sg_gst_checkbox)).click();
	}
	
	public void showGSTNumCheckbox() {
		driver.findElement(By.xpath(sg_show_Gst_num)).click();
	}
	

	
	//IN
	private String in_gst_registered_yes="//label[contains(@class,'gst-registered choice-yes')]/div";
	private String in_gst_registered_no="//label[contains(@class,'gst-registered choice-no')]/div";
	
	public void clickGSTRegisteredYesCheckbox() {
		driver.findElement(By.xpath(in_gst_registered_yes)).click();
	}
	
	public void clickGSTRegisteredNoCheckbox() {
		driver.findElement(By.xpath(in_gst_registered_no)).click();
	}
	
	
	//HK and NI
	private String vat_checkbox="//input[@id='tax_option_charge_vat']/parent::div[contains(@class,'checkbox')]";
	private String vat_rate="//input[@id='vatRate']";
	private String show_vat_num="//input[@id='tax_option_show_vat_number']/parent::div[contains(@class,'checkbox')]";
	private String vat_number="//input[@id='vatNumber']";
	
	public void clickVATCheckbox() {
		driver.findElement(By.xpath(vat_checkbox)).click();
	}
	
	public void showVatNumCheckbox() {
		driver.findElement(By.xpath(show_vat_num)).click();
	}
	
	public void addVatNum(String num) {
		driver.findElement(By.xpath(vat_number)).sendKeys(""+num);
	}
	
	public void addVatRate(String rate) {
		driver.findElement(By.xpath(vat_rate)).sendKeys(""+rate);
	}
	
	public void removeVatRate() {
		driver.findElement(By.xpath(vat_rate)).clear();
	}
	
}
