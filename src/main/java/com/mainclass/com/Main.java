package com.mainclass.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Login.page.Login;

public class Main {
	
	
	
	@Test
	public void runTo() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Login h=new Login(driver);
		h.inputEnter();
		h.search();
		h.clickOn();
		
		driver.quit();
		
	}

}
