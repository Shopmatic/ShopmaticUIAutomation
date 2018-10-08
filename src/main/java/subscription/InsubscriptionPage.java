package subscription;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InsubscriptionPage {
	WebDriver driver;

	public InsubscriptionPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	private String price_plan_info_15="//div[@data-plan-id='twelve_month_plan']/h3[@class='plan-info']";
	private String price_plan_info_7="//div[@data-plan-id='six_month_plan']/h3[@class='plan-info']";
	private String price_plan_info_3="//div[@data-plan-id='three_month_plan']/h3[@class='plan-info']";

	private String price_currency_15="//div[@data-plan-id='twelve_month_plan']/h2/span[@class=\"price-title-currency\"]";
	private String price_currency_7="//div[@data-plan-id='six_month_plan']/h2/span[@class=\"price-title-currency\"]";
	private String price_currency_3="//div[@data-plan-id='three_month_plan']/h2/span[@class=\"price-title-currency\"]";

	private String price_15="//div[@data-plan-id='twelve_month_plan']/h2/span[@class='price-title-currency']/text()";
	private String price_7="//div[@data-plan-id='six_month_plan']/h2/span[@class='price-title-currency']/text()";
	private String price_3="//div[@data-plan-id='three_month_plan']/h2/span[@class='price-title-currency']/text()";

	private String total_price_15="//div[@data-plan-id='twelve_month_plan']/p[@class='bottom-info']";
	private String total_price_7="//div[@data-plan-id='six_month_plan']/p[@class='bottom-info']";
	private String total_price_3="//div[@data-plan-id='three_month_plan']/p[@class='bottom-info']";
	
	private String choose_plan_15="//div[@data-plan-id='twelve_month_plan']/btn";
	private String choose_plan_7="//div[@data-plan-id='six_month_plan']/btn";
	private String choose_plan_3="//div[@data-plan-id='three_month_plan']/btn";
	
	
	public String getPricePlanInfo_15() {
		return driver.findElement(By.xpath(price_plan_info_15)).getText();
	}
	
	public String getPricePlanInfo_7() {
		return driver.findElement(By.xpath(price_plan_info_7)).getText();
	}

	public String getPricePlanInfo_3() {
		return driver.findElement(By.xpath(price_plan_info_3)).getText();
	}
	
	public String getPriceCurrency_15() {
		return driver.findElement(By.xpath(price_currency_15)).getText();
	}
	
	public String getPriceCurrency_7() {
		return driver.findElement(By.xpath(price_currency_7)).getText();
	}

	public String getPriceCurrency_3() {
		return driver.findElement(By.xpath(price_currency_3)).getText();
	}
	
	public String getPrice_15() {
		return driver.findElement(By.xpath(price_15)).getText();
	}
	
	public String getPrice_7() {
		return driver.findElement(By.xpath(price_7)).getText();
	}

	public String getPrice_3() {
		return driver.findElement(By.xpath(price_3)).getText();
	}
	
	public String getTotalPrice_15() {
		return driver.findElement(By.xpath(total_price_15)).getText();
	}
	
	public String getTotalPrice_7() {
		return driver.findElement(By.xpath(total_price_7)).getText();
	}

	public String getTotalPrice_3() {
		return driver.findElement(By.xpath(total_price_3)).getText();
	}
	
	public void choosePlan_15() {
		driver.findElement(By.xpath(choose_plan_15)).click();
	}
	
	public void choosePlan_7() {
		driver.findElement(By.xpath(choose_plan_7)).click();
	}
	
	public void choosePlan_3() {
		driver.findElement(By.xpath(choose_plan_3)).click();
	}

}
