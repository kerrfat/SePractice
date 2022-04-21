package SePractice.BaseClasses;

import org.openqa.selenium.edge.EdgeDriver;

public class FKEdge extends FKBrowser {

	public FKEdge() {
		super();
		System.setProperty("webdriver.edge.driver", "./Drivers\\msedgedriver.exe");
		setDriver(new EdgeDriver());
		driver.manage().window().maximize();
	}

	public FKEdge(String url) {
		super(url);
		System.setProperty("webdriver.edge.driver", "./Drivers\\msedgedriver.exe");
		setDriver(new EdgeDriver());
		driver.manage().window().maximize();
	}

}
