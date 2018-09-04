package TemplateCategories;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import TemplateActions.TemplateActions;

public class FashionAccessoriesTemplate {
	
	private String fashion_accessories_template = "//div[contains(@data-name,'Jewellery - 0";
	private String temp="')]";
	TemplateActions templateactions;
	WebDriver driver;
	
	public FashionAccessoriesTemplate(WebDriver driver) {
		this.driver=driver;
		templateactions = new TemplateActions(driver);
	}
	
	public void clickEditTemplate(int template_no) 
	{
		templateactions.clickEditTemplate(fashion_accessories_template+template_no+temp);
	}
	
	public void clickPreview(int template_no) 
	{
		templateactions.clickPreview(fashion_accessories_template+template_no+temp);
	}
	
	public void clickCategory() {
		driver.findElement(By.xpath("//a[text()='Fashion accessories']")).click();
	}

}
