package Singtel.Taxes;

import java.io.IOException;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import BaseClass.BaseClass_Login;
import BaseClass.Navigation;
import BasePageOptions.Products;
import BasePageOptions.Setup.TaxesPage;
import Login.SingtelLogin;
import PageBuilder.DomainNamePage;
import PageBuilder.PageBuilderPage;
import PageBuilder.PaymentOptionsPage;
import PageBuilder.ReadyToPublishPage;
import SignUp.BusinessInfo;
import SignUp.SignUp;
import SignUp.SignUpWindow;
import TemplateCategories.BlankTemplate;

public class AddGSTRefNumberForSG extends BaseClass_Login{
	
	String vatRate="6.5";
	TaxesPage tax;
	String productName="Product1";
	String productSellingPrice="100.00";
	String firstName=RandomStringUtils.randomAlphabetic(5), lastName=RandomStringUtils.randomAlphabetic(3);

	public AddGSTRefNumberForSG() throws IOException, InvalidFormatException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Test
	public void enableGST() throws InterruptedException {
		SingtelLogin singtelLogin = new SingtelLogin(driver);
		singtelLogin.addEmail(email);
		singtelLogin.addEnvPassCode();
		singtelLogin.clickLogin();
		Thread.sleep(5000);
		
		PageBuilderPage pageBuilderPage=new PageBuilderPage(driver);
		pageBuilderPage.clickDashboard();
		pageBuilderPage.selectSetUp();
		pageBuilderPage.clickTaxes();
		Thread.sleep(5000);
		
		tax=new TaxesPage(driver);
		tax.addGstNum("GST1234567890098");
		tax.clickSaveChanges();
		Thread.sleep(2000);
		Assert.assertTrue(tax.getMessage().contentEquals("Your changes have been saved."));
	}
	
}
