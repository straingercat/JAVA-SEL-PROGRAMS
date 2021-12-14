

	package dropppdowwn;

	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class multisel {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/punith%20raj.c/Desktop/multidropdown.html");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement a = driver.findElement(By.id("MTR"));
			Select s=new Select(a);
			s.selectByIndex(0);
			Thread.sleep(3000);
			s.selectByValue("3");
			Thread.sleep(3000);
			s.selectByVisibleText("chicken 65");
			Thread.sleep(3000);
			List<WebElement> o = s.getOptions();
			System.out.println(o.size());
			for(WebElement p:o)
			{
				System.out.println(p.getText());
				
			}
			
			if(s.isMultiple())
			{
				s.deselectAll();
				Thread.sleep(4000);
				System.out.println(s.isMultiple());
				
			}
			
			driver.close();
			
		    
			
			

		}

	}
