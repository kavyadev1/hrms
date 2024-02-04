package hrms.testcases;

import org.testng.annotations.Test;

import hrms.pageobjects.login;
import hrms.pageobjects.mytimesheet;

public class MyTimesheetTest extends BaseClass
{
	@Test(groups = "Smoke")
public void my_time_sheet() throws InterruptedException
{
		login lp = new login(driver);
		lp.setUserName(username);
		lp.setpassword(password);
		lp.clicklogin();
		Thread.sleep(3000);

	mytimesheet mts = new mytimesheet(driver);
    mts.click_pname_checkbox();	
mts.Click_Radio_button_M();
mts.Click_Radio_button_F();

}
}

