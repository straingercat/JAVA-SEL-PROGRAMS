package dropppdowwn;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonList {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/s?k=chocolates+gift+pack&i=nowstore&crid=2YHDMDB4N52UQ&sprefix=choco%2Cundefined%2C365&ref=nb_sb_ss_ts-doa-p_3_5");
		List<WebElement> ele = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		for(WebElement w:ele) {
		{
			//System.out.println(w.getText());
		}
		
		TreeSet <String> set=new TreeSet<String>();
		
		System.out.println(set);
		
		

	}

}}
