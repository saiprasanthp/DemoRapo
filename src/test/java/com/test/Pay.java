package com.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Pay {
	public WebDriver driver;
	@Test
	public void m1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://paytm.com/bus-tickets");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		WebElement ele=	driver.findElement(By.xpath("(//input[@id='text-box'])[1]"));
		ele.sendKeys("Hyderabad");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	List	<WebElement> jj=	driver.findElements(By.xpath("//p[@class='_1TxU']"));
	for(int i=0;i<jj.size();i++) {
		WebElement ele1=jj.get(i);
		String name=ele1.getText();
		System.out.println(name);
		if(name.equalsIgnoreCase("Hyderabad")) {
			Actions a=new Actions(driver);
			a.moveToElement(ele1).build().perform();
			ele1.click();
			break;
		}
		
	}
		//jj.click();


	}

}
