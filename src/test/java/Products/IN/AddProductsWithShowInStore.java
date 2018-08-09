package Products.IN;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.BaseClass_Login;
import BasePageOptions.Products;
import Login.LoginPage;
import Login.SingtelLogin;
import PageBuilder.PageBuilderPage;

public class AddProductsWithShowInStore extends BaseClass_Login{
	
	String productName="Product9";
	String sellingPrice="132.00";
	String originalPrice="150";
	String productDesc="productDesc";
	String categoryName="category1";
	String qty="100";

	public AddProductsWithShowInStore() throws IOException, InvalidFormatException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void testAddProduct() throws InterruptedException {
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
		pageBuilderPage.clickProducts();
		
		Products products = new Products(driver);
		products.clickAddProduct();
		Thread.sleep(2000);
		products.addProductsName(productName);
		products.addSellingPrice(sellingPrice);
		
		products.addTotalStockQty(qty);
		
		products.clickMoreSettings();
		Thread.sleep(1000);
		
		products.enableShowPrdInStore();
		
		products.clickSave();
		Thread.sleep(2000);
		Assert.assertTrue(products.isProductPresent(productName), "Product is not present in the list");
	}

}
