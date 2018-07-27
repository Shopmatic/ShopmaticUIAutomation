package Website;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProductShippingDetails {
	
	public ProductShippingDetails(WebDriver driver) {
		this.driver = driver;
	}

	WebDriver driver;
	
	private String product_quantity="//input[@id='quantity']";
	private String addToCart="//input[@value='Add to cart']";
	private String discount_code="//input[@name='carts_discount_form[code]']";
	private String apply_discount="//input[@value='Apply']";
	private String subTotal="//div[contains(@class,'row products')]/div[contains(@class,'subtotal')]";
	private String total="//div[contains(@class,'total')]/div[contains(@class,'subtotal')]";
	private String checkout="//a[text()='Checkout']";
	private String cart_email="//input[@id='carts_check_email_form_email']";
	private String continue_button="//input[@value='Continue']";
	
	//shipping details
	
	private String fname="//input[@name='carts_contact_info_form[first_name]']";
	private String lname="//input[@name='carts_contact_info_form[last_name]']";
	private String addr="//textarea[@name='carts_contact_info_form[address_hash][street_address]']";
	private String landmark="//input[@name='carts_contact_info_form[address_hash][landmark]']";
	private String state="//div[contains(@id,'form_address_hash_state')]";
	private String city="//div[contains(@id,'form_address_hash_city')]";
	private String country="//div[contains(@id,'form_address_hash_country')]";
	private String postcode="//input[@name='carts_contact_info_form[address_hash][postcode]']";
	private String ph_no="//input[@name='carts_contact_info_form[phone]']";
	
	
	private String save_cust_info="//label[@for='carts_contact_info_form_save_info']/preceding-sibling::span";
	private String subscribe_to_emails="//label[@for='carts_contact_info_form_subscribed']/preceding-sibling::span";
	private String continue_shipping="//a[text()='Continue']/span";
	private String login="//a[@class='login-here']";
	private String password_to_save_cust_info="//input[@id='carts_contact_info_form_user_password']";
	
	//shipping Details
	private String shipping_method = "//div[@class='";
	
	public void selectShippingMethod(String text) {
		driver.findElement(By.xpath(shipping_method+text+"']")).click();
	}

	public void addState(String s) throws InterruptedException {
		driver.findElement(By.xpath(state)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='s2id_autogen7_search']")).sendKeys(""+s);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='s2id_autogen7_search']")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='s2id_autogen7_search']")).sendKeys(Keys.ENTER);

	}
	
	public void addCountry(String country_name) {
		
	}
	
	public void addCity(String city_name) throws InterruptedException {
		driver.findElement(By.xpath(city)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='s2id_autogen5_search']")).click();
		driver.findElement(By.xpath("//input[@id='s2id_autogen5_search']")).sendKeys(""+city_name+"\n");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='s2id_autogen5_search']")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='s2id_autogen5_search']")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[@id='select2-drop']/ul/li/div/span")).click();
		Thread.sleep(1000);
	}
	
	public void clickContinue() {
		driver.findElement(By.xpath(continue_button)).click();
	}
	
	public void clickCheckout() {
		driver.findElement(By.xpath(checkout)).click();
	}
	public void clickApply() {
		driver.findElement(By.xpath(apply_discount)).click();
	}
	
	public String getSubTotal() {
		return driver.findElement(By.xpath(subTotal)).getText();
	}
	public String getTotal() {
		return driver.findElement(By.xpath(total)).getText();
	}
	
	public void addQuantity(String qty) {
		Select dropdown=new Select(driver.findElement(By.xpath(product_quantity)));
		dropdown.selectByValue(qty);
	}
	
	public void clickAddToCart() {
		driver.findElement(By.xpath(addToCart)).click();		
	}
	
	public void addDiscountCode(String code) {
		driver.findElement(By.xpath(discount_code)).sendKeys(""+code);
	}
	
	public void addEmailToCart(String email) {
		driver.findElement(By.xpath(cart_email)).sendKeys(""+email);
	}
	
	public void addFirstName(String name) {
		driver.findElement(By.xpath(fname)).sendKeys(""+name);
	}
	
	public void addLastName(String name) {
		driver.findElement(By.xpath(lname)).sendKeys(""+name);
	}
	
	public void addStreetAddr(String address) {
		driver.findElement(By.xpath(addr)).sendKeys(""+address);
	}
	
	public void addLandmark(String address) {
		driver.findElement(By.xpath(landmark)).sendKeys(""+address);
	}
	
	public void addPostCode(String pin) {
		driver.findElement(By.xpath(postcode)).sendKeys(""+pin);
	}
	public void addPhone(String num) {
		driver.findElement(By.xpath(ph_no)).sendKeys(""+num);
	}
	public void addPassword(String pwd) {
		driver.findElement(By.xpath(password_to_save_cust_info)).sendKeys(""+pwd);
	}
	
	public void clickSaveInfoFuturePurposes() {
		driver.findElement(By.xpath(save_cust_info)).click();
	}
	public void clickSubscribeToMarketingEmails() {
		driver.findElement(By.xpath(subscribe_to_emails)).click();
	}
	
	public void clickShippingContinue() {
		driver.findElement(By.xpath(continue_shipping)).click();
	}
	public void clickLoginHere() {
		driver.findElement(By.xpath(login)).click();
	}

}
