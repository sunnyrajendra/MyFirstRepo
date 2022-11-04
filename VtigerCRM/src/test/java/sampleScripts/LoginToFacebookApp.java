package sampleScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericUtilities.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginToFacebookApp extends BaseClass{

	@Test
	public void loginToFacebookApp() throws InterruptedException
	{
		//welcome to facebook application
		String title = driver.getTitle();
		System.out.println(title);
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(title,"Facebook – log in or sign up");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("bjvcwdjvcjvjc");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("3423412");
		Assert.fail();
		driver.findElement(By.xpath("//button[@name='login']")).click();
		sa.assertAll();
	}	
}
