package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

//Upcasting
//Maximize The Browser
	//Implicitly Wait
	//PageLoad TimeOut
	//Delete All Cookies
	//Open URL
	public static WebDriver driver;
	
	public static void initialization() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();	
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	    driver.manage().deleteAllCookies();
	    driver.get("https://edistrict.kerala.gov.in/registerPortalUser.do");
	}
	
}
