package myprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notidisable {

	public static void main(String[] args) {
		ChromeOptions s=new ChromeOptions();
		s.addArguments("--enablle-notifications");
		WebDriver driver=new ChromeDriver(s);
	     driver.manage().window().maximize();
	     driver.get("https://ytmp3.com/");
	     
		
	}

}
