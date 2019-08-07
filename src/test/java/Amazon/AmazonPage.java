package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPage extends Utility{
public	WebDriver driver;
	
	
	@FindBy(xpath="(//a[@class='a-link-normal quadrant-overlay'])[1]")
	WebElement mensfashion;
	
public	AmazonPage(WebDriver driver){
	this.driver=driver;
		PageFactory.initElements(driver, this);
	}

public Mens click_on_Fashion() {
	super.a=new Actions(driver);
	a.moveToElement(mensfashion).click().build().perform();
	
	return new Mens();
	
	
}

	
	


}
