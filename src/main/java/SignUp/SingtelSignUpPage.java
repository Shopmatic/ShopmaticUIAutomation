package SignUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class SingtelSignUpPage {
	
public WebDriver driver;
	
	public SingtelSignUpPage(WebDriver driver) {
		this.driver =driver;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
