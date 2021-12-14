package get;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loc {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		Point L = ele.getLocation();
		System.out.println("x loc:"  +L.getX());
		System.out.println("y loc:"  +L.getY());
		
		driver.close();

	}

}
