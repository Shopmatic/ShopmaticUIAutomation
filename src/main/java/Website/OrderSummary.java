package Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderSummary {
	public OrderSummary(WebDriver driver) {
		super();
		this.driver = driver;
	}

	WebDriver driver;
	
	private String continue_shopping="//a[@class='logo-link']/following-sibling::a[text()='Continue shopping']";
	
	public void clickContinueShopping() {
		driver.findElement(By.xpath(continue_shopping)).click();
	}
}
