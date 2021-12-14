package web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test0 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		ele.sendKeys("phone");
		Thread.sleep(10000);
		
	    driver.findElement(By.id("nav-search-submit-button")).submit();
	    ele.clear();
		
		
		}

}
