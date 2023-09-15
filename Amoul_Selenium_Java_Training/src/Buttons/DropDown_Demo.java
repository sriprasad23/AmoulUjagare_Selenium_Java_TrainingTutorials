package Buttons;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Demo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Find the web element

		WebElement txt = driver.findElement(By.id("testingDropdown"));

		// 2. Create the object of select class

		Select seltxt = new Select(txt);

		// 3. select the option

		Thread.sleep(4000);
	//	seltxt.selectByIndex(3);
	//	seltxt.selectByVisibleText("Performance Testing");
		seltxt.selectByValue("Database");





	}

}
