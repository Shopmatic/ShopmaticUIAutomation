package checkout2_0;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	private String checkout="";
	private String home="";
	private String aboutus="";
	private String shipping_return="";
	private String faq="";
	private String contact_us="";
	private String all_products="";
	private String continue_shopping="";
	private String delete_cart_item="";
	private String modify_qty_cart_item="";
	private String cart_total_amount="";
	private String cart="";
	private String product_search="";
	private String product_search_button="";
	private String sort_by="";
	private String choose_Product="";
	private String options="";

	public void clickCart() {
		driver.findElement(By.xpath(cart)).click();
	}
	
	public void clickCheckout() {
		driver.findElement(By.xpath(checkout)).click();
	}
	
	public void clickDeleteCartItem(String item_num) {
		driver.findElement(By.xpath(delete_cart_item+item_num+"']")).click();
	}
	
	public void changeCartItemQuantity(String item_num,String qty) {
		Select dropdown=new Select(driver.findElement(By.xpath(modify_qty_cart_item+item_num+"']")));
		dropdown.selectByValue(qty);
	}
	
	public void clickContinueShopping() {
		driver.findElement(By.xpath(continue_shopping)).click();
	}
	
	public String getCartTotalAmount() {
		return driver.findElement(By.xpath(cart_total_amount)).getText();
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
		driver.findElement(By.xpath(aboutus)).click();
	}
	public void clickShipping_returns() {
		driver.findElement(By.xpath(shipping_return)).click();
	}
	public void clickFaq() {
		driver.findElement(By.xpath(faq)).click();
	}
	public void clickContact_us() {
		driver.findElement(By.xpath(contact_us)).click();
	}

}
