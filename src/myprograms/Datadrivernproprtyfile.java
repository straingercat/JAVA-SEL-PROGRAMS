package myprograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datadrivernproprtyfile {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties p=new Properties();
		p.load(new FileInputStream("./data.properties"));
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(p.getProperty("url"));
		
		
		

	}

}
