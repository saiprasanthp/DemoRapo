package com.amazon.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.amazonPage.AmazonPage;

import Amazon.baseclass.AmazoneBaseClass;

public class AmazonTest extends AmazoneBaseClass {
	
	
	@Test
	public void m3() {
		WebDriver driver=super.m2();
		AmazonPage h=new AmazonPage(driver);
		h.first();
		h.second();
		h.submit();
		h.text();
		
	}
	@AfterTest
	public void clse() {
		driver.close();
	}
	

}
