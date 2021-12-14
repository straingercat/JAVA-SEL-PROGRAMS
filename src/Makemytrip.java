import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemytrip {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//body[@class='desktop in webp']")).click();
		
		driver.findElement(By.xpath("//span[text()='From']")).click();
		
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("blr");
		driver.findElement(By.xpath("//p[text()='Bangalore, India']")).click();
		driver.findElement(By.xpath("//span[text()='To']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("del");
		driver.findElement(By.xpath("//p[text()='Delhi, India']")).click();
		driver.findElement(By.xpath("//div[@aria-selected='true']")).click();
		//driver.close();
		
		
		
		
	}

}