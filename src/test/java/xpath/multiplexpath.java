package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplexpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://medimention.com/");
		Thread.sleep(9000);
		driver.findElement(By.xpath("//input[@class='form-control'][@name='name'][@placeholder='Your Name']")).sendKeys("ritika");
	//and or xpath is used over here
	}

}
