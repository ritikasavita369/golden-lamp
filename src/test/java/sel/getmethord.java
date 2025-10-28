package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getmethord {

	public static void main(String[] args) throws InterruptedException {
		//what is get method?
		/*when we try to fetch something we use different get method*/
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");//to open any URL we use get method
		driver.manage().window().maximize();
		//get title
		//we use get title of any page
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		//window id
		//to fetch the id of any particular tab
		String onewindow = driver.getWindowHandle();
		System.out.println(onewindow);
		//get window handle
		driver.findElement(By.xpath("//a[text()='Instagram']")).click();
		System.out.println(driver.getWindowHandles());
		Thread.sleep(5000);
		System.out.println(driver.getPageSource());
		//Browser commands
	//	driver.close();// for only one window
		driver.quit(); // for all the windows

	}

}
