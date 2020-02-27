package com.day1;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TestNGDemo1 {
    @Test
    public void testCase1(){
        System.out.println("这是@Test注解");
    }
    @Test
    public void assertEqualTest(){
        String a = "asdf";
        String b = "asdf1";

        Assert.assertEquals(a,b,"不相等");
    }
    @Test
    public void assertNotNullTest(){
        String a = null;
        Assert.assertNull(a);
    }
    @Test
    public void openchrome(){
        System.setProperty("webdriver.chrome.driver","E:\\selenium_demo\\drivers\\chromedriver.ext");
        WebDriver webDriver = new ChromeDriver();
    }
    @Test
    public void openIE() throws InterruptedException {
        System.setProperty("webdriver.ie.driver","E:\\selenium_demo\\drivers\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        Dimension dimension = new Dimension(500,500);
        driver.manage().window().setSize(dimension);
        driver.get("https://www.baidu.com");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        WebElement keys = driver.findElement(By.id("kw"));
        keys.sendKeys("1346546");
        Thread.sleep(5000);
        keys.clear();
        driver.quit();
    }
    @Test
    public void shotIE() throws InterruptedException {
        System.setProperty("webdriver.ie.driver", "E:\\selenium_demo\\drivers\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        Dimension dimension = new Dimension(500, 500);
        driver.manage().window().setSize(dimension);
        driver.get("https://www.baidu.com");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        WebElement keys = driver.findElement(By.id("kw"));
        keys.sendKeys("1346546");
        Thread.sleep(3000);
        //获取截图
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("D:\\test3.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Thread.sleep(3000);
        keys.clear();
        driver.quit();
    }

}
