package TemplateActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TemplateActions {
	
	private String editTemplate="//a[@class='button start-editing']";
	private String previewTemplate = "//a[@class='button preview']";
	private String previewTemplate1 = "/div/a[@class='button preview']";
	
	WebElement editTemplateElement,previewTemplateElement,templateHover;
	Actions action;
	
	public WebDriver driver;
	
	public TemplateActions(WebDriver driver) {
		this.driver =driver;
		action = new Actions(driver);
	}
	
	
	public WebElement clickEditTemplateElement() {
		return driver.findElement(By.xpath(editTemplate));
	}
	
	public WebElement clickPreviewElement(String element) {
		return driver.findElement(By.xpath(element+previewTemplate1));
	}
	
	
	
	public WebElement hoverOnBlankTemplateElement(String template) {
		return driver.findElement(By.xpath(template));
	}
	
	public void clickEditTemplate(String element) 
	{
		action.moveToElement(hoverOnBlankTemplateElement(element)).click(clickEditTemplateElement()).build().perform();
	}
	
	public void clickPreview(String element) {
		action.moveToElement(hoverOnBlankTemplateElement(element)).click(clickPreviewElement(element)).build().perform();

	}
	
	

}
