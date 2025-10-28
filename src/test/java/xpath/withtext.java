package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class withtext {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
	//Thread.sleep(2000);
		// driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
		//tag name[@attribute name]
		// this works for text attribute
		//it is also known as inner text
		
		//X-path with contain
		/*Thread.sleep(2000);
		*/driver.findElement(By.xpath("//input[contains(@placeholder,'Ph')]")).sendKeys("ritika@gmail.com");
		
		//X-path  Start with
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[starts-with(@class,'xvs91rp xwhw')]")).click();

	}

}
