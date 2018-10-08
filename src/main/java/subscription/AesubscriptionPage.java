package subscription;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AesubscriptionPage {
	WebDriver driver;

	public AesubscriptionPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	//ae
	private String ae_one_month_plan="//input[@id='billing_form_plan_one_month_plan_ae']";
	private String ae_six_month_plan="//input[@id='billing_form_plan_six_month_plan_ae']";
	private String ae_twelve_month_plan="//input[@id='billing_form_plan_twelve_month_plan_ae']";
	
	private String discount_desc_one_month_plan="//div[@id='one_month_plan_ae']/div/div/div/span[@class='ae-vat']";
	private String discount_amt_one_month_plan="//div[@id='one_month_plan_ae']/div/div/div/h5[@class='savings ae']";
	
	private String bill_amount_one_month_plan="//div[@id='one_month_plan_ae']/div/div/div/span[@class='ae-billed-detail']";
	private String bill_amount_six_month_plan="//div[@id='six_month_plan_ae']/div/div/div/span[@class='ae-billed-detail']";
	private String bill_amount_twelve_month_plan="//div[@id='twelve_month_plan_ae']/div/div/div/span[@class='ae-billed-detail']";
	
	private String discount_desc_six_month_plan="//div[@id='six_month_plan_ae']/div/div/div/span[@class='ae-vat']";
	private String discount_desc_twelve_month_plan="//div[@id='twelve_month_plan_ae']/div/div/div/span[@class='ae-vat']";

	private String discount_amt_six_month_plan="//div[@id='six_month_plan_ae']/div/div/div/h5[@class='savings ae']";
	private String discount_amt_twelve_month_plan="//div[@id='twelve_month_plan_ae']/div/div/div/h5[@class='savings ae']";

	private String choose_one_month_plan="//div[@id='one_month_plan_ae']/div/div/div/div[@class='form-actions']/a[contains(@class,'choose-plan')]";
	private String choose_six_month_plan="//div[@id='six_month_plan_ae']/div/div/div/div[@class='form-actions']/a[contains(@class,'choose-plan')]";
	private String choose_twelve_month_plan="//div[@id='twelve_month_plan_ae']/div/div/div/div[@class='form-actions']/a[contains(@class,'choose-plan')]";
	
	
	public void chooseOneMonthPlan() {
		driver.findElement(By.xpath(choose_one_month_plan)).click();
	}
	public void chooseSixMonthPlan() {
		driver.findElement(By.xpath(choose_six_month_plan)).click();
	}
	public void chooseTwelveMonthPlan() {
		driver.findElement(By.xpath(choose_twelve_month_plan)).click();
	}
	
	public void selectOneMonthPlan() {
		driver.findElement(By.xpath(ae_one_month_plan)).click();
	}
	public void selectSixMonthPlan() {
		driver.findElement(By.xpath(ae_six_month_plan)).click();
	}
	public void selectTwelveMonthPlan() {
		driver.findElement(By.xpath(ae_twelve_month_plan)).click();
	}

	public String getDiscountOneMonthPlanDesc() {
		return driver.findElement(By.xpath(discount_desc_one_month_plan)).getText();
	}
	public String getDiscountSixMonthPlanDesc() {
		return driver.findElement(By.xpath(discount_desc_six_month_plan)).getText();
	}
	public String getDiscountTwelveMonthPlanDesc() {
		return driver.findElement(By.xpath(discount_desc_twelve_month_plan)).getText();
	}
	
	public String getDiscountOneMonthPlanAmount() {
		return driver.findElement(By.xpath(discount_amt_one_month_plan)).getText();
	}
	public String getDiscountSixMonthPlanAmount() {
		return driver.findElement(By.xpath(discount_amt_six_month_plan)).getText();
	}
	public String getDiscountTwelveMonthPlanAmount() {
		return driver.findElement(By.xpath(discount_amt_twelve_month_plan)).getText();
	}
	
	public String getOneMonthPlanBillAmount() {
		return driver.findElement(By.xpath(bill_amount_one_month_plan)).getText();
	}
	public String getSixMonthPlanBillAmount() {
		return driver.findElement(By.xpath(bill_amount_six_month_plan)).getText();
	}
	public String getTwelveMonthPlanBillAmount() {
		return driver.findElement(By.xpath(bill_amount_twelve_month_plan)).getText();
	}
}
