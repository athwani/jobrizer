package jobrizeer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class candidatesearch extends store_string{
  
	public void candsearch(WebDriver driver) throws Exception {
		
		/* System.out.println("Senario start of valid user and valid password");
		  driver.findElement(By.xpath("//input[contains(@name,'loginemail')]")).sendKeys("athwani.sagar1@gmail.com");
			  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[contains(@name,'loginpassword')]")).sendKeys("sagarathwani");			
			  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[@class='popup-btn'][contains(text(),'Login')]")).click();
			  Thread.sleep(2000);
	     System.out.println("Senario end of valid user and valid passowrd"); */
	  
	     System.out.println("Page Refreshed");
		  driver.navigate().refresh();
		  
		 System.out.println("Candidate Search page opens");
		 driver.findElement(By.xpath("//li//a[@href='/beta/resume-search']")).click();
			Thread.sleep(1000);
			
			WebElement state_dropdown=driver.findElement(By.name("location"));
			Select location_dd=new Select(state_dropdown);
			location_dd.selectByIndex(2);
			Thread.sleep(2000);
			
			WebElement state_dropdown2=driver.findElement(By.name("salary_text"));
			Select location_dd2=new Select(state_dropdown2);
			location_dd2.selectByVisibleText("0k - 10k");
	        Thread.sleep(2000);
	        
	        
	        WebElement state_dropdown3=driver.findElement(By.name("experience_text"));
			Select location_dd3=new Select(state_dropdown3);
	        location_dd3.selectByValue("1");
			Thread.sleep(2000);
				
		    
			driver.findElement(By.linkText("Clear All")).click();
			System.out.println("Cleared All");
			Thread.sleep(3000);
			
			WebElement state_dropdown4=driver.findElement(By.name("location"));
			Select location_dd4=new Select(state_dropdown4);
			//will select Negeri Semibilian
			location_dd4.selectByValue("8");
			Thread.sleep(2000);
			//will select Pahang
			location_dd4.selectByVisibleText("Kedah");		
			System.out.println("Kedah State selected");
			Thread.sleep(2000);
		    
			
			WebElement state_dropdown5=driver.findElement(By.name("salary_text"));
			  Select location_dd5=new Select(state_dropdown5);
			    location_dd5.selectByValue("20k - 30k");
		 	       Thread.sleep(2000);
			    location_dd5.selectByVisibleText("50k - 60k");
			    System.out.println("Salary selected");   
			    Thread.sleep(2000);
	              
	        
	        WebElement state_dropdown6=driver.findElement(By.name("experience_text"));
			  Select location_dd6=new Select(state_dropdown6);
			    location_dd6.selectByVisibleText("9 Yr");
			    System.out.println("Year Experience Selected");   
			    Thread.sleep(2000);
			       
			       
			   //Select on Bookmark    
			 driver.findElement(By.xpath("//a[contains(@class,'bookmarked')]")).click();
			 System.out.println("Bookmark clicked");
			 Thread.sleep(2000);
			 
			 
			 //Click on ok button
			 driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			 System.out.println("Ok button selected");
			 Thread.sleep(2000);
			 
			 
			 //Click on View button
			 driver.findElement(By.xpath("//button[@class='btn-black']")).click();
			 Thread.sleep(2000);
			 for (int i=1; i<=5; i++) {
				    driver.findElement(By.xpath("//html//div[@class='page-content-main']//div[11]/div[1]/section[1]/label[4]")).click();
			     System.out.println("Clicked 5 times");      	
			 }
			 Thread.sleep(2000);
		       
			
			  //Click on Back button
			driver.findElement(By.xpath("//button[@class='btn btn-black btn_back']")).click();
			Thread.sleep(2000);
			
			    
			 //Click on Share button
			driver.findElement(By.xpath("//a[@class='btn btn-black btn-share']")).click();
			System.out.println("Share button clicked");
			Thread.sleep(1000);
			
			 //Old id canceled
            driver.findElement(By.xpath("//button[@class='btn tags close-icon']")).click();
            System.out.println("Selected id canceled");
            Thread.sleep(2000);
			
			//Type email id 
			driver.findElement(By.xpath("//input[@class='form-control fills input-lg completer-limit ng-untouched ng-pristine ng-valid']")).sendKeys(candisearch);
		        Thread.sleep(2000);
		           
	        
	        //Click on Share button 
            driver.findElement(By.xpath("//button[@class='btn pop_btn_black pull-left'][contains(text(),'Share Resume')]")).click();
            System.out.println("Email id shared");
            Thread.sleep(2000);
            
            //Click on cancel button
            driver.findElement(By.xpath("//button[@class='btn pop_btn_black pull-right']")).click();
            System.out.println("Cancel button clicked");
            Thread.sleep(2000);
           
           //Select Language
            driver.findElement(By.xpath("//html//div[@class='page-content-main']//div[6]/div[1]/label[4]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//html//div[@class='page-content-main']//div[6]/div[1]/label[4]")).click();
            Thread.sleep(2000);
                          
            driver.findElement(By.xpath("//html//div[@class='page-content-main']//div[6]/div[1]/label[3]")).click();
            Thread.sleep(2000);
	 }
}
