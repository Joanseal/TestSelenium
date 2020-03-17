package com.Firstpart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionTest {
    WebDriver driver = new ChromeDriver();
    @BeforeMethod
    public void setP(){
        System.setProperty("webDriver.Chrome.driver", "E:\\selenium_demo\\drivers\\chromedriver.exe");
    }
    @Test(description = "测试模拟右键")
    public void actionOne()throws InterruptedException{
        driver.get("https://www.baidu.com");
        Actions actions = new Actions(driver);
        actions.contextClick().perform();
        Thread.sleep(3000);
    }

    @AfterMethod
    public  void quitTest(){
        driver.quit();
    }
}
