package practice;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FirstTest extends Base {
	
	@Test
	public void firstTest()
	{
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("btnK")).click();
		WebElement element= driver.findElement(By.partialLinkText("Selenium"));
		WebDriverWait wait=new WebDriverWait(driver, 1000);
		wait.until(ExpectedConditions.visibilityOf(element));
		//WebElement element= driver.findElement(By.partialLinkText("Selenium"));
		//System.out.println(element.toString());
		assertEquals("https://www.selenium.dev/",element.getAttribute("href"));
	}

}
