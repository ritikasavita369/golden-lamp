package sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboc {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		
		
		List<WebElement>checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		//for loop
		for (WebElement i:checkbox ) {
			
			if (i.isSelected()==false) {
			i.click();
			Thread.sleep(500);
			}
		}
		

	}

}
