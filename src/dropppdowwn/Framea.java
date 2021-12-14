package dropppdowwn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framea {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("svg[focusable='false']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//span[text()='Play']")).click();
		Thread.sleep(10000);
		driver.close();
		

	}
}
