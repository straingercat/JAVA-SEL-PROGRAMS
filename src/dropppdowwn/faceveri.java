package dropppdowwn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class faceveri {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	 WebElement a = driver.findElement(By.id("month"));
	 a.click();
	 Select s=new Select(a);
	 Thread.sleep(3000);
	 s.selectByIndex(1);
	 List<WebElement> b = s.getOptions();
	 System.out.println(b.size());
	ArrayList t=new ArrayList<>();
	
	 for(WebElement c:b) {
		 String d = c.getText();
		 System.out.println(d);
		 t.add(d);
		 
		 }
	 
	 
	 System.out.println("***after-sorting***");
	 Collections.sort(t);
	for(Object r:t) {
		System.out.println(r);
		
	}
		
	 driver.close();
	 
	
	

	}

}
