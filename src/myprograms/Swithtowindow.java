package myprograms;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swithtowindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='ignorelink'])[16]")).click();
		Thread.sleep(3000);
		Set<String> allwin = driver.getWindowHandles();
		Thread.sleep(3000);
		for(String a:allwin)
		{
			driver.switchTo().window(a);
		}
			Thread.sleep(3000);
			driver.findElement(By.linkText("Selenium Training")).click();
			Thread.sleep(3000);
			driver.close();
			
		}
		
		
	

	}


