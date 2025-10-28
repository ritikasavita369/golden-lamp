package sel_day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
		//how to open browser with selinium
		//what is sel. it is a web driver tool
		//it helps to open a browser
		
		WebDriver driver= new ChromeDriver(); //it helps to open the browser
		
		// how to open the website with sel.
		//driver is the thing which stores the things
		
		driver.get("https://www.facebook.com/");
		//how to max the window
		
		driver.manage().window().maximize();//above code is known as setup
		
		//how to find element with the help of id attribute
		//sendKey is for sending the writing things in the box
		driver.findElement(By.id("email")).sendKeys("ritika@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("ritika123");
		
	}

}
