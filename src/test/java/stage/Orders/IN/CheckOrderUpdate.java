package stage.Orders.IN;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.BaseClass_Login;
import BasePageOptions.Orders;
import Login.LoginPage;
import PageBuilder.PageBuilderPage;

public class CheckOrderUpdate extends BaseClass_Login{
	
	String order_id="E96274";

	public CheckOrderUpdate() throws IOException, InvalidFormatException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void testMethod() throws InterruptedException {
		Thread.sleep(5000);

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
		pageBuilderPage.clickOrders();
		Thread.sleep(2000);
		
		Orders orders=new Orders(driver);
		//orders.clickOrderId("E0789D");
//		orders.selectOrderCheckBox("E12464");
//		Thread.sleep(2000);
		orders.selectActionsForOrder(order_id);
		orders.clickCancelOrder(order_id);
		orders.clickConfirm();
		Thread.sleep(2000);
		Assert.assertTrue(orders.getMessage().contentEquals("Order #"+order_id+" is cancelled"));
	}

}
