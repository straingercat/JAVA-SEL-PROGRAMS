package myprograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ismultidesel {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/punith%20raj.c/Desktop/multidropdown.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement a = driver.findElement(By.id("MTR"));
		Select s=new Select(a);
		s.selectByIndex(0);
		s.selectByValue("3");
	
		s.selectByVisibleText("coffee");
		List<WebElement> b = s.getOptions();
		System.out.println(b.size());
		for(WebElement c:b) {
			System.out.println(c.getText());
			}
		if(s.isMultiple());
		{
			s.deselectAll();
			System.out.println(s.isMultiple());
		}
	

	}

}
