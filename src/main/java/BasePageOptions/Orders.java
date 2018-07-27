package BasePageOptions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Orders {
	WebDriver driver;
	
	public Orders(WebDriver driver) {
		this.driver=driver;
	}
	
	private String allow_customer_order_note="//div[@class='order-note']";
	private String order_tab_allorders="//div[contains(@class,'regional-filter-button')][1]";
	private String order_tab_domesticorders="//div[contains(@class,'regional-filter-button')][2]";
	private String order_tab_internationalorders="//div[contains(@class,'regional-filter-button')][3]";
	
	private String shippment_status_All="//div[text()='All status']";
	private String shippment_status_Unshipped="//div[text()='Unshipped']";
	private String shippment_status_AwaitingPickup="//div[text()='Awaiting pickup']";
	
	//order row data
	private String order_row="//div[@class='rt-tr-group']";
	private String order_id_row="//a[text()='";
	private String actions_order_row="//div[contains(@class,'order-actions')]/parent::div/preceding-sibling::div/a[text()='";
	
	public void clickOrderId(String order_id) {
		driver.findElement(By.xpath("//a[text()='"+order_id+"']")).click();	
	}
	public void selectOrderCheckBox(String order_id) {
		driver.findElement(By.xpath(order_id_row+order_id+"']/parent::div/preceding-sibling::div")).click();
	}
	
	public void selectActionsForOrder(String order_id, String action) {
		Select dropdown= new Select(driver.findElement(By.xpath(actions_order_row+order_id+"']")));
		dropdown.selectByVisibleText(action);
	}
	


	public void clickOrderNote() {
		driver.findElement(By.xpath(allow_customer_order_note)).click();
	}
	
	public void clickOrderTabs_AllOrders() {
		//List<String> orders_sections=
				driver.findElement(By.xpath(order_tab_allorders)).click();
	}
	
	public void clickOrderTabs_DomesticOrders() {
		//List<String> orders_sections=
				driver.findElement(By.xpath(order_tab_domesticorders)).click();
	}
	
	public void clickOrderTabs_InternationalOrders() {
		//List<String> orders_sections=
				driver.findElement(By.xpath(order_tab_internationalorders)).click();
	}
	
	public void clickShippmentStatus_AwaitingPickUp() {
		//List<String> orders_sections=
				driver.findElement(By.xpath(shippment_status_AwaitingPickup)).click();
	}
	public void clickShippmentStatus_Unshipped() {
		//List<String> orders_sections=
				driver.findElement(By.xpath(shippment_status_Unshipped)).click();
	}
	public void clickShippmentStatus_All() {
		//List<String> orders_sections=
				driver.findElement(By.xpath(shippment_status_All)).click();
	}

}
