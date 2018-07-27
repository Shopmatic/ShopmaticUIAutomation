package BasePageOptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard {
	
	WebDriver driver;
	
	private String products="//div[contains(@class,'scorecard-card-a')]/strong";
	private String orders="//div[contains(@class,'scorecard-card-b')]/strong";
	private String customers="//div[contains(@class,'scorecard-card-c')]/strong";
	private String topProductsWeekButton="//a[contains(@href,'top-products-week')]";
	private String topProductsMonthButton="//a[contains(@href,'top-products-week')]";
	private String dashboardWeekButton="//a[contains(@href,'dashboard/orders') and text()='Week']";
	private String dashboardMonthButton="//a[contains(@href,'dashboard/orders') and text()='Month']";
	private String dashboardInternationalOrders="//a[contains(@href,'dashboard/orders') and text()='International orders']";
	private String dashboardDomesticOrders="//a[contains(@href,'dashboard/orders') and text()='Domestic orders']";
	private String pageViewsByWeek="//a[contains(@href,'dashboard/page_views') and text()='Week']";
	private String pageViewsByMonth="//a[contains(@href,'dashboard/page_views') and text()='Month']";
	private String soldOutProductsViewAll="//a[text()='View all']";
	
	public Dashboard(WebDriver driver) {
		this.driver=driver;
	}
	
	public String getProducts() {
		return driver.findElement(By.xpath(products)).getText();
	}
	
	public String getOrders() {
		return driver.findElement(By.xpath(orders)).getText();
	}
	public String getCustomers() {
		return driver.findElement(By.xpath(customers)).getText();
	}
	public void clickTopProductsWeek() {
		driver.findElement(By.xpath(topProductsWeekButton)).click();
	}
	public void clickTopProductsMonth() {
		driver.findElement(By.xpath(topProductsMonthButton)).click();
	}
	
	public void clickDashboardWeek() {
		driver.findElement(By.xpath(dashboardWeekButton)).click();
	}
	public void clickdashboardMonth() {
		driver.findElement(By.xpath(dashboardMonthButton)).click();
	}
	public void clickDashboardDomesticOrders() {
		driver.findElement(By.xpath(dashboardInternationalOrders)).click();
	}
	public void clickdashboardInternationalOrders() {
		driver.findElement(By.xpath(dashboardDomesticOrders)).click();
	}
	
	public void clickPageViewsByWeek() {
		driver.findElement(By.xpath(pageViewsByWeek)).click();
	}
	public void clickPageViewsByMonth() {
		driver.findElement(By.xpath(pageViewsByMonth)).click();
	}
	
	public void clickSoldOutProductsViewAll() {
		driver.findElement(By.xpath(soldOutProductsViewAll)).click();
	}

}
