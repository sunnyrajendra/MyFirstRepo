package sampleScripts;

import org.testng.annotations.Test;

import ObjectRepository.LoginPage;
import genericUtilities.BaseClass;

public class POMExample extends BaseClass{

  @Test
  public void loginToFacebookApp()
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginToApp("admin", "12345");
		loginPage.lgn();
		driver.quit();
	}
}