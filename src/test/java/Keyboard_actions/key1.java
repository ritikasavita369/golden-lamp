package Keyboard_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class key1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		Actions keyboadaction = new Actions(driver);
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("ritika");
		keyboadaction.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		keyboadaction.keyDown(Keys.CONTROL).sendKeys("")
	
		

	}

}
