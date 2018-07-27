package TemplateCategories;
import org.openqa.selenium.WebDriver;
import TemplateActions.TemplateActions;

public class BlankTemplate {
	
	private String blank_template = "//div[@data-name='Others - 01']";
	
TemplateActions templateactions;
	
	public BlankTemplate(WebDriver driver) {
		
		templateactions = new TemplateActions(driver);
	}
	
	public void clickEditTemplate() 
	{
		templateactions.clickEditTemplate(blank_template);
	}
	
	public void clickPreview() 
	{
		templateactions.clickPreview(blank_template);
	}

}
