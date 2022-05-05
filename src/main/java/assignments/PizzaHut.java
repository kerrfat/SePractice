package assignments;

import org.openqa.selenium.By;
import SePractice.BaseClasses.FKBrowser;

public class PizzaHut {
	static FKBrowser browser = new FKBrowser("Https://pizzahut.com", "chrome"); //chrome or msedge

	public static void main(String[] args) throws InterruptedException {
		browser.Open();
		browser.click(By.className("MuiButton-label"));
		Thread.sleep(5000);

		browser.click(By.xpath("//*[@id='menu-list-grow']/li[1]/a/div[1]"));
		Thread.sleep(5000);
		browser.click(By.linkText("Popular Pizzas"));
		Thread.sleep(5000);
		browser.click(By.xpath("//*[@id='tile-cheese-pizza']/div/div[2]/div[3]/div[2]/div[1]/div/a[1]/span"));

		Thread.sleep(5000);
		browser.click(By.xpath("//*[@id='ph-localization-id']/div[1]/div[1]/div/div/label"));

		browser.sendKey(By.name("deliveryStreet"), "1582 S Parker Rd");
		browser.sendKey(By.name("deliveryApt"), "Suite 210");
		browser.sendKey(By.name("deliveryCity"), "Denver");
		browser.selectByValue(By.name("deliveryState"), "CO");
		browser.sendKey(By.name("deliveryZip"), "80247");

		browser.click(By.xpath("//*[@id='ph-find-store']"));

	}

}
