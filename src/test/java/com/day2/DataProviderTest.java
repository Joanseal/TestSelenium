package com.day2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
    //数据驱动
    @DataProvider(name ="loginUser")
    public Object[][] data1(){
        return new Object[][]{{"user1","pwd1"},
                {"user2","pwd2}"}};
        }
    }


