/*!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 Notes:
 1. in eclipse got help > marketplace > search testng > install testng.
 2. go to mvn repository > search testng > download testng jar file of latest stable version and ADD to lib folder in eclips > testng jar file select and rite click Add to Build path
 3.


 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*/


package TestNG_RealProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JobSites {

	WebDriver driver;

	@BeforeClass
	public void openBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@AfterClass
	public void browserClose() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}

	@Test
	public void naukri()
	{

		// Driver URL
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Locators xpaths valid credentials

	}

	@Test
	public void foundit() throws InterruptedException
	{

		// Driver URL
		driver.get("https://www.foundit.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Locators xpaths valid credentials

	}

	@Test
	public void shine() {


		// Driver URL
		driver.get("https://www.shine.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Locators xpaths valid credentials


	}

}
