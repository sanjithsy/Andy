package com.flipkart.setdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageobjectmodel extends Commonactions {
	
 public pageobjectmodel() {
	 PageFactory.initElements(driver,this);
 }
	 @FindBy (xpath="//button[text()='✕']")
	 private  WebElement closeicon;
	 
	 @FindBy(xpath="(//select[@class='_2YxCDZ'])[2]")
	 private WebElement dropdown;
	 
	 
 }

