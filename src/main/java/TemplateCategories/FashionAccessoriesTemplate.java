package TemplateCategories;
import org.openqa.selenium.WebDriver;
import TemplateActions.TemplateActions;

public class FashionAccessoriesTemplate {
	
	private String fashion_accessories_template = "//div[contains(@data-name,'Jewellery - ')]";
	
TemplateActions templateactions;
	
	public FashionAccessoriesTemplate(WebDriver driver) {
		
		templateactions = new TemplateActions(driver);
	}
	
	public void clickEditTemplate(int template_no) 
	{
		templateactions.clickEditTemplate(fashion_accessories_template, template_no);
	}
	
	public void clickPreview(int template_no) 
	{
		templateactions.clickPreview(fashion_accessories_template, template_no);
	}

}
