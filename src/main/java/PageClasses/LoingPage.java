package PageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoingPage extends TestBase{

	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")
	WebElement username;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input")
	WebElement Password;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")
	WebElement sigin;

   public LoingPage(){
	   PageFactory.initElements(driver,this);
   }
   
   public String user_pass(String uname,String pass) {
	   username.sendKeys(uname);
	   Password.sendKeys(pass);
	   return null;
   }
   
   public HomePage click1() {
	   sigin.click();
	   return new HomePage();
   }

}
