package Singtel.Products;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BaseClass.BaseClass_Login;
import BasePageOptions.Products;
import Login.SingtelLogin;
import PageBuilder.PageBuilderPage;

public class AddProducts extends BaseClass_Login{
	
	String productName="Product6";
	String sellingPrice="132.00";

	public AddProducts() throws IOException, InvalidFormatException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void testAddProduct() throws InterruptedException {
		SingtelLogin loginPage =  new SingtelLogin(driver);
		loginPage.addEmail(email);
		loginPage.addEnvPassCode();
		loginPage.clickLogin();
		PageBuilderPage pageBuilderPage = new PageBuilderPage(driver);
		Thread.sleep(2000);
		pageBuilderPage.clickDashboard();
		pageBuilderPage.clickProducts();
		
		Products products = new Products(driver);
		products.clickAddProduct();
		Thread.sleep(5000);
		products.addProductsName(productName);
		products.addSellingPrice(sellingPrice);
		products.clickSave();
		products.clickAllProduct();
		Thread.sleep(5000);
		System.out.println(driver.findElements(By.xpath("//a[contains(@href,'/products/')]/div/div[2]/h1")).get(1).getText());
		//driver.findElements(By.xpath("//a[contains(@href,'/products/')]/div/div[2]/h1[text()]"));
		//Assert.assertTrue(products.isProductPresent(productName));
	}

}
