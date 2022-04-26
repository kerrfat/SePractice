package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import SePractice.BaseClasses.FKChrome;
import SePractice.BaseClasses.FKEdge;

public class HomeDepotReg {
	static FKEdge browser = new FKEdge("Https://homedepot.com");

	public static void main(String[] args) throws InterruptedException {
		browser.Open(); // WebDriver setup
		browser.click(By.linkText("My Account")); // click on My account link

		Thread.sleep(6000);
		browser.click(By.xpath("//span[contains(text(),'Register')]")); // go to register oage

		// select personal account
		browser.click(By.xpath(
				"//body/div[@id='single-signin']/div[@id='outer']/div[@id='single-signin__body']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/button[1]/span[1]"));

		// Register form informaton
		Thread.sleep(6000);
		browser.sendKey(By.xpath("//input[@id='email']"), "demotest@testse.com");
		browser.sendKey(By.xpath("//input[@id='password-input-field']"), "demoTest@2020");
		browser.sendKey(By.xpath("//input[@id='zipCode']"), "80014");
		browser.sendKey(By.xpath("//input[@id='phone']"), "72012345698");

		browser.click(By.xpath(
				"//body/div[@id='single-signin']/div[@id='outer']/div[@id='single-signin__body']/div[1]/div[2]/form[1]/div[5]/div[1]/div[1]/label[1]"));

		browser.getDriver().switchTo().frame(browser.getDriver().findElement(
				By.xpath("//*[@id=\"single-signin__body\"]/div/div[2]/form/div[7]/div/div/div/div/iframe")));

		browser.getDriver().findElement(By.id("recaptcha-anchor-label")).click();

		browser.click(By.id("registrationCreateAnAccountButton"));

	}

}
