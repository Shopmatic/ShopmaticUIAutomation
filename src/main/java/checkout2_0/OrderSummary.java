package checkout2_0;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderSummary {
	public OrderSummary(WebDriver driver) {
		super();
		this.driver = driver;
	}

	WebDriver driver;
	
	private String next="//form[@class='grid-x']/div[10]/input";
	
	
	//right pane
	private String  client_email="//form[@class='grid-x']/div[1]/div[1]/div[2]/input";
	private String  client_phone_num="//form[@class='grid-x']/div[9]/div/div[2]/input";
	private String  shipping_country_1="//span[contains(text(),'Shipping country')]/parent::div/following-sibling::div";
	private String  shipping_country_2="/div/div/div[2]/div/input";
	private String  shipping_address="//form[@class='grid-x']/div[5]/div/div[2]/input";
	private String  shipping_city="//form[@class='grid-x']/div[6]/div/div[2]/input";
	private String  shipping_state="//form[@class='grid-x']/div[8]/div/div[2]/input";
	private String  shipping_post_code="//form[@class='grid-x']/div[7]/div/div[2]/input";
	private String  shipping_district="";
	
	private String  sign_in_pop_up_link="";
	private String  save_and_continue="";
	private String  client_password="";
	private String  sign_in_btn="";
	private String  checkout_as_guest="";
	private String fname="//form[@class='grid-x']/div[2]/div/div[2]/input";
	private String lname="//form[@class='grid-x']/div[3]/div/div[2]/input";
	
	//Sign in/up popup
	private String email="";
	private String  password="";
	private String  sign_in_button="";
	private String  register_link="";
	private String  forgot_password_link="";
	private String sign_in_error_msg="";
	private String email_error_validation_msg="";
	private String password_error_validation_msg="";
	private String sign_in_link="";
	
	//Shipping options
	private String  choose_shipping_option_radio_btn="";
	private String  shipping_amount="";
	private String  shipping_client_note="";
	private String  proceed_to_pay="";
	
	//Payment options
	private String  choose_payment_option_radio_btn="";
	private String  order_now="";
	private String  promotions_chkbox="";
	private String register_chkbox="";
	
	//credit card 
	
	private String credit_card_number="";
	private String name_on_credit_card="";
	private String credit_card_cvv="";
	private String credit_card_expiry_date="";
	
	private String ewallet_password="";
	private String pay_securely_now="";
	private String payment_error_message="";
	private String repay="";
	
	//Bank - net banking payment
	private String select_bank="";
	
	//forgot password
	private String forgot_password_email="";
	private String send_email="";
	private String back_to_sign_in="";
	private String forgot_password_msg="";
	
	private String dismiss_btn="";
	private String  nav_register_link="";
	private String  nav_sign_in_link="";
	
	//reset password
	private String  new_pwd="";
	private String  conform_pwd="";
	private String  change_pwd="";
	
	public void clickSign_in_pop_up_link() {
		driver.findElement(By.xpath(sign_in_pop_up_link)).click();
	}
	
	public void clickSave_and_continue() {
		driver.findElement(By.xpath(save_and_continue)).click();
	}
	
	
	public void clickSign_in_btn() {
		driver.findElement(By.xpath(sign_in_btn)).click();
	}
	
	
	public void clickCheckout_as_guest() {
		driver.findElement(By.xpath(checkout_as_guest)).click();
	}
	
	
	public void click_sign_in_button() {
		driver.findElement(By.xpath(sign_in_button)).click();
	}
	
	
	public void click_register_link() {
		driver.findElement(By.xpath(register_link)).click();
	}
	
	public void click_forgot_password_link() {
		driver.findElement(By.xpath(forgot_password_link)).click();
	}
	

	public void click_sign_in_link() {
		driver.findElement(By.xpath(sign_in_link)).click();
	}
	
	
	public void choose_shipping_option_radio_btn(String optn) {
		driver.findElement(By.xpath(choose_shipping_option_radio_btn+optn+"']")).click();
	}
	
	
	public void choose_pmt_option_radio_btn(String optn) {
		driver.findElement(By.xpath(choose_payment_option_radio_btn+optn+"']")).click();
	}
	
	
	public void click_proceed_to_pay() {
		driver.findElement(By.xpath(proceed_to_pay)).click();
	}
	
	
	public void click_order_now() {
		driver.findElement(By.xpath(order_now)).click();
	}
	
	public void click_promotions_chkbox() {
		driver.findElement(By.xpath(promotions_chkbox)).click();
	}
	

	public void click_register_chkbox() {
		driver.findElement(By.xpath(register_chkbox)).click();
	}

	public void click_pay_securely_now() {
		driver.findElement(By.xpath(pay_securely_now)).click();
	}
	
	public void click_repay() {
		driver.findElement(By.xpath(repay)).click();
	}
	

	public void click_send_email() {
		driver.findElement(By.xpath(send_email)).click();
	}
	

	public void click_back_to_sign_in() {
		driver.findElement(By.xpath(back_to_sign_in)).click();
	}
	
	public void click_dismiss_btn() {
		driver.findElement(By.xpath(dismiss_btn)).click();
	}
	
	public void click_nav_register_link() {
		driver.findElement(By.xpath(nav_register_link)).click();
	}
	
	public void click_nav_sign_in_link() {
		driver.findElement(By.xpath(nav_sign_in_link)).click();
	}
	
	public void click_change_pwd() {
		driver.findElement(By.xpath(change_pwd)).click();
	}
	

	
	

	
}
