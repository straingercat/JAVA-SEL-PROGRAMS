package myprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.id("course"));
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		driver.findElement(By.linkText("Selenium Training")).click();
		Thread.sleep(3000);
		WebElement ele1 = driver.findElement(By.id("add"));
		Actions s=new Actions(driver);
		s.doubleClick(ele1).perform();
		
		
	}

}
