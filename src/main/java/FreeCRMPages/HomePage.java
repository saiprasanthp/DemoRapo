package FreeCRMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver;
	public Actions a;
	
	@FindBy(xpath="//span[text()='Home']")
	WebElement home;
	
	@FindBy(xpath="//span[text()='Calendar']")
	WebElement calender;
	
	@FindBy(xpath="//span[text()='Contacts']")
	WebElement contacts;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public HomePage1 home_click() {
		a=new Actions(driver);
		a.moveToElement(home).click().build().perform();
		return new  HomePage1(driver);	
	}

}
