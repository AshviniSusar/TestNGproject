package Demo2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {

	 @Test
	 public void method1() {
	  
	  System.out.println("i am method1 from class test2");
	 }
	 @Test
	 
	 public void method2() {
		  
		  System.out.println("i am method2 from class test2");
		 }
	 
	 @BeforeSuite
	 public void method3() {
		  
		  System.out.println("i am method3 from class test2");
		 }
	 
	 @AfterSuite
	 public void method4() {
		  
		  System.out.println("i am method4 from class test2");
		 }
		  
	 @BeforeTest
	 public void method5() {
		  
		  System.out.println("i am method5 from class test2");
		 }
		 
	 @AfterTest
	 public void method6() {
		  
		  System.out.println("i am method6 from class test2");
		 }
		
	 @AfterClass
	 public void method7() {
		  
		  System.out.println("i am method7 from class test2");
		 }
	
	 @BeforeClass
	 public void method8() {
		  
		  System.out.println("i am method8 from class test2");
		 }
		 
	 
	 
}
