package dropppdowwn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\punith raj.c\\git\\repository27\\selpro1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("container_users")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='New User']")).click();
		Thread.sleep(3000);
		WebElement a = driver.findElement(By.id("createUserPanel_firstNameField"));
		a.sendKeys("ronaldo");
		System.out.println(a.getText());
		driver.findElement(By.xpath("//div[contains(@class,'closeButton hideButton_panelContainer')]")).click();
		Thread.sleep(3000);
		Alert b = driver.switchTo().alert();
		
		b.dismiss();
		
		driver.close();
	
		
		
	
		
		

	}

}
