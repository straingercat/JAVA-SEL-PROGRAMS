package get;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class size {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
        Dimension s = ele.getSize();
        System.out.println("height"+s.getHeight());
        System.out.println("width"+s.getWidth());
        Thread.sleep(3000);
        driver.close();
        

	}

}
