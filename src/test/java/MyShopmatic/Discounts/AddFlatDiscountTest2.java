package MyShopmatic.Discounts;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.BaseClass_Login;
import BasePageOptions.Marketing.Discounts;
import Login.LoginPage;
import PageBuilder.PageBuilderPage;

public class AddFlatDiscountTest2 extends BaseClass_Login{
	
	String discountName="offer6";
	String discount="30.5";

	public AddFlatDiscountTest2() throws IOException, InvalidFormatException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void addFlatDiscount() throws InterruptedException {
		
		LoginPage loginPage =  new LoginPage(driver);
		loginPage.addEmail(email);
		loginPage.addPassword(password);
		
		loginPage.clickLogin();
		Thread.sleep(5000);
		PageBuilderPage pageBuilderPage = new PageBuilderPage(driver);
		Thread.sleep(2000);
		pageBuilderPage.clickDashboard();
		pageBuilderPage.selectMarketing();
		pageBuilderPage.clickDiscounts();
		
		Discounts discounts = new Discounts(driver);
		discounts.clickAddDiscount();
		discounts.addDiscountName(discountName);
		discounts.addDiscountCode("JulyClearanceSale6");
		discounts.addFlatDiscountAmount(discount);
		discounts.addminOrderDiscount((float) 3.0);
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
