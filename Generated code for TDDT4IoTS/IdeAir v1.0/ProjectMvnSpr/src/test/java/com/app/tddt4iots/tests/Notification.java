/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.tddt4iots.tests;

import java.util.Objects;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

class Notification {

    Notification instance = new Notification();

    Notification() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public boolean isAlert_Test0(int gasType_param) {
        System.out.println("isAlert");
        int gasType = 1;
        Boolean expResult = true;
        Boolean result = instance.isAlert_Test0(gasType);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (!Objects.equals(expResult, result)) {
            fail("The test case is a prototype.");
        } else {
            System.out.println("The test case is a good prototype!");
        }
        
        return result;
    }

    @Test
    public boolean isAlert_Test1(int gasType_param) {
        System.out.println("isAlert");
        int gasType = 2;
        Boolean expResult = false;
        Boolean result = instance.isAlert_Test1(gasType);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (!Objects.equals(expResult, result)) {
            fail("The test case is a prototype.");
        } else {
            System.out.println("The test case is a good prototype!");
        }
        return result;
    }
}
