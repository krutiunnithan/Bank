package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class base {
	
	public static WebDriver driver;
	public Properties prop;

	
	public WebDriver browserSelection() throws IOException {
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Kruti\\Bank\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		
		else if(browserName.equals("firefox")) {
			
			System.out.println("Code to initiate gecko driver");
			
		}
		
		else {
			
			System.out.println("Code to initiate IE driver");
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}


	
	

}
