package FreeCRMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;

public class LoginPage {
	
	public WebDriver driver;
	public Actions a;
	
	@FindBy(xpath="//span[text()='Log In']")
	WebElement login_but;
	
	
	
	@FindBy(xpath="//input[@name='email']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement login;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	
	public void login_but_click() {
		a=new Actions(driver);

		a.moveToElement(login_but).click().build().perform();
		
	}
	
	
	public void enter_username() {
		
		username.sendKeys("sai.p342@gmail.com");
	}
	
	public void enter_pass() {
		password.sendKeys("8125900610");
	}
	public HomePage login_but() {
		login.click();
	return	new HomePage(driver);
	}

}
