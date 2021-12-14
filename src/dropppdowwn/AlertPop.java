package dropppdowwn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertPop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.id("course"));
		Thread.sleep(3000);
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		WebElement ele1 = driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]"));
		ele1.click();
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("button[ondblclick='addtocart()']")).click();
		
		
		Alert b=driver.switchTo().alert();
		
		Thread.sleep(3000);
		System.out.println(b.getText());
		b.accept();
		driver.close();
		
		
		
		
	}

}
