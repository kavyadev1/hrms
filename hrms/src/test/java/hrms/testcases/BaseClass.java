package hrms.testcases;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import hrms.utilities.readconfig;

import org.apache.log4j.PropertyConfigurator;
//import org.apache.logging.log4j.core.util.FileUtils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;


public class BaseClass {
	readconfig Readconfig = new readconfig();
	
 public String baseUrl = Readconfig.getApplicationURL();
 public String username = Readconfig.getUsername();
 public String password = Readconfig.getPassword();
 public static WebDriver driver;
 
 public static Logger logger; 
  
 @Parameters("browser")// will take parameter from xml file 
 
 @BeforeClass(groups = {"Smoke", "Sanity", "Regression"})
 public void setup(String br) 
 {
	 
	 if(br.equals("chrome"))
	 {
		 System.setProperty("webdriver.chrome.driver",Readconfig.getChromepath());
		 driver = new ChromeDriver();
	 }
	
	 driver.get(baseUrl);
	 
	 Logger logger = Logger.getLogger("hrms");
	 PropertyConfigurator.configure("log4j.xml");
	 
	 // @SuppressWarnings("unused") declaration to instruct the compiler to ignore warnings about the variable being unused.
 }
 
  @AfterClass(groups = {"Smoke", "Sanity", "Regression"})
		 public void tearDown() throws InterruptedException 
  {
	  Thread.sleep(5000);
			 driver.quit();
  }
  public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
}
