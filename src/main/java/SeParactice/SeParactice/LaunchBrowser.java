package SeParactice.SeParactice;

import org.openqa.selenium.By;

import SePractice.BaseClasses.FKBrowser;


public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		FKBrowser browser = new FKBrowser("https://www.amazon.com","firefox");
		browser.Open();
		browser.sendKey(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"), "Laptop");
		
		browser.click(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
		Thread.sleep(6000);
		browser.Quit();
	};
}
