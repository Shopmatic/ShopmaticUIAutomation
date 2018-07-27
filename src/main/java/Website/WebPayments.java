package Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class WebPayments {
	WebDriver driver;

	public WebPayments(WebDriver driver) {
		super();
		this.driver = driver;
	}

	private String subtotal="//div[text()='Subtotal']/following-sibling::div";
	private String shipping_charges="//div[text()='Shipping']/following-sibling::div";
	private String total="//div[text()='Total']/following-sibling::div";

	public String getShippingCharges() {
		return driver.findElement(By.xpath(shipping_charges)).getText();
	}
	
	public String getTotal() {
		return driver.findElement(By.xpath(total)).getText();
	}
	
	
	public String getSubTotal() {
		return driver.findElement(By.xpath(subtotal)).getText();
	}
	
	public void choosePaymentMethod(String pmt) {
		driver.findElement(By.xpath("//div[text()='"+pmt+"']")).click();
	}
	
	//card details for the payment
	private String cardHolderName="//input[contains(@id,'CardHolder')]";
	private String cardNum="//input[contains(@id,'Number')]";
	private String expiryDate="//input[contains(@id,'Expiry')]";
	private String cvv="//input[contains(@id,'Cvv')]";
	private String makeCardPmt="//button[text()='Make Payment']";
	
	public void addCardHolderName(String name) {
		driver.findElement(By.xpath(cardHolderName)).sendKeys(""+name);
	}
	
	public void addCardNum(String num) {
		driver.findElement(By.xpath(cardNum)).sendKeys(""+num);
	}
	
	public void addExpiryDate(String dt) {
		driver.findElement(By.xpath(expiryDate)).sendKeys(""+dt);
	}
	
	public void addCVV(String c) {
		driver.findElement(By.xpath(cvv)).sendKeys(""+c);
	}
	
	public void clickMakePaymentForCard() {
		driver.findElement(By.xpath(makeCardPmt)).click();
	}
	
	//Make payment via bank
	private String chooseBank="//select[contains(@class,'select-bank')]";
	private String makeBankPmt="//select[contains(@class,'select-bank')]/following-sibling::div/form/input[@value='Make Payment']";
	
	public void selectBank(String bank) {
		Select dropdown=new Select(driver.findElement(By.xpath(chooseBank)));
		dropdown.selectByValue(bank);
	}
	
	public void clickMakePaymentForBank() {
		driver.findElement(By.xpath(makeBankPmt)).click();
	}
	
	//cod
	private String cod="//a[text()='Place Order']";
	
	public void clickPlaceOrder() {
		driver.findElement(By.xpath(cod)).click();
	}
}
