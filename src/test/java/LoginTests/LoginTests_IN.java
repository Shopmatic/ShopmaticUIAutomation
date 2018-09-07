package LoginTests;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import BaseClass.BaseClass_Login;
import HomePage.HomePage;
import Login.LoginPage;
import PageBuilder.PageBuilderPage;

public class LoginTests_IN extends  BaseClass_Login{

	public LoginTests_IN() throws IOException, InvalidFormatException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Test
	public void testMethod() throws InterruptedException {
		Thread.sleep(2000);
		HomePage homePage = new HomePage(driver);
		homePage.clickLogin();
		Thread.sleep(2000);
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		String regionURL = currentURL.substring(0, 43);
		System.out.println(regionURL);
		regionURL=regionURL+region;
		System.out.println(regionURL);
		driver.navigate().to(regionURL);
		Thread.sleep(2000);
		LoginPage loginPage =  new LoginPage(driver);
		loginPage.addEmail(email);
		loginPage.addPassword(password);
		Thread.sleep(2000);
		loginPage.clickLogin();
		Thread.sleep(5000);
		PageBuilderPage pageBuilderPage = new PageBuilderPage(driver);
		Thread.sleep(2000);
		pageBuilderPage.clickDashboard();
		pageBuilderPage.clickSignOut();
		pageBuilderPage.clickConfirmSignOut();
		
	}

}
