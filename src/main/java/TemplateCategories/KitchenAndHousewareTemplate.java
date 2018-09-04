package TemplateCategories;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import TemplateActions.TemplateActions;

public class KitchenAndHousewareTemplate {
	
	private String kitchen_houseware_template = "//div[contains(@data-name,'Kitchen - 0";
	private String temp="')]";
	TemplateActions templateactions;
	WebDriver driver;
	
	public KitchenAndHousewareTemplate(WebDriver driver) {
		this.driver=driver;
		templateactions = new TemplateActions(driver);
	}
	
	public void clickEditTemplate(int template_no) 
	{
		templateactions.clickEditTemplate(kitchen_houseware_template+template_no+temp);
	}
	
	public void clickPreview(int template_no) 
	{
		templateactions.clickPreview(kitchen_houseware_template+template_no+temp);
	}
	
	public void clickCategory() {
		driver.findElement(By.xpath("//a[text()='Kitchen & Houseware']")).click();
	}

}
