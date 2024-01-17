package Steps;



import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;
import io.cucumber.java.en.Given;

public class RegisterPageSteps extends BaseClass {

	
	public static RegisterPage RegisterPage;
	@Given("user is on Facebook Register Page and validate the Facebook URL")
	public void user_is_on_facebook_register_page_and_validate_the_facebook_url() {
	   BaseClass.initialization();
		 RegisterPage=new RegisterPage();
	String actualUrl=	 RegisterPage.validateRegisterPageUrl();
	Assert.assertEquals(actualUrl.contains("reg"),true);
	
		
	}

	
	@Given("user enters a valid firstname and lastname")
	public void user_enters_a_valid_firstname_and_lastname() {
		RegisterPage.fnameAndLnameFunctionality("Sonali", "Khalate");
		
	}
}
