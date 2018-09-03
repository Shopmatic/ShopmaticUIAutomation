package TemplateCategories;
import org.openqa.selenium.WebDriver;
import TemplateActions.TemplateActions;

public class AllTemplate {
	
	private String electronics_template = "//div[contains(@data-name,'Electronics - 01')]";
	private String health_template = "//div[contains(@data-name,'Health - 01')]";
	private String toys_template = "//div[contains(@data-name,'Toys - 01')]";
	private String gifts_template = "//div[contains(@data-name,'Gifts - 01')]";
	private String beautyAndWellness_template = "//div[contains(@data-name,'Beauty - 0";
	private String blank_template = "//div[@data-name='Others - 01']";
	public String clothing_template = "//div[contains(@data-name,'Clothing - 0";
	private String decor_furniture_template = "//div[contains(@data-name,'Decor - 0";
	private String education_template = "//div[contains(@data-name,'Education - 0";
	private String fashion_accessories_template = "//div[contains(@data-name,'Jewellery - 0";
	private String groceries_template = "//div[contains(@data-name,'Grocery - 0";
	private String health_services_template = "//div[contains(@data-name,'Health - 0";
	private String interior_design_template = "//div[contains(@data-name,'Interior - 0";
	private String kitchen_houseware_template = "//div[contains(@data-name,'Kitchen - 0";
	private String real_estate_template = "//div[contains(@data-name,'Estate - 0";
	private String weddings_events_template = "//div[contains(@data-name,'Wedding - 0";
	private String temp="')]";

	TemplateActions templateactions;
	
	public AllTemplate(WebDriver driver) {
		
		templateactions = new TemplateActions(driver);
	}
	
	public void clickEditElectronicsTemplate() 
	{
		templateactions.clickEditTemplate(electronics_template);
	}
	
	public void clickElectronicsTemplatePreview() 
	{
		templateactions.clickPreview(electronics_template);
	}
	
	public void clickEditHealthTemplate() 
	{
		templateactions.clickEditTemplate(health_template);
	}
	
	public void clickHealthTemplatePreview() 
	{
		templateactions.clickPreview(health_template);
	}
	
	public void clickEditToysTemplate() 
	{
		templateactions.clickEditTemplate(toys_template);
	}
	
	public void clickToysTemplatePreview() 
	{
		templateactions.clickPreview(toys_template);
	}
	
	public void clickEditGiftsTemplate() 
	{
		templateactions.clickEditTemplate(gifts_template);
	}
	
	public void clickGiftsTemplatePreview() 
	{
		templateactions.clickPreview(gifts_template);
	}
	
	public void clickEditBeautyAndWellness(int template_no) 
	{
		templateactions.clickEditTemplate(beautyAndWellness_template+template_no+temp);
	}
	
	public void clickBeautyAndWellnessPreview(int template_no) 
	{
		templateactions.clickPreview(beautyAndWellness_template+template_no+temp);
	}
	
	public void clickEditBlankTemplate() 
	{
		templateactions.clickEditTemplate(blank_template);
	}
	
	public void clickPreviewBlankTemplate() 
	{
		templateactions.clickPreview(blank_template);
	}
	
	public void clickEditClothingTemplate(int template_no) 
	{
		templateactions.clickEditTemplate(clothing_template+template_no+temp);
	}
	
	public void clickClothingPreview(int template_no) 
	{
		templateactions.clickPreview(clothing_template+template_no+temp);
	}
	
	public void clickEditDecorAndFurnitureTemplate(int template_no) 
	{
		templateactions.clickEditTemplate(decor_furniture_template+template_no+temp);
	}
	
	public void clickDecorAndFurniturePreview(int template_no) 
	{
		templateactions.clickPreview(decor_furniture_template+template_no+temp);
	}

	public void clickEditEducationTemplate(int template_no) 
	{
		templateactions.clickEditTemplate(education_template+template_no+temp);
	}
	
	public void clickdEducationPreview(int template_no) 
	{
		templateactions.clickPreview(education_template+template_no+temp);
	}
	
	public void clickEditFashionAccessoriesTemplate(int template_no) 
	{
		templateactions.clickEditTemplate(fashion_accessories_template+template_no+temp);
	}
	
	public void clickFashionAccessoriesPreview(int template_no) 
	{
		templateactions.clickPreview(fashion_accessories_template+template_no+temp);
	}
	
	public void clickEditGroceriesTemplate(int template_no) 
	{
		templateactions.clickEditTemplate(groceries_template+template_no+temp);
	}
	
	public void clickGroceriesPreview(int template_no) 
	{
		templateactions.clickPreview(groceries_template+template_no+temp);
	}
	
	public void clickEditHealthServicesTemplate(int template_no) 
	{
		templateactions.clickEditTemplate(health_services_template+template_no+temp);
	}
	
	public void clickHealthServicesPreview(int template_no) 
	{
		templateactions.clickPreview(health_services_template+template_no+temp);
	}
	
	public void clickEditInteriorDesignTemplate(int template_no) 
	{
		templateactions.clickEditTemplate(interior_design_template+template_no+temp);
	}
	
	public void clickInteriorDesignPreview(int template_no) 
	{
		templateactions.clickPreview(interior_design_template+template_no+temp);
	}
	public void clickEditKitchenAndHousewareTemplate(int template_no) 
	{
		templateactions.clickEditTemplate(kitchen_houseware_template+template_no+temp);
	}
	
	public void clickKitchenAndHousewarePreview(int template_no) 
	{
		templateactions.clickPreview(kitchen_houseware_template+template_no+temp);
	}
	
	public void clickEditRealEstateTemplate(int template_no) 
	{
		templateactions.clickEditTemplate(real_estate_template+template_no+temp);
	}
	
	public void clickRealEstatePreview(int template_no) 
	{
		templateactions.clickPreview(real_estate_template+template_no+temp);
	}
	
	public void clickEditWeddingsAndEventsTemplate(int template_no) 
	{
		templateactions.clickEditTemplate(weddings_events_template+template_no+temp);
	}
	
	public void clickWeddingsAndEventsPreview(int template_no) 
	{
		templateactions.clickPreview(weddings_events_template+template_no+temp);
	}
}
