package ReportsGenerated_Utility_Screenshots;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hpsf.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ForExtentReportScreenShot {


	public static String theScreenshot(WebDriver driver) throws IOException
	{
		//1. create the object refrence of take screen shot
		// assign current drivre to it

		TakesScreenshot ts = (TakesScreenshot) driver;

		// using ts call the method getScreenshot
		// & store this screen shot into filr on=bject

		File srcFile = ts.getScreenshotAs(OutputType.FILE);

		String timeStamp = new SimpleDateFormat("ddMMyyyyhhmmss").format(new Date());
		String fileName = "IMG"+timeStamp+".png";

		// create an image (real)
		FileUtils.copyFile(srcFile, new File(".Reports Generated\\ExtentScreenShots\\"+fileName));

		return fileName;
	}

	public static ExtentReports getExtentObject()
	{
		ExtentSparkReporter reporter = new ExtentSparkReporter("Reports Generated/Reports.html");
	    ExtentReports extent =new ExtentReports();
	    extent.attachReporter(reporter);
	    reporter.config().setDocumentTitle("HR Managment System");
	    reporter.config().setReportName("Regression Testing");
	    reporter.config().setTheme(Theme.DARK);

	    // Extra Information
	    extent.setSystemInfo("Developer Name", "Pradeep");
	    extent.setSystemInfo("Tester Name", "Sriprasad R");
	    extent.setSystemInfo("Project Name", "HR Managment System");
	    extent.setSystemInfo("Test Environment/Configuration", "OS : Windows | Browser : Chrome");
	    extent.setSystemInfo("Start Date", "23 February 2023");
	    extent.setSystemInfo("Dead Line", "13 July 2023");
	    extent.setSystemInfo("", "");

	    return extent;

	}

}
