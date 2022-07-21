package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoB {

	
	@Test
public void run()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		Reporter.log("the brower is opened now");
		driver.manage().window().maximize();
		Reporter.log("the brower is maximized");
		driver.get("https://www.google.com/");
		Reporter.log("the google website is opened");
		driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys("Bye");
		Reporter.log("the data \"Bye\" is entered");

	}

}
