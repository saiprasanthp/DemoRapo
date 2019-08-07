package FreeCRM;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import FreeCRMPages.BaseClass;
import FreeCRMPages.HomePage;
import FreeCRMPages.LoginPage;

public class LoginTest extends BaseClass{
	
	
	public LoginTest() {
		
		super();
	}
	
	
	@Test
	public void loginTest1() {
		LoginPage j=new LoginPage(driver);
		
		j.login_but_click();
		report.log(LogStatus.INFO, "click on loging");

		j.enter_username();
		report.log(LogStatus.INFO, "send keys of username");

		j.enter_pass();
		report.log(LogStatus.INFO, "entered password");
		HomePage obj=j.login_but();
		report.log(LogStatus.INFO, "login success");

	}
	
	@AfterTest
	public void after() {
		driver.quit();
	}
	
	
	

}
