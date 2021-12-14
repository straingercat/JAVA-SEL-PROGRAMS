package get;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class attri {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement ele = driver.findElement(By.xpath("//a[text()='Amazon Pay']"));
	System.out.println(ele.getAttribute("tabindex"));
	driver.close();
		

	}

}
