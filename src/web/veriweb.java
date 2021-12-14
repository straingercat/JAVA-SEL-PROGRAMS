package web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class veriweb {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement u = driver.findElement(By.id("username"));
		if(u.isDisplayed()) {
			System.out.println("pass displayed");
			
		}
		else
		{
			System.out.println("fail not displayed");
			
		}
		WebElement s = driver.findElement(By.id("keepLoggedInCheckBox"));
		if(s.isSelected()) {
			System.out.println("pass selected");
			
		}
		else
		{
			System.out.println("fail not selected");
			
		}
		WebElement e = driver.findElement(By.xpath("//div[text()='Login ']"));
		if(e.isEnabled()) {
			System.out.println("pass enabled");
			
		}
		else
		{
			System.out.println("fail not enabled");
			
		}
		driver.close();

	}

}
