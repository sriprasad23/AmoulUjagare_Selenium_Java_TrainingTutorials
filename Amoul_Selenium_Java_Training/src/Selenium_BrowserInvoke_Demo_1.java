import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_BrowserInvoke_Demo_1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

	//	WebDriver driver =new FirefoxDriver();

	//	WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");

		driver.navigate().to("http://gmail.com");

		driver.navigate().back();

		driver.navigate().forward();

		driver.navigate().refresh();

		driver.close();
	//	driver.quit();


	}

}
