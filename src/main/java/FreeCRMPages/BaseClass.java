package FreeCRMPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class BaseClass {
public	WebDriver driver;
public ExtentReports report;
	
public	BaseClass(){
	report=ExtentReports.get(BaseClass.class);
	report.init("F:\\pom.html", true);
	report.startTest("staring and initailizing test");
	report.log(LogStatus.INFO, "starting");
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");

	driver=new ChromeDriver();
	driver.get("https://freecrm.com/");
	report.log(LogStatus.INFO, "url launched");

	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	}
	
	

}
