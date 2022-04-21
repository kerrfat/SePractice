package SePractice.BaseClasses;

import org.openqa.selenium.chrome.ChromeDriver;

public class FKChrome extends FKBrowser {

	public FKChrome() {
		super();
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		setDriver(new ChromeDriver());
		
		driver.manage().window().maximize();
	}

	
	public FKChrome(String url) {
		super(url);
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		setDriver(new ChromeDriver());
		
		driver.manage().window().maximize();
	}
}
