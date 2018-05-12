package jobrizeer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    
public class Register {
	 
	 
	 public void ER(WebDriver driver) throws Exception{
		//Enter all empty data
			driver.findElement(By.xpath("//input[contains(@class,'completer-input form-control ng-untouched ng-pristine ng-valid')]")).sendKeys("company1");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("email1");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[contains(@name,'contact_number')]")).sendKeys("contact1");
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("password1");
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[contains(@name,'confPassword')]")).sendKeys("confpassword1");
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//button[@class='popup-btn'][contains(text(),'Register')]")).click();
		    Thread.sleep(3000);
			System.out.println("All data are Empty");
			}

	 public void VE(WebDriver driver) throws Exception {
		 //Enter Valid email
			driver.findElement(By.xpath("//input[contains(@class,'completer-input form-control ng-untouched ng-pristine ng-valid')]")).sendKeys("company2");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("email2");
			Thread.sleep(2000);
			System.out.println("Entered Valid Email");
            driver.findElement(By.xpath("//input[contains(@name,'contact_number')]")).sendKeys("contact2");
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("password2");
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[contains(@name,'confPassword')]")).sendKeys("confpassword2");
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//button[@class='popup-btn'][contains(text(),'Register')]")).click();
		    Thread.sleep(3000);
			System.out.println();
		 }
	 
	 public void IVE(WebDriver driver) throws Exception {
		 //Enter Invalid email
			driver.findElement(By.xpath("//input[contains(@class,'completer-input form-control ng-untouched ng-pristine ng-valid')]")).sendKeys("company3");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("email3");
			Thread.sleep(2000);
			System.out.println("Entered Invalid Email");
			driver.findElement(By.xpath("//input[contains(@name,'contact_number')]")).sendKeys("contact3");
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("password3");
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[contains(@name,'confPassword')]")).sendKeys("confpassword3");
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//button[@class='popup-btn'][contains(text(),'Register')]")).click();
		    Thread.sleep(3000);
			System.out.println();
		 }
	 
	 public void BE(WebDriver driver) throws Exception {
		 //Enter Blank email
			driver.findElement(By.xpath("//input[contains(@class,'completer-input form-control ng-untouched ng-pristine ng-valid')]")).sendKeys("company4");
			     Thread.sleep(2000);
			driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("email4");
			     Thread.sleep(2000);
			System.out.println("Entered Blank Email");
			driver.findElement(By.xpath("//input[contains(@name,'contact_number')]")).sendKeys("contact4");
		         Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("password4");
		         Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[contains(@name,'confPassword')]")).sendKeys("confpassword4");
		         Thread.sleep(2000);
		    driver.findElement(By.xpath("//button[@class='popup-btn'][contains(text(),'Register')]")).click();
		         Thread.sleep(3000);
			System.out.println();
		 }
	 
	 public void VCN(WebDriver driver) throws Exception {
		 //Enter Valid Contact Number 
			driver.findElement(By.xpath("//input[contains(@class,'completer-input form-control ng-untouched ng-pristine ng-valid')]")).sendKeys("company6");
			     Thread.sleep(2000);
			driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("email6");
			     Thread.sleep(2000);
			driver.findElement(By.xpath("//input[contains(@name,'contact_number')]")).sendKeys("contact6");
		         Thread.sleep(2000);
		    System.out.println("Entered Valid Contact Number");
		    driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("password6");
		         Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[contains(@name,'confPassword')]")).sendKeys("confpassword6");
		         Thread.sleep(2000);
		    driver.findElement(By.xpath("//button[@class='popup-btn'][contains(text(),'Register')]")).click();
		         Thread.sleep(3000);
			System.out.println();
		}
	 
	 public void BCN(WebDriver driver) throws Exception {
		 //Enter Blank Contact Number 
			driver.findElement(By.xpath("//input[contains(@class,'completer-input form-control ng-untouched ng-pristine ng-valid')]")).sendKeys("company7");
			     Thread.sleep(2000);
			driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("email7");
			     Thread.sleep(2000);
			driver.findElement(By.xpath("//input[contains(@name,'contact_number')]")).sendKeys("contact7");
		         Thread.sleep(2000);
		    System.out.println("Entered Blank Contact Number");
		    driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("password7");
		         Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[contains(@name,'confPassword')]")).sendKeys("confpassword7");
		         Thread.sleep(2000);
		    driver.findElement(By.xpath("//button[@class='popup-btn'][contains(text(),'Register')]")).click();
		         Thread.sleep(3000);
			System.out.println();
		 }
	 
	 public void ICN(WebDriver driver) throws Exception {
		 //Enter Invalid Contact Number 
			driver.findElement(By.xpath("//input[contains(@class,'completer-input form-control ng-untouched ng-pristine ng-valid')]")).sendKeys("company8");
			   Thread.sleep(2000);
			driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("email8");
			   Thread.sleep(2000);
			driver.findElement(By.xpath("//input[contains(@name,'contact_number')]")).sendKeys("contact8");
		       Thread.sleep(2000);
		    System.out.println("Entered Invalid Contact Number");
		    driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("password8");
		       Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[contains(@name,'confPassword')]")).sendKeys("confpassword8");
		       Thread.sleep(2000);
		    driver.findElement(By.xpath("//button[@class='popup-btn'][contains(text(),'Register')]")).click();
		       Thread.sleep(3000);
			System.out.println();
		 }
	 
