package com.Ecommerce.SkillRary.Signup.genericLibrary;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class WebDriverUtilies {
	/**
	 * Handle the dropdown
	 * @param ele
	 * @param text
	 */
	public void dropDown(WebElement ele,String text) {
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	/**
	 * Handle the mouse hover
	 * @param driver
	 * @param target
	 */
	public void mouseHover(WebDriver driver,WebElement target) {
		Actions a=new Actions(driver);
		a.moveToElement(target).perform();
	}
	/**
	 * double click action
	 * @param driver
	 * @param target
	 */
	public void doubleClick(WebDriver driver,WebElement target) {
		Actions a=new Actions(driver);
		a.doubleClick(target).perform();
	}
	/**
	 * Drag and drop
	 * @param driver
	 * @param source
	 * @param target
	 */
	public void dragandDrop(WebDriver driver,WebElement source,WebElement target) {
		Actions a=new Actions(driver);
		a.dragAndDrop(source, target).perform();
	}
	/**
	 * handle the scrollbar
	 * @param driver
	 * @param x
	 * @param y
	 */
	
	public void scrollBar(WebDriver driver,int x,int y) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	
	/**
	 * take the screenshot o the failed tc
	 * @param driver
	 * @param name
	 * @return
	 * @throws IOException
	 */
	public File screenShot(WebDriver driver,String name) throws IOException {
		Date d=new Date();
	    String s = d.toString().replace(":","-");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(AutoConstant.photopath+s+name+".png");
		FileUtils.copyFile(src, dest);
		return dest;
	}
	/**
	 * switch into the frame
	 * @param driver
	 */
	public void switchFrame(WebDriver driver) {
		driver.switchTo().frame(0);
	}
	/**
	 * switch back from the frame
	 * @param driver
	 */
	public void switchBack(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	/**
	 * handle the alertpopups
	 * @param driver
	 */
	public void alertPopup(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	/**
	 * switch he tabs
	 * @param driver
	 */
	public void switchTab(WebDriver driver) {
		Set<String> child = driver.getWindowHandles();
		for(String b:child) {
			driver.switchTo().window(b);
		}
	}
	/**
	 * Verfiy
	 * @param actual
	 * @param expected
	 */
	public void verify(String actual,String expected) {
		Assert.assertEquals(actual, expected);
	}

}
