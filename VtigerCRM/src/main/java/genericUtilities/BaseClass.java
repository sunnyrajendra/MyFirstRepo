package genericUtilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	public WebDriver driver;
	
    @BeforeSuite
    public void dbConfig()
    {
    	System.out.println("connect to DB");
    }
    @BeforeClass
    public void launchBrowser()
    {
    	WebDriverManager.chromedriver().setup();
    	driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	System.out.println("browser launched");
    }
    
    @BeforeMethod
    public void loginToApp()
    {
    	driver.get("https://www.facebook.com");
    	System.out.println("successfully logged in");
    }
    
    @AfterMethod
    public void logoutFromApp()
    {
    	System.out.println("logout from app");
    }
    @AfterClass
    public void closeBrowser()
    {
    	driver.quit();
    	System.out.println("browser closed");
    }
    
    
	@AfterSuite
	public void dbClose()
	{
		System.out.println("close BD conn");	
	}
}
