package myprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("container_users")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='New User']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@placeholder='First Name'])[3]")).sendKeys("Ronaldo");
		WebElement ele = driver.findElement(By.id("usersManagementBodyTagId"));
		Thread.sleep(3000);
		System.out.println(ele.getText());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(@class,'closeButton hideButton_panelContainer')]")).click();
		Alert a = driver.switchTo().alert();
		a.dismiss();
		
		driver.close();
		
		
		

	}

}
