package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Support {
	WebDriver driver;
	private String help_topic_search_text="//input[@id='hkb-search']";
	private String help_topic_search_button="//button[contains(@class,'hkb-site-search')]";
	private String faq="//a[contains(@class,'hkb-category')]/div/h2[contains(text(),'FAQ')]";
	private String get_started="//a[contains(@class,'hkb-category')]/div/h2[contains(text(),'Get started')]";
	private String register_domain_names="//a[contains(@class,'hkb-category')]/div/h2[contains(text(),'Register domain names')]";
	private String payment_options="//a[contains(@class,'hkb-category')]/div/h2[contains(text(),'Payment options')]";
	private String logistics = "//a[contains(@class,'hkb-category')]/div/h2[contains(text(),'Logistics')]";
	private String layout_design="//a[contains(@class,'hkb-category')]/div/h2[contains(text(),'layout design')]";
	private String webstore_content="//a[contains(@class,'hkb-category')]/div/h2[contains(text(),'Webstore content')]";
	private String analytics="//a[contains(@class,'hkb-category')]/div/h2[contains(text(),'Business')]";
	private String marketplaces="//a[contains(@class,'hkb-category')]/div/h2[contains(text(),'Marketplaces')]";
	private String dashboard="//a[contains(@class,'hkb-category')]/div/h2[contains(text(),'dashboard')]";
	
	//popular articles
	private String popular_articles_section="//section[contains(@id,'articles')]/ul";
	private String popular_articles_link="//section[contains(@id,'articles-widget')]/ul/li";
	
	public Support(WebDriver driver) {
		this.driver=driver;
	}
	
	public void searchHelpTopicByText(String text) {
		driver.findElement(By.xpath(help_topic_search_text)).sendKeys(""+text);
	}
	
	public void clickSearchButton() {
		driver.findElement(By.xpath(help_topic_search_button)).click();
	}
	
	public void clickfaq() {
		driver.findElement(By.xpath(faq)).click();
	}

	public void clickGetStarted() {
		driver.findElement(By.xpath(get_started)).click();
	}
	public void clickRegisterDomainNames() {
		driver.findElement(By.xpath(register_domain_names)).click();
	}
	public void clickPaymentOptions() {
		driver.findElement(By.xpath(payment_options)).click();
	}
	public void clickLogistics() {
		driver.findElement(By.xpath(logistics)).click();
	}
	public void clickLayoutDesign() {
		driver.findElement(By.xpath(layout_design)).click();
	}
	public void clickWebstoreContent() {
		driver.findElement(By.xpath(webstore_content)).click();
	}
	public void clickAnalytics() {
		driver.findElement(By.xpath(analytics)).click();
	}
	public void clickMarketplaces() {
		driver.findElement(By.xpath(marketplaces)).click();
	}
	public void clickDashboard() {
		driver.findElement(By.xpath(dashboard)).click();
	}
	public void clickPopular_articles_link(int article_no) {
		driver.findElement(By.xpath(""+popular_articles_link+"["+article_no+"]")).click();
	}
	public String getPopularArticles() {
		return driver.findElement(By.xpath(popular_articles_section)).getText();
	}
}
