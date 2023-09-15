/**************************************************************************************************************************************************
 Notes:
   The main method we wont use in Junit instead we use @Test Annotation
   add @Test annotation to the method and import the Junit package
   @Before class will be executed for every @Test executes
   @After Class will be executes once all the @Before CLas and @Test methods are executed finally @After Class will be executed


 **********************************************************************************************************************************************/

package Junit_Demo;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitDemo_2 {

	static WebDriver driver;

	@BeforeClass // This method will be executed Before at every Test method of the class
	public static void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@AfterClass // this method will run once After all Test methods are executed
	public static void browserClose() {
		driver.close();
	}

	@Test

	public void myTest1() throws InterruptedException {

		driver.get("https://demoqa.com/login");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Locators xpaths valid credentials

		WebElement txtUserName = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
		txtUserName.sendKeys("sriprasadkoushik");

		WebElement txtPassword = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		txtPassword.sendKeys("Dhruvanth@9");

		Thread.sleep(3000);
		WebElement btnLogin = driver.findElement(By.xpath("//*[@id=\"login\"]"));
		btnLogin.click();

	}

}
