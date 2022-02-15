package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class HomePage extends TestBase{
@FindBy(xpath="//div[contains(text(),'Press Enter to p')]")
WebElement ele;

	public HomePage() {
		PageFactory.initElements(driver,this);
	}
	public String acceptAlert() throws InterruptedException {
		
	String Title=driver.getTitle();
	
	return Title;
	}
	

	
	public dummyClass javaScriptExpecu() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()",ele);
		System.out.println(ele.getText());
		return new dummyClass();
	}
	public LoingPage logout() {
		driver.findElement(By.xpath("//div[@aria-label='Account']")).click();
		driver.findElement(By.xpath("//div//span[contains(text(),'Log Out')]")).click();
		return new LoingPage();
	}
}
