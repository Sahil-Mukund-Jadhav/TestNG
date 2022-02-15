package TestCases;

import java.util.concurrent.BrokenBarrierException;

import org.testng.annotations.Test;

import Base.TestBase;
import PageClasses.BrokenLinkOnLoginPage;
import PageClasses.LoingPage;

public class TC_03_BrokenLinksOnLoginPage extends TestBase{

	LoingPage lp;
	BrokenLinkOnLoginPage bp;
	
	public TC_03_BrokenLinksOnLoginPage() {
		super();
	}
	
	@Test(priority=0)
	public void setup() {
		initilization();
		lp=new LoingPage();
		lp.user_pass(prop.getProperty("username"),prop.getProperty("password"));
		bp=new BrokenLinkOnLoginPage();
		bp.checkLinks();
	}

}
