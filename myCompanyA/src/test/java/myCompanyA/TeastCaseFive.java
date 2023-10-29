package myCompanyA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import frameWork.ActionsUtil;

public class TeastCaseFive {

	WebDriver driver = null;

	@Test(description = "Handling Frames", enabled = true)

	public void handleFrames() {

		driver = ActionsUtil.getDriver();

		driver.get("https://the-internet.herokuapp.com/nested_frames");

		// Syntax to switch to frame//driver.switchTo().frame(framename);

		driver.switchTo().frame("frame-top");

		driver.switchTo().frame("frame-left");

		// Syntax for finding element based on the tag name
		// driver.findElement(By.tagName("Body"));
		// .getText() function ------------------is used to get text from application

		System.out.println(driver.findElement(By.tagName("Body")).getText());
		// Switching back to the parent frame/default, use
		// //driver.switchTo().defaultContent();

		driver.switchTo().defaultContent();

		driver.switchTo().frame("frame-top");

		driver.switchTo().frame("frame-right");

		System.out.println(driver.findElement(By.tagName("Body")).getText());

		driver.switchTo().defaultContent();

		driver.switchTo().frame("frame-top");

		driver.switchTo().frame("frame-middle");

		System.out.println(driver.findElement(By.tagName("div")).getText());

	}

}
