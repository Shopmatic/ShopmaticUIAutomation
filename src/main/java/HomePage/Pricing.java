package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pricing {
	 WebDriver driver;
	 
	private String pricing_plan="//ul[contains(@class,'pricing-block')]/li[contains(@class,'pricing-list')]";
	/*private String pricing_plan_1="//ul[contains(@class,'pricing-block')]/li[contains(@class,'pricing-list')][1]";
	private String pricing_plan_2="//ul[contains(@class,'pricing-block')]/li[contains(@class,'pricing-list')][2]";
	private String pricing_plan_3="//ul[contains(@class,'pricing-block')]/li[contains(@class,'pricing-list')][3]";
*/
	private String features_list="//a[@href='features-list.html']";
	private String speak_to_consultant="//a[@href='contact.html' and text()='SPEAK TO CONSULTANT']";
	
	public Pricing(WebDriver driver) {
		this.driver=driver;
	}
	
	public void selectPricing(int pricing_plan_no) {
		driver.findElement(By.xpath(""+pricing_plan+"["+pricing_plan_no+"]")).click();
	}
	
	public void clickFeaturesList() {
		driver.findElement(By.xpath(features_list)).click();
	}
	
	public void clickSpeakToConsultant() {
		driver.findElement(By.xpath(speak_to_consultant)).click();
	}
}
