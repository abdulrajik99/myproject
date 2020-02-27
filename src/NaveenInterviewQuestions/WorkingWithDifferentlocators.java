package NaveenInterviewQuestions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class WorkingWithDifferentlocators 
{

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul Rajik shaik\\Desktop\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS );
        driver.get("https://www.ebay.com/");
        String url=driver.getCurrentUrl();
        System.out.println(url);
        driver.findElement(By.linkText("register")).click();
        String text=driver.getTitle();
        System.out.println("the title of login page is"+text);
        driver.findElement(By.id("firstname")).sendKeys("sathya");
        driver.findElement(By.id("lastname")).sendKeys("tech");
        driver.findElement(By.id("email")).sendKeys("sathyatech@gmail.com");
        Sleeper.sleepTightInSeconds(5000);
      //  the password field requires 6 characters ,a number or a symbol or atleast a letter
        driver.findElement(By.xpath("//div[@id='PASSWORD_r']")).sendKeys("Password@123");
        driver.findElement(By.name("checkbox-default")).click();
        Sleeper.sleepTightInSeconds(5000);

        driver.findElement(By.xpath("//button[@id='ppaFormSbtBtn']")).click();
        
	   // driver.quit();
	}

}
