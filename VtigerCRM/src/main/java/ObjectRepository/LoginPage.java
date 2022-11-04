package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
//Declaretion
	@FindBy(id = "email")
	private WebElement userNameEdtText;
	
	@FindBys({@FindBy(name = "email"),@FindBy(xpath = "//input[@id='email']")})
	private WebElement passwordEdtTxt;
	
	@FindAll({@FindBy(id = "loginbutton"),@FindBy(name = "logi")})
	private WebElement loginBtn;
	
//Intialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
//Utilization
	public void loginToApp(String username,String password)
	{
		userNameEdtText.sendKeys(username);
		passwordEdtTxt.sendKeys(password);
	}
	public void lgn()
	{
		loginBtn.click();
	}
}