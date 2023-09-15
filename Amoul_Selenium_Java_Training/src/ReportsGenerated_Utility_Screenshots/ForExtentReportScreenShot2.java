package ReportsGenerated_Utility_Screenshots;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hpsf.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ForExtentReportScreenShot2 {


	public static File theScreenshot(WebDriver driver) throws IOException
	{
		//1. create the object refrence of take screen shot
		// assign current drivre to it

		TakesScreenshot ts = (TakesScreenshot) driver;

		// using ts call the method getScreenshot
		// & store this screen shot into filr on=bject

		File src = ts.getScreenshotAs(OutputType.FILE);

		String timeStamp = new SimpleDateFormat("ddMMyyyyhhmmss").format(new Date());
		File trg = new File("IMG"+timeStamp+".png");

		// create an image (real)
		FileUtils.copyFile(src, new File(".\\Reports Generated\\ExtentScreenShots\\"+trg));

		return trg;
	}


}
