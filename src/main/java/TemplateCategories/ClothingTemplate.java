package TemplateCategories;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import TemplateActions.TemplateActions;

public class ClothingTemplate {
	
	public String clothing_template = "//div[contains(@data-name,'Clothing - 0";
	TemplateActions templateactions;
	private String temp="')]";
	WebDriver driver;
	
	public ClothingTemplate(WebDriver driver) {
		this.driver=driver;
		templateactions = new TemplateActions(driver);
	}
	
	public void clickEditTemplate(int template_no) 
	{
		templateactions.clickEditTemplate(clothing_template+template_no+temp);
	}
	
	public void clickPreview(int template_no) 
	{
		templateactions.clickPreview(clothing_template+template_no+temp);
	}
	
	public void clickCategory() {
		driver.findElement(By.xpath("//a[text()='Clothing']")).click();
	}
}
