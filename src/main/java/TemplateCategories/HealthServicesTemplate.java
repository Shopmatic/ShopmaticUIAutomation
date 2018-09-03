package TemplateCategories;
import org.openqa.selenium.WebDriver;
import TemplateActions.TemplateActions;

public class HealthServicesTemplate {
	
	private String health_services_template = "//div[contains(@data-name,'Health - 0";
	private String temp="')]";
TemplateActions templateactions;
	
	public HealthServicesTemplate(WebDriver driver) {
		
		templateactions = new TemplateActions(driver);
	}
	
	public void clickEditTemplate(int template_no) 
	{
		templateactions.clickEditTemplate(health_services_template+template_no+temp);
	}
	
	public void clickPreview(int template_no) 
	{
		templateactions.clickPreview(health_services_template+template_no+temp);
	}

}
