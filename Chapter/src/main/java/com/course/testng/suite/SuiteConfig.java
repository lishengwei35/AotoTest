package com.course.testng.suite;

import org.testng.annotations.*;

public class SuiteConfig {

    @BeforeSuite
    public void beforSuite(){
        System.out.println();
        System.out.println("before suite 运行啦,,,,,,,,,,,,,");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite 运行啦");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("BeforeTest");
    }

    @AfterTest
    public void  afterTest(){
        System.out.println("AfterTest");
    }
}
