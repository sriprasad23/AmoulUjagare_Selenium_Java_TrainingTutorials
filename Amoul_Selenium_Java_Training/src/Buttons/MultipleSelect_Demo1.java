package Buttons;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect_Demo1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.click.in/pune/classifieds/60/post.html ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement joblocation = driver.findElement(By.id("source_118"));

		Select seljoblocation = new Select(joblocation);

		// To Select Multiple webelements

				Thread.sleep(2000);
				seljoblocation.selectByVisibleText("Bangalore");

				Thread.sleep(2000);
				seljoblocation.selectByVisibleText("Chennai");

				Thread.sleep(2000);
				seljoblocation.selectByVisibleText("Mumbai");

				driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[1]")).click();

		// To Deselect from location

				WebElement seljoblocationfld = driver.findElement(By.id("fld_118"));

				Select deseljoblocation = new Select(seljoblocationfld);

				Thread.sleep(2000);
				deseljoblocation.selectByVisibleText("Chennai");
				Thread.sleep(2000);
				deseljoblocation.selectByVisibleText("Mumbai");

				driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[2]")).click();
	}


}
