package OrderShippingOptions;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BaseClass.BaseClass_Login;

public class ShipViaShipyaari extends BaseClass_Login
{
		WebDriver driver;

		public ShipViaShipyaari(WebDriver driver) throws IOException, InvalidFormatException {
			super();
			this.driver = driver;
		}
		
		private String scheduleViaShipyaari_button="//button[text()='Schedule pickup now']";
		
		public void clickScheduleViaShipyaari() {
			driver.findElement(By.xpath(scheduleViaShipyaari_button)).click();
		}
		
}
