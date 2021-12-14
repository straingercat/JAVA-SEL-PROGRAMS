package dropppdowwn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollclick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com//");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.linkText("Core Java"));
	
		Point loc= ele.getLocation();
		int x=loc.getX();
		int y =loc.getY();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		
		
		ele.click();
	
	

	}

}
