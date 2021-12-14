package myprograms;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettitleandcloaseonlychildwindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
        System.out.println(child);
        System.out.println(child.size());
        child.remove(parent);
     
        for(String c:child) {
       
        	driver.switchTo().window(c);
       
        	System.out.println(driver.getTitle());
        	driver.close();
     
        
        	
        	
        }
        
       
        
        
        
        
        
        
        
		
		

	}

}
