package sampleScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGExample
{
	@Test // acts like a main method
	public void test1()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	//	System.out.println("success"); // print only in eclipse console
		Reporter.log("facebook", true); // print both in eclipse console as well as report
	}
	
	@Test
	public void test2()
	{
	   WebDriverManager.firefoxdriver().setup();
	   WebDriver driver=new FirefoxDriver();
	   driver.get("https://www.amazon.in");
	   Reporter.log("amazon",true);
	}
	
	@Test
	public void test3()
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com");
		Reporter.log("flipkart",true);
	}
}