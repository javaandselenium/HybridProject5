package com.Ecommerce.SkillRary.Signup.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(xpath="//a[text()=' GEARS ']")
private WebElement gerasbtn;

@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
private WebElement demoapp;

@FindBy(name="q")
private WebElement searchTb;

@FindBy(xpath="//input[@value='go']")
private WebElement gobtn;

public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}


public void navigateToDemoApp() {
	gerasbtn.click();
	demoapp.click();
}

public void searchforCourse(String course) {
	searchTb.sendKeys(course);
	gobtn.click();
}

}
