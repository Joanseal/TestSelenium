package com.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class RegisterTest {
    @Test
    public void registerIE() throws InterruptedException {
        System.setProperty("webdriver.ie.driver", "E:\\selenium_demo\\drivers\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.get("https://mail.163.com/register/index.htm?from=163mail");
        Thread.sleep(5000);
        driver.findElement(By.id("username")).sendKeys("chenqiongxi");
        driver.findElement(By.id("password")).sendKeys("Womendeai1314");
        driver.findElement(By.id("phone")).sendKeys("13859697787");
        Thread.sleep(3000);
        driver.quit();
    }
}
