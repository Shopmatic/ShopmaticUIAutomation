package TemplateCategories;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import TemplateActions.TemplateActions;

public class EducationTemplate {
	
	private String education_template = "//div[contains(@data-name,'Education - 0";
	private String temp="')]";
	TemplateActions templateactions;
	WebDriver driver;
	
	public EducationTemplate(WebDriver driver) {
		this.driver=driver;
		templateactions = new TemplateActions(driver);
	}
	
	public void clickEditTemplate(int template_no) 
	{
		templateactions.clickEditTemplate(education_template+template_no+temp);
	}
	
	public void clickPreview(int template_no) 
	{
		templateactions.clickPreview(education_template+template_no+temp);
	}
	
	public void clickCategory() {
		driver.findElement(By.xpath("//a[text()='Education']")).click();
	}

}
