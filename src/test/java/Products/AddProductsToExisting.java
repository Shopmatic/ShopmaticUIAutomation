package Products;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import BaseClass.BaseClass_Login;
import BasePageOptions.Products;
import Login.LoginPage;
import PageBuilder.PageBuilderPage;

public class AddProductsToExisting extends BaseClass_Login{
	String productName="Product 3";

	public AddProductsToExisting() throws IOException, InvalidFormatException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void addProductWithMinimumDetails() throws InterruptedException {
		
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
		pageBuilderPage.clickProducts();
		
		Products products = new Products(driver);
		products.clickAddProduct();
		products.addProductsName(productName);
		products.addSellingPrice("534");
		products.clickSave();
		
		pageBuilderPage.clickDashboard();
		pageBuilderPage.clickSignOut();
		pageBuilderPage.clickConfirmSignOut();
		
	}

}
