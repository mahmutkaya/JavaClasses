package com.techproed;

import org.junit.Ignore;
import org.junit.Test;

public class FirstJUnitClass {
    //Create our first method.
    //@Test is used to CREATE TEST CASES
    //with @Test, we no longer need a main method
    @Test
    public void test1(){
        System.out.println("This is my first test case");
    }
    //Skipping this test case using @Ignore annotation
    @Ignore
    @Test
    public void test2(){
        System.out.println("This is my second test case");
    }
    @Test
    public void test3(){
        System.out.println("This is my third test case");
    }

}
