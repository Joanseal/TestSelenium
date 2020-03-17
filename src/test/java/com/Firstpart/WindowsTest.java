package com.Firstpart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowsTest {
    //多窗口操作元素，使用getWindowsHandle
    @Test
    public void selectTest() throws InterruptedException {
        System.setProperty("webDriver.Chrome.driver", "E:\\selenium_demo\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///F:/study/selenium_html/index.html");
        driver.findElement(By.linkText("Open new window")).click();
        Thread.sleep(3000);
        String handleOne = driver.getWindowHandle();
        for(String handles:driver.getWindowHandles()){
            if (handles.equals(handleOne))
                continue;
            driver.switchTo(

            ).window(handles);

        }
        driver.findElement(By.linkText("Open new window")).click();
        Thread.sleep(3000);
        driver.quit();

    }
}
