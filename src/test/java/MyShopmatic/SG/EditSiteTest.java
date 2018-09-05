package MyShopmatic.SG;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import BaseClass.BaseClass_Login;
import Login.LoginPage;
import PageBuilder.PageBuilderPage;
import TemplateCategories.FashionAccessoriesTemplate;
import editsite.EditSitePage;

public class EditSiteTest extends BaseClass_Login{

	public EditSiteTest() throws IOException, InvalidFormatException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void testMethod() throws InterruptedException, InvalidFormatException, IOException {
		LoginPage loginPage =  new LoginPage(driver);
		loginPage.addEmail(email);
		loginPage.addPassword(password);
		Thread.sleep(2000);
		loginPage.clickLogin();
		Thread.sleep(5000);
		
		PageBuilderPage pb= new PageBuilderPage(driver);
		pb.clickDashboard();
		pb.clickEditSite();
		Thread.sleep(5000);
		
		EditSitePage e = new EditSitePage(driver);
		e.clickSiteSetting();
		Thread.sleep(2000);
		e.clickChangeDesignTemplate();
		Thread.sleep(5000);
		
		FashionAccessoriesTemplate b =new FashionAccessoriesTemplate(driver);
		b.clickCategory();
		Thread.sleep(5000);
		b.clickEditTemplate(3);
		Thread.sleep(10000);
		e.clickConfirm_template_switch();
		Thread.sleep(10000);
		e.clickSave();
	}

}
