package SeParactice.SeParactice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import SePractice.BaseClasses.MyBrowser;

public class ActionsApp {

	public static void main(String[] args) throws InterruptedException {
		MyBrowser Chrome = new MyBrowser("https://amazon.com", "ChromE");
		WebDriver dr = Chrome.driver;
		// Chrome.setup("https://amazon.com", "ChromE");
		Chrome.Open();
		
		 Actions act =new Actions(dr);
		 WebElement hover = dr.findElement(By.id("nav-link-accountList-nav-line-1"));
		 act.moveToElement(hover).build().perform();
		
		
		
		};

	}


