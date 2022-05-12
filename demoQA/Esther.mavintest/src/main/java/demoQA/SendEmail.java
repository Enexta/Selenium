package demoQA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class SendEmail {	
		public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\esther.nwowo\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();		
	
	driver.get("https://outlook.live.com/mail/0/");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));	
	driver.manage().window().maximize();


    driver.findElement(By.linkText("Sign in")).click();
    driver.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1652289464&rver=7.0.6737.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fnlp%3d1%26RpsCsrfState%3de4544cc0-a6e8-cfd4-0a5f-1c5e08fd0b5d&id=292841&aadredir=1&whr=outlook.com&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=90015");
        
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
    
    driver.findElement(By.id("i0116")).clear();
    driver.findElement(By.id("i0116")).sendKeys("your username");
    driver.findElement(By.id("idSIButton9")).click();      
  
    for(int i=0; i<=2;i++){
    	  try{
    	     driver.findElement(By.name("passwd")).click();
    	     break;
    	  }
    	  catch(Exception e){
    	     System.out.print(e.getMessage());
    	  }
    	}
    driver.findElement(By.name("passwd")).clear();
    driver.findElement(By.name("passwd")).click();
     driver.findElement(By.name("passwd")).sendKeys("your_password");
           
    driver.findElement(By.id("idSIButton9")).click();   
    
    driver.findElement(By.id("idSIButton9")).click();     
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        
   driver.get("https://outlook.live.com/mail/0/");
   System.out.print("Login Successful");
  
   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
   for(int i=0; i<=2;i++){
 	  try{
 	     driver.findElement(By.id("id__9")).click();
 	     break;
 	  }
 	  catch(Exception e){
 	     System.out.print(e.getMessage());
 	  }
 	}
   driver.findElement(By.id("id__9")).click();
   
     
   driver.findElement(By.xpath("//input[@value='ecnwowo@outlook.com']")).clear();
   driver.findElement(By.xpath("//input[@value='ecnwowo@outlook.com']")).sendKeys("ecnwowo@outlook.com");
   
   driver.findElement(By.id("TextField1181")).click();
   driver.findElement(By.id("TextField1181")).clear();
   driver.findElement(By.id("TextField1181")).sendKeys("Hi");
   
   driver.findElement(By.xpath("//div[@id='virtualEditScroller341']/div/div")).click();
   driver.findElement(By.id("TextField233")).sendKeys("Automation Test");
   driver.findElement(By.id("id__212")).click();
   
   //Go to Sent Items and verify 
   driver.findElement(By.xpath("//a[@title='Sent Items']")).click();
   
  if (driver.findElement(By.xpath("//div[@class='xfjq3NWbpycK5fsD16mO pz2Jt_8jXFcXuxljSdz2 MtC_rOWwwVu7Sakz1yfU jYIx5XXTs7crsoYtdhha']//span[@title ='Hi']")) !=null)
     {
   System.out.println(" Email sent sucessfully");
   }
     else
   {
   System.out.println("Failed to send email");
   }
  
     driver.quit();
   }
   
		}
		

	
	



