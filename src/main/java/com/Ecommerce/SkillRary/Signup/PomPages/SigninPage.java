package com.Ecommerce.SkillRary.Signup.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {
	@FindBy(xpath="//a[text()='Sign In']")
	private WebElement signinbutton;
	
	@FindBy(id="email")
	private WebElement emailaddesstb;
	
	@FindBy(name="password")
	private WebElement passwordtb;
	
	@FindBy(xpath="//button[text()=' Submit ']")
	private WebElement sumbitbtn;
	
	public SigninPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	public void logincredtails(String email,String pwd) {
		signinbutton.click();
		emailaddesstb.sendKeys(email);
		passwordtb.sendKeys(pwd);
		sumbitbtn.click();
	}
	
	
	

}
