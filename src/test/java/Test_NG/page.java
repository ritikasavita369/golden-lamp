package Test_NG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class page {
	WebDriver driver;
	
	page(WebDriver driver){
		this.driver = driver;//Globe variable is used here
	}
	//here all xpaths are stored for the modle to work
	By user = By.xpath("//input[@name='username']");
	By pass = By.xpath("//input[@name='password']");
	By login = By.xpath("//button[@type='submit']");
	
	public void username (String name) {
		driver.findElement(user).sendKeys(name);
		}
	public void password (String pin) {
		driver.findElement(pass).sendKeys(pin);
	}
	public void log () {
		driver.findElement(login).click();
	}

}
