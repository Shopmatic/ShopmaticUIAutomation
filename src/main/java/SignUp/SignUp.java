package SignUp;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUp {
	
	public WebDriver driver;
	
	public SignUp(WebDriver driver) {
		this.driver =driver;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	private String signUpGetStartedLink = "//a[contains(@class,'link-to-signup')]";
	private String signUp_link_IN="//a[contains(text(),'SIGN UP')]";
    private String category_all="All";
    
    private String category_clothing="//ul[@id='category-list']//li[@class='category']/a[text()='Clothing']";
    private String category_fashion_accessories="//ul[@id='category-list']//li[@class='category']/a[contains(text(),'Fashion ')]";
    private String category_decor_furniture="//ul[@id='category-list']//li[@class='category']/a[contains(text(),'Decor ')]";
    private String category_kitchen_houseware="//ul[@id='category-list']//li[@class='category']/a[contains(text(),'Kitchen ')]";
    private String category_groceries="//ul[@id='category-list']//li[@class='category']/a[(text()='Groceries')]";
    private String category_beauty_wellness="//ul[@id='category-list']//li[@class='category']/a[contains(text(),'Beauty ')]";
    private String category_education="//ul[@id='category-list']//li[@class='category']/a[(text()='Education')]";
    private String category_weddings_events="//ul[@id='category-list']//li[@class='category']/a[contains(text(),'Weddings ')]";
    private String category_health_services="//ul[@id='category-list']//li[@class='category']/a[contains(text(),'Health ')]";   
    private String category_interior_design="//ul[@id='category-list']//li[@class='category']/a[contains(text(),'Interior ')]";
    private String category_real_estate="//ul[@id='category-list']//li[@class='category']/a[contains(text(),'Real ')]";
    private String category_others="//ul[@id='category-list']//li[@class='category']/a[(text()='Others')]";
    private String category_blank_template="//ul[@id='category-list']//li[@class='category']/a[contains(text(),'Blank ')]";
	
	
  
	public void clickSignUp() {
		driver.findElement(By.xpath(signUp_link_IN)).click();
	}
	
	public void clickSignUpGetStarted() {
		driver.findElement(By.xpath(signUpGetStartedLink)).click();
	}
	
	public void clickCategoryAll(WebDriver driver) {
		driver.findElement(By.xpath(category_all)).click();
	}
	public void clickCategoryClothing(WebDriver driver) {
		driver.findElement(By.xpath(category_clothing)).click();
	}
	public void clickCategoryFashionAccessories(WebDriver driver) {
		driver.findElement(By.xpath(category_fashion_accessories)).click();
	}
	public void clickCategoryDecorFurniture(WebDriver driver) {
		driver.findElement(By.xpath(category_decor_furniture)).click();
	}
	public void clickKitchenHouseware(WebDriver driver) {
		driver.findElement(By.xpath(category_kitchen_houseware)).click();
	}
	public void clickCategoryGroceries(WebDriver driver) {
		driver.findElement(By.xpath(category_groceries)).click();
	}
	public void clickCategoryBeautyWellness(WebDriver driver) {
		driver.findElement(By.xpath(category_beauty_wellness)).click();
	}
	public void clickCategoryEducation(WebDriver driver) {
		driver.findElement(By.xpath(category_education)).click();
	}
	public void clickCategoryWeddingsEvents(WebDriver driver) {
		driver.findElement(By.xpath(category_weddings_events)).click();
	}
	public void clickCategoryHealthServices(WebDriver driver) {
		driver.findElement(By.xpath(category_health_services)).click();
	}
	public void clickCategoryInteriorDesign(WebDriver driver) {
		driver.findElement(By.xpath(category_interior_design)).click();
	}
	public void clickCategoryRealEstate(WebDriver driver) {
		driver.findElement(By.xpath(category_real_estate)).click();
	}
	public void clickCategoryOthers(WebDriver driver) {
		driver.findElement(By.xpath(category_others)).click();
	}
	public void clickCategoryBlankTemplate() {
		driver.findElement(By.xpath(category_blank_template)).click();
	}

}
