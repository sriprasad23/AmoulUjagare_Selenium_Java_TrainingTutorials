package Buttons;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxAndRadioButton {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		// Direct click method =  Working
		driver.findElement(By.xpath("//input[@value='Automation']")).click();
		driver.findElement(By.xpath("//input[@value='Performance']")).click();

		// travers from webelement click method = Not Working
/*
		WebElement automation  =  driver.findElement(By.xpath("//input[@value='Automation']"));
		WebElement performance = driver.findElement(By.xpath("//input[@value='Performance']"));


		if(automation.isSelected())
		{
			automation.click();
		}


		if(performance.isSelected())
		{
			performance.click();
		}
*/
	}

}
