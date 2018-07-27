package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private String try_it_free="//button[contains(text(),'TRY IT FREE')]";
	private String watch_demo="//button[contains(text(),'WATCH DEMO')]";
	private String features="//ul[contains(@class,'main-menu')]/li/a[contains(text(),'Features')]";
	private String pricing="//ul[contains(@class,'main-menu')]/li/a[contains(text(),'Pricing')]";
	private String showcase="//ul[contains(@class,'main-menu')]/li/a[contains(text(),'Showcase')]";
	private String support="//ul[contains(@class,'main-menu')]/li/a[contains(text(),'Support')]";
	private String download_app ="//ul[contains(@class,'main-menu')]/li/a[text()='Download App']";
	private String blog="//ul[contains(@class,'main-menu')]/li/a[text()='Blog']";
	private String login="//nav[contains(@id,'header')]/ul[contains(@class,'right-menu')]/li/a[contains(text(),'Login')]";
	private String promo = "//ul[contains(@class,'main-menu')]/li/a[contains(text(),'Promo')]";
	private String sign_up="//a[contains(text(),'SIGN UP')]";
	private String contact_us="//div[contains(@class,'Center')]/h2";
	private String try_it_free_features="//a[contains(text(),'TRY IT FREE')]/parent::ul";
	private String learn_more="//a[contains(text(),'LEARN MORE')]";
	private String get_in_touch= "//a[text()=\"GET IN TOUCH\"]";
	private String resources_and_faqs="//a[text()=\"RESOURCES & FAQS\"]";
	private String book_a_free_demo="//a[contains(text(),'BOOK A FREE DEMO')]";
	//products
	private String features_overview="//a[text()='Features Overview']";
	private String features_list="//a[text()='Features List']";
	private String difference="//a[text()='Go vs Pro Difference']";
	private String pricing_footer="//a[text()='Pricing' and @class='footer-link']";
	private String download_app_footer="//a[text()='Download App' and @class='footer-link']";
	
	//customers
	private String showcase_footer="//a[text()='Showcase' and @class='footer-link']";
	private String success_stories="//a[text()='Success Stories']";
	private String support_footer="//a[text()='Support' and @class='footer-link']";
	private String sign_up_footer="//a[text()='Sign Up' and @class='footer-link']";
	private String login_footer="//a[text()='Login' and @class='footer-link']";
	
	//company
	private String about_us="//a[text()='About Us' and @class='footer-link']";
	private String contact_us_footer="//a[text()='Contact Us' and @class='footer-link']";
	private String blog_footer="//a[text()='Blog' and @class='footer-link']";
	private String press_and_media="//a[text()='Press & Media' and @class='footer-link']";
	private String investor_relations="//a[text()='Investor Relations' and @class='footer-link']";
	private String partners="//a[text()='Partners' and @class='footer-link']";
	private String strategic_partnerships="//a[text()='Strategic partnerships' and @class='footer-link']";
	private String careers="//a[text()='Careers' and @class='footer-link']";
	private String tos="//a[text()='Terms of Service' and @class='footer-link']";
	private String privacy_policy="//a[text()='Privacy Policy' and @class='footer-link']";
	
	// follow us on
	private String facebook="//a[text()='Facebook' and @class='footer-link']";
	private String twitter="//a[text()='Twitter' and @class='footer-link']";
	private String linkedin="//a[text()='Linkedin' and @class='footer-link']";
	private String google_plus="//a[text()='Google Plus' and @class='footer-link']";
	
	private String footer_text="//p[contains(@class,'footer-link')]";
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickFeatures() {
		driver.findElement(By.xpath(features)).click();
	}
	
	public void clickPricing() {
		driver.findElement(By.xpath(pricing)).click();
	}
	
	public void clickShowcase() {
		driver.findElement(By.xpath(showcase)).click();
	}
	
	public void clickSupport() {
		driver.findElement(By.xpath(support)).click();
	}
	
	public void clickBlog() {
		driver.findElement(By.xpath(blog)).click();
	}
	public void clickPromo() {
		driver.findElement(By.xpath(promo)).click();
	}
	public void clickDownloadApp() {
		driver.findElement(By.xpath(download_app)).click();
	}
	public void clickLogin() {
		driver.findElement(By.xpath(login)).click();
	}
	public void clickSignUp() {
		driver.findElement(By.xpath(sign_up));
	}
	public void clickTryItFree() {
		driver.findElement(By.xpath(try_it_free));
	}
	public void clickWatchDemo() {
		driver.findElement(By.xpath(watch_demo));
	}
	public void clickContactUs() {
		driver.findElement(By.xpath(contact_us));
	}
	public void clickContactUsFooterLink() {
		driver.findElement(By.xpath(contact_us_footer));
	}
	public void clickTryItFreeFeatures() {
		driver.findElement(By.xpath(try_it_free_features)).click();
	}
	
	public void clickLearnMore() {
		driver.findElement(By.xpath(learn_more)).click();
	}
	public void clickGetInTouch() {
		driver.findElement(By.xpath(get_in_touch)).click();
	}
	public void clickResourcesAndFaqs() {
		driver.findElement(By.xpath(resources_and_faqs)).click();
	}
	public void clickBookAFreeDemo() {
		driver.findElement(By.xpath(book_a_free_demo)).click();
	}
	public void clickFeaturesOverview() {
		driver.findElement(By.xpath(features_overview)).click();
	}
	public void clickFeaturesList() {
		driver.findElement(By.xpath(features_list)).click();
	}
	public void clickDifference() {
		driver.findElement(By.xpath(difference)).click();
	}
	public void clickPricingFooter() {
		driver.findElement(By.xpath(pricing_footer)).click();
	}
	public void clickDownloadAppFooter() {
		driver.findElement(By.xpath(download_app_footer)).click();
	}
	public void clickShowcaseFooter() {
		driver.findElement(By.xpath(showcase_footer)).click();
	}
	public void clickSuccessStories() {
		driver.findElement(By.xpath(success_stories)).click();
	}
	public void clickSupportFooter() {
		driver.findElement(By.xpath(support_footer)).click();
	}
	public void clickSignUpFooter() {
		driver.findElement(By.xpath(sign_up_footer)).click();
	}
	public void clickLoginFooter() {
		driver.findElement(By.xpath(login_footer)).click();
	}
	public void clickAbout_us() {
		driver.findElement(By.xpath(about_us)).click();
	}
	public void clickBlogFooter() {
		driver.findElement(By.xpath(blog_footer)).click();
	}
	public void clickPressAndMedia() {
		driver.findElement(By.xpath(press_and_media)).click();
	}
	public void clickInvestorRelations() {
		driver.findElement(By.xpath(investor_relations)).click();
	}
	public void clickPartners() {
		driver.findElement(By.xpath(partners)).click();
	}
	public void clickCareers() {
		driver.findElement(By.xpath(careers)).click();
	}
	public void clickStrategicPartnerships() {
		driver.findElement(By.xpath(strategic_partnerships)).click();
	}
	public void clickTermsOfService() {
		driver.findElement(By.xpath(tos)).click();
	}
	public void clickPrivacyPolicy() {
		driver.findElement(By.xpath(privacy_policy)).click();
	}
	public void clickFacebook() {
		driver.findElement(By.xpath(facebook)).click();
	}
	public void clickTwitter() {
		driver.findElement(By.xpath(twitter)).click();
	}
	public void clickLinkedin() {
		driver.findElement(By.xpath(linkedin)).click();
	}
	public void clickGooglePlus() {
		driver.findElement(By.xpath(google_plus)).click();
	}
	public String getFooterText() {
		return driver.findElement(By.xpath(footer_text)).toString();
	}
	
}
