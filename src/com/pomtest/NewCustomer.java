package com.pomtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewCustomer {
	
	WebDriver driver;
	By customernamestr = By.name("name");
	By addressstr = By.name("addr");
	By citystr = By.name("city");
	By statestr = By.name("state");
	By pin = By.name("pinno");
	By mobilenumber = By.name("telephoneno");
	By emailid = By.name("emailid");
	By password = By.name("password");
	
	public NewCustomer(WebDriver driver) {
		
	this.driver= driver;
	
	}
 public void customer(String customervalue) {
	 
	 driver.findElement(customernamestr).sendKeys(customervalue);
 }
 
public void adaddress(String addressvalue) {
	 
	 driver.findElement(addressstr).sendKeys(addressvalue);
}

public void citystr(String cityvalue) {
	 
	 driver.findElement(citystr).sendKeys(cityvalue);
	 
	 
}

}
