package TemplateCategories;
import org.openqa.selenium.WebDriver;
import TemplateActions.TemplateActions;

public class ClothingTemplate {
	
	public String clothing_template = "//div[contains(@data-name,'Clothing - ')]";
	TemplateActions templateactions;
	
	public ClothingTemplate(WebDriver driver) {
		
		templateactions = new TemplateActions(driver);
	}
	
	public void clickEditTemplate(int template_no) 
	{
		templateactions.clickEditTemplate(clothing_template, template_no);
	}
	
	public void clickPreview(int template_no) 
	{
		templateactions.clickPreview(clothing_template, template_no);
	}
	
	
}
