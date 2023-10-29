package myCompanyA;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import frameWork.ActionsUtil;

public class TestCaseSix {
	
	WebDriver driver=null;
	
	@Test(description="Mouse Over Action",enabled = true)
	//https://the-internet.herokuapp.com/hovers
	
	public void mouseOverAction() throws Exception {
		
		driver = ActionsUtil.getDriver();
		driver.get("https://the-internet.herokuapp.com/hovers");
		// We are using Actions Class to perform mouse over actions on elements
		Actions a=new Actions(driver);
		
		List<WebElement>elements =driver.findElements(By.xpath("//img[@alt='User Avatar']"));
		
//		a.moveToElement(elements.get(1)).build().perform();
		
		for(int i=0; i<elements.size(); i++)		
		{
			a.moveToElement(elements.get(i)).build().perform();
				Thread.sleep(500);
				
				captureScreenshot("Image_"+i);
		}
		
		captureScreenshot("Complete_Browser");
		
	}
	public void captureScreenshot(String fileName) throws Exception { 	  
  	  // TakeScrenshot----------Is to capture ScreenShot
		
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//This screenShot will be stored in a temp folder
		
		File location=new File(System.getProperty("user.dir")+"//"+fileName+".png");
		
		Files.copy(scr, location);
    }	
	

}
