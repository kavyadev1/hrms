package hrms.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class mytimesheet{
WebDriver ldriver;
public mytimesheet(WebDriver rdriver)
{
	   ldriver = rdriver;
	   PageFactory.initElements(rdriver, this);   
}

@FindBy(how = How.NAME , using = "//*[@id='dashboard-quick-launch-panel-menu_holder']/table/tbody/tr/td[3]/div/a/img")
WebElement clickmytimesheet;

public void Click_my_timehseet() {
	clickmytimesheet.click();
}

@FindBy(how = How.NAME, using = "//*[@id=\"startDates\"]")
WebElement SelectWeek;

public void clickweekdropdown(String week)
{
	   Select select = new Select(SelectWeek);
     select.selectByVisibleText(week);
	   
}

@FindBy(how = How.ID, using = "//*[@id=\'btnEdit\']")
WebElement clickEdit;
 public void click_on_edit() {
	 clickEdit.click();
 }
 @FindBy(how = How.ID,using = "//*[@id='initialRows_0_projectName']")
 WebElement projectname;
 public void click_project_name(String pname) {
	 projectname.sendKeys(pname);
 }
 
 @FindBy(how = How.XPATH , using = "/html/body/div[6]/ul/li/text()[2]")
 WebElement clickprojectdropdown;
 
public void click_project_dropdown(String project) {
	Select select = new Select(clickprojectdropdown);
    select.selectByVisibleText(project);
}

@FindBy(how = How.NAME, using = "//*[@id='initialRows_nb_0_1']")
WebElement mon;

public void clickmon(String num1) {
	mon.sendKeys(num1);
}

@FindBy(how = How.ID, using = "//*[@id='submitSave']")
WebElement Clicksave;

public void click_save() {
	Clicksave.click();
	}

@FindBy(how = How.ID, using = "//*[@id='initialRows_0_toDelete']")
WebElement clickprojectnamecheckbox;
 public void click_pname_checkbox() {
	// Verify the checkbox is initially unchecked
	    Assert.assertFalse(clickprojectnamecheckbox.isSelected(), "Checkbox should be unchecked initially.");

	    // Perform the action (e.g., click the checkbox)
	    clickprojectnamecheckbox.click();

	    // Verify the checkbox is checked after the action
	    Assert.assertTrue(clickprojectnamecheckbox.isSelected(), "Checkbox should be checked after clicking.");

	    // Perform any additional verifications or actions as needed
	}




@FindBy(how = How.ID, using = "//*[@id='personal_optGender_1']")
WebElement clickradioM;
@FindBy(how = How.ID, using = "//*[@id='personal_optGender_2']")
WebElement clickradioF;

public void Click_Radio_button_M()
{
	clickradioM.click();
}
public void Click_Radio_button_F()
{
	clickradioF.click();
}























}