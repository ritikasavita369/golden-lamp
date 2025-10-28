package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day1 {

	public static void main(String[] args) throws InterruptedException {
	/*absolute X-path (it is a tool/locator)
	 * it is also known as full X-Path
	 * eg:- https://uncodemy.com/course/java-training-course-in-noida
	 * 
	 * relative X-path
	 * it is known as partial X-path
	 * eg:-//input[@id='password']
	 * 
	 * *which x-path we are using in industry? 
	 * relative X-path we use in industry
	 * reason 1:-in absolute X-pth if there is some minor change in code or design 
	 * the previous X-path would be incorrect
	 * as it depends on the all nodes/tags.it starts from the node
	 * relative X-path it is very rare we change the attribute or tag name.
	 * reason 2:- relative X-path is faster 
	 * as it directly jump to the main tag and attribute
	 * 
	 * how to use relative X-path?
	 * Basic syntax of X-path
	 *   // tag name[@attribute name='the attribute value']
	 */
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(9000);
		driver.quit();
		//to test the function with the valid credential
		
	}

}
