package com.paytmtest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import PaytmModel.BaseClass;
import PaytmModel.BusPage;

public class TestPaytm extends BaseClass{
	
	
	@Test
	public void m2() {
		WebDriver driver=m1();
		BusPage j=new BusPage(driver);
		j.busclick();
		j.ene();
		j.check();
		
		
		
		
	}
	@AfterTest
	public void m3() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
	

}
