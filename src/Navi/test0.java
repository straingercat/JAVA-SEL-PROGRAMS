package Navi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test0 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
        String title=driver.getTitle();
        System.out.println(title);
        if(title.equals(title)) {
        	System.out.println("pass");
        }
   
        else
        {
        	System.out.println("fail");
        }
		
		
		
	
		


	}

}
