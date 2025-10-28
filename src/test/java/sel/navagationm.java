package sel;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navagationm {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		URL myurl=new URL("https://www.facebook.com/");
		//driver.get(myurl);// accept url in string format only
	
		driver.navigate().to(myurl);//Accept both string and obj format
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		//it is an alt of get()
		//we use to open any particular browser
		driver.findElement(By.xpath("//a[text()='Messenger']")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();//for going back in tab
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();//for go to next tab
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();//for refreshing the tab
		System.out.println(driver.getTitle());
	}

}
