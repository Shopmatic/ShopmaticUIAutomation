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
	private String productMoreSettings="//span[text()='More settings']";

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
	private String list_of_products="//a[contains(@href,'/products/')]/div/div[2]/h1[text()]";
	
	
	WebElement element;
	
	public Boolean isProductPresent(String prod_name) {
		List<WebElement> plist = driver.findElements(By.xpath(list_of_products));
		for(int i=0; i<plist.size();i++)
		{
			System.out.println(plist.get(i).toString());
			if(plist.get(i).toString().contentEquals(prod_name)) {
				return true;
			}
		}
		return false;
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
