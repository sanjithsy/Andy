package com.flipkart.setdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MobilePurchase {
	
	@Given("user launches flipkart application")
	public void user_launches_flipkart_application() {
	
	}

	@And("user login with correct credentials")
	public void user_login_with_correct_credentials() {
	   WebElement closeicon = Hooks.driver.findElement(By.xpath("//button[text()='✕']"));
	   closeicon.click();
	}

	@When("user search mobile")
	public void user_search_mobile() {
	  WebElement search = Hooks.driver.findElement(By.name("q"));
	  search.sendKeys("realme mobiles under 16000",Keys.ENTER);
	}

	@Then("user changes price of mobile")
	public void user_changes_price_of_mobile() {
		 Hooks.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 WebElement drop = Hooks.driver.findElement(By.xpath("(//select[@class='_2YxCDZ'])[2]"));
		 Select s = new Select(drop);
		 s.selectByIndex(7);
	}

	@And("user changes operating system version as pie")
	public void user_changes_operating_system_version_as_pie() throws Throwable  {
		//Hooks.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(5000);
		  WebElement down = Hooks.driver.findElement(By.xpath("(//div[@class='_4rR01T'])[7]"));
	   JavascriptExecutor js = (JavascriptExecutor)Hooks.driver;
	   js.executeScript("arguments[0].scrollIntoView(true)",down);
	  WebElement ops = Hooks.driver.findElement(By.xpath("//div[text()='Operating System Version Name']"));
	  ops.click();
	   WebElement pie = Hooks.driver.findElement(By.xpath("//div[text()='Pie']"));
	   pie.click();
	   
	}

	@And("user clicks mobile")
	public void user_clicks_mobile() throws InterruptedException {
		//Hooks.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(5000);
	  WebElement mobile = Hooks.driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]"));
	  mobile.click();
	}

	@And("user close browser")
	public void user_close_browser() throws InterruptedException {
		Thread.sleep(5000);
	 Hooks.driver.quit();
	}
}
