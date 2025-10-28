package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://uncodemy.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		Actions hover =new Actions(driver);
		WebElement button = driver.findElement(By.xpath("//span[text()='CATEGORIES']"));
		Thread.sleep(1000);
		hover.moveToElement(button).perform();

	}

}
