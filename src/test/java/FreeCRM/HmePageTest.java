package FreeCRM;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import FreeCRMPages.BaseClass;
import FreeCRMPages.HomePage;
import FreeCRMPages.HomePage1;
import FreeCRMPages.LoginPage;

public class HmePageTest extends BaseClass{ 
	public HomePage w;
	public HmePageTest() {
		super();
		
	}
	@BeforeMethod
	public void bfm() {
		LoginPage f=new LoginPage(driver);
		f.login_but_click();
		f.enter_username();
		f.enter_pass();
		 w=f.login_but();	
	}
	@Test
	public void land_page() {
		report.log(LogStatus.INFO, "clicking on home");
		HomePage1 l=w.home_click();
		report.log(LogStatus.INFO, "clicked");
		report.log(LogStatus.INFO, "homepaged opened");
	}
	
	@AfterTest
	public void cl() throws InterruptedException {
		Thread.sleep(3000);
		report.log(LogStatus.INFO, " browser closed");

		driver.quit();
	}
}
