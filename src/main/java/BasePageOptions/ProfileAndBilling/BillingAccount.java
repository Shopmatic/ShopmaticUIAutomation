
package BasePageOptions.ProfileAndBilling;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;

import BaseClass.BaseClass_Login;

public class BillingAccount extends BaseClass_Login{
	WebDriver driver;

	public BillingAccount(WebDriver driver) throws IOException, InvalidFormatException {
		super();
		this.driver = driver;
	}

	
	
}
