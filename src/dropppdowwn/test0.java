package dropppdowwn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test0 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement e = driver.findElement(By.name("url"));
		Select s=new Select(e);
		Thread.sleep(3000);
		s.selectByIndex(9);
		Thread.sleep(3000);
		s.selectByVisibleText("Amazon Fashion");
		Thread.sleep(3000);
		List<WebElement> f = s.getOptions();
	    System.out.println(f.size());
	    for(WebElement g:f)
	    	System.out.println(g.getText());
	    
		driver.close();
		

	}

}
