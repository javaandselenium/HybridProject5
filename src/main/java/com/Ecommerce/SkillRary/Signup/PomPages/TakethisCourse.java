package com.Ecommerce.SkillRary.Signup.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TakethisCourse {
@FindBy(xpath="//div[@class='play-icon']")
private WebElement playbtn;


@FindBy(xpath="//div[@class='pause-icon']")
private WebElement pausebtn;

@FindBy(xpath="//div[@class='controls enroll_take_course']")
private WebElement takecoursebtn;

public TakethisCourse(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public void playVideo() throws InterruptedException {
	playbtn.click();
	Thread.sleep(10000);
	
	
}
public void pauseBtn() {
	pausebtn.click();
}

public void takecouseButton() {
	takecoursebtn.click();
}
}
