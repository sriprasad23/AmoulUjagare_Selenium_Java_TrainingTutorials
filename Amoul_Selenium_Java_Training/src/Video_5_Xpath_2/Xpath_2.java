package Video_5_Xpath_2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.click.in/pune/classifieds/60/post.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

}
