package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel {
	public WebDriver driver;
	@Parameters({"browsername"})
	@Test
	public void tc1(String browser) {
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
			}
		
		
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("bcuoi");
		driver.findElement(By.id("pass")).sendKeys("4132543");
		driver.findElement(By.name("login")).click();
		String t=driver.getTitle();
		Reporter.log(t,true);
		String url=driver.getCurrentUrl();
		Reporter.log(url,true);
	}

}
