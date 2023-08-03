package TestLayer;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.RegisterUserPage;

public class RegisterUserPageTest extends BaseClass{
//Mention Precondition 
//Write Test Case With Help Of @Test Annotation and Call RegisterUserPage Class Methods With help Of Object Name
	//and at The Time Of calling This Method Enter The Test Data
	//Mention Post Condition
	@BeforeTest
	public void setUp() {
		initialization();
	}
	@Test
	public void validateRegisterUserFun() throws InterruptedException {
		RegisterUserPage reg=new RegisterUserPage();
		reg.RegisterUserPageFunctionality("abc","May","2020","12", "Male", "Om", "Pune", "Nigadi",
				"Kannur", "7890765434", "546789765432");
	}
}

