package CaptureScreenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class screenshotCapture {

	@Test
	public void capture() throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.get("http://facebook.com");
		driver.navigate().to("http://instagram.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("http://facebook.com");
		driver.navigate().to("http://gmail.com");

		//Take full page screen shot
		 TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(".\\ScreenShots\\homepage.png");
		FileUtils.copyFile(src, trg);

		//Take Section/portion of page screen shot

		/*
		 * WebElement section = driver.findElement(By.xpath("//div[@class='_6luv _52jv']"));
		 * File src = section.getScreenshotAs(OutputType.FILE);
		   File trg = new File(".\\ScreenShots\\logsection.png");
		   FileUtils.copyFile(src, trg);
		 */

		//Take screen shot of particulor portion
		/* WebElement element = driver.findElement(By.xpath("//img[@alt='Facebook']"));
		 File src = element.getScreenshotAs(OutputType.FILE); File trg = new
		 File(".\\ScreenShots\\logo.png"); FileUtils.copyFile(src, trg);*/

		// Take screen shot with time interval



	/*	TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String timestamp = new SimpleDateFormat("ddMMyyyyhhmmss").format(new Date(100));
		String filename = "IMG"+timestamp+".png";
		File trg = new File(".\\ScreenShots\\"+filename);
		FileUtils.copyFile(src, trg);*/


		driver.close();

	}

}
