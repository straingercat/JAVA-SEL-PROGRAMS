package dropppdowwn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T1 {
	public WebDriver driver;
	@BeforeMethod
	public void openapp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("hhttps://demo.actitime.com/login.do");
		}
	
	
	@Test
	public void login() {
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("Login")).click();
		Reporter.log(driver.getTitle(),true);
		Reporter.log(driver.getCurrentUrl(),true);

		driver.getCurrentUrl();
	}
	
	
	@AfterMethod
	public void closeapp() {
		driver.close();
	}

}
