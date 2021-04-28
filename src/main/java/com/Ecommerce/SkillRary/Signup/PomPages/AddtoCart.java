package com.Ecommerce.SkillRary.Signup.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCart {
@FindBy(id="add")
private WebElement addBtn;

@FindBy(xpath="//button[text()=' Add to Cart']")
private WebElement addtocart;

public WebElement getAddBtn() {
	return addBtn;
}

public AddtoCart(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public void addtocartbtn() {
	addtocart.click();
}




}
