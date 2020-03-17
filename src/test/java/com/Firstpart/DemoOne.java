package com.Firstpart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DemoOne {
    //登录约约测网后台case
    WebDriver webDriver = new ChromeDriver();

    @Test
    public void openChrome() throws InterruptedException{
        System.setProperty("webDriver.Chrome.driver","E:\\selenium_demo\\drivers\\chromedriver.exe");
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        webDriver.get("http://apitest.yueyuechuxing.cn/ops/login");
        webDriver.manage().window().maximize();

        webDriver.findElement(By.name("username")).sendKeys("shenyd@yueyue");
        webDriver.findElement(By.name("password")).sendKeys("Xmqx2018");
        webDriver.findElement(By.name("msgCode")).sendKeys("1234");

        //点击登录按钮
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/form/div[4]/div/button/span")).click();

        //点击营销活动管理
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/ul/div[1]/li/div/span")).click();

        //点击乘客营销活动
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/ul/div[1]/li/ul/div[1]/li/div")).click();

        //点击礼包设置
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/ul/div[1]/li/ul/div[1]/li/ul/a[1]/li")).click();

        //点击指定商圈
        webDriver.findElement(By.xpath("//*[@id=\"tab-7\"]")).click();
        //点击添加优惠券
        webDriver.findElement(By.xpath("//*[@id=\"pane-7\"]/div[2]/div[1]/div/div/a/i")).click();

        //输入活动名称，
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/section/div/div/div[2]/div/div/form/span/div/div[1]/div/div[1]/input")).sendKeys("Demo_one");
        Thread.sleep(2000);
        // 发放城市，
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/section/div/div/div[2]/div/div/form/span/div/div[2]/div/div/div/input")).click();
        webDriver.findElement(By.cssSelector("body > div.el-select-dropdown.el-popper > div.el-scrollbar > div.el-select-dropdown__wrap.el-scrollbar__wrap > ul > li.el-select-dropdown__item.selected.hover > span")).click();
        Thread.sleep(8000);
        // 活动城市，
        /*webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/section/div/div/div[2]/div/div/form/span/div/div[3]/div/div/div/input")).sendKeys("2");
        Thread.sleep(3000);
        webDriver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div[2]/table/tbody/tr[5]/td[2]/div/span")).click();
        Thread.sleep(2000);
        webDriver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div[2]/table/tbody/tr[5]/td[3]/div/span")).click();
        Thread.sleep(2000);
        webDriver.findElement(By.xpath("/html/body/div[5]/div[2]/button[2]/span")).click();*/
        // 每人限领取，


        // 位置选择。
        // 业务类型，
        // 起终点选择，
        // 添加优惠券，
        // 点击提交

    }
    @AfterMethod
    public void quitChrome(){
        webDriver.quit();

    }
}
