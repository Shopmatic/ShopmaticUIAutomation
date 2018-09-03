package TemplateCategories;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import TemplateActions.TemplateActions;

public class WeddingsAndEventsTemplate {
	
	private String weddings_events_template = "//div[contains(@data-name,'Wedding - 0";
	private String temp="')]";
TemplateActions templateactions;
WebDriver driver;
	
	public WeddingsAndEventsTemplate(WebDriver driver) {
		this.driver=driver;
		templateactions = new TemplateActions(driver);	
	}
	
	public void clickEditTemplate(int template_no) 
	{
		templateactions.clickEditTemplate(weddings_events_template+template_no+temp);
	}
	
	public void clickPreview(int template_no) 
	{
		
		templateactions.clickPreview(weddings_events_template+template_no+temp);
	}
	
	public void clickCategory() {
		driver.findElement(By.xpath("//a[text()='Weddings & Events']")).click();
	}

}
