package Shoptiq.Login;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Login.LoginPage;
import PageBuilder.PageBuilderPage;
import PageBuilder.PaymentOptionsPage;
import PageBuilder.ShippingOptionsPage;

public class shoptiqTest extends BaseClass{

	public shoptiqTest() throws IOException, InvalidFormatException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void testShoptiq() throws InterruptedException {
		Thread.sleep(5000);
		LoginPage loginPage =  new LoginPage(driver);
		loginPage.addEmail("testshop_shoptiq_Aug242018@testshop.com");
		loginPage.addPassword("Tester123");	
		loginPage.loginShoptiq();
		Thread.sleep(5000);
		loginPage.clickManageYourStore();
		Thread.sleep(5000);
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(5000);
		
		PageBuilderPage pb = new PageBuilderPage(driver);
		pb.clickDashboard();
		pb.selectSetUp();
		pb.clickPayment();
		
		PaymentOptionsPage p = new PaymentOptionsPage(driver);
		p.enableCODPayment();
		
		pb.clickDashboard();
		pb.selectSetUp();
		pb.clickShipping();
		Thread.sleep(10000);
		
		ShippingOptionsPage shippingOptionsPage= new ShippingOptionsPage(driver);
		shippingOptionsPage.addSelfCollectDetails("Self collect details");
		shippingOptionsPage.clickSave();
		shippingOptionsPage.clickEnableSelfCollect();
		Thread.sleep(5000);
		
		pb.clickDashboard();
		pb.clickSignOut();
		pb.clickConfirmSignOut();
		
		
	}

}
