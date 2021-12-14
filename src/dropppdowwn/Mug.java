package dropppdowwn;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mug {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[contains(@class,\"_2KpZ6l _2doB4z\")]")).click();
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.xpath("(//img[contains(@alt,'Bath Towels')])"));
		
		Thread.sleep(3000);
	      ele.click();
	}

}
