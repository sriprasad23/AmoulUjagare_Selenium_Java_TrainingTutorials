import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_Locator {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/#");

	//	List<WebElement> lst=driver.findElements(By.className("input"));

	//	System.out.println(lst.size());

	//	lst.get(18).sendKeys("sriprasad")

	}

}
