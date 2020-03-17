package com.Firstpart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class TimeWait {
    //全局等待（隐式等待）打开测试界面，点击wait按钮 ，获取文本，并判断是否"wait for display"
    WebDriver driver = new ChromeDriver();
    @Test
    public void waitTest() {
        System.setProperty("webDriver.Chrome.driver", "E:\\selenium_demo\\drivers\\chromedriver.exe");

        driver.get("file:///F:/study/selenium_html/index.html");
        driver.findElement(By.xpath("//*[@id=\"wait\"]/input")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String element = driver.findElement(By.xpath("//*[@id=\"display\"]/div")).getText();
        Assert.assertEquals(element,"wait for display");
    }
    //显示等待
    @Test
    public void waitTestTwo()  {
        System.setProperty("webDriver.Chrome.driver", "E:\\selenium_demo\\drivers\\chromedriver.exe");
        driver.get("file:///F:/study/selenium_html/index.html");
        driver.findElement(By.xpath("//*[@id=\"wait\"]/input")).click();
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"display\"]/div")));
        String element = driver.findElement(By.xpath("//*[@id=\"display\"]/div")).getText();
        Assert.assertEquals(element,"wait for display");
        driver.quit();
    }
}
