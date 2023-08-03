package PageLayer;

import static UtilityLayer.HandleDropDown.*;

import static UtilityLayer.UtilsClass.*;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class RegisterUserPage extends BaseClass{
//FindElement using @FindBy Annotation and store global,private in webelemnt Variable
	//initialize The Object Repository With Help Of Page Factory class
	//Create Functionality Associated Method Without Entering Test Data
	@FindBy(id="userName")
	private WebElement username;
	
	@FindBy(xpath="//i[@class='fa fa-calendar-alt	 icon-calendar']")
	private WebElement clickcalender;
	
	
	  @FindBy(id="changeMonth") 
	  private WebElement clickmonth;
	  
	  @FindBy(xpath="//td[starts-with(@id,'m')]") 
	  private List<WebElement> month;
	 
	  @FindBy(id="changeYear") 
	  private WebElement clickyear;
	 
	
	 @FindBy(xpath="(//div[@id='selectYear']//td)") 
	 private List<WebElement> year;
	 
	//@FindBy(id="dobCalender")
	//private WebElement Date;
	
	 @FindBy(xpath="//span[@id='CalContent']//a") 
	 private List<WebElement> Date;
	  
	 @FindBy(xpath="//input[@name='gender']")
	private List<WebElement> Gender;
	
	@FindBy(id="houseno_name")
	private WebElement HouseName;
	
	@FindBy(id="place")
	private WebElement Place;
	
	@FindBy(id="locality")
	private WebElement Locality;
	
	@FindBy(id="districtCbo")
	private WebElement District;
	
	@FindBy(id="mobileNo")
	private WebElement Mobile;
	
	@FindBy(id="uid")
	private WebElement Aadhar;
	
	public RegisterUserPage() {
		PageFactory.initElements(driver, this);
	}
	public void RegisterUserPageFunctionality(String name,String Month,String Year,String date,String gender,
			String housename,String place,String local,String dist,String Phone,String adhar) throws InterruptedException {
		sendKeys(username,name);
		click(clickcalender);
		
		  Thread.sleep(3000); 
		  click(clickmonth);
		  
		  selectfindElements(month,Month); 
		  Thread.sleep(3000);
		  click(clickyear);
		  selectfindElements(year,Year);
		  Thread.sleep(3000);
		  selectfindElements(Date,date);
		 
		
		//sendKeys(Date,date);
		selectGender(Gender, gender);
		sendKeys(HouseName,housename);
		sendKeys(Place,place);
		sendKeys(Locality,local);
		selectByVisibleText(District,dist);
		sendKeys(Mobile,Phone);
		sendKeys(Aadhar,adhar);
		
	}
	
}
