package TemplateCategories;
import org.openqa.selenium.WebDriver;
import TemplateActions.TemplateActions;

public class BeautyAndWellnessTemplate {
	
	private String beautyAndWellness_template = "//div[contains(@data-name,'Beauty - 0";
	private String temp="')]";
TemplateActions templateactions;
	
	public BeautyAndWellnessTemplate(WebDriver driver) {
		
		templateactions = new TemplateActions(driver);
	}
	
	public void clickEditTemplate(int template_no) 
	{
		templateactions.clickEditTemplate(beautyAndWellness_template+template_no+temp);
	}
	
	public void clickPreview(int template_no) 
	{
		templateactions.clickPreview(beautyAndWellness_template+template_no+temp);
	}

}
