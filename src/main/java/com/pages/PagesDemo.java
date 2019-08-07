package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.base.BaseClass;

public class PagesDemo extends BaseClass{
	
	
	
	@FindBy(xpath="//img[@alt='Google']")
public	WebElement image;
	@FindBy(xpath="//input[@class='gLFyf gsfi']")
public	WebElement inputText;
	
	
	public PagesDemo() {
		PageFactory.initElements(driver, this);
	}
	public void img_dispalyed() {
		boolean b=image.isDisplayed();
		Assert.assertEquals(b, true);
	}
	public void type() {
		inputText.sendKeys("hai");
	}
}
