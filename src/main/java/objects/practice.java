package objects;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.sun.org.apache.bcel.internal.classfile.Code;

public class practice

{
	public WebDriver driver;

	@FindBy(xpath = "(//input[@id='input-number'])[1]")
	WebElement InputNumber;
	@FindBy(xpath = "(//input[@id='input-text'])[1]")
	WebElement InputText;
	@FindBy(xpath = "(//input[@id='input-password'])[1]")
	WebElement InputPassword;
	@FindBy(xpath = "(//input[@id='input-date'])[1]")
	WebElement InputDate;
	@FindBy(xpath = "(//strong[@id='output-number'])")
	WebElement OutputNumber;
	@FindBy(xpath = "(//strong[@id='output-text'])")
	WebElement OutputText;
	@FindBy(xpath = "(//strong[@id='output-password'])")
	WebElement OutputPassword;
	@FindBy(xpath = "(//strong[@id='output-date'])")
	WebElement OutputDate;
	@FindBy(xpath = "(//button[@id='btn-display-inputs'])")
	WebElement DisplayButton;

	public practice(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void webinput() throws InterruptedException

	{
		driver.get("https://practice.expandtesting.com/inputs");

		InputNumber.sendKeys("5");
		InputText.sendKeys("one");
		InputPassword.sendKeys("one@");
		InputDate.sendKeys("12/02/1981");
		DisplayButton.click();
		Thread.sleep(4000);

		String expNumber = "5";
		String expText = "one";
		String expPassword = "one@";
		String expDate = "1981-12-02";

		ArrayList<String> expected = new ArrayList<String>();
		expected.add(expNumber);
		expected.add(expText);
		expected.add(expPassword);
		expected.add(expDate);

		String actNumber = OutputNumber.getText();
		String actText = OutputText.getText();
		String actPassword = OutputPassword.getText();
		String actDate = OutputDate.getText();

		ArrayList<String> actual = new ArrayList<String>();
		actual.add(actNumber);
		actual.add(actText);
		actual.add(actPassword);
		actual.add(actDate);
		
		Thread.sleep(4000);
		Assert.assertEquals(expected, actual);

	}
}
