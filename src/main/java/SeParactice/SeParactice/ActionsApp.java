package SeParactice.SeParactice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import SePractice.BaseClasses.FKBrowser;
import SePractice.BaseClasses.FKChrome;

public class ActionsApp {

	public static void main(String[] args) throws InterruptedException {
		FKChrome Chrome = new FKChrome();
		WebDriver dr = Chrome.getDriver();
		
		Chrome.Open("https://amazon.com");
		
		 Actions act =new Actions(dr);
		 WebElement hover = dr.findElement(By.id("nav-link-accountList-nav-line-1"));
		 act.moveToElement(hover).build().perform();
		Thread.sleep(6000);
		
		Chrome.Quit();
		};

	}


