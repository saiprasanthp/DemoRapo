package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mens extends Utility {
	WebDriver driver;
	
	@FindBy(xpath="(//div[@class='bb-s-item-overlay'])[3]")
	WebElement shirt;
	
	
	public Mens(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	

	public Mens() {
		
	}

	public void click_mens() {
		a.moveToElement(shirt).click().build().perform();
		
	}

}
