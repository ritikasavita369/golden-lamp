package ASSINGMENT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pract {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("ritika");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ritika@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("121 b pramramuk shivalay valsad 396001");
		

	}

}
