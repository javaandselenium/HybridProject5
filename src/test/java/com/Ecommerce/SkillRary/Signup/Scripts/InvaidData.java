package com.Ecommerce.SkillRary.Signup.Scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.Ecommerce.SkillRary.Signup.PomPages.SigninPage;
import com.Ecommerce.SkillRary.Signup.genericLibrary.BaseClass;

public class InvaidData extends BaseClass{
@Test
public void invalidLogin() throws EncryptedDocumentException, InvalidFormatException, IOException {
	test=reports.createTest("invalidLogin");
	SigninPage s=new SigninPage(driver);
	s.logincredtails(fileutilies.getExcelfile("Sheet1",1,0),fileutilies.getExcelfile("Sheet1",1,1));
	driverutilies.verify(driver.getTitle(),fileutilies.getPropertyFile("homepagetitle"));
}
}
