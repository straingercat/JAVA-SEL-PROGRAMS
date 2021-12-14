package dropppdowwn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement src = driver.findElement(By.id("box3"));
		WebElement dest = driver.findElement(By.id("box103"));
		Thread.sleep(5000);
		
		Actions a=new Actions(driver);
		a.dragAndDrop(src, dest).perform();
		Thread.sleep(5000);
		
		driver.close();
		
		

	}

}
