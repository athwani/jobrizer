package jobrizeer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class newsfeed {


	  public void newfeed(WebDriver driver) throws Exception {
		  
		  System.out.println("Senario start of valid user and valid password");
			  driver.findElement(By.xpath("//input[contains(@name,'loginemail')]")).sendKeys("athwani.sagar1@gmail.com");
				  Thread.sleep(2000);
			  driver.findElement(By.xpath("//input[contains(@name,'loginpassword')]")).sendKeys("sagarathwani");			
				  Thread.sleep(2000);
			  driver.findElement(By.xpath("//button[@class='popup-btn'][contains(text(),'Login')]")).click();
				  Thread.sleep(1000);
		  System.out.println("Senario end of valid user and valid passowrd");
  		
		// Open Newsfeed page
		  driver.findElement(By.xpath("//li//a[@href='/beta/newsfeed']")).click();
			Thread.sleep(1000);
		   	
    	WebElement state_dropdown=driver.findElement(By.name("category"));
			Select location_dd=new Select(state_dropdown);
			location_dd.selectByValue("it");
			Thread.sleep(2000);
			
			
			//will select Financial
			location_dd.selectByVisibleText("Financial");
			Thread.sleep(2000);

          driver.findElement(By.xpath("//span[contains(@class,'more read_more')]")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//span[contains(@class,'less read_more')]")).click();
	        Thread.sleep(4000);
	        driver.findElement(By.linkText("View"));
	        Thread.sleep(2000);
	        
	        WebElement state_dropdown1=driver.findElement(By.name("category"));
			Select location_dd1=new Select(state_dropdown1);
			location_dd1.selectByValue("it");
			Thread.sleep(2000);
    
			//will select Financial
			location_dd1.selectByVisibleText("Financial");
			Thread.sleep(2000);
			  driver.findElement(By.xpath("//span[contains(@class,'more read_more')]")).click();
		        Thread.sleep(4000);
		        driver.findElement(By.xpath("//span[contains(@class,'less read_more')]")).click();
		        Thread.sleep(4000);
		        driver.findElement(By.xpath("//button[@class='btn btn-black btn_back']")).click();
		        Thread.sleep(1000);
		        
    }
}
