package com.pomtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Guru99Login {

	WebDriver driver ;
	
	By user99GuruName = By.name("uid");

    By password99Guru = By.name("password");

    By titleText =By.className("barone");

    By login = By.name("btnLogin");

     public Guru99Login(WebDriver driver){

        this.driver = driver;

    }
    public void setUserName(String strUserName){

        driver.findElement(user99GuruName).sendKeys(strUserName);
 

    }
    public void setPassword(String strPassword){

        driver.findElement(password99Guru).sendKeys(strPassword);

   }
    public void clicklogin() {
    	driver.findElement(login).click();
    	
    }
    public String getLoginTitle(){

          return  driver.findElement(titleText).getText();

       }
    public void loginToGuru99(String strUserName,String strPassword){

        //Fill user name

        this.setUserName(strUserName);

        //Fill password

        this.setPassword(strPassword);

        //Click Login button

        this.clicklogin();        
    }
}
