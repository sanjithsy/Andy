package com.flipkart.setdefinition;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Commonactions extends Hooks {
	
	public  void launchUrl(String url) {
		 WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.get(url);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void inserttext(WebElement elem,String value) {
		elem.sendKeys("value",Keys.ENTER);

	}
	public void textfromelement(WebElement elem) {
		String text = elem.getText();
		System.out.println(text);
	}
	public void button(WebElement elem) {
	      elem.click();
	}
	public void windowhandle() {
		  String parent = driver.getWindowHandle();
		   Set<String> child = driver.getWindowHandles();
		   for(String x: child) {
			   if(!parent.equals(x)) {
				   driver.switchTo().window(x);
			   }
		   }
}
