package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class deposit {

public WebDriver driver;
	
	By depo = By.xpath("//button[@ng-click='deposit()']");
	By amount = By.xpath("//input[@type='number']");
    By btn = By.xpath("//button[@type='submit']");
	
	public deposit(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement dep() {
		
		return driver.findElement(depo);
		
	}
	
   public WebElement amt() {
		
		return driver.findElement(amount);
		
	}
   
   public WebElement rectBtn() {
		
		return driver.findElement(btn);
		
	}
	
}
