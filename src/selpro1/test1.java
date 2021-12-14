package selpro1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(1000);
		
	    driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		if(title.equals("actiTIME - Enter Time-Track")) {
			System.out.println("pass-home page is displayed");
			}
		else
		{
			System.out.println("fail-home page is not displayed");
		}
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);
		
		driver.close();
		
		
		
		
		
		
		
		
		

	}

}
