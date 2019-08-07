package PaytmModel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class BusPage {
	WebDriver driver;
	Actions act;
	@FindBy(xpath="//a[@title='Bus']")
	WebElement bus;
	
	@FindBy(xpath="(//input[@id='text-box' and @class='fl-input'])[1]")
	WebElement enterBus;
	
	@FindBys(@FindBy(className="//p[@class='_1TxU']")) 
	List<WebElement> cities;
	
	public BusPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void busclick() {
		act=new Actions(driver);
		act.moveToElement(bus).build().perform();
		bus.click();
	}
	
	public void ene() {
		enterBus.sendKeys("hyderabad");
	}
	
	public void check() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		for(int i=0;i<cities.size();i++) {
			WebElement ele1=cities.get(i);
			String name=ele1.getText();
			System.out.println(name);
			if(name.equalsIgnoreCase("Hyderabad")) {
				 act=new Actions(driver);
				act.moveToElement(ele1).build().perform();
				ele1.click();
				break;  
			}
		}
	}
}
	


