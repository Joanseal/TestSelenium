package com.Firstpart;

import org.testng.annotations.*;

public class DemoFour {
    //用于测试@Test标签区别
    @Test
    public void isTest(){
        System.out.println("这是一个Test注解");
    }
    @BeforeMethod
    public  void isBeforeMethod(){
        System.out.println("这是一个BeforeMethod注解");
    }
    @AfterMethod
    public void  isAfterMethod(){
        System.out.println("this is a AfterMethod");
    }
    @Test
    public void isTest2(){
        System.out.println("这是Test2注解");
    }
    @BeforeTest
    public void isBeforeTest(){
        System.out.println("这是一个BeforeTest注解");
    }
    @BeforeClass
    public void isBeforeClass(){
        System.out.println("这是一个BeforeClass注解");
    }
}
