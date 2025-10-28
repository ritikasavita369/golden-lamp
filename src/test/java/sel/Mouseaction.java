package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//mouse actions
		Actions mouse = new Actions(driver);
		Thread.sleep(1000);
		WebElement button = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		Thread.sleep(3000);
		mouse.doubleClick(button).build().perform();
		//build crates the actions
		//button is element over here
		//perform work the thing

	}

}
