package hrms.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login 
{
   WebDriver ldriver;
   public login(WebDriver rdriver)
   {
	   ldriver = rdriver;
	   PageFactory.initElements(rdriver, this);   
   }
   
   @FindBy(name ="txtUsername")
   WebElement txtUsername;
   
   @FindBy(id="txtPassword")
   WebElement txtpassword;
   
   @FindBy(id="btnLogin")
   WebElement loginbtn;
   
   @FindBy(id="welcome")
   WebElement Welcomebtn;
   
   @FindBy(xpath = "//a[@href='/index.php/auth/logout']")
   private WebElement logoutbtn;


   
	public void setUserName(String uname)
	{
		txtUsername.sendKeys(uname);
	}
	public void setpassword(String pwd)
	{
		txtpassword.sendKeys(pwd);
	}
	public void clicklogin()
	{
		loginbtn.click();
	}
	public void clickwelcomebtn()
	{
		Welcomebtn.click();
	}
    public void clicklogout()
    {
    	logoutbtn.click();
    }
}
