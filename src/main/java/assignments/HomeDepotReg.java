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
	static FKEdge chrome = new FKEdge("Https://homedepot.com");

	public static void main(String[] args) throws InterruptedException {
		chrome.Open(); // WebDriver setup
		chrome.click(By.linkText("My Account")); // click on My account link

		Thread.sleep(6000);
		chrome.click(By.xpath("//span[contains(text(),'Register')]")); // go to register oage

		// select personal account
		chrome.click(By.xpath(
				"//body/div[@id='single-signin']/div[@id='outer']/div[@id='single-signin__body']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/button[1]/span[1]"));

		// Register form informaton
		Thread.sleep(6000);
		chrome.sendKey(By.xpath("//input[@id='email']"), "demotest@testse.com");
		chrome.sendKey(By.xpath("//input[@id='password-input-field']"), "demoTest@2020");
		chrome.sendKey(By.xpath("//input[@id='zipCode']"), "80014");
		chrome.sendKey(By.xpath("//input[@id='phone']"), "72012345698");

		chrome.click(By.xpath(
				"//body/div[@id='single-signin']/div[@id='outer']/div[@id='single-signin__body']/div[1]/div[2]/form[1]/div[5]/div[1]/div[1]/label[1]"));

		chrome.getDriver().switchTo().frame(chrome.getDriver().findElement(
				By.xpath("//*[@id=\"single-signin__body\"]/div/div[2]/form/div[7]/div/div/div/div/iframe")));

		chrome.getDriver().findElement(By.id("recaptcha-anchor-label")).click();

		chrome.click(By.id("registrationCreateAnAccountButton"));

	}

}
