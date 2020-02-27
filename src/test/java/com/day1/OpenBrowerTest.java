package com.day1;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class OpenBrowerTest {
    WebDriver driver;
    @BeforeMethod
    public void openIe(){
        System.setProperty("webdriver.ie.driver","E:\\selenium_demo\\drivers\\IEDriverServer.exe");
        driver = new InternetExplorerDriver();
    }
    @Test
    public void clickTest() throws InterruptedException{
        driver.get("//https:www.baidu.com");
        Thread.sleep(3000);
        WebElement keys = driver.findElement(By.id("kw"));
        Thread.sleep(3000);
        keys.click();
        keys.sendKeys("1346546");
        Thread.sleep(3000);
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try{
            FileUtils.copyFile(file,new File("D:\\test1.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);
        keys.clear();
        Thread.sleep(3000);


    }
    @AfterMethod
    public void closed(){
        driver.quit();
    }
}