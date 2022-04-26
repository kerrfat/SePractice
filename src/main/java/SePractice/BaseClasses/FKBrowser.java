package SePractice.BaseClasses;

import java.io.IOException;
import java.io.InvalidObjectException;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FKBrowser {
	protected WebDriver driver;
	protected String Url;
	// public String browserType;

	public FKBrowser(String url) {

		this.Url = url;
	}

	public FKBrowser() {

	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
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
	
	public void sendKey(By by,String Value) {
		WebElement elmt = this.driver.findElement(by);
		elmt.sendKeys(Value);
		
	}

	public void click(By by) {
		WebElement elmt = this.driver.findElement(by);
		elmt.click();
		
	}
}