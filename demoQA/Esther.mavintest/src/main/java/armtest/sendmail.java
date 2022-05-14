package armtest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class sendmail {

	public static void main(String[] args) {
			 
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\esther.nwowo\\chromedriver.exe");
		    WebDriver driver= new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));	
		    JavascriptExecutor js = (JavascriptExecutor)driver; 
	//Log into Yahoo Mail
		    driver.get("https://mail.yahoo.com/");
		    // Maximize window
		    driver.manage().window().maximize();
		    //CLixk on Sign in
		    driver.findElement(By.linkText("Sign in")).click();
   //Enter Username
		     WebDriverWait chill = new WebDriverWait(driver,(Duration.ofMillis(1000)));
		    chill.until(ExpectedConditions.elementToBeClickable(By.id("login-username")));	   
		    driver.findElement(By.id("login-username")).sendKeys("test@yahoo.com");
		    driver.findElement(By.id("login-signin")).click();
	//Enter Password
		    WebDriverWait relax = new WebDriverWait(driver,(Duration.ofMillis(1000)));
		     relax.until(ExpectedConditions.elementToBeClickable(By.id("login-passwd")));
		     driver.findElement(By.id("login-passwd")).sendKeys("test");
   //Sign In
		    driver.findElement(By.id("login-signin")).click();
   //Click on COmpose New Mail
		    driver.findElement(By.linkText("Compose")).click();
	//Enter mail recipient
		    driver.findElement(By.id("message-to-field")).click();
		    driver.findElement(By.id("message-to-field")).clear();
		    driver.findElement(By.id("message-to-field")).sendKeys("enwowo@yahoo.com");
   //Enter Mail Subject
		    driver.findElement(By.cssSelector(".je_0")).click();
		    driver.findElement(By.cssSelector(".je_0")).sendKeys("Hi");
		    driver.findElement(By.cssSelector(".rte > div")).click();	
   //Enter Mail Body
		    driver.findElement(By.xpath("//div[@id='editor-container']/div")).click();		    {
		        WebElement element = driver.findElement(By.cssSelector(".rte"));
		        js.executeScript("if(arguments[0].contentEditable === 'true') {arguments[0].innerText = 'Automated test'}", element);
		      }
   //Send Mail
		    driver.findElement(By.xpath("//div[@id='mail-app-component']/div/div/div/div[2]/div[2]/div/button/span")).click();
   //Confirm Email has been sent
		    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		    WebDriverWait wait = new WebDriverWait(driver,(Duration.ofMillis(500)));
		     wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sent")));
		    driver.findElement(By.linkText("Sent")).click();
		    
		  	if(driver.findElement(By.xpath("//*[@id=\"mail-app-component\"]/div/div/div/div[2]/div/div/div[2]/div/div[1]/ul/li[2]/a/div/div[2]/div[1]/div[1]/span[1]"))!= null);{
		  		    {
		    	System.out.println("Great.. Email sent sucessfully!!!");
		    	}
		    driver.quit();
	}
	}
}

	

		
	




