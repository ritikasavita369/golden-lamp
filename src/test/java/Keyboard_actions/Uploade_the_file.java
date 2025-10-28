package Keyboard_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploade_the_file {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement uploade =  driver.findElement(By.xpath("//input[@id='singleFileInput']"));
		Thread.sleep(1000);
		uploade.sendKeys("C:\\Users\\HP\\Downloads\\Brown Vintage Travel Journal Cover A4 Document.pdf");
		Thread.sleep(2000);
		driver.manage().window().minimize();
		

	}

}
