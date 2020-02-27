package com.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DoLogin {

    @Test
    public void registerIE() throws InterruptedException {
            System.setProperty("webdriver.ie.driver", "E:\\selenium_demo\\drivers\\IEDriverServer.exe");
            WebDriver driver = new InternetExplorerDriver();
            driver.get("https://mail.163.com");
            Thread.sleep(3000);
            driver.findElement(By.id("switchAccountLogin")).click();
            driver.findElement(By.name("email")).sendKeys("fdchenqiongxi");
            driver.findElement(By.name("password")).sendKeys("womendeai1314");
            driver.findElement(By.id("dologin")).click();
            //显示等待
            /*WebDriverWait wait = new WebDriverWait(driver,10);
            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("auto-id")));
            //全局等待
            driver.manage().timeouts().imlipcitlyWait(10,Timeunit.SECONDS);
            */
            Thread.sleep(3000);
            driver.quit();
    }
}
