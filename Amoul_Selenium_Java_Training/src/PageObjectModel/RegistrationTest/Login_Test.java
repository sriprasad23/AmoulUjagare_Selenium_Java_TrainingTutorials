package PageObjectModel.RegistrationTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Login_Test
{
	ExtentReports extent;

	@BeforeClass
	public void initExtent()
	{
		ExtentSparkReporter reporter = new ExtentSparkReporter("OrangeHRM Reports Generated/Reports generated.html");
	    extent =new ExtentReports();
	    extent.attachReporter(reporter);
	    reporter.config().setDocumentTitle("Attendance Managment System");
	    reporter.config().setReportName("Regression Testing");
	    reporter.config().setTheme(Theme.DARK);

	    // Extra Information
	    extent.setSystemInfo("Developer Name", "Shivakumar");
	    extent.setSystemInfo("Tester Name", "Sriprasad R");
	    extent.setSystemInfo("Project Name", "Attendance Managment System");
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
  public void verifylogintest() throws InterruptedException
  {
	  ExtentTest test = extent.createTest("OrangeHRM Login Test");
	  WebDriver driver = new ChromeDriver();

	//  RegistrationPage RGPage = new RegistrationPage(driver); //constructor

	  LoginPage2_Imp RGPage = new LoginPage2_Imp(driver);

	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.manage().window().maximize();

	  test.info("URL is opend");

	  RGPage.setuserName("Admin");
	  test.info("User ID Entered");
	  RGPage.setuserPassword("admin123");
	  test.info("Password is Entered");
	  RGPage.loginclick();
	  test.info("Login Button is Clicked");

	  Thread.sleep(6000);
	  driver.close();

  }

}
