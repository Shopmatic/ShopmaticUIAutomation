package TemplateCategories;
import org.openqa.selenium.WebDriver;
import TemplateActions.TemplateActions;

public class DecorAndFurnitureTemplate {
	
	private String decor_furniture_template = "//div[contains(@data-name,'Decor - ')]";
	
TemplateActions templateactions;
	
	public DecorAndFurnitureTemplate(WebDriver driver) {
		
		templateactions = new TemplateActions(driver);
	}
	
	public void clickEditTemplate(int template_no) 
	{
		templateactions.clickEditTemplate(decor_furniture_template, template_no);
	}
	
	public void clickPreview(int template_no) 
	{
		templateactions.clickPreview(decor_furniture_template, template_no);
	}

}
