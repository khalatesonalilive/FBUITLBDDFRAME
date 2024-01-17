package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class RegisterPage extends BaseClass{

	@FindBy(name="firstname")
	private WebElement fname;
	
	@FindBy(name="lastname")
	private WebElement lname;
	
	public RegisterPage() {
		PageFactory.initElements(driver, this);

	}

	public String validateRegisterPageUrl() {

		return driver.getCurrentUrl();

	}
	
	public void fnameAndLnameFunctionality(String First, String Last)
	{
		fname.sendKeys(First);
		lname.sendKeys(Last);
		
	}
	
	
}
