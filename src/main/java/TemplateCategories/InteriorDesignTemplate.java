package TemplateCategories;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import TemplateActions.TemplateActions;

public class InteriorDesignTemplate {
	
	private String interior_design_template = "//div[contains(@data-name,'Interior - 0";
	private String temp="')]";
	TemplateActions templateactions;
	WebDriver driver;
	
	public InteriorDesignTemplate(WebDriver driver) {
		this.driver=driver;
		templateactions = new TemplateActions(driver);
	}
	
	public void clickEditTemplate(int template_no) 
	{
		templateactions.clickEditTemplate(interior_design_template+template_no+temp);
	}
	
	public void clickPreview(int template_no) 
	{
		templateactions.clickPreview(interior_design_template+template_no+temp);
	}
	
	public void clickCategory() {
		driver.findElement(By.xpath("//a[text()='Interior design']")).click();
	}

}
