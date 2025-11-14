package com.bootcamp.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LocatorDemo {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.createDriver(BrowserType.CHROME);

        driver.get("https://automationexercise.com/login");

        driver.findElement(By.name("email")).sendKeys("test@gmail.com");
        driver.findElement(By.name("password")).sendKeys("123456");

        driver.quit();
    }
}
