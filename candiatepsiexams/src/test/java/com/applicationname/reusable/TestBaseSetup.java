package com.applicationname.reusable;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;



public class TestBaseSetup extends ExtentCustomisedReports{
	
	public static WebDriver driver;
	public static ReusablePropertiesFile reusableproperties;
	public static ExtentCustomisedReports ex;
	
	//@Parameters("browsername")
     @BeforeTest(groups={"regression","sanity"})
	public static void launchbrowser() throws IOException{
    	 ex=new ExtentCustomisedReports(System.getProperty("user.dir")+"\\extentreport.html");
    	 reusableproperties=new ReusablePropertiesFile("C:\\Users\\Lenovo\\Documents\\OnlineNareshClasses\\configuration.properties");
    	String browsername=reusableproperties.getPropertyData("browsername");
		if(browsername.equalsIgnoreCase("firefox")){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\Downloads\\geckodriver.exe");		
		 driver=new FirefoxDriver();
		}else if(browsername.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
			driver=new ChromeDriver();			
		}else if(browsername.equalsIgnoreCase("IE")){
			
			driver=new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to(reusableproperties.getPropertyData("appurl"));
	}
	
   @AfterTest(groups={"regression","sanity"})
    public static void tearDown(){
  	 driver.quit();
  	report.endTest(test);
  	report.flush();
  }

}
