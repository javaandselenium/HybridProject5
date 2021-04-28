package com.Ecommerce.SkillRary.Signup.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSkillRrayLogin {
@FindBy(id="course")
private WebElement coursetab;

@FindBy(xpath="//a[text()='Selenium Training']")
private WebElement seleniumTraining;


public DemoSkillRrayLogin(WebDriver driver) {
	PageFactory.initElements(driver,this);
}


public WebElement getCoursetab() {
	return coursetab;
}

public void seleniumtrainingcourse() {
	seleniumTraining.click();
}




}
