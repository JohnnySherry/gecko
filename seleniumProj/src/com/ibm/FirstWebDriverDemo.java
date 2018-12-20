package com.ibm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstWebDriverDemo {

    public static void main(String[] args) {

        WebDriver driver;
        String baseUrl;

        System.setProperty("webdriver.firefox.bin","C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        System.setProperty("webdriver.gecko.driver","D:\\IdeaProjects\\geckodriver.exe");

        baseUrl = "http://www.sogou.com";

        driver = new FirefoxDriver();
        driver.get(baseUrl+"/");
        driver.findElement(By.id("query")).sendKeys("我想要自由");
        driver.findElement(By.id("std")).click();

    }
}
