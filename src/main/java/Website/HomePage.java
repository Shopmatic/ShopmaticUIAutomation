package Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	WebDriver driver;
	
	private String home="//li[@data-name='home'][1]";
	private String about_us="//li[@data-name='about-us'][1]";
	private String shipping_returns="//li[@data-name='shipping-returns'][1]";
	private String faq="//li[@data-name='faq'][1]";
	private String contact_us="//li[@data-name='contact-us'][1]";
	private String all_products="//li[@data-name='all-products']";
	private String options="//li[@data-name='";
	private String product_search="//input[@id='search_query']";
	private String product_search_button="//i[@id='product-search-btn']";
	private String sort_by="//button[contains(text(), 'Sort by')]";
	private String choose_Product="//div[contains(@class, 'product-column')]";
	private String cart="//div[contains(@class, 'cart')]";
	private String checkout="//a[text()='PROCEED TO CHECKOUT']";
	
	public void clickCart() {
		driver.findElement(By.xpath(cart)).click();
	}
	
	public void clickCheckout() {
		driver.findElement(By.xpath(checkout)).click();
	}
	
	public void selectSortBy(String optn) {
		Select dropdown=new Select(driver.findElement(By.xpath(sort_by)));
		dropdown.selectByValue(optn);
	}
	
	public void addProductSearch(String text) {
		driver.findElement(By.xpath(product_search)).clear();
		driver.findElement(By.xpath(product_search)).sendKeys(""+text);
	}
	
	public void clickSelectProduct(int prd_id) {
		driver.findElement(By.xpath(choose_Product+"["+prd_id+"]")).click();
	}
	
	public void clickProductSearchButton() {
		driver.findElement(By.xpath(product_search_button)).click();
	}
	
	public void clickOptions(String optn) {
		driver.findElement(By.xpath(options+optn+"']s")).click();
	}
	
	public void clickAllProducts() {
		driver.findElement(By.xpath(all_products)).click();
	}
	
	public void clickHome() {
		driver.findElement(By.xpath(home)).click();
	}
	public void clickAbout_us() {
		driver.findElement(By.xpath(about_us)).click();
	}
	public void clickShipping_returns() {
		driver.findElement(By.xpath(shipping_returns)).click();
	}
	public void clickFaq() {
		driver.findElement(By.xpath(faq)).click();
	}
	public void clickContact_us() {
		driver.findElement(By.xpath(contact_us)).click();
	}


}
