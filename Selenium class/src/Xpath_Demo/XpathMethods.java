package Xpath_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathMethods {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Santosh_Mulik\\Desktop\\Nov Batch\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// text()
		// tagName[text()='textval']

		driver.findElement(By.xpath("//a[text()='Create Account']")).click();

		// starts-with()
		// tagName[starts-with(@attriName,'value')]

		// tagName[starts-with(text(),'textValue')]

		driver.findElement(By.xpath("//input[starts-with(@name,'name')]")).sendKeys("Selenium");

		String str = driver.findElement(By.xpath("//td[starts-with(text(),'By clicking on')]")).getText();
		System.out.println(str);

		// contains()
		// tagName[contains(@attriName, 'attriValue')]

		// tagName[contains(text(), 'textValue')]

		// in between value
		// a[contains(text(),' and conditions')]

		driver.findElement(By.xpath("//input[contains(@name,'login')]")).sendKeys("ramrathod");

		driver.findElement(By.xpath("//input[contains(@name,'chkavail')]")).click();

		// and / or
		// span[@class='a-size-medium a-color-base a-text-normal' or @class='a-price-whole']

		driver.findElement(By.xpath("//input[@type='radio' and @value='f']")).click();
		Thread.sleep(3000);

		// index
		driver.findElement(By.xpath("//input[@type='radio'][1]")).click();

		Thread.sleep(3000);
		driver.quit();
	}

}
