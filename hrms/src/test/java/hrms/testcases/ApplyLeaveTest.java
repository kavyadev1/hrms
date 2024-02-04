package hrms.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import hrms.pageobjects.applyleave;
import hrms.pageobjects.login;

public class ApplyLeaveTest extends BaseClass
{
	 @Parameters("browser")
	 @Test(groups = "Smoke")
public void applyleav() throws InterruptedException
{
		login lp = new login(driver);
		lp.setUserName(username);
		lp.setpassword(password);
		lp.clicklogin();
		Thread.sleep(3000);
		
		applyleave appleave = new applyleave(driver);
		appleave.clickapplyleavebtn();
		appleave.clickleavtypedropdown("privilageleave");
		appleave.clicktxtcomment("kavya");
		appleave.clickapply();

}
}
