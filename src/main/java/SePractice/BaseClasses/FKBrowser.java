package SePractice.BaseClasses;

import java.io.IOException;
import java.io.InvalidObjectException;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class FKBrowser {
	protected WebDriver driver;
	protected String Url;
	// public String browserType;

	public FKBrowser(String url, String webdriverType) {

		this.Url = url;
		setDriver(webdriverType);
	}

	public FKBrowser(String webdriverType) {
		setDriver(webdriverType);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(String webdriverType) {
		
		if (webdriverType.equalsIgnoreCase("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
			this.driver = new ChromeDriver();
		}
		else if (webdriverType.equalsIgnoreCase("msedge"))
		{
			System.setProperty("webdriver.edge.driver", "./Drivers\\msedgedriver.exe");

			this.driver = new EdgeDriver();
		}
		this.driver.manage().window().maximize();
		
	}

	public String getUrl() {
		return Url;
	}

	public void setUrl(String url) {
		Url = url;
	}

	public void Open() {
		driver.get(this.Url);

	}

	public void Open(String url) {

		driver.get(url);

	}

	public void Quit() {
		driver.quit();

	}

	public void sendKey(By by, String Value) {
		WebElement elmt = this.driver.findElement(by);
		elmt.sendKeys(Value);

	}

	public void click(By by) {
		WebElement elmt = this.driver.findElement(by);
		elmt.click();

	}
	public void selectByValue(By by,String value)
	{
		WebElement selectElement = this.driver.findElement(by);
		Select selectObject = new Select(selectElement);
		selectObject.selectByVisibleText(value);
	}

	public String GetBrowserName() {

		Capabilities cap = ((RemoteWebDriver) this.driver).getCapabilities();
		String browserName = cap.getBrowserName().toLowerCase();
		return browserName;
	}
}