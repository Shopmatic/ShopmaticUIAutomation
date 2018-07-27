package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Showcase {
	WebDriver driver;
	private String success_stories="//a[@href='stories.html' and text()='VIEW THEIR SUCCESS STORIES']";

	public Showcase(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickSpeakToConsultant() {
		driver.findElement(By.xpath(success_stories)).click();
	}
}
