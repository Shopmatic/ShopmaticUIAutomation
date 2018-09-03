package TemplateCategories;
import org.openqa.selenium.WebDriver;
import TemplateActions.TemplateActions;

public class GroceriesTemplate {
	
	private String groceries_template = "//div[contains(@data-name,'Grocery - 0";
	private String temp="')]";
	
TemplateActions templateactions;
	
	public GroceriesTemplate(WebDriver driver) {
		
		templateactions = new TemplateActions(driver);
	}
	
	public void clickEditTemplate(int template_no) 
	{
		templateactions.clickEditTemplate(groceries_template+template_no+temp);
	}
	
	public void clickPreview(int template_no) 
	{
		templateactions.clickPreview(groceries_template+template_no+temp);
	}

}
