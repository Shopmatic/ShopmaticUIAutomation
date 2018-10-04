package Shoptiq.products;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.BaseClass_Login;
import BasePageOptions.Products;
import Login.LoginPage;
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
		Thread.sleep(5000);
		LoginPage loginPage =  new LoginPage(driver);
		loginPage.addEmail("shoptiqtesting@gmail.com");
		loginPage.addPassword("7273fwFW");	
		loginPage.loginShoptiq();
		Thread.sleep(5000);
		loginPage.clickManageYourStore();
		Thread.sleep(5000);
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
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
		products.addOriginalPrice(originalPrice);
		products.addProductDescription(productDesc);
		products.addCategory(categoryName);
		products.addTotalStockQty(qty);
		
		products.clickMoreSettings();
		Thread.sleep(1000);
		products.addLength("1");
		products.addHeight("2");
		products.addWidth("3");
		products.addTotalWeight("10");
		
		products.clickSave();
		Thread.sleep(2000);
		Assert.assertTrue(products.isProductPresent(productName), "Product is not present in the list");
	}

}
