package Extent_Reports;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExceptionTest2 {

ExtentReports extent;

	@BeforeClass
	public void initExtent()
	{
		ExtentSparkReporter reported = new ExtentSparkReporter("Reports-gn/Reports-gn.html");
	    extent =new ExtentReports();
	    extent.attachReporter(reported);
	    reported.config().setDocumentTitle("Stock Managment System");
	    reported.config().setReportName("Regression Testing");
	    reported.config().setTheme(Theme.DARK);

	    // Extra Information
	    extent.setSystemInfo("Developer Name", "Shivakumar");
	    extent.setSystemInfo("Tester Name", "Sriprasad R");
	    extent.setSystemInfo("Project Name", "Stock Managment System");
	    extent.setSystemInfo("Test Environment/Configuration", "OS : Windows | Browser : Chrome");
	    extent.setSystemInfo("Start Date", "23 February 2023");
	    extent.setSystemInfo("Dead Line", "13 July 2023");
	//    extent.setSystemInfo("", "");

	}

	@AfterClass
	public void writeReport()
	{
		extent.flush();  // without this update to report will not be created

	}

	@Test
	public void reportloginTest() throws InterruptedException
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

	}

	@Test
	public void reportloginTest1() throws InterruptedException
	{
		ExtentTest test = extent.createTest("In-Valid Login Test");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		test.info("URL is opend");

		WebElement txtuserName = driver.findElement(By.xpath("//input[@name='username']"));
		txtuserName.sendKeys("Admin12");

		test.info("User ID Entered");
		WebElement txtPassword =driver.findElement(By.xpath("//input[@name='password']"));
		txtPassword.sendKeys("admin3210");

		test.info("Password is Entered");

		WebElement btlogin =driver.findElement(By.xpath("//button[@type='submit']"));
		btlogin.click();

		test.info("Login Button is Clicked");

	}
	@Test
	public void reportloginTest2() throws InterruptedException
	{
		ExtentTest test = extent.createTest("Blank Valid Login Test");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		test.info("URL is opend");

		WebElement txtuserName = driver.findElement(By.xpath("//input[@name='username']"));
		txtuserName.sendKeys("");

		test.info("User ID Entered");
		WebElement txtPassword =driver.findElement(By.xpath("//input[@name='password']"));
		txtPassword.sendKeys("");

		test.info("Password is Entered");

		WebElement btlogin =driver.findElement(By.xpath("//button[@type='submit']"));
		btlogin.click();

		test.info("Login Button is Clicked");

	}

}
