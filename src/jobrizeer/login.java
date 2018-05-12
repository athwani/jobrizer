package jobrizeer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login extends store_string{
  
 
        public void VUIP(WebDriver driver)  throws Exception{
         System.out.println("Senario start of valid user and Invalid password");
	             driver.findElement(By.xpath("//input[contains(@name,'loginemail')]")).sendKeys(vu1);
			        Thread.sleep(2000);
	             driver.findElement(By.xpath("//input[contains(@name,'loginpassword')]")).sendKeys(ip);			
			        Thread.sleep(2000);
	   	         driver.findElement(By.xpath("//button[@class='popup-btn'][contains(text(),'Login')]")).click();
			        Thread.sleep(1000); 
		 System.out.println("Secanrio end of valid user and Invalid passowrd");
        
        }

        public void IUIP(WebDriver driver)  throws Exception{
	     System.out.println("Senario start of Invalid user and Invalid password");
	     driver.findElement(By.xpath("//input[contains(@name,'loginemail')]")).clear();
	       Thread.sleep(1000);
		         driver.findElement(By.xpath("//input[contains(@name,'loginemail')]")).sendKeys(iu1);
				     Thread.sleep(2000);
				 driver.findElement(By.xpath("//input[contains(@name,'loginpassword')]")).clear();
			         Thread.sleep(1000);
	   	         driver.findElement(By.xpath("//input[contains(@name,'loginpassword')]")).sendKeys(ip1);			
				     Thread.sleep(2000);
		   	     driver.findElement(By.xpath("//button[@class='popup-btn'][contains(text(),'Login')]")).click();
				     Thread.sleep(1000); 
		 System.out.println("Senario end of Invalid user and Invalid passowrd");
	   
        }
        
        public void EUEP(WebDriver driver)  throws Exception{
	      System.out.println("Senario start of Empty user and Empty password");
		         driver.findElement(By.xpath("//input[contains(@name,'loginemail')]")).clear();
		            Thread.sleep(1000);  
		         driver.findElement(By.xpath("//input[contains(@name,'loginpassword')]")).clear();
		            Thread.sleep(1000);   
		         driver.findElement(By.xpath("//button[@class='popup-btn'][contains(text(),'Login')]")).click();
		            Thread.sleep(3000); 
		  System.out.println("Senario end of Empty user and Empty passowrd");
        
        }
	   
        public void VUEP(WebDriver driver)  throws Exception{
		  System.out.println("Senario start of valid user and Empty password");
			     driver.findElement(By.xpath("//input[contains(@name,'loginemail')]")).sendKeys("vu2");
			        Thread.sleep(2000);
			     driver.findElement(By.xpath("//button[@class='popup-btn'][contains(text(),'Login')]")).click();
			        Thread.sleep(3000);    
		         System.out.println("Senario end of valid user and Empty passowrd");
	     } 
		
        public void EUVP(WebDriver driver)  throws Exception{
	      System.out.println("Senario start of Empty user and valid password");
	             driver.findElement(By.xpath("//input[contains(@name,'loginemail')]")).clear();
			         Thread.sleep(1000);    
			     driver.findElement(By.xpath("//input[contains(@name,'loginpassword')]")).sendKeys("vp2");			
			         Thread.sleep(2000);
			     driver.findElement(By.xpath("//button[@class='popup-btn'][contains(text(),'Login')]")).click();
			         Thread.sleep(3000);
		  System.out.println("Senario end of Empty user and valid passowrd");
		
		}
		 
	    public void IUVP(WebDriver driver)  throws Exception{
		  System.out.println("Senario start of Invalid user and valid password");
			  	driver.findElement(By.xpath("//input[contains(@name,'loginemail')]")).sendKeys(iu);
			  		Thread.sleep(2000);
			    driver.findElement(By.xpath("//input[contains(@name,'loginpassword')]")).clear();
					Thread.sleep(1000);
			  	driver.findElement(By.xpath("//input[contains(@name,'loginpassword')]")).sendKeys(vp1);			
			  	    Thread.sleep(2000);
			  	driver.findElement(By.xpath("//button[@class='popup-btn'][contains(text(),'Login')]")).click();
			  		Thread.sleep(1000); 
		  System.out.println("Senario end of Invalid user and valid passowrd");
		
	    }  
			 
	    public void VUVP(WebDriver driver)  throws Exception{
		  System.out.println("Senario start of valid user and valid password");
		  driver.findElement(By.xpath("//input[contains(@name,'loginemail')]")).clear();
			Thread.sleep(2000);
				  driver.findElement(By.xpath("//input[contains(@name,'loginemail')]")).sendKeys(vu);
					Thread.sleep(2000);
				  driver.findElement(By.xpath("//input[contains(@name,'loginpassword')]")).clear();
					Thread.sleep(2000);
				  driver.findElement(By.xpath("//input[contains(@name,'loginpassword')]")).sendKeys(vp);			
					Thread.sleep(2000);
				  driver.findElement(By.xpath("//button[@class='popup-btn'][contains(text(),'Login')]")).click();
					Thread.sleep(1000);
		  System.out.println("Senario end of valid user and valid passowrd");

		
         
	    }
	    
}
	          
