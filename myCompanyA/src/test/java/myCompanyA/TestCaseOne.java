package myCompanyA;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import frameWork.ActionsUtil;

public class TestCaseOne {
	ActionsUtil actions;

	// enabled = true means to execute test case
	// enabled =false means to not execute test case
	@Test(description = "Launch Application", enabled = true)
	public void testCaseOne() throws Exception {

//		ActionsUtil.killChromeBrowsers();

		WebDriver driver = null;

		driver = ActionsUtil.getDriver();

		actions = new ActionsUtil(ActionsUtil.getDriver());

		actions.launchApplication("https://demo.guru99.com/test/newtours/");

		String amazonHandle = actions.launchApplication("https://www.amazon.com");

		actions.switchToNewWindow();

		driver.switchTo().window(amazonHandle);
		driver.close();
		driver.quit();

	}

}
