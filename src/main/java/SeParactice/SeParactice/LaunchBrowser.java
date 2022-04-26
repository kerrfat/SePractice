package SeParactice.SeParactice;

import org.openqa.selenium.By;
import SePractice.BaseClasses.FKChrome;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		FKChrome Chrome = new FKChrome("https://www.amazon.com");
		Chrome.Open();
		Chrome.sendKey(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"), "Laptop");
		
		Chrome.click(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
		Thread.sleep(6000);
		Chrome.Quit();
	};
}
