package Test_NG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parallertesting {
	WebDriver driver;
	@Test (priority = 1)
	@Parameters({"browser"})
	void setup(String bro) {
		switch(bro)
		{
		case "Chrome":  driver = new ChromeDriver(); break;
		case "firefox": driver = new FirefoxDriver(); break;
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	@Test (priority = 2)
	void login() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	

}
