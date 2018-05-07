package jobrizeer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class entryclass  {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vivek\\Desktop\\selenium all data\\chromedriver.exe");
		 // Initialize browser
		WebDriver driver=new ChromeDriver();
		//Maximize browser
		       driver.manage().window().maximize();
		// Open Jobrizer
					driver.get("http://www.jobrizzer.iosbuild.net");
	    //Click on Employer Link	
			driver.findElement(By.linkText("Employer")).click();
			Thread.sleep(2000);	
				
			//Login Page 
			driver.findElement(By.linkText("Login")).click();
			Thread.sleep(1000);
	
	   	 login L1 = new login();
              L1.VUIP(driver);
	   	      L1.IUIP(driver);
	   	      L1.EUEP(driver);
	   	      L1.VUEP(driver);
	   	      L1.EUVP(driver);
	   	      L1.VUVP(driver);
       	      L1.IUVP(driver);
			 
			
			
			
	   //Open Register Page
			driver.findElement(By.linkText("Signup")).click();
			Thread.sleep(1000);
		
	   	    Register R1 = new Register();
	   	   

	   // Open bookmark page
	   	driver.findElement(By.partialLinkText("Bookmark")).click();
        Thread.sleep(2000); 
    
	   	bookmark B1 = new bookmark();	
	 
	
	   	store_string S1 = new store_string();
      }
}
