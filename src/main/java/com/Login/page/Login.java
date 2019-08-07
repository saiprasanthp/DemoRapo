package com.Login.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {


	WebDriver driver;

	By input=By.xpath("//input[@class='gLFyf gsfi']");
	By click=	By.xpath("(//input[@class='gNO89b'])[2]");
	By search=By.xpath("(//b[text()='mahesh babu'])[1]");
	
	
	
	public Login(WebDriver driver) {
		this.driver=driver;
	}
	
	public void inputEnter() {
		driver.findElement(input).sendKeys("maheshbabu");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}
	
	public void clickOn() {
		driver.findElement(click).click();
	} 

	public void search() {
		driver.findElement(search).click();

	}









}
