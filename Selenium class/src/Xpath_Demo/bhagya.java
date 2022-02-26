package Xpath_Demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class bhagya {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications");
	WebDriver driver = new ChromeDriver(option);
		
	driver.get("https://phptravels.com/demo");
	
	List<WebElement> all = driver.findElements(By.xpath("//h3[@class='text-left']"));
	
	for(WebElement a: all) {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(a.getText());
	}
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,350)","");
	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,700)","");
	
	
	
    //Launch the application		
    driver.get("https://www.browserstack.com/guide/selenium-scroll-tutorial");

    //Locating element by link text and store in variable "Element"        		
    WebElement Element = driver.findElement(By.linkText("Try Selenium Testing For Free"));

    // Scrolling down the page till the element is found		
    js.executeScript("arguments[0].scrollIntoView();", Element);
	
	}
	
}
