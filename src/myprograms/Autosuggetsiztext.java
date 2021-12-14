package myprograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggetsiztext {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.name("q")).sendKeys("suzu");
		Thread.sleep(3000);
		List<WebElement> ele = driver.findElements(By.xpath("//li[@class='sbct']"));
		System.out.println(ele.size());
		for(WebElement e:ele)
		{
			System.out.println(e.getText());
			
		}
		driver.close();
		

	}

}
