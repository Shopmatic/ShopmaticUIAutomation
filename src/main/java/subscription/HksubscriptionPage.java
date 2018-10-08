package subscription;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HksubscriptionPage {
	WebDriver driver;

	public HksubscriptionPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	private String price_plan_info_16="//div[@data-plan-id='twelve_month_plan_hk']/h3[@class='plan-info']";
	private String price_plan_info_7="//div[@data-plan-id='six_month_plan_hk']/h3[@class='plan-info']";
	private String price_plan_info_1="//div[@data-plan-id='one_month_plan_hk']/h3[@class='plan-info']";

	private String price_currency_16="//div[@data-plan-id='twelve_month_plan']/h2/span[@class=\"price-title-currency\"]";
	private String price_currency_7="//div[@data-plan-id='six_month_plan']/h2/span[@class=\"price-title-currency\"]";
	private String price_currency_1="//div[@data-plan-id='one_month_plan']/h2/span[@class=\"price-title-currency\"]";

	private String price_16="//div[@data-plan-id='twelve_month_plan']/h2/span[@class='price-title-currency']/text()";
	private String price_7="//div[@data-plan-id='six_month_plan']/h2/span[@class='price-title-currency']/text()";
	private String price_1="//div[@data-plan-id='one_month_plan']/h2/span[@class='price-title-currency']/text()";

	private String total_price_16="//div[@data-plan-id='twelve_month_plan']/p[@class='bottom-info']";
	private String total_price_7="//div[@data-plan-id='six_month_plan']/p[@class='bottom-info']";
	private String total_price_1="//div[@data-plan-id='one_month_plan']/p[@class='bottom-info']";
	
	private String choose_plan_16="//div[@data-plan-id='twelve_month_plan']/btn";
	private String choose_plan_7="//div[@data-plan-id='six_month_plan']/btn";
	private String choose_plan_1="//div[@data-plan-id='one_month_plan']/btn";
	
	
	public String getPricePlanInfo_16() {
		return driver.findElement(By.xpath(price_plan_info_16)).getText();
	}
	
	public String getPricePlanInfo_7() {
		return driver.findElement(By.xpath(price_plan_info_7)).getText();
	}

	public String getPricePlanInfo_1() {
		return driver.findElement(By.xpath(price_plan_info_1)).getText();
	}
	
	public String getPriceCurrency_16() {
		return driver.findElement(By.xpath(price_currency_16)).getText();
	}
	
	public String getPriceCurrency_7() {
		return driver.findElement(By.xpath(price_currency_7)).getText();
	}

	public String getPriceCurrency_1() {
		return driver.findElement(By.xpath(price_currency_1)).getText();
	}
	
	public String getPrice_16() {
		return driver.findElement(By.xpath(price_16)).getText();
	}
	
	public String getPrice_7() {
		return driver.findElement(By.xpath(price_7)).getText();
	}

	public String getPrice_1() {
		return driver.findElement(By.xpath(price_1)).getText();
	}
	
	public String getTotalPrice_16() {
		return driver.findElement(By.xpath(total_price_16)).getText();
	}
	
	public String getTotalPrice_7() {
		return driver.findElement(By.xpath(total_price_7)).getText();
	}

	public String getTotalPrice_1() {
		return driver.findElement(By.xpath(total_price_1)).getText();
	}
	
	public void choosePlan_16() {
		driver.findElement(By.xpath(choose_plan_16)).click();
	}
	
	public void choosePlan_7() {
		driver.findElement(By.xpath(choose_plan_7)).click();
	}
	
	public void choosePlan_1() {
		driver.findElement(By.xpath(choose_plan_1)).click();
	}

}
