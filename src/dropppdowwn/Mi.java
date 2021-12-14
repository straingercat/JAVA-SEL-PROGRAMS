package dropppdowwn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class Mi {

	public static void main(String[] args) throws InterruptedException  {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles under 15000",Keys.ENTER);
	driver.findElement(By.xpath("//span[text()='See more']")).click();
	driver.findElement(By.xpath("(//i[contains(@class,'a-icon a-icon-checkbox')])")).click();
	String text = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText().replaceAll(",", "");
	int price = Integer.parseInt(text);
	Assert.assertTrue(price<15000);
	System.out.println("Mi phones under 15000");
	Thread.sleep(3000);

	 driver.close();
	
	}

}
