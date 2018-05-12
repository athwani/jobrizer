package jobrizeer;

import java.util.logging.LogManager;
import java.util.logging.Logger;

//import org.apache.log4j.BasicConfigurator;
//import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class entryclass  {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		//BasicConfigurator.configure();
		//Logger logger = LogManager.getLogger(entryclass.class);

		//PropertyConfigurator.configure("log4j.properties");
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
	  	   
//	              L1.VUIP(driver);
//	  	   	      L1.IUIP(driver);
//	  	   	      L1.EUEP(driver);
//	  	   	      L1.VUEP(driver);
//	  	   	      L1.EUVP(driver);
	  	   	      L1.VUVP(driver);
	         	 // L1.IUVP(driver);
	         
	  	   	
	  	   jobsearch J1 = new jobsearch();
	  	   candidatesearch C1 = new candidatesearch();
	  	   purchase P2 = new purchase();
	  	   newsfeed N1 = new newsfeed();
	  	   Logout L2 =new Logout();  	
	  	 
	            //Job Search
		         J1.jbsearch(driver);
		      //Candidate Search
		         C1.candsearch(driver);
		    //Purchase      
	   	   	     P2.purchas1(driver);
	   	  //Newsfeed    
	             N1.newfeed(driver);
		         L2.Logout1(driver);
	            
			
		   	
			 
			
			
			
	   //Open Register Page
			
		 Register R1 = new Register();
	   	   R1.ER(driver);
	   	   R1.VE(driver);
	   	   R1.IVE(driver);
	   	   R1.BE(driver);
	   	   R1.VCN(driver);
	   	   R1.BCN(driver);
	   	   R1.ICN(driver);
	   	   R1.VP(driver);
	   	   R1.BP(driver);
	   	   R1.IP(driver);
	   	   R1.VCP(driver);
	   	   R1.BCP(driver);
	   	   R1.ICP(driver);
	   	   R1.VR(driver);

	 //Value stored in one class
	   	store_string S1 = new store_string();

    
	}
}
