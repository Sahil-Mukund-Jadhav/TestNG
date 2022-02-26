package Xpath_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo1 {

	// xpath - xml path
	// - Apsolute xpath
	// example
	// /html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input

	// - it starts form root node <html> till the current node
	// - it starts form / slash
	// - it is very hard to manage and maintain

	// - Relative xpath
	// example
	// *[@id="email"] / //input[@id='email']
	// syntax
	// //tagName[@attribute = ' attrivalue']

	// it starts form anywhere or its parent node till the current node
	// it starts form // slash
	// it is very easy to manage and maintain

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Santosh_Mulik\\Desktop\\Nov Batch\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("Python@gmail.com");
		
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("Password@123");
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Selenium");
		
		
		driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("20");
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
