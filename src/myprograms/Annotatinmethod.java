package myprograms;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Annotatinmethod {
	
public WebDriver driver;
@Parameters ({"chromedriver"})
@BeforeMethod
public void openapp(){
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
}
	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		String ele = driver.getTitle();
		Reporter.log(ele,true);
		String ele1 = driver.getCurrentUrl();
		Reporter.log(ele1,true);
		
	}
	
	
	
	@AfterMethod
	public void closeapp(){
	driver.close();	
	}
	
	
	

}
