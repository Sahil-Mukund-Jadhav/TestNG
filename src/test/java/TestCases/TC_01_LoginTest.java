package TestCases;

import org.testng.annotations.*;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import utiltiy.ExtentReportManager;

import Base.TestBase;
import PageClasses.HomePage;
import PageClasses.LoingPage;
import PageClasses.dummyClass;
import jdk.jfr.internal.Logger;

public class TC_01_LoginTest extends TestBase {
	
	LoingPage lp;
	HomePage hp;
	dummyClass dm;
	ExtentReports report;
	ExtentTest logger;
	
	public TC_01_LoginTest() {
		super();
		report= ExtentReportManager.getReportInstance();
		 logger=report.createTest("setup");
	}
	
	@BeforeSuite
	public void reports() {
		report= ExtentReportManager.getReportInstance();
		 logger=report.createTest("setup");
	}

	@Test(priority = 0)
	public void setup() throws InterruptedException {
		
		initilization();
	
		lp = new LoingPage();
		String a = lp.user_pass(prop.getProperty("username"), prop.getProperty("password"));
		
		hp = lp.click1();
		logger.log(Status.PASS,"Test pass 1");
		
		String ab = hp.acceptAlert();
		System.out.println(ab);
	}

	@Test(priority = 1)
	public void TC_01_1() {
		
		dm=hp.javaScriptExpecu();
		logger.log(Status.PASS,"Test pass 2");
	}

	@Test(priority = 2)
	public void logoutFacebook() {
		lp=hp.logout();
		logger.log(Status.FAIL,"Test pass 3");
	}
	@Test(priority=3)
	public void close(){
		report.flush();
		logger.log(Status.FAIL,"Test pass 4");
		driver.close();
	}
}
