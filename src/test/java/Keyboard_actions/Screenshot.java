package Keyboard_actions;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://uncodemy.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement screen = driver.findElement(By.xpath("//span[text()='CATEGORIES']"));
		
		File screenshot = screen.getScreenshotAs(OutputType.FILE);
		
		File targetfile = new File("C:\\Users\\HP\\eclipse-workspace\\sel_1_proj\\screenshotfolder\\screen.png");
		
		screenshot.renameTo(targetfile);
		driver.quit();

	}

}
