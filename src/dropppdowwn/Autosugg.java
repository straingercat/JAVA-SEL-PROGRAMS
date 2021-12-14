package dropppdowwn;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Autosugg {

	
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.lenskart.com/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 driver.findElement(By.name("q")).click();
			List<WebElement> ele = driver.findElements(By.xpath("//div[@class='trending']"));
			for(WebElement e:ele)
				System.out.println(e.getText());
				
		
			driver.close();


		}
		

	}

	


