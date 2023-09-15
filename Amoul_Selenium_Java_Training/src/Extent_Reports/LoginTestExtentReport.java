package Extent_Reports;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class LoginTestExtentReport {

	ExtentReports extent;

	@BeforeClass
	public void initExtent()
	{
		ExtentSparkReporter reporter = new ExtentSparkReporter("Reports Generated/Reports generated.html");
	    extent =new ExtentReports();
	    extent.attachReporter(reporter);
	    reporter.config().setDocumentTitle("Stock Managment System");
	    reporter.config().setReportName("Regression Testing");
	    reporter.config().setTheme(Theme.DARK);

	    // Extra Information
	    extent.setSystemInfo("Developer Name", "Shivakumar");
	    extent.setSystemInfo("Tester Name", "Sriprasad R");
	    extent.setSystemInfo("Project Name", "Stock Managment System");
	    extent.setSystemInfo("Test Environment/Configuration", "OS : Windows | Browser : Chrome");
	    extent.setSystemInfo("Start Date", "23 February 2023");
	    extent.setSystemInfo("Dead Line", "13 July 2023");
	    extent.setSystemInfo("", "");

	}

	@AfterClass
	public void writeReport()
	{
		extent.flush();  // without this update to report will not be created

	}

	@Test
	public void reportlogin() throws InterruptedException
	{
		ExtentTest test = extent.createTest("Valid Login Test");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		test.info("URL is opend");

		WebElement txtuserName = driver.findElement(By.xpath("//input[@name='username']"));
		txtuserName.sendKeys("Admin");

		test.info("User ID Entered");
		WebElement txtPassword =driver.findElement(By.xpath("//input[@name='password']"));
		txtPassword.sendKeys("admin123");

		test.info("Password is Entered");

		WebElement btlogin =driver.findElement(By.xpath("//button[@type='submit']"));
		btlogin.click();

		test.info("Login Button is Clicked");

		String expected = "OrangeHRM";
		String actual = driver.getTitle();

		System.out.println("expected:  "+expected);
		System.out.println("actual:  "+actual);

		  try
		  {
		  Assert.assertEquals(actual, expected, "This is not Title");
		  test.pass("This test is passed");
		  }

		  catch(AssertionError e)
		  {

			 test.addScreenCaptureFromPath(".\\Reports Generated\\ExtentScreenShots\\"+theScreenshot(driver));
			 test.fail(e.getMessage());  // test.fail gives red colour in extent report
		  }


	}

	public String theScreenshot(WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	public void reportlogin1() throws InterruptedException
	{
		ExtentTest test = extent.createTest("In-Valid Login Test");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		test.info("URL is opend");

		WebElement txtuserName = driver.findElement(By.xpath("//input[@name='username']"));
		txtuserName.sendKeys("Admin11");

		test.info("User ID Entered");
		WebElement txtPassword =driver.findElement(By.xpath("//input[@name='password']"));
		txtPassword.sendKeys("admin11");

		test.info("Password is Entered");

		WebElement btlogin =driver.findElement(By.xpath("//button[@type='submit']"));
		btlogin.click();

		test.info("Login Button is Clicked");


		  String expected = "Orange"; String actual = driver.getTitle();

		  System.out.println("expected:  "+expected);
		  System.out.println("actual:  "+actual);

		  try { Assert.assertEquals(actual, expected, "This is not Title");
		  test.pass("This test is passed"); }

		  catch(AssertionError e)
		  {

			  test.addScreenCaptureFromPath("./ExtentScreenShots/"+theScreenshot(driver));
			  test.fail(e.getMessage()); // test.fail gives red colour in extent report
		  }

	}



	@Test
	public void reportlogin2() throws InterruptedException
	{
		ExtentTest test = extent.createTest("Blank Login Test");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		test.info("URL is opend");

		WebElement txtuserName = driver.findElement(By.xpath("//input[@name='username']"));
		txtuserName.sendKeys("");

		test.info("User ID Entered Blank");
		WebElement txtPassword =driver.findElement(By.xpath("//input[@name='password']"));
		txtPassword.sendKeys("");

		test.info("Password is Entered Blank");

		WebElement btlogin =driver.findElement(By.xpath("//button[@type='submit']"));
		btlogin.click();

		test.info("Login Button is Clicked");

		 String expected = "Orange";
		 String actual = driver.getTitle();

		  System.out.println("expected:  "+expected);
		  System.out.println("actual:  "+actual);

		  try
		  {
			  Assert.assertEquals(actual, expected, "This is not Title");
			  test.pass("This test is passed");
		  }

		  catch(AssertionError e)
		  {

		  test.addScreenCaptureFromPath("./ExtentScreenShots/"+theScreenshot( driver));
		  test.fail(e.getMessage()); // test.fail gives red colour in extent report
		  }


	}


}
