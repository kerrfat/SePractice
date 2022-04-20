package SePractice.BaseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MyBrowser {
	public WebDriver driver;
    public String Url;
	// public String browserType;

	public MyBrowser(String url, String browserType) {
		browserType = browserType.toLowerCase();
		this.Url=url;
		switch (browserType) {
		case "chrome": {
			
			System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			//driver.get(url);
			driver.manage().window().maximize();
			break;
		}
		case "edge": {
			
			System.setProperty("webdriver.edge.driver", "./Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			//driver.get(url);
			driver.manage().window().maximize();
			break;
		}

		}

	}

	public void Open() {
		driver.get(this.Url);

	}
	
	public void Quit() {
		driver.quit();

	}

}
