package hrms.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class applyleave {
	   WebDriver ldriver;
	   public applyleave(WebDriver rdriver)
	   {
		   ldriver = rdriver;
		   PageFactory.initElements(rdriver, this);   
	   }
	   
	   @FindBy(how = How.XPATH, using = "//*[@id='dashboard-quick-launch-panel-menu_holder']/table/tbody/tr/td[1]/div/a")
	   WebElement Applyleavebtn;
	   @FindBy(how = How.NAME, using = "//*[@name =applyleave[txtLeaveType]")
	   WebElement leavetypedropdown;
	   @FindBy(how = How.NAME, using ="//*[@name = applyleave[txtComment")
	   WebElement txtcomment;
	   @FindBy(how = How.ID, using = "//*[@id=\"applyBtn\"]")
	   WebElement applybtn;
	   
	   public void clickapplyleavebtn()
	   {
		   Applyleavebtn.click(); 
	   }
	   
		public void clickleavtypedropdown(String leavetype)
		   {
			   Select select = new Select(leavetypedropdown);
		        select.selectByVisibleText(leavetype);
			   
		   }
	   public void clicktxtcomment(String comment)
	   {
		   txtcomment.sendKeys(comment);
	   }
	   
	   public void clickapply()
	   {
		   applybtn.click();
	   }

	
}

