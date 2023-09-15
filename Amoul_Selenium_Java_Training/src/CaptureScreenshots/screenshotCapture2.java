package CaptureScreenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class screenshotCapture2 {

	private TakesScreenshot driver;
	@Test
	public void capture() throws IOException, InterruptedException
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));



		WebElement txtuserName = driver.findElement(By.xpath("//input[@name='username']"));
		txtuserName.sendKeys("Admin");


		WebElement txtPassword =driver.findElement(By.xpath("//input[@name='password']"));
		txtPassword.sendKeys("admin123");



		WebElement btlogin =driver.findElement(By.xpath("//button[@type='submit']"));
		btlogin.click();
		Thread.sleep(4000);
		//Take full page screen shot
		 TakesScreenshot ts = (TakesScreenshot) driver;
		 File src = ts.getScreenshotAs(OutputType.FILE);
		 File trg = new File(".\\ScreenShots\\homepage1.png");
		 FileUtils.copyFile(src, trg);


	}

	@Test
	public void capture1() throws IOException, InterruptedException
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));



		WebElement txtuserName = driver.findElement(By.xpath("//input[@name='username']"));
		txtuserName.sendKeys("Admin123");


		WebElement txtPassword =driver.findElement(By.xpath("//input[@name='password']"));
		txtPassword.sendKeys("admin321");



		WebElement btlogin =driver.findElement(By.xpath("//button[@type='submit']"));
		btlogin.click();

		Thread.sleep(3000);
		//Take full page screen shot
		 TakesScreenshot ts = (TakesScreenshot) driver;
		 File src = ts.getScreenshotAs(OutputType.FILE);
		 File trg = new File(".\\ScreenShots\\homepage2.png");
		 FileUtils.copyFile(src, trg);
	}

	@Test
	public void capture2() throws IOException, InterruptedException
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));



		WebElement txtuserName = driver.findElement(By.xpath("//input[@name='username']"));
		txtuserName.sendKeys("");


		WebElement txtPassword =driver.findElement(By.xpath("//input[@name='password']"));
		txtPassword.sendKeys("");



		WebElement btlogin =driver.findElement(By.xpath("//button[@type='submit']"));
		btlogin.click();


		//Take full page screen shot
		 TakesScreenshot ts = (TakesScreenshot) driver;
		 File src = ts.getScreenshotAs(OutputType.FILE);
		 File trg = new File(".\\ScreenShots\\homepage3.png");
		 FileUtils.copyFile(src, trg);
	}






	/*TakesScreenshot ts = (TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	String timestamp = new SimpleDateFormat("ddMMyyyyhhmmss").format(new Date(100));
	String filename = "IMG"+timestamp+".png";
	File trg = new File(".\\ScreenShots\\"+filename);
//	FileUtils.copyFile(src, trg);*/

}
