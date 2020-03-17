package com.Firstpart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DemoThree {
    //测试Iframe框 ,使用switchTo().frame(Stiring||int)

    //方法二，用tarname定位
    @Test
    public void confirmTestTwo() throws InterruptedException {
        System.setProperty("webDriver.Chrome.driver", "E:\\selenium_demo\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///F:/study/selenium_html/index.html");
        driver.manage().window().maximize();
        WebElement iframe = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.linkText("baidu")).click();
        Thread.sleep(3000);
        driver.quit();
    }


    @Test
    public void confirmTest() throws InterruptedException {
        System.setProperty("webDriver.Chrome.driver", "E:\\selenium_demo\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///F:/study/selenium_html/index.html");
        driver.manage().window().maximize();
        driver.switchTo().frame("aa");
        driver.findElement(By.linkText("baidu")).click();
        Thread.sleep(3000);
        //控制权转交,点击登录界面
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//*[@id=\"link\"]/a")).click();
        Thread.sleep(3000);
        driver.quit();


    }
}
