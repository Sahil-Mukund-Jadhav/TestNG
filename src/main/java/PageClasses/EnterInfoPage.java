package PageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;

public class EnterInfoPage extends TestBase{

	@FindBy(xpath="//input[@name=\"firstname\"]")
	WebElement fname;
	
	@FindBy(xpath="//input[@name=\"lastname\"]")
	WebElement lname;
	
	@FindBy(xpath="//input[@name=\"reg_email__\"]")
	WebElement mob;
	
	@FindBy(xpath="//input[@id=\"password_step_input\"]")
	WebElement new_pass;
	
	@FindBy(xpath="//select[@id='day']")
	WebElement day;
	
	@FindBy(xpath="//select[@id='month']")
	WebElement month;
	
	@FindBy(xpath="//select[@id='year']")
	WebElement year;
	
	@FindBy(xpath="")
	WebElement xyz;
	
	public EnterInfoPage() {
		PageFactory.initElements(driver,this);
	}
	
	public void EnterInfo(String fname,String lname,String mob,String newpass) {
		this.fname.sendKeys(fname);
		this.lname.sendKeys(lname);
		this.mob.sendKeys(mob);
		this.new_pass.sendKeys(newpass);
	}
	public SignUpPage returnclass() {
		return new SignUpPage();
	}
	public void dropdownSelection(String day1,String month2,String year3) {
		Select sel=new Select(day);
		sel.selectByVisibleText(day1);
		
		Select sel2=new Select(month);
		sel2.selectByVisibleText(month2);
		
		Select sel3=new Select(year);
		sel3.selectByVisibleText(year3);
	}
	
	public void genderSelection(){
		
	}	
	
	
	
	
	
	
	
	
	
	
	
	
}
