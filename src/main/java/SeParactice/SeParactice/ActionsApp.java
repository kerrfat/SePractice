package SeParactice.SeParactice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import SePractice.BaseClasses.FKBrowser;
import SePractice.BaseClasses.FKChrome;

public class ActionsApp {

	public static void main(String[] args) throws InterruptedException {
		FKBrowser Chrome = new FKBrowser("chrome");
		
		
		Chrome.Open("https://amazon.com");
		
		
		Chrome.Quit();
		};

	}


