package SeParactice.SeParactice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LaunchBrowser {
	// static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		MyBrowser Chrome = new MyBrowser("https://amazon.com", "ChromE");
		WebDriver dr = Chrome.driver;
		// Chrome.setup("https://amazon.com", "ChromE");
		Chrome.Open();
		WebElement searchText = dr.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"));
		searchText.sendKeys("Computer");
		Thread.sleep(6000);

		WebElement searchIcon = dr.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
		searchIcon.click();

		Thread.sleep(36000);
		Chrome.Quit();
		MyBrowser Edge = new MyBrowser("https://amazon.com", "Edge");
		Edge.Open();
		searchText = Edge.driver
				.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"));
		searchText.sendKeys("laptop");
		Thread.sleep(6000);

		searchIcon = Edge.driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
		searchIcon.click();
		Thread.sleep(36000);
		Edge.Quit();

	};
}
