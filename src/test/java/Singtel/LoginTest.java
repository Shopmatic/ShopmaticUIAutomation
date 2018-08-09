package Singtel;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import BaseClass.BaseClass_Login;
import Login.SingtelLogin;

public class LoginTest extends BaseClass_Login{

	public LoginTest() throws IOException, InvalidFormatException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void testSingtelLogin() throws InterruptedException {
		SingtelLogin singtelLogin = new SingtelLogin(driver);
		singtelLogin.addEmail(email);
		singtelLogin.addEnvPassCode();
		singtelLogin.clickLogin();
		Thread.sleep(5000);
	}

}
