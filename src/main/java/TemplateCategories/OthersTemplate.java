package TemplateCategories;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import TemplateActions.TemplateActions;

public class OthersTemplate {
	
	private String electronics_template = "//div[contains(@data-name,'Electronics - 01')]";
	private String health_template = "//div[contains(@data-name,'Health - 01')]";
	private String toys_template = "//div[contains(@data-name,'Toys - 01')]";
	private String gifts_template = "//div[contains(@data-name,'Gifts - 01')]";
	TemplateActions templateactions;
	
	public OthersTemplate(WebDriver driver) {		
		templateactions = new TemplateActions(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void clickEditElectronicsTemplate() 
	{
		templateactions.clickEditTemplate(electronics_template);
	}
	
	public void clickElectronicsTemplatePreview() 
	{
		templateactions.clickPreview(electronics_template);
	}
	
	public void clickEditHealthTemplate() 
	{
		templateactions.clickEditTemplate(health_template);
	}
	
	public void clickHealthTemplatePreview() 
	{
		templateactions.clickPreview(health_template);
	}
	
	public void clickEditToysTemplate() 
	{
		templateactions.clickEditTemplate(toys_template);
	}
	
	public void clickToysTemplatePreview() 
	{
		templateactions.clickPreview(toys_template);
	}
	
	public void clickEditGiftsTemplate() 
	{
		templateactions.clickEditTemplate(gifts_template);
	}
	
	public void clickGiftsTemplatePreview() 
	{
		templateactions.clickPreview(gifts_template);
	}

}
