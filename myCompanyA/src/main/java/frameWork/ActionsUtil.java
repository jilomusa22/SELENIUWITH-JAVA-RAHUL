package frameWork;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

// This is for Selenium Related Functions
public class ActionsUtil {

	WebDriver driver;

	public ActionsUtil(WebDriver driver) {

		this.driver = driver;

	}

//	public static void killChromeBrowsers() {
//
//		try {
//
//			Runtime.getRuntime().exec("TASKKILL -f -im chrome.exe");
//			Runtime.getRuntime().exec("TASKKILL -f -im chromedriver.exe");
//		} catch (Exception e) {
//
//			e.printStackTrace();
//		}
//	}

	public static WebDriver getDriver()

	{
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20));
		//Implicit wait-Applied Cross the driver object
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		return driver;
	}
	public String launchApplication(String url) throws Exception {
		if (!url.contains("https"))

			throw new Exception("This url :" + url + " does not contain https protocol");
		driver.get(url);

		return driver.getWindowHandle();
	}

	public String launchApplicatuionInNewTab(String url) throws Exception {

		driver.switchTo().newWindow(WindowType.TAB);
		String handle = launchApplication(url);

		return handle;
	}

	public String launchApplicatuionInNewWindow(String url) throws Exception {

		driver.switchTo().newWindow(WindowType.WINDOW);
		launchApplication(url);

		String handle = launchApplication(url);

		return handle;

	}

	public void switchToNewWindow() throws InterruptedException {

		Set<String> handles = driver.getWindowHandles();

		for (String s1 : handles) {

			Thread.sleep(5000);

			driver.switchTo().window(s1);

			System.out.println(driver.getTitle());

		}
	}

	public void enterText(WebElement element, String data) {

		element.sendKeys(data);

	}

	public void clickElement(WebElement element) {

		element.click();

	}
	
	public void selectValueFromDropDown(WebElement element, String value) {
		
		Select select = new Select(element);
		
		try {
			
			select.selectByVisibleText(value);
		}catch (Exception e) {
			// TODO: handle exception
			select.selectByValue(value);
		}
	}

}
