package XYZ;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import junit.framework.Assert;
import pageObjects.customerLogin;
import pageObjects.deposit;
import pageObjects.transaction;
import resources.base;

public class HomePage extends base {
	
	@BeforeTest
	public void initialize() throws IOException {
		
		driver = browserSelection();					
		
		
	}

	@Test 
	public void invokeBrowser() throws IOException, InterruptedException {
		
		driver.get(prop.getProperty("url"));
		
		Assert.assertTrue(driver.findElement(By.xpath("//strong[text()='XYZ Bank']")).getText(), true);
		
		customerLogin c = new customerLogin(driver);
		c.button().click();
		
		//select tag
		Select s = new Select(driver.findElement(By.id("userSelect")));
		s.selectByVisibleText("Harry Potter");
		
		c.login().click();
		
		
		deposit d = new deposit(driver);
		d.dep().click();
		d.amt().sendKeys(prop.getProperty("deposit"));
		d.rectBtn().click();
		
		Thread.sleep(4000);
		transaction t = new transaction(driver);
		t.trans().click();
		t.getScreenShot();
	}
	
	
/*	@AfterTest
	public void tearDown() {
		
		driver.close();
		driver = null;
	}*/
	
}	

		 

	      

	      
	        

	       

	  

	


