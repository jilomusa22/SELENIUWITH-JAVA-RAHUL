package myCompanyA;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.PublicEncryptionKey;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;
import com.google.common.io.Files;

import frameWork.ActionsUtil;

public class TestCaseFour {
	WebDriver driver =null;
	
	
	@Test(description="DragAndDrop",enabled=true)
	
	public void dragAndDrop() throws InterruptedException {
		
		driver =ActionsUtil.getDriver();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		Thread.sleep(5000);
		Actions a=new Actions(driver);
		Thread.sleep(5000);
		a.dragAndDrop(driver.findElement(By.xpath("//div[@id='column-a']")), driver.findElement(By.xpath("//div[@id='column-b']")))
		.build().perform();
	}
	
		

}
