package conditionmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class display {

	public static void main(String[] args) throws InterruptedException {
		// display
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement logo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		System.out.println(logo);

	}

}
