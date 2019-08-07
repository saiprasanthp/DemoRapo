package com.amazonPage;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Amazon.baseclass.AmazoneBaseClass;

public class AmazonPage extends AmazoneBaseClass{
	
	
	
	@FindBy(xpath="(//a[@class='a-link-normal quadrant-overlay'])[5]")
	WebElement firstdress;
	
	@FindBy(xpath="(//div[@class='bb-s-item-overlay'])[2]")
	WebElement second;
	
	@FindBy(xpath="//input[@id='buy-now-button']")
	WebElement submit;
	
	@FindBy(xpath="//input[@type='email']")
	WebElement text;
	
	
	public AmazonPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void first() {
		firstdress.click();
		
	}
	public void second() {
		second.click();
		
	}
	public void submit() {
		submit.click();
	}
	public void text() {
		text.sendKeys("sai");
	}
	
	
	
	
	
	

}
