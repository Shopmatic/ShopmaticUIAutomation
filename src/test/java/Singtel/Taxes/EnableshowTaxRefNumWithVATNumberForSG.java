package Singtel.Taxes;

import java.io.IOException;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.BaseClass_Login;
import BasePageOptions.Setup.TaxesPage;
import Login.SingtelLogin;
import PageBuilder.PageBuilderPage;

public class EnableshowTaxRefNumWithVATNumberForSG extends BaseClass_Login{
	
	String vatRate="6.5";
	TaxesPage tax;
	String productName="Product1";
	String productSellingPrice="100.00";
	String firstName=RandomStringUtils.randomAlphabetic(5), lastName=RandomStringUtils.randomAlphabetic(3);

	public EnableshowTaxRefNumWithVATNumberForSG() throws IOException, InvalidFormatException {
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
		tax.showGSTNumCheckbox();
		tax.addGstNum("3jytvcjeruwey726");
		tax.clickSaveChanges();
		Thread.sleep(2000);
		Assert.assertTrue(tax.getMessage().contentEquals("Your changes have been saved."));
	}
	
}
