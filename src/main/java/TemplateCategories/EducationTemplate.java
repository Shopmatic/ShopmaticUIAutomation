package TemplateCategories;
import org.openqa.selenium.WebDriver;
import TemplateActions.TemplateActions;

public class EducationTemplate {
	
	private String education_template = "//div[contains(@data-name,'Education - ')]";
	
TemplateActions templateactions;
	
	public EducationTemplate(WebDriver driver) {
		
		templateactions = new TemplateActions(driver);
	}
	
	public void clickEditTemplate(int template_no) 
	{
		templateactions.clickEditTemplate(education_template, template_no);
	}
	
	public void clickPreview(int template_no) 
	{
		templateactions.clickPreview(education_template, template_no);
	}

}
