import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_SwitchTONewWindow_2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("http://facebook.com");

		Thread.sleep(2000);

		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("http://gamil.com");
	//	driver.close();				// closes the current open browser only
		driver.quit();				// closes all browsers opend by

	}

}
