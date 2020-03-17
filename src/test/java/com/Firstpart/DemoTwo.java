package com.Firstpart;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTwo {
    //isSelect用法，
    @Test
    public void openChrome() throws InterruptedException {
        System.setProperty("webDriver.Chrome.driver", "E:\\selenium_demo\\drivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("file:///F:/study/selenium_html/index.html");
        WebElement element = webDriver.findElement(By.xpath("//*[@id=\"radio\"]/input[1]"));
        element.click();
        boolean a =element.isSelected();
        Assert.assertTrue(a);
        Thread.sleep(3000);
        webDriver.quit();
    }
    //弹窗的处理，Alert,Confirm, Prompt
    //Alertc处理，点击确认
    @Test
    public void alertTest() throws InterruptedException {
        System.setProperty("webDriver.Chrome.driver", "E:\\selenium_demo\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///F:/study/selenium_html/index.html");
        WebElement a = driver.findElement(By.xpath("//*[@id=\"alert\"]/input"));
        a.click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(3000);
        alert.accept();
        Thread.sleep(3000);
        driver.quit();
    }
    //confirm警告框处理，点击取消，再点击确认
    @Test
    public void confirmTest() throws InterruptedException {
        System.setProperty("webDriver.Chrome.driver", "E:\\selenium_demo\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///F:/study/selenium_html/index.html");
        driver.findElement(By.xpath("//*[@id=\"confirm\"]/input")).click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
        Thread.sleep(3000);
        alert.accept();
        Thread.sleep(3000);
        driver.quit();
    }
    //prompt ,点击prompt,点击按钮，输入内容，点击确认，再次点击确认(chromeBUG，无法在alert输入值)
    @Test
    public void promptTest() throws InterruptedException {
        System.setProperty("webDriver.Chrome.driver", "E:\\selenium_demo\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///F:/study/selenium_html/index.html");
        driver.findElement(By.xpath("//*[@id=\"prompt\"]/input")).click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("this is a Test");
        Thread.sleep(3000);
        alert.accept();
        Thread.sleep(3000);
        alert.accept();
        Thread.sleep(2000);
        driver.quit();

    }

}
