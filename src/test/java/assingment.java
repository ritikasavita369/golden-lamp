import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assingment {

	public static void main(String[] args) throws InterruptedException {
		// Assignment of input in all the text box 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.medimention.com/");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@name='name']")).sendKeys("ritika");
		//driver.findElement(By.xpath("//input[@name='name']")).sendKeys("ritika@gmail.com");
		//driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("6583678");
		List<WebElement> name = driver.findElements(By.xpath("//input[@name='name']"));
		name.get(0).sendKeys("ritika");
		name.get(1).sendKeys("ritika");
		List<WebElement> email = driver.findElements(By.xpath("//input[@name='email']"));
		email.get(0).sendKeys("ritika@gmail.com");
		email.get(1).sendKeys("ritika123@gmail.com");
		List<WebElement> phone = driver.findElements(By.xpath("//input[@name='phone']"));
		phone.get(0).sendKeys("436753269");
		phone.get(1).sendKeys("66532896");
	
		

	}

}
