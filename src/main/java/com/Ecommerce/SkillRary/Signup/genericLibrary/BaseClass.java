package com.Ecommerce.SkillRary.Signup.genericLibrary;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.ChromeDriverManager;
/**
 * 
 * @author QSP
 *
 */
public class BaseClass {
	/**
	 * it is used to launch the browser fretch the url from property file
	 */
	public WebDriver driver;
	public FileUtilies fileutilies=new FileUtilies();
	public WebDriverUtilies driverutilies=new WebDriverUtilies();
	public ExtentHtmlReporter htmlreport;
	public static ExtentReports reports;
	public static ExtentTest test;
	@BeforeSuite
	public void configBS() {
 htmlreport=new ExtentHtmlReporter(AutoConstant.reportspath);
 htmlreport.config().setDocumentTitle("Skillrary");
 htmlreport.config().setTheme(Theme.DARK);
 reports=new ExtentReports();
 reports.attachReporter(htmlreport);
		
	}
	
	@BeforeMethod
	public void OpenApp() throws FileNotFoundException, IOException {
		ChromeDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(fileutilies.getPropertyFile("url"));
	}
	/**
	 * close the browser
	 * @throws IOException 
	 */
	
	
	@AfterMethod
	public void closeApp(ITestResult r) throws IOException {
		int result = r.getStatus();
		String name = r.getName();
		
		if(result==ITestResult.FAILURE) {
			driverutilies.screenShot(driver, name);
			test.log(Status.FAIL,r.getThrowable()+"Test case is failed");
		//test.addScreenCaptureFromPath(AutoConstant.photopath+name+".png");

		}
		else if(result==ITestResult.SUCCESS) {
			test.log(Status.PASS,r.getName()+"Test case is passed");
		}
		else if(result==ITestResult.SKIP)
		{
			test.log(Status.SKIP,r.getName()+"Test caes is skipped");
		}
		
		driver.quit();
	}
	
	@AfterSuite
	public void configAS() {
		htmlreport.flush();
		reports.flush();
	}

}
