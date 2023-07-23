package Demo1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AssertionsDemo {

	@Test
	public void invalidlogin() {
		
	     WebDriver driver = new ChromeDriver(); 
	     
	     driver.get("https://login.salesforce.com/"); 
	     
	     driver.findElement(By.xpath("//input[@type='email']")).sendKeys("testisdi");
	     
	     driver.findElement(By.xpath("//input[@id='password']")).sendKeys("test2");
	     
	     driver.findElement(By.xpath("//input[@name='login']")).click();
	     
	     WebElement a = driver.findElement(By.xpath("//div[@id='error']"));
	     
	     String actualText = a.getText();
	     
	     String ExpectedText="please check your username.if you still cant log in ,contact your SalesForce administrator.";
	     
	     SoftAssert sa = new SoftAssert();
	     
	     sa.assertEquals(actualText,ExpectedText,"Valid Error message is not showing");
	     
	     sa.assertAll();
	     
	}
	     
	     
	     @Test
	     
	     public void Validlogin () {
	    	 
	    	 WebDriver driver = new ChromeDriver();
	    	 
	    	 driver.get("https://login.salesforce.com/"); 
	    	   
	    	 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("testsdi");
	    	 
	    	 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("test2");
	    	 
	    	 driver.findElement(By.xpath("//input[@name='login']")).click();
	    	 
	    	 WebElement a = driver.findElement(By.xpath("//div[@id='CustomersService']"));

	         String actualText=a.getText();
	         
	         String ExpectedText="Customer Service";
	         
	         
	        SoftAssert sa = new SoftAssert();
	        
	        sa.assertEquals(ExpectedText,ExpectedText,"Valid Error message is not showing");
	        
	        sa.assertAll();
	        
	        
	        
	      }
	        
	     
	    	 
	    	 
	     
		
	
}
