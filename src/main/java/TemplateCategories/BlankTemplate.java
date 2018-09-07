package TemplateCategories;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import TemplateActions.TemplateActions;

public class BlankTemplate {
	
	private String blank_template = "//div[@data-name='Others - 01']";
	WebDriver driver;
TemplateActions templateactions;
	
	public BlankTemplate(WebDriver driver) {
		this.driver=driver;
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
	
	public void clickCategory() {
		driver.findElement(By.xpath("//a[text()='Blank template']")).click();
	}

}
