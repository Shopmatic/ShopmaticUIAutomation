package Singtel.discounts;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.BaseClass_Login;
import BasePageOptions.Marketing.Discounts;
import Login.SingtelLogin;
import PageBuilder.PageBuilderPage;

public class AddFlatPercenatgeDiscountTest1 extends BaseClass_Login{
	
	String discountName="offer4";
	String discount="30.5";

	public AddFlatPercenatgeDiscountTest1() throws IOException, InvalidFormatException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void addFlatDiscount() throws InterruptedException {
		
		SingtelLogin loginPage =  new SingtelLogin(driver);
		loginPage.addEmail(email);
		loginPage.addEnvPassCode();
		Thread.sleep(2000);
		loginPage.clickLogin();
		Thread.sleep(5000);
		PageBuilderPage pageBuilderPage = new PageBuilderPage(driver);
		Thread.sleep(2000);
		pageBuilderPage.clickDashboard();
		pageBuilderPage.selectMarketing();
		Thread.sleep(2000);
		pageBuilderPage.clickDiscounts();
		
		Discounts discounts = new Discounts(driver);
		discounts.clickAddDiscount();
		discounts.addDiscountName(discountName);
		discounts.addDiscountCode("PercClearanceSale1");
		discounts.clickradioButtonPercentageDiscount();
		discounts.addFlatDiscountPercentage(discount);
		discounts.addDiscountStartDate("30 July 2018");
		discounts.addDiscountEndDate("31 July 2018");
		discounts.clickAddADiscountButton();
		Thread.sleep(2000);
		Assert.assertTrue(discounts.checkDiscountCreated().contentEquals("You have successfully created Discount"+" "+discountName+"."));
		pageBuilderPage.clickDashboard();
		pageBuilderPage.clickSignOut();
		pageBuilderPage.clickConfirmSignOut();
		
	}


}
