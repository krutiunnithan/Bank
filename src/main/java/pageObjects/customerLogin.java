package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class customerLogin {
	
	public WebDriver driver;
	
	By customerButton = By.xpath("//button[text()='Customer Login']");
	By login = By.xpath("//button[@type='submit']");

	public customerLogin(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement button() {
		
		return driver.findElement(customerButton);
		
	}

	
	public WebElement login() {
		
		return driver.findElement(login);
		
	}
}
