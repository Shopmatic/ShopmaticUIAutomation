package Discounts;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import BaseClass.BaseClass_Login;
import BasePageOptions.Products;
import BasePageOptions.Marketing.Discounts;
import Login.LoginPage;
import PageBuilder.PageBuilderPage;

public class AddDiscount extends BaseClass_Login{
	
	String discountName="offer1";

	public AddDiscount() throws IOException, InvalidFormatException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void addDiscount() throws InterruptedException {
		
		LoginPage loginPage =  new LoginPage(driver);
		loginPage.addEmail(email);
		loginPage.addPassword(password);
		loginPage.addEnvPassCode();
		Thread.sleep(2000);
		loginPage.clickLogin();
		Thread.sleep(5000);
		PageBuilderPage pageBuilderPage = new PageBuilderPage(driver);
		Thread.sleep(2000);
		pageBuilderPage.clickDashboard();
		pageBuilderPage.selectMarketing();
		pageBuilderPage.clickDiscounts();
		
		Discounts discounts = new Discounts(driver);
		discounts.clickAddDiscount();
		
		pageBuilderPage.clickDashboard();
		pageBuilderPage.clickSignOut();
		pageBuilderPage.clickConfirmSignOut();
		
	}


}
