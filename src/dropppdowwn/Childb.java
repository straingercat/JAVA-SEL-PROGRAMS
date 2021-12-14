package dropppdowwn;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childb {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='ignorelink'])[16]")).click();
		Set<String> allwin = driver.getWindowHandles();
		for(String a:allwin) {
			driver.switchTo().window(a);
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()='Selenium Training'])[2]")).click();
		

	}

}
