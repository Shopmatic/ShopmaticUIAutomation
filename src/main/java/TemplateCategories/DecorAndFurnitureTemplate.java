package TemplateCategories;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import TemplateActions.TemplateActions;

public class DecorAndFurnitureTemplate {
	
	private String decor_furniture_template = "//div[contains(@data-name,'Decor - 0";
	private String temp="')]";
	TemplateActions templateactions;
	WebDriver driver;
	
	public DecorAndFurnitureTemplate(WebDriver driver) {
		this.driver=driver;
		templateactions = new TemplateActions(driver);
	}
	
	public void clickEditTemplate(int template_no) 
	{
		templateactions.clickEditTemplate(decor_furniture_template+template_no+temp);
	}
	
	public void clickPreview(int template_no) 
	{
		templateactions.clickPreview(decor_furniture_template+template_no+temp);
	}
	
	public void clickCategory() {
		driver.findElement(By.xpath("//a[text()='Decor & Furniture']")).click();
	}

}
