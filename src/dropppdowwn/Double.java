package dropppdowwn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.id("course"));
		Thread.sleep(5000);
		
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[text()='Selenium Training'])[2]")).click();
		Thread.sleep(5000);
		WebElement ele1 = driver.findElement(By.id("add"));
		Actions b=new Actions(driver);
		
		b.doubleClick(ele1).perform();
		Thread.sleep(5000);
		driver.close();
		
	}

}
