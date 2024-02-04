package hrms.testcases;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import hrms.pageobjects.login;

public class LoginTest extends BaseClass
{
	@Test(groups = {"Regression", "Sanity"})
	public void loginTest() throws InterruptedException 
	{
		
		//logger.info("url is opened");		//creating object for page object class login
		login lp = new login(driver);
		lp.setUserName(username);
		//logger.info("entered username");
		lp.setpassword(password);
		//logger.info("entered password");
		Thread.sleep(5000);
		lp.clicklogin();
		//logger.info("login test passed");
		
		if
		(driver.getTitle().equals("TRIGENT"))
		{
			Assert.assertTrue(true);
		}
		else
			
		{
		//if testcase is failed we need to call screenshot method
		try {
			captureScreen(driver, "loginTest");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//giving testcase name  , webdriver object that is driver 
			Assert.assertTrue(false);
		}
	}

}