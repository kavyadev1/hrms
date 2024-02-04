package hrms.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class dashboard {
		   WebDriver ldriver;
		   public dashboard(WebDriver rdriver)
		   {
			   ldriver = rdriver;
			   PageFactory.initElements(rdriver, this);   
		   }

		   @FindBy(how = How.XPATH, using = "//*[@id='dashboard-quick-launch-panel-menu_holder']/table/tbody/tr/td[1]/div/a")
		   WebElement Applyleavebtn;
		   
}

