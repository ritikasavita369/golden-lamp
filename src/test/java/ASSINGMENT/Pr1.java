package ASSINGMENT;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		List<WebElement>box = driver.findElements(By.xpath("//input[@class='form-check-input']"));
		for (WebElement i:box) {
			if (i.isSelected()==false) {
				i.click();
				Thread.sleep(500);
				
			}
		}

	}

}
