package PageClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class BrokenLinkOnLoginPage extends TestBase {

	public BrokenLinkOnLoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	public void checkLinks() {
		List<WebElement> links=driver.findElements(By.xpath("//a[@href]"));
		for(WebElement fur:links) {
			System.out.println(fur.getAttribute("href"));
		}
	}
}
