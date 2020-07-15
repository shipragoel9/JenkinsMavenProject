package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
 

	public WebDriver driver;
	 @BeforeClass
	  public void LaunchApp() {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\ShipraJindal\\Desktop\\selenium\\selenium jar file\\chromedriver_win32\\chromedriver.exe");
			
			driver =new ChromeDriver();
		    driver.get("http://demowebshop.tricentis.com/");
		    driver.manage().window().maximize();
		    driver.findElement(By.linkText("Log in")).click(); 
	 }
	 
	@Test
  public void login() {
	  	
	  
      driver.findElement(By.id("Email")).sendKeys("shigoel3@gmail.com");
      driver.findElement(By.id("Password")).sendKeys("Aabcsdsfds$");
      driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
      
      
  }
	@Test
	  public void logout() {
		driver.findElement(By.linkText("Log out")).click();
	}
	
	@AfterClass
	  public void Closing() {
		driver.close();
	  }
	
	



}
