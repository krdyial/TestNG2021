package com.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestAnnotations {
    @BeforeMethod
    public void setUp() {
        System.out.println("This is Before Method");
    }



    @Test
    public void test1() {
        System.out.println("Test1");
    }

    @Ignore
    @Test
    public void test2() {
        System.out.println("Test2");
    }
    @Test
    public void test3() {
        System.out.println("Test3");
    }
    @Test
    public void test4() {
        System.out.println("Test4");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("This is After Method");
    }



}
