package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class RegisterPage extends BaseClass {

	@FindBy(name = "firstname")
	private WebElement fname;

	@FindBy(name = "lastname")
	private WebElement lname;

	@FindBy(name = "reg_email__")
	private WebElement emailId;

	@FindBy(name = "reg_passwd__")
	private WebElement PassW;

	@FindBy(name = "birthday_day")
	private WebElement bdate;

	@FindBy(name = "birthday_month")
	private WebElement bmonth;

	@FindBy(name = "birthday_year")
	private WebElement byear;

	public RegisterPage() {
		PageFactory.initElements(driver, this);

	}

	public String validateRegisterPageUrl() {

		return driver.getCurrentUrl();

	}

	public void fnameAndLnameFunctionality(String First, String Last) {
		fname.sendKeys(First);
		lname.sendKeys(Last);

	}

	public void emailIDAndPass(String emailID, String PassWord) {
		emailId.sendKeys(emailID);
		PassW.sendKeys(PassWord);

	}

	public void validateDOBFunctionality(String Date, String Month, String Year) {
		
		Select sel=new Select(bdate);
		sel.selectByVisibleText(Date);
		
		Select sel1=new Select(bmonth);
		sel1.selectByVisibleText(Date);
		
		
		Select sel2=new Select(byear);
		sel2.selectByVisibleText(Date);
	}

}
