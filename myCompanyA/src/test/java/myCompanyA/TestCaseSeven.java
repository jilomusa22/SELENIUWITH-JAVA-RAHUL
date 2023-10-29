package myCompanyA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import frameWork.ActionsUtil;

public class TestCaseSeven {
	
	  @Test(description = "Handling Alerts and PopUps", enabled = true)
	  
	  
	  public void handleAlertsAndPopUps() throws Exception {

			WebDriver driver = ActionsUtil.getDriver();

			driver.get("https://the-internet.herokuapp.com/javascript_alerts");

			// actionsUtil.launchApplication("https://the-internet.herokuapp.com/javascript_alerts");
			// Applied a wait for 3 secs
			// xpath(very powerful locator).
			driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
			// Explicit Wait is Applied for a particular element or a condition(This is a
			// dynamic wait)
			// Apply a wait condition until the alert is present
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

			wait.until(ExpectedConditions.alertIsPresent());
			// //button[@onclick='jsAlert()'] we will find this element on the bases of
			
			Thread.sleep(5000);
			// Syntax to get text of the Alert
			System.out.println(driver.switchTo().alert().getText());

			driver.switchTo().alert().accept();

			// https://the-internet.herokuapp.com/javascript_alerts

			driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
			wait.until(ExpectedConditions.alertIsPresent());

			// //button[@onclick='jsAlert()'] we will find this element on the bases of

			Thread.sleep(5000);
			// Syntax to get text of the Alert
			System.out.println(driver.switchTo().alert().getText());
			// Dismissing Alert
			// Syntax to get text of the Alert
			driver.switchTo().alert().dismiss();
	
	
}
	
   
	
	


}
