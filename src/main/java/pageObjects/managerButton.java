package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class managerButton {

	
public WebDriver driver;
	
	By  manage= By.xpath("//button[@ng-click='manager()']");
	By Cust = By.xpath("//button[@ng-click='addCust()']");
	
	public managerButton(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement manageBtn() {
		
		return driver.findElement(manage);
		
	}
	
   public WebElement custBtn() {
		
		return driver.findElement(Cust);
		
	}
	
}
