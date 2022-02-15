package TestCases;

import org.testng.annotations.Test;

import Base.TestBase;
import PageClasses.CreateAccount_click;
import PageClasses.EnterInfoPage;
import PageClasses.SignUpPage;

public class TC_02_CreateAcount extends TestBase {
	CreateAccount_click cc;
	EnterInfoPage ep;
	SignUpPage sp;
	public TC_02_CreateAcount(){
		super();
	}
	
	@Test(priority=0)
	public void setup() {
		initilization();	
		cc=new CreateAccount_click();
		ep=cc.returnclass();
	}
	
	@Test(priority=1)
	public void TC_02_1() {
		cc.click_createAccount();
	}
	
	
	@Test(priority=2)
	public void TC_02_2() {
		sp=ep.returnclass();
	}
	
	
	@Test(priority=3)
	public void TC_02_2_2() {
		ep.EnterInfo(prop.getProperty("firstname"),prop.getProperty("lastname"),
				prop.getProperty("mobile"),prop.getProperty("newpass"));
		ep.dropdownSelection(prop.getProperty("day"), prop.getProperty("month"),
				prop.getProperty("year"));
	}

	
}
