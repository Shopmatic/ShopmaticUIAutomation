package TemplateActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LayoutPreview {
	WebDriver driver;
	
	private String back_to_layout_section="//a[contains(@class,'back-to-select')]";
	private String edit_this_layout="//a[contains(@class,'edit')]";
	
	public LayoutPreview(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickBacktoLayout() {
		driver.findElement(By.xpath(back_to_layout_section)).click();
	}
	
	public void clickEditThisLayout() {
		driver.findElement(By.xpath(edit_this_layout)).click();
	}
	
	public String layoutHeader() {
		return driver.findElement(By.xpath("//h1")).getText();
	}

}
