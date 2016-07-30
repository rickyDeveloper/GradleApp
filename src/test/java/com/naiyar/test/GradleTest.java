package com.naiyar.test;

import junit.framework.*;
import org.junit.Before;


/**
 * Created by vikasnaiyar on 10/06/16.
 */
public class GradleTest extends TestCase{

    protected int value1, value2;

    // assigning the values
    @Before
    protected void setUp(){
        value1=3;
        value2=3;
    }

    // test method to add two values
    @org.junit.Test
    public void testAdd(){
        double result= value1 + value2;
        System.out.println("Value is --> " + result) ;
        assertTrue(result == 5);
    }
}
