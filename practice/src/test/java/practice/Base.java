package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static void main(String[] args)
	{
		//setUp();
		//tearDown();
	}
	WebDriver driver;

	@BeforeTest
	public void setUp()
	{
		System.out.println("Set up");
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
		driver.get("https://google.com");
	}
	@AfterTest
	public void tearDown()
	{
		System.out.println("Tear Down");
		driver.close();
		driver.quit();
		
	}
}
