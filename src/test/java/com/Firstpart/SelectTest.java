package com.Firstpart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectTest {
    //下拉框选取的三种方式select

    @Test
    public void selectTest() throws InterruptedException {
        System.setProperty("webDriver.Chrome.driver", "E:\\selenium_demo\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///F:/study/selenium_html/index.html");
        WebElement element = driver.findElement(By.id("moreSelect"));
        Select select = new Select(element);
        select.selectByIndex(1);
        Thread.sleep(3000);
        select.selectByValue("vivo");
        Thread.sleep(3000);
        select.selectByIndex(3);
        Thread.sleep(3000);
        select.selectByVisibleText("huawei");
        Thread.sleep(3000);
        driver.quit();
    }
}
