package TemplateCategories;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import TemplateActions.TemplateActions;

public class RealEstateTemplate {
	
	private String real_estate_template = "//div[contains(@data-name,'Estate - 0";
	private String temp="')]";
	TemplateActions templateactions;
	WebDriver driver;
	
	public RealEstateTemplate(WebDriver driver) {
		this.driver=driver;
		templateactions = new TemplateActions(driver);
	}
	
	public void clickEditTemplate(int template_no) 
	{
		templateactions.clickEditTemplate(real_estate_template+template_no+temp);
	}
	
	public void clickPreview(int template_no) 
	{
		templateactions.clickPreview(real_estate_template+template_no+temp);
	}
	
	public void clickCategory() {
		driver.findElement(By.xpath("//a[text()='Real estate']")).click();
	}

}
