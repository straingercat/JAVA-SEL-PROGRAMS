package dropppdowwn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate {

	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver","C:\\Users\\punith raj.c\\chromedriver123544.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement searchbox = driver.findElement(By.id("search_query_top"));
		searchbox.sendKeys("T-shirts");
		driver.findElement(By.name("submit_search")).click();
		driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		int slidder = driver.findElements(By.className("homeslider-container")).size();
		System.out.println(slidder);
		
		
		int links = driver.findElements(By.tagName("a")).size();
		System.out.println(links);
		
		
	}

}
