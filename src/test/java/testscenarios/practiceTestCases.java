package testscenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import objects.BaseClass;
import objects.practice;

public class practiceTestCases extends BaseClass {
	WebDriver driver;

	@BeforeTest
	public void beforetest() {

		driver = init_driver();

		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

	@Test(priority = 1)
	public void webinputtest() throws InterruptedException {
		practice e;
		e = new practice(driver);
		e.webinput();
		
		Thread.sleep(2000);
	}

	// Thread.sleep(2000);

	@AfterTest
	public void aftertest() {
		driver.quit();

	}

}