	 public void VP(WebDriver driver) throws Exception {
		 //Enter Valid Password 
			driver.findElement(By.xpath("//input[contains(@class,'completer-input form-control ng-untouched ng-pristine ng-valid')]")).sendKeys("company9");
			    Thread.sleep(2000);
			driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("email9");
			    Thread.sleep(2000);
			driver.findElement(By.xpath("//input[contains(@name,'contact_number')]")).sendKeys("contact9");
		        Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("password9");
		        Thread.sleep(2000);
		    System.out.println("Entered Valid Password");
		    driver.findElement(By.xpath("//input[contains(@name,'confPassword')]")).sendKeys("confpassword9");
		        Thread.sleep(2000);
		    driver.findElement(By.xpath("//button[@class='popup-btn'][contains(text(),'Register')]")).click();
		        Thread.sleep(3000);
			System.out.println();
		 }
	 
	 public void BP(WebDriver driver) throws Exception {
		 //Enter Blank Password 
			driver.findElement(By.xpath("//input[contains(@class,'completer-input form-control ng-untouched ng-pristine ng-valid')]")).sendKeys("company10");
			    Thread.sleep(2000);
			driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("email10");
			    Thread.sleep(2000);
			driver.findElement(By.xpath("//input[contains(@name,'contact_number')]")).sendKeys("contact10");
		        Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("password10");
		        Thread.sleep(2000);
		    System.out.println("Entered Blank Password");
		    driver.findElement(By.xpath("//input[contains(@name,'confPassword')]")).sendKeys("confpassword10");
		        Thread.sleep(2000);
		    driver.findElement(By.xpath("//button[@class='popup-btn'][contains(text(),'Register')]")).click();
		        Thread.sleep(3000);
			System.out.println();
		 }
	 
	 public void IP(WebDriver driver) throws Exception {
		 //Enter Invalid Password 
			driver.findElement(By.xpath("//input[contains(@class,'completer-input form-control ng-untouched ng-pristine ng-valid')]")).sendKeys("company11");
			     Thread.sleep(2000);
			driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("email11");
			     Thread.sleep(2000);
			driver.findElement(By.xpath("//input[contains(@name,'contact_number')]")).sendKeys("contact11");
		         Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("password11");
		         Thread.sleep(2000);
		    System.out.println("Entered Invalid Password");
		    driver.findElement(By.xpath("//input[contains(@name,'confPassword')]")).sendKeys("confpassword11");
		         Thread.sleep(2000);
		    driver.findElement(By.xpath("//button[@class='popup-btn'][contains(text(),'Register')]")).click();
		         Thread.sleep(3000);
			System.out.println();
		 }
	 
	 public void VCP(WebDriver driver) throws Exception {
		 //Enter Valid Confirm Password 
			driver.findElement(By.xpath("//input[contains(@class,'completer-input form-control ng-untouched ng-pristine ng-valid')]")).sendKeys("company12");
			      Thread.sleep(2000);
			driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("email12");
			      Thread.sleep(2000);
			driver.findElement(By.xpath("//input[contains(@name,'contact_number')]")).sendKeys("contact12");
		          Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("password12");
		          Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[contains(@name,'confPassword')]")).sendKeys("confpassword12");
		          Thread.sleep(2000);
		    System.out.println("Entered Valid Confirm Password");
		    driver.findElement(By.xpath("//button[@class='popup-btn'][contains(text(),'Register')]")).click();
		          Thread.sleep(3000);
			System.out.println();
		 }
	 
	 public void BCP(WebDriver driver) throws Exception {
		 //Enter Blank Confirm Password
			driver.findElement(By.xpath("//input[contains(@class,'completer-input form-control ng-untouched ng-pristine ng-valid')]")).sendKeys("company13");
			    Thread.sleep(2000);
			driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("email13");
			    Thread.sleep(2000);
			driver.findElement(By.xpath("//input[contains(@name,'contact_number')]")).sendKeys("contact13");
		        Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("password13");
		        Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[contains(@name,'confPassword')]")).sendKeys("confpassword13");
		        Thread.sleep(2000);
		    System.out.println("Entered Blank Confirm Password");
		    driver.findElement(By.xpath("//button[@class='popup-btn'][contains(text(),'Register')]")).click();
		        Thread.sleep(3000);
			System.out.println();
		 }
	 
	 public void ICP(WebDriver driver) throws Exception {
		 //Enter Invalid Confirm Password  
			driver.findElement(By.xpath("//input[contains(@class,'completer-input form-control ng-untouched ng-pristine ng-valid')]")).sendKeys("company14");
			    Thread.sleep(2000);
			driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("email14");
			    Thread.sleep(2000);
			driver.findElement(By.xpath("//input[contains(@name,'contact_number')]")).sendKeys("contact14");
		        Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("password14");
		        Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[contains(@name,'confPassword')]")).sendKeys("confpassword14");
		        Thread.sleep(2000);
		    System.out.println("Entered Invalid Confirm Password");
		    driver.findElement(By.xpath("//button[@class='popup-btn'][contains(text(),'Register')]")).click();
		        Thread.sleep(3000);
			System.out.println();
		 }
	
	 public void VR(WebDriver driver) throws Exception {
			//Enter all data
		  System.out.println("Scenario entered all valid data");
			driver.findElement(By.xpath("//input[contains(@class,'completer-input form-control ng-untouched ng-pristine ng-valid')]")).sendKeys("company");
		  	   Thread.sleep(2000);
			driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("email");
			   Thread.sleep(2000);
			driver.findElement(By.xpath("//input[contains(@name,'contact_number')]")).sendKeys("contact");
		       Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("password");
		       Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[contains(@name,'confPassword')]")).sendKeys("confpassword");
		       Thread.sleep(2000);
		    driver.findElement(By.xpath("//button[@class='popup-btn'][contains(text(),'Register')]")).click();
		       Thread.sleep(3000);
			System.out.println("Scenario entered all valid data are entered");
			
	         
	 }
    
    }
	

