package MyShopmatic.NI;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.BaseClass_Login;
import BasePageOptions.Products;
import Login.LoginPage;
import PageBuilder.PageBuilderPage;

public class NILoginTest extends BaseClass_Login{
	String productName="Product9";
	String sellingPrice="132.00";
	String originalPrice="150";
	String productDesc="productDesc";
	String categoryName="category1";
	String qty="100";

	public NILoginTest() throws IOException, InvalidFormatException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void loginTest() throws InterruptedException {
		login();
		addProducts();
	}

	private void addProducts() throws InterruptedException{
		// TODO Auto-generated method stub
		PageBuilderPage pageBuilderPage = new PageBuilderPage(driver);
		Thread.sleep(2000);
		pageBuilderPage.clickDashboard();
		pageBuilderPage.clickProducts();
		
		Products products = new Products(driver);
		products.clickAddProduct();
		Thread.sleep(2000);
		products.addProductsName(productName);
		products.addSellingPrice(sellingPrice);
		products.addOriginalPrice(originalPrice);
		products.addProductDescription(productDesc);
		products.addCategory(categoryName);
		products.addTotalStockQty(qty);
		products.clickSave();
		Thread.sleep(2000);
		Assert.assertTrue(products.isProductPresent(productName), "Product is not present in the list");
	
	}

	private void login() throws InterruptedException {
		// TODO Auto-generated method stub
		LoginPage loginPage =  new LoginPage(driver);
		loginPage.addEmail(email);
		loginPage.addPassword(password);
		loginPage.clickLogin();
		Thread.sleep(5000);
		System.out.println("*************Logged IN**********************\nemail: "+email+"\nPassword: "+password);
	}
}
