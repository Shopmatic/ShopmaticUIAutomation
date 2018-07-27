package TemplateCategories;
import org.openqa.selenium.WebDriver;
import TemplateActions.TemplateActions;

public class WeddingsAndEventsTemplate {
	
	private String weddings_events_template = "//div[contains(@data-name,'Wedding - ')]";
	
TemplateActions templateactions;
	
	public WeddingsAndEventsTemplate(WebDriver driver) {
		
		templateactions = new TemplateActions(driver);
	}
	
	public void clickEditTemplate(int template_no) 
	{
		templateactions.clickEditTemplate(weddings_events_template, template_no);
	}
	
	public void clickPreview(int template_no) 
	{
		templateactions.clickPreview(weddings_events_template, template_no);
	}

}
