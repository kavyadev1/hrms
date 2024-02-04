package hrms.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readconfig {
	
	Properties pro;
	 public readconfig() {
	        try {
	            File src = new File("./Configuration/Config.properties"); // reading data from config.properties we have to use
	                                                                     // file input stream

	            FileInputStream fis = new FileInputStream(src);
	            pro = new Properties(); // pro object is initiated
	            pro.load(fis); // load is a method which will load complete file(config file)
	        } catch (IOException e) {
	            e.printStackTrace(); // Handle the exception according to your requirements
	        }
	    }
	//to read each and every variable from config file , we have to create method 
         public String getApplicationURL() {
        	 String url = pro.getProperty("url");
        	 return url;
         }
         public String getUsername() {
        	 String username = pro.getProperty("username");
        	 return username;
         }
         public String getPassword() {
        	 String password = pro.getProperty("password");
        	 return password;
         }
         public String getChromepath() {
        	 String chromepath = pro.getProperty("chromepath");
        	 return chromepath;
         }
}

