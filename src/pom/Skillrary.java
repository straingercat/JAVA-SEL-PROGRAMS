package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillrary {
@FindBy(id="username")
private WebElement nametb;

@FindBy(name="pwd")
private WebElement passwordtb;


@FindBy(xpath="//div[text()='Login ")
private WebElement logintb;

public Skillrary(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void username(String adm) {
	nametb.sendKeys(adm);
	}
public void password(String man) {
	passwordtb.sendKeys(man);
	}
public void login() {
	logintb.click();
	}
}
