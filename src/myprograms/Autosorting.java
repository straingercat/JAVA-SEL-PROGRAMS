package myprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Autosorting {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement ele = driver.findElement(By.id("month"));
		ele.click();
		
		
		Select s=new Select(ele);
		s.selectByValue("1");
		List<WebElement> a = s.getOptions();
		System.out.println(a.size());
		
		
		ArrayList t=new ArrayList<>();
		
		for(WebElement b:a){
			String c = b.getText();
			System.out.println(c);
			t.add(c);
			}
		System.out.println("--After sorting--");
		Collections.sort(t);
		
	
		for(Object r:t) {
			System.out.println(r);
		}
		
		driver.close();
		
		

	}

}
