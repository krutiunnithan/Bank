package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class managerCustomer {

	
public WebDriver driver;
	
	By custBtn = By.xpath("//button[@ng-click='showCust()']");
	By search = By.xpath("//input[@ng-model='searchCustomer']");
	By delete = By.xpath("//button[text()='Delete']");
	
	public managerCustomer(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement mgrCust() {
		
		return driver.findElement(custBtn);
		
	}
	
    public WebElement src() {
		
		return driver.findElement(search);
		
	}
    
    public WebElement del() {
		
		return driver.findElement(delete);
		
	}

	
}
