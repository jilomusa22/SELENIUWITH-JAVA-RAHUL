package myCompanyA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import frameWork.ActionsUtil;

public class TestCaseThree {
	@Test(description = "Scroll Up and Down", enabled = true)

	public void scrollDownAction() throws InterruptedException {
		// https://the-internet.herokuapp.com/infinite_scroll
		WebDriver driver = ActionsUtil.getDriver();

		driver.get("https://the-internet.herokuapp.com/infinite_scroll");
		Thread.sleep(5000);
		// JavaScriptExecutor=Ton execute JS commands on the browser
		// Scrolling down the page by 400 pixels
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)", "");
		// document.body.scrollheight=Scroll to the height of the screen.
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollheight)", "");
		Thread.sleep(5000);
		// // Scrolling up the page by 0,-400 pixels.
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-400)", "");
	}
		
	}


