package jobrizeer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class purchase {
	
	public void purchas1(WebDriver driver) throws Exception{
		  
		/*  System.out.println("Scenario start of valid user and valid password");
			  driver.findElement(By.xpath("//input[contains(@name,'loginemail')]")).sendKeys("athwani.sagar1@gmail.com");
				  Thread.sleep(2000);
			  driver.findElement(By.xpath("//input[contains(@name,'loginpassword')]")).sendKeys("sagarathwani");			
				  Thread.sleep(2000);
			  driver.findElement(By.xpath("//button[@class='popup-btn'][contains(text(),'Login')]")).click();
				  Thread.sleep(2000);
		  System.out.println("Senario end of valid user and valid passowrd");    */
		  
		  driver.navigate().refresh();
		  System.out.println("Page Refreshed");

		 
		  driver.findElement(By.xpath("//li//a[@href='/beta/employer-purchase-plan']")).click();
			Thread.sleep(1000);
			 System.out.println("Purchase page opens");
			
		 
		     driver.findElement(By.xpath("//html//div[@class='col-md-7 mid_content']/div[1]/div[2]/a[1]")).click();
	             Thread.sleep(2000);
	             System.out.println("Clicked on Full Detail");
	             
	     
	         driver.findElement(By.xpath("//a[@class='btn btn-black'][contains(text(),'Back To Plan')]")).click();
	              Thread.sleep(3000);
	              System.out.println("Back to Purchase page");
	              
	         driver.findElement(By.xpath("//a[contains(@class,'btn-purchase pull-right')]")).click();
	         Thread.sleep(2000);
	         driver.switchTo().alert().accept();
	         System.out.println("Welcome to Plan page");
	         
	}
}