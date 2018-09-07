package PageBuilder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShippingOptionsPage {
	WebDriver driver;
	
	private String next="//a[text()='Next']";
	private String shipping_domestic_tab="//a[contains(@href,'domestic')]";
	private String shipping_international_tab="//a[contains(@href,'international')]";
	private String shipping_provider_list="//span[@class='provider-name']";
	private String enable_shipping_option="//button[text()='Enable']";
	private String enable_selfCollectOption="//div[@class='self_collect control-unit']/button[text()='Enable']";
	private String enable_free_shipping_domestic="//*[@id='panel_domestic']/div[2]/div/label/input";
	private String enable_free_shipping_international="//*[@id='panel_international']/div[2]/div/label/inpu";
	private String self_collect_details="//textarea[@name='description']";
	private String saveButton="//button[text()='Save']";
	private String cancelButton="//button[text()='Cancel']";
	private String flatShippingFreeCharge="//*[@id='flat_shipping_fee']";
	private String viewShippingRatesLink="//a[contains(text(),'View shipping rates.')]";
	
	
	//domestic
	private String aramex_domestic="//div[@id='panel_domestic']/div[1]/div[1]/div[3]/div[contains(@class,'aramex')]/div[6]/div/div/div/button";
	private String shipyaari_domestic="//div[@id=\"panel_domestic\"]/div[1]/div[1]/div[4]/div[contains(@class,'shipyaari')]/div[5]/div/div/div/button";
	private String selfcollect_domestic="//div[contains(@class,'self-collect')]/div[3]/div/div/div/button";

	//international
	private String aramex_international="//div[@id='panel_international']/div[1]/div[1]/div[3]/div[contains(@class,'aramex')]/div[6]/div/div/div/button";
	private String ownShipping_international="//div[@id='panel_international']/div[1]/div/div[2]/div[contains(@class,'own-shipping')]/div[3]/div/div/div/button";
	private String stdShipping_international_sg="//div[@id='panel_international']/div/div/div/div[contains(@class,'own-shipping')]/div/div/div/div/button";
	private String confirm="//button[text()='Confirm']";
	
	
	// SG
	private String easyShip_domestic="//div[@id='panel_domestic']/div/div[2]/div/div[contains(@class,'easyship')]/div[3]/div/div/div/button";
	private String easyShip_international="//div[@id='panel_international']/div/div[2]/div/div[contains(@class,'easyship')]/div[3]/div/div/div/button";
	
	public void clickConfirm() {
		driver.findElement(By.xpath(confirm)).click();
	}
	
	public void clickAramex_Domestic() {
		driver.findElement(By.xpath(aramex_domestic)).click();
	}
	
	public void clickEasyShip_Domestic() {
		driver.findElement(By.xpath(easyShip_domestic)).click();
	}
	
	public void clickEasyShip_International() {
		driver.findElement(By.xpath(easyShip_international)).click();
	}
	
	public void clickShipyaari_Domestic() {
		driver.findElement(By.xpath(shipyaari_domestic)).click();
	}
	
	public void clickSelfCollect_Domestic() {
		driver.findElement(By.xpath(selfcollect_domestic)).click();
	}
	
	public void clickAramex_International() {
		driver.findElement(By.xpath(aramex_international)).click();
	}
	
	public void clickOwnShipping_International() {
		driver.findElement(By.xpath(ownShipping_international)).click();
	}
	
	public void clickStdShipping_International_SG() {
		driver.findElement(By.xpath(stdShipping_international_sg)).click();
	}
	
	public ShippingOptionsPage(WebDriver driver) {
		this.driver=driver;
		new WebDriverWait(driver,30);
	}
	
	public void clickNext() {
		if(driver.findElement(By.xpath(next)).isDisplayed())
			driver.findElement(By.xpath(next)).click();
	}
	
	public void clickEnableSelfCollect() {
		driver.findElement(By.xpath(enable_selfCollectOption)).click();
	}
	
	public String listOfShippingProviders() {
		return driver.findElement(By.xpath(shipping_provider_list)).getText();
	}
	
	public void clickEnableShipping(int shipping_option_num) {
		driver.findElement(By.xpath(""+enable_shipping_option+"["+shipping_option_num+"]")).click();
	}
	
	public void clickViewShippingOptionsLink(int shipping_option_num) {
		driver.findElement(By.xpath(""+viewShippingRatesLink+"["+shipping_option_num+"]")).click();
	}
	
	public void enableFreeShippingforDomestic() {
		driver.findElement(By.xpath(enable_free_shipping_domestic)).click();
	}
	
	public void enableFreeShippingforInternational() {
		driver.findElement(By.xpath(enable_free_shipping_international)).click();
	}
	
	public void clickDomesticShippingTab() {
		driver.findElement(By.xpath(shipping_domestic_tab)).click();
	}
	
	public void clickInternatioanlShippingTab() {
		driver.findElement(By.xpath(shipping_international_tab)).click();
	}
	
	public void addSelfCollectDetails(String text) {
		driver.findElement(By.xpath(self_collect_details)).sendKeys(""+text);
	}
	
	public void clickSave() {
		driver.findElement(By.xpath(saveButton)).click();
	}
	
	public void clickCancel() {
		driver.findElement(By.xpath(cancelButton)).click();
	}
	
	public void addFlatShippingFeeCharges(Float charges) {
		driver.findElement(By.xpath(flatShippingFreeCharge)).sendKeys(""+charges);
	}

}
