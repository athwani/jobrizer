package jobrizeer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {

	public void Logout1(WebDriver driver) throws Exception{
		
		driver.findElement(By.xpath("//span[contains(@class,'caret')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log out")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Employer")).click();
		Thread.sleep(2000);	
			
		//Login Page 
		driver.findElement(By.linkText("Login")).click();
           Thread.sleep(1000);
           login L1 = new login();
           L1.VUVP(driver);
		
	}
}
