package com.bootcamp.day6;


import org.openqa.selenium.WebDriver;

public class HelloSelenium {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.createDriver(BrowserType.CHROME);
        driver.get("https://google.com");
        System.out.println("Title: " + driver.getTitle());
        driver.quit();
    }
}
