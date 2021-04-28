package com.Ecommerce.SkillRary.Signup.Scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.Ecommerce.SkillRary.Signup.PomPages.LoginPage;
import com.Ecommerce.SkillRary.Signup.PomPages.SeleniumPage;
import com.Ecommerce.SkillRary.Signup.PomPages.TakethisCourse;
import com.Ecommerce.SkillRary.Signup.genericLibrary.BaseClass;

public class TakeCourse extends BaseClass{
	@Test
	public void takeingcourse() throws FileNotFoundException, IOException, InterruptedException {
		test=reports.createTest("takeingcourse");
		LoginPage l=new LoginPage(driver);
		l.searchforCourse(fileutilies.getPropertyFile("coursename"));
	
		SeleniumPage s=new SeleniumPage(driver);
		s.seleniumcourse();
		
		TakethisCourse t=new TakethisCourse(driver);
		driverutilies.switchFrame(driver);
		t.playVideo();
		t.pauseBtn();
		driverutilies.switchBack(driver);
		t.takecouseButton();
		driverutilies.verify(driver.getCurrentUrl(),fileutilies.getPropertyFile("takecoursetitle"));
		
	
	}

}
