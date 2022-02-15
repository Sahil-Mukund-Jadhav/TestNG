package PageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CreateAccount_click extends TestBase{

	@FindBy(xpath="//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")
	WebElement createaccount;
	
	public CreateAccount_click() {
		PageFactory.initElements(driver,this);
	}
	
	public void click_createAccount() {
		createaccount.click();
	}
	
	public  EnterInfoPage returnclass() {
		return new EnterInfoPage();
	}
}
