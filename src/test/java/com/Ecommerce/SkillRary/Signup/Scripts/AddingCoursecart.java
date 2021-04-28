package com.Ecommerce.SkillRary.Signup.Scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.Ecommerce.SkillRary.Signup.PomPages.AddtoCart;
import com.Ecommerce.SkillRary.Signup.PomPages.DemoSkillRrayLogin;
import com.Ecommerce.SkillRary.Signup.PomPages.LoginPage;
import com.Ecommerce.SkillRary.Signup.genericLibrary.BaseClass;
import com.Ecommerce.SkillRary.Signup.genericLibrary.FileUtilies;

public class AddingCoursecart extends BaseClass {
	
	@Test
	public void addtocart() throws FileNotFoundException, IOException {
		test=reports.createTest("addtocart");
		LoginPage l=new LoginPage(driver);
		l.navigateToDemoApp();
		
		driverutilies.switchTab(driver);
		
		DemoSkillRrayLogin d=new DemoSkillRrayLogin(driver);
		driverutilies.mouseHover(driver,d.getCoursetab());
		d.seleniumtrainingcourse();
		
		AddtoCart c=new AddtoCart(driver);
		driverutilies.doubleClick(driver,c.getAddBtn());
		c.addtocartbtn();
		driverutilies.alertPopup(driver);
		
		driverutilies.verify(driver.getTitle(),fileutilies.getPropertyFile("title"));
	}

}
