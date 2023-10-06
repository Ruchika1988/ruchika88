package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	WebDriver driver;

	public WebDriver init_driver() {


		String browser = "chrome" ;
	

		// driver.get("https://demoqa.com/elements");

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "C:/Users/Ruchika/Documents/Drivers/chromedriver.exe");
			
		} 
		else if (browser.equals("firefox")) {
			WebDriverManager.chromedriver().setup();

			driver = new FirefoxDriver();
			System.setProperty("webdriver.FireFox.driver", "C:\\Users\\Ruchika\\Documents\\Drivers\\Firefox Installer");
		} 
		else if (browser.equals("EdgeDriver")) {
			driver = new EdgeDriver();
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Ruchika\\Documents\\Drivers\\edgedriver_win64");
		} 
		else {
			System.out.println("Please provide a proper browser value..");
		}

		driver.manage().window().maximize();
		return driver;


	}

}
