package PageLayer;

import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class RegisterPage extends BaseClass{

	public RegisterPage() {
		PageFactory.initElements(driver, this);

	}

	public String validateRegisterPageUrl() {

		return driver.getCurrentUrl();

	}
}
