package BasePageOptions.Marketing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Seo {
	WebDriver driver;
	
	public Seo(WebDriver driver) {
		this.driver=driver;
	}
	
	private String titleAndMetaDescriptionForPages="//select[@name='page[id]']";
	private String titleAndMetaDescriptionForPageTitle="//input[@id='page_title']";
	private String titleAndMetaDescriptionForPageDescription="//textarea[@id='page_description']";
	private String saveTitleAndMetaDescriptionForPages="//input[@value='Save'][1]";
	private String saveGoogleSiteVerification="//input[@value='Save'][2]";
	private String addGoogleSiteVerificationNumber="//textarea[@id='google_site_verification_id']";


	public void clickSaveTitleAndMetaDescriptionForPages() {
		driver.findElement(By.xpath(saveTitleAndMetaDescriptionForPages)).click();
	}
	
	public void clicksaveGoogleSiteVerification() {
		driver.findElement(By.xpath(saveGoogleSiteVerification)).click();
	}
	
	public void clickTitleAndMetaDescriptionForPagesDropdown() {
		driver.findElement(By.xpath(titleAndMetaDescriptionForPages)).click();
	}
	
	public void selectTitleAndMetaDescriptionForPagesDropdown(String text) {
		Select dropdown=new Select(driver.findElement(By.xpath(titleAndMetaDescriptionForPages)));
		dropdown.selectByVisibleText(text);
	}
	
	public void addTitleAndMetaDescriptionForPagesTitle(String text) {
		driver.findElement(By.xpath(titleAndMetaDescriptionForPageTitle)).sendKeys(""+text);

	}
	
	public void addTitleAndMetaDescriptionForPagesDescription(String text) {
		driver.findElement(By.xpath(titleAndMetaDescriptionForPageDescription)).sendKeys(""+text);

	}
	
	public void addGoogleSiteVerificationNumber(String text) {
		driver.findElement(By.xpath(addGoogleSiteVerificationNumber)).sendKeys(""+text);

	}
	
	public String getMessage() {
		return driver.findElement(By.xpath("//div[contains(@class,'alert-success')]/div")).getText();
	}

}
