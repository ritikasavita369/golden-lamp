package sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
		Select dropdown =new Select(country);
		Thread.sleep(2000);
		dropdown.selectByValue("india");
		Thread.sleep(1000);
		dropdown.selectByIndex(3);
		driver.quit();
		List<WebElement> count = dropdown.getOptions();
		for (int i=0; i<count.size(); i++) {
			System.out.println(count.get(i).getText());
		}
		

	}

}
