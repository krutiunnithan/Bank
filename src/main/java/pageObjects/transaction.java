package pageObjects;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;

public class transaction {
	
public WebDriver driver;
	
	By tr = By.xpath("//button[@ng-click='transactions()']");
	

	public transaction(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement trans() {
		
		return driver.findElement(tr);
		
	}
	
    public void getScreenShot() throws IOException {
		
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Files.copy(src, new File("C://test//screenshot.png"));
		
		
	} 

}
