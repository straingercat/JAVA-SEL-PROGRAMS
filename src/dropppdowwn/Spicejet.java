package dropppdowwn;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Spicejet {

	public static void main(String[] args) throws Throwable  {
		
		
		  ChromeOptions option=new ChromeOptions();
		  option.addArguments("--disable-notifications");
		  WebDriver driver=new ChromeDriver(option);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("https://beta.spicejet.com/");
		
		
		driver.findElement(By.xpath("//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu']")).click();
		driver.findElement(By.xpath("//div[text()='Mangalore International Airport']")).click();
		driver.findElement(By.xpath("//div[text()='Indira Gandhi International Airport']")).click();
		
		
		driver.findElement(By.xpath("//div[@data-testid='undefined-month-December-2021']/descendant::div[text()=5]")).click();
		driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'css-1dbjc4n r-1awozwy r-1xfd6ze r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73')]")).click();
		
		
		driver.findElement(By.xpath("//input[contains(@class,'css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy')]")).sendKeys("punith");
		driver.findElement(By.xpath("(//input[@autocapitalize='sentences'])[2]")).sendKeys("raj");
		driver.findElement(By.xpath("//input[contains(@data-testid,'contact-number-input-box')]")).sendKeys("7353736930");
		driver.findElement(By.xpath("//input[contains(@data-testid,'emailAddress-inputbox-contact-details')]")).sendKeys("c.puneethraj@gmail.com");
		driver.findElement(By.xpath("//input[contains(@data-testid,'city-inputbox-contact-details')]")).sendKeys("Pandavapura");
		
		
		driver.findElement(By.xpath("//div[text()='I am flying as the primary passenger']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73')]")).click();
		driver.findElement(By.xpath("//div[contains(@class,'css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73')]")).click();
		
		
		WebElement cardnoFrame=driver.findElement(By.xpath("//iframe[@class='card_number_iframe']"));
		driver.switchTo().frame(cardnoFrame);
		driver.findElement(By.id("card_number")).sendKeys("1234567890123456");
		
		driver.switchTo().parentFrame();
		WebElement cardholdername = driver.findElement(By.xpath("//iframe[@class='name_on_card_iframe']"));
		driver.switchTo().frame(cardholdername);
		driver.findElement(By.id("name_on_card")).sendKeys("Punith");
		
		driver.switchTo().parentFrame();
		WebElement mm = driver.findElement(By.xpath("//iframe[@class='card_exp_month_iframe']"));
		driver.switchTo().frame(mm);
		driver.findElement(By.name("card_exp_month")).sendKeys("11");
		
		
		driver.switchTo().parentFrame();
		WebElement yy = driver.findElement(By.xpath("//iframe[@class='card_exp_year_iframe']"));
		driver.switchTo().frame(yy);
		driver.findElement(By.name("card_exp_year")).sendKeys("21");
		
		
		
		driver.switchTo().parentFrame();
		WebElement cvv = driver.findElement(By.xpath("//iframe[@class='security_code_iframe']"));
		driver.switchTo().frame(cvv);
		driver.findElement(By.name("security_code")).sendKeys("21");
		
		
	}
}
