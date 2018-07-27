package BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tos {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/swetha/Documents/softwares/automation drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://goshopmatic.com/in/terms.html");
		Thread.sleep(10000);
		String tos_text_1= driver.findElement(By.xpath("//div[@class='fix-8-12 left']/p")).getText();
		tos_text_1=tos_text_1+driver.findElement(By.xpath("//h3[1]")).getText();
		tos_text_1+=driver.findElement(By.xpath("//ul[@class='list-block']/li")).getText();
		tos_text_1+=driver.findElement(By.xpath("//h3[2]")).getText();
		tos_text_1+=driver.findElement(By.xpath("//ul[@class='list-block'][2]")).getText();
		tos_text_1+=driver.findElement(By.xpath("//h3[3]")).getText();
		tos_text_1+=driver.findElement(By.xpath("//ul[@class='list-block'][3]")).getText();
		tos_text_1+=driver.findElement(By.xpath("//h3[4]")).getText();
		tos_text_1+=driver.findElement(By.xpath("//ul[@class='list-block'][4]")).getText();
		tos_text_1+=driver.findElement(By.xpath("//h4[1]")).getText();
		tos_text_1+=driver.findElement(By.xpath("//h4[3]")).getText();
		tos_text_1+=driver.findElement(By.xpath("//ul[@class='list-block'][5]")).getText();
		tos_text_1+=driver.findElement(By.xpath("//ul[@class='list-block'][6]")).getText();
		tos_text_1+=driver.findElement(By.xpath("//ul[@class='list-block'][7]")).getText();
		tos_text_1+=driver.findElement(By.xpath("//h3[5]")).getText();

		System.out.println(tos_text_1);
		driver.quit();
		
		
	}

}
