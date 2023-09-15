/*!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 Notes:
 1. in eclipse got help > marketplace > search testng > install testng.
 2. go to mvn repository > search testng > download testng jar file of latest stable version and ADD to lib folder in eclips > testng jar file select and rite click Add to Build path

 Reports:
 1. in Social sites Assertion added to make reports generation


 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*/

package TestNG_RealProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SocialSites
  {
	WebDriver driver;

	@BeforeClass
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterClass
	public void browserClose() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}

	@Test
	public void faceBook()
	{
		// Driver URL
			driver.get("https://facebook.com");

			Assert.assertEquals(driver.getTitle(), "FacebookInsta", "This is not Instagram");
		// Waits
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Locators xpaths valid credentials

	}

	@Test
	public void instagram() {

		// Driver URL
		driver.get("https://instagram.com");

		Assert.assertEquals(driver.getTitle(), "InstaFB", "This is not Instagram");
		// Waits
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Locators xpaths valid credentials

	}

	@Test
	public void twitter() {

		// Driver URL
		driver.get("https://twitter.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Locators xpaths valid credentials

	}

	@Test
	public void gmail() {

		// Driver URL
		driver.get("https://gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Locators xpaths valid credentials

	}


}
