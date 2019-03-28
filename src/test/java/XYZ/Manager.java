package XYZ;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.managerButton;
import pageObjects.managerCustomer;
import resources.base;

public class Manager extends base {

	@BeforeTest
	public void initialize() throws IOException {
		
		driver = browserSelection();					
		
		
	}

	@Test (dataProvider = "getData")
	public void invokeBrowser(String first, String last, int pin) throws IOException, InterruptedException {
		
		driver.get(prop.getProperty("url"));
		managerButton m = new managerButton(driver);
		m.manageBtn().click();
		
		m.custBtn().click();
		
		driver.findElement(By.xpath("//input[@ng-model='fName']")).sendKeys(first);
		driver.findElement(By.xpath("//input[@ng-model='lName']")).sendKeys(last);
		
		driver.findElement(By.xpath("//input[@ng-model='postCd']")).sendKeys(String.valueOf(pin));
		
		driver.findElement(By.xpath("//button[text()='Add Customer']")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		
		managerCustomer mgr = new managerCustomer(driver);
		mgr.mgrCust().click();
		mgr.src().sendKeys(first);
		mgr.del().click();
		
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.close();
		driver = null;
	}
	
	
	@DataProvider
	public Object[][] getData() throws IOException {
		
		ReadExcelFile config = new ReadExcelFile("E:\\Selenium\\Data.xlsx");
		int rows = config.rowCount(0);
		
		Object[][] credentials = new Object[rows][3];
		
		for (int i = 0; i < rows; i++ ) {
			
			credentials[i][0] = config.data(0, i, 0);
			credentials[i][1] = config.data(0, i, 1);
			credentials[i][2] = config.num(0, i, 2);
			
		}
		
		return credentials;
	}
	
}	
	

