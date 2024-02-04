package hrms.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import hrms.pageobjects.login;
import hrms.utilities.XLUtlis;

public class loginDDT extends BaseClass 
{
	@Test(dataProvider = "logindata", groups = {"Smoke", "Sanity"})//create a parameter, give dataprovider name = logindata
	public void logindata(String user , String pwd) 
	{
	
		login lp = new login(driver);
		lp.setUserName(user);
		lp.setpassword(pwd);
		lp.clicklogin();
		
		if(isAlertPresent()==true) {//if alert is present means username and pwd is wrong then alert popups
			driver.switchTo().alert().accept();//close alert
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);//testcase is fail 
		
		}
		else 
		{
			Assert.assertTrue(true);
			
		}
	}
	//user defined method to check alert
	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
			}
		catch(Exception e) 
		{
			return false;
		}
		
	}
public void loignddt()
{
	
}
	@DataProvider(name="logindata")
	 String[][] getData() throws IOException//strign2 dimensional array is returntype 
	{
		String path = System.getProperty("user.dir")+"/src/test/java/hrms/testdata/data sheet .xlsx";
		int rownum = XLUtlis.getRowCount(path, "Sheet1");
		int colcount = XLUtlis.getCellCount(path, "Sheet1", 1);
		
		//two dimensional array to get data from excel file
		//login[][] - two dimensional array 
		// should specify with same number of rows and columns in excel 
		String logindata[][] = new String[rownum][colcount];
		
		for (int i= 1; i<= rownum; i++)
		{
			for (int j = 0; j < colcount; j++)
			{
				logindata[i-j][j] = XLUtlis.getCellData(path,"Sheet1", i, j);
			}
			
		}
		return logindata;
			
	}
	
	
}
