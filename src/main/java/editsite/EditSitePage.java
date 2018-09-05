package editsite;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BaseClass.BaseClass_Login;

public class EditSitePage extends BaseClass_Login{
	WebDriver driver;

	public EditSitePage(WebDriver driver) throws IOException, InvalidFormatException 
	{
			super();
			this.driver = driver;
	}
		
	private String site_setting="//div[@data-for='page-setting-btn-tip']";	
	private String changeDesignTemplate="//div[@class='site-settings-list-item']/span[text()='Change design template']";
	private String confirm_template_switch="//button[@class='confirm-btn']";
	private String save="//a[contains(@data-for,'save-btn')]";
	
	public void clickSiteSetting() {
		driver.findElement(By.xpath(site_setting)).click();
	}
	
	public void clickChangeDesignTemplate() {
		driver.findElement(By.xpath(changeDesignTemplate)).click();
	}
	
	public void clickConfirm_template_switch() {
		driver.findElement(By.xpath(confirm_template_switch)).click();
	}
	
	public void clickSave() {
		driver.findElement(By.xpath(save)).click();
	}
}
