package sel_day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class byname {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		driver.manage().window().maximize();
		WebElement email =driver.findElement(By.name("username"));
		email.sendKeys("Ritika");
		//Thread.sleep(2000);
		email.sendKeys(Keys.CONTROL+"a");
		email.sendKeys(Keys.DELETE);
		Thread.sleep(4000);
		email.sendKeys("rustum@gamil.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("ritika");
		Thread.sleep(2000);
	
	}

}
