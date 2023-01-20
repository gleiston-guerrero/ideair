/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.tddt4iots.tests;


import com.app.tddt4iots.entities.Device;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*; 

	 class Home{
	Home instance = new Home();
	 Home(){
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
	public Device getDevice_Test0(int idDevice_param){
		System.out.println("getDevice");
		int idDevice = 1;
                Device Device_Test = new Device();
		Device expResult = Device_Test;
		Device result = instance.getDevice_Test0(idDevice);
		//assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		if(expResult!=(result))
			fail("The test case is a prototype.");
		else
			System.out.println("The test case is a good prototype!");
                
                return result;
}	


 	@Test 
	public Device getDevice_Test1(int idDevice_param){
		System.out.println("getDevice");
		int idDevice = 2;
                Device Device_Test_2 = new Device();
		Device expResult = Device_Test_2;
		Device result = instance.getDevice_Test1(idDevice);
		//assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		if(expResult!=(result))
			fail("The test case is a prototype.");
		else
			System.out.println("The test case is a good prototype!");
                
                return result;
}	


 	@Test 
	public Device getDevice_Test2(int idDevice_param){
		System.out.println("getDevice");
		int idDevice = 3;
                Device Device_Test_3 = new Device();
		Device expResult = Device_Test_3;
		Device result = instance.getDevice_Test2(idDevice);
		//assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		if(expResult!=(result))
			fail("The test case is a prototype.");
		else
			System.out.println("The test case is a good prototype!");
                
                return result;
}	}