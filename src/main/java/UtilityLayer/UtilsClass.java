package UtilityLayer;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class UtilsClass extends BaseClass{

	//Create Reusable Script Code For Click On Element Enter The Text Without Locating The Element And Without
	//Entering The Test Data
	
	public static void sendKeys(WebElement wb,String value) {
		if(wb.isDisplayed()&&wb.isEnabled()) {
			wb.sendKeys(value);
		}
	}
	public static void click(WebElement wb) {
		if(wb.isDisplayed()&&wb.isEnabled()) {
			wb.click();
		}
	}
}
