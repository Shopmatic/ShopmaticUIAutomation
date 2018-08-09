package Singtel.Products;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.BaseClass_Login;
import BasePageOptions.Products;
import Login.SingtelLogin;
import PageBuilder.PageBuilderPage;

public class AddProductsWithShippingDetails extends BaseClass_Login{
	
	String productName="Product9";
	String sellingPrice="132.00";
	String originalPrice="150";
	String productDesc="productDesc";
	String categoryName="category1";
	String qty="100";

	public AddProductsWithShippingDetails() throws IOException, InvalidFormatException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void testAddProductWithBasicInfo() throws InterruptedException {
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

}
