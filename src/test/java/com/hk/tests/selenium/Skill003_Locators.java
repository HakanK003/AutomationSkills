package com.hk.tests.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skill003_Locators {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        // finding web element by name
        driver.findElement(By.name(""));

        // finding web element by id
        driver.findElement(By.id(""));

        // finding web element by tag name *very useless
        driver.findElement(By.tagName(""));

        // finding web element by
        driver.findElement(By.className(""));

        // finding web element by text that we actually see in website
        driver.findElement(By.linkText(""));

        // finding web element by taking only a part of the text that we actually see in website
        driver.findElement(By.partialLinkText(""));

        // finding web element by css selector *very usefull
        driver.findElement(By.cssSelector(""));

        // finding web element by absolute xpath
        driver.findElement(By.xpath(""));

        // finding web element by relative xpath *very usefull
        driver.findElement(By.xpath(""));

    }

}
