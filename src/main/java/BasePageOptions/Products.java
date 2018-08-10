package BasePageOptions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Products {
	WebDriver driver;
	
	public Products(WebDriver driver) {
		this.driver=driver;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	private String productsOption="//a[@data-name='products']";
	private String moreproductsOption="//a[contains(@class,'add-product-btn')]";

	private String productsName="//input[@id='product_form_product_attributes_name']";
	private String saveProduct="//div/a[@class='submit']";
	private String cancelProduct="//div/a[@class='cancel']";
	private String productBasicInfo="//a[text()='Basic info']";
	private String productOptions="//span[text()='Product options']";
	private String productTaxes="//a[text()='Taxes']";

	private String productDescription="//textarea[@name='product_form[product_attributes][description]']";
	private String sellingPrice="//input[@id='product_form_product_attributes_price']";
	private String originalPrice="//input[@id='product_form_product_attributes_list_price']";
	private String category="//div[@id='s2id_product_form_product_attributes_category_ids']/ul/li/input";
	private String totalStockQty="//input[@id='product_form_product_attributes_stock_sum']";
	private String uploadimage="//input[@id='upload-button']";
	private String skipEditing="//a[contains(@class,'skip-link')]";
	private String editHomePage="//a[contains(@class,'next-link')]";
	
	private String add_product="//div[contains(@class,'builder-side')]/a[@class='add-product-btn']";
	private String import_products="//a[contains(@class,'import-product-btn')]";
	private String import_options="//div[@class='modal-content']/div/div/a/img[contains(@alt,";
	
	private String all_products="//div[@class='navbar-content-pane']/a[@data-action='show']";
	private String selectCategory="//a[@data-action='show']/span[@class='title' and text()='";
	
	private String add_subcategory="//span[@class='title' and text()='";
	private String list_of_products="//ul[@class='product-list']/li/div[@class='product-info']/span[@class='product-name']";
	
	//Taxes
	private String gst_in="//input[@id='product_form_product_attributes_taxes_applicable_sales']";
	private String taxes_tab="//a[@href='#product_form_tab3_new']";
	
	//Shipping details
	private String more_settings="//span[text()='More settings']";
	private String length="//input[@id='product_form_product_attributes_shipping_details_length']";
	private String height = "//input[@id='product_form_product_attributes_shipping_details_height']";
	private String width = "//input[@id='product_form_product_attributes_shipping_details_width']";
	private String totalWeight = "//input[@id='product_form_product_attributes_shipping_details_weight']";
	private String inventorySKU="//input[@id='product_form_product_attributes_sku']";
	private String upc="//input[@id='product_form_product_attributes_upc_code']";
	private String allow_purchase_oos="//label[@for='product_form_product_attributes_allow_oversell' and @class='switch-paddle float-right']";
	private String show_prd_in_store="//label[@for='product_form_unpublishing' and @class='switch-paddle float-right']";
	
	WebElement element;
	
	public void addGST_IN(String tax) 
	{
		driver.findElement(By.xpath(gst_in)).sendKeys(""+tax);
	}
	
	public void clickTaxes() 
	{
		driver.findElement(By.xpath(taxes_tab)).click();
	}
	
	public void addLength(String dim) 
	{
		driver.findElement(By.xpath(length)).sendKeys(""+dim);
	}
	
	public void addHeight(String dim) 
	{
		driver.findElement(By.xpath(height)).sendKeys(""+dim);
	}

	public void addWidth(String dim) 
	{
		driver.findElement(By.xpath(width)).sendKeys(""+dim);
	}

	public void addTotalWeight(String dim) 
	{
		driver.findElement(By.xpath(totalWeight)).sendKeys(""+dim);
	}

	public void addInventorySKU(String sku) 
	{
		driver.findElement(By.xpath(inventorySKU)).sendKeys(""+sku);
	}

	public void addUpc(String dim) 
	{
		driver.findElement(By.xpath(upc)).sendKeys(""+dim);
	}

	public void enableAllowPurchaseOOS() 
	{
		driver.findElement(By.xpath(allow_purchase_oos)).click();
	}
	
	public void enableShowPrdInStore() 
	{
		driver.findElement(By.xpath(show_prd_in_store)).click();
	}
	
	public void clickCancel() {
		driver.findElement(By.xpath(cancelProduct));
	}
	
	public void clickMoreSettings() {
		driver.findElement(By.xpath(more_settings)).click();
	}
	
	public Boolean isProductPresent(String prod_name) {
		ArrayList<String> plist = new  ArrayList<String>();
		int size = driver.findElements(By.xpath(list_of_products)).size();
		for(int i=0; i<size;i++)
		{
			plist.add(driver.findElements(By.xpath(list_of_products)).get(i).getText());
			if(plist.get(i).contentEquals(prod_name)) {
				return true;
			}
		}
		return false;
	}
	
	public ArrayList<String> listOfProducts() {
		ArrayList<String> plist = new  ArrayList<String>();
		int size = driver.findElements(By.xpath(list_of_products)).size();
		for(int i=0; i<size;i++)
		{
			plist.add(driver.findElements(By.xpath(list_of_products)).get(i).getText());
			
		}
		return plist;
	}
	
	public void addSubCategory(String option) {
		driver.findElement(By.xpath(add_subcategory+option+"']/parent::a/following-sibling::ul")).click();
	}
	
	public void chooseCategory(String option) {
		driver.findElement(By.xpath(selectCategory+option+"']")).click();
	}
	
	public void clickAllProduct() {
		driver.findElement(By.xpath(all_products)).click();
	}
	
	public void clickAddProduct() {
		driver.findElement(By.xpath(add_product)).click();
	} 
	
	public void clickImportProducts() {
		driver.findElement(By.xpath(import_products)).click();
	} 
	
	public void clickImportOptions(String option) {
		driver.findElement(By.xpath(""+import_options+"'"+option+"')]")).click();
	}

	public void clickEditHomePage() {
		driver.findElement(By.xpath(editHomePage)).click();
	} 	
	public void clickSkipEditing() {
		driver.findElement(By.xpath(skipEditing)).click();
	} 
	
	public void clickProductsOption() {
		driver.findElement(By.xpath(productsOption)).click();
	}
	
	public void addMoreproductsOption() {
		driver.findElement(By.xpath(moreproductsOption)).click();
	}
	
	public void addProductsName(String name) {
		driver.findElement(By.xpath(productsName)).sendKeys(""+name);
	}
	
	public void addProductDescription(String name) {
		driver.findElement(By.xpath(productDescription)).sendKeys(""+name);
	}
	
	public void addSellingPrice(String price) {
		driver.findElement(By.xpath(sellingPrice)).sendKeys(""+price);
	}
	
	public void addOriginalPrice(String price) {
		driver.findElement(By.xpath(originalPrice)).sendKeys(""+price);
	}
	
	public void addCategory(String text) {
		element = driver.findElement(By.xpath(category));
		element.sendKeys(""+text);
		element.sendKeys("\n");
	}
	
	public void addTotalStockQty(String text) {
		element=driver.findElement(By.xpath(totalStockQty));
		element.clear();
		element.sendKeys(""+text);
	}
	
	public void clickSave() {
		driver.findElement(By.xpath(saveProduct)).click();
	}
	
	public void clickUploadImage() {
		driver.findElement(By.xpath(uploadimage)).click();
	}
	

}
