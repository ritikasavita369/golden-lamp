package conditionmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class enable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver .get("https://www.facebook.com/");
		Thread.sleep(2000);
		 WebElement login = driver.findElement(By.xpath("//button[@name'login']"));
		System.out.println(login.isEnabled());
		driver.quit();
		
		driver .get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rwhtiuwhiuhui");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("hdrgfyyg");
		 WebElement login1 = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println(login1.isEnabled());
		driver.quit();
		
		

	}

	
	}


