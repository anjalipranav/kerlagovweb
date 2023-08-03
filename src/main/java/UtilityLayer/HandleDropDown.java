package UtilityLayer;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass{
//Create Reusable Script Code Without Finding The WebElement And Without Seleting The WebElement 
	
	public static void selectByVisibleText(WebElement wb,String value) {
		Select sel=new Select(wb);
		sel.selectByVisibleText(value);
	}
	
	public static void selectfindElements(List<WebElement> wb,String value) {
	for(WebElement abc:wb) {
		if(abc.getText().contains(value)) {
			System.out.println(abc.getText());
			
			//((JavascriptExecutor)driver).("arguments[0].click();",abc);
			abc.click();
			break;
		}
	}
}
	
	public static void selectGender(List<WebElement> wb,String value) {
		for(WebElement abc:wb) {
			if(abc.getAttribute("id").equalsIgnoreCase(value)) {
			
				
				((JavascriptExecutor)driver).executeScript("arguments[0].click();",abc);
				//abc.click();
				break;
			}
		}
	}
}