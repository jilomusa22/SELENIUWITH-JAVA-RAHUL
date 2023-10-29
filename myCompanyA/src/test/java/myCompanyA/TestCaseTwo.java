package myCompanyA;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import frameWork.ActionsUtil;

public class TestCaseTwo {
	
	ActionsUtil actionsUtil = null;

	@Test(description = "Interaction with web elements")

	public void interactWithWebElements() throws Exception {
		// ActionsUtil.killChromeBrowsers();

		WebDriver driver = null;

		driver = ActionsUtil.getDriver();
		actionsUtil = new ActionsUtil(driver);
		actionsUtil.launchApplication("https://demo.guru99.com/test/newtours");
		Thread.sleep(5000);
		actionsUtil.enterText(driver.findElement(By.name("userName")), "Musaboo123");
		Thread.sleep(5000);
		actionsUtil.enterText(driver.findElement(By.name("password")), "Musaboo1234");
		Thread.sleep(5000);
		actionsUtil.clickElement(driver.findElement(By.name("submit")));
		
		actionsUtil.clickElement(driver.findElement(By.linkText("Flights")));
		Thread.sleep(5000);
		actionsUtil.clickElement(driver.findElement(By.xpath("//input[@value='oneway']")));
		Thread.sleep(5000);
		// selectValueFromDropDown
		// Select select0 = new
		// Select(driver.findElement(By.xpath("//select[@name='passCount']")));
		// select0.selectByVisibleText("3");
		actionsUtil.selectValueFromDropDown(driver.findElement(By.xpath("//select[@name='passCount']")),"4");
		//Select select1 = new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
		Thread.sleep(5000);
		//select1.selectByVisibleText("Paris");
		actionsUtil.selectValueFromDropDown(driver.findElement(By.xpath("//select[@name='fromPort']")),"Paris");
		Thread.sleep(5000);
		//Select select2 = new Select(driver.findElement(By.xpath("//select[@name='fromMonth']")));
		//select2.selectByVisibleText("May");
		
		actionsUtil.selectValueFromDropDown(driver.findElement(By.xpath("//select[@name='fromMonth']")),"May");
		Thread.sleep(5000);
	//	Select select4 = new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
	//	select4.selectByVisibleText("London");
		actionsUtil.selectValueFromDropDown(driver.findElement(By.xpath("//select[@name='toPort']")),"London");
		Thread.sleep(5000);
	//	Select select5 = new Select(driver.findElement(By.xpath("//select[@name='toDay']")));
	//	select5.selectByVisibleText("10");
		actionsUtil.selectValueFromDropDown(driver.findElement(By.xpath("//select[@name='toDay']")),"11");
		Thread.sleep(5000);
		actionsUtil.clickElement(driver.findElement(By.xpath("//input[@value='Business']")));

	//	Select select6 = new Select(driver.findElement(By.xpath("//select[@name='airline']")));
	//	select6.selectByVisibleText("Unified Airlines");
		Thread.sleep(5000);
		actionsUtil.selectValueFromDropDown(driver.findElement(By.xpath("//select[@name='airline']")),"Unified Airlines");
		// findFlights
		// Stale element reference exception=element is refreshing or removed from the
		// page, the tool dont know what to do.
		// Solution is to refresh the page ie, Copy and paste as below
		Thread.sleep(5000);
		actionsUtil.clickElement(driver.findElement(By.xpath("//input[@name='findFlights']")));

	}

}
