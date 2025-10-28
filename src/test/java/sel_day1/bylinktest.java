package sel_day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bylinktest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Instagram")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
		//over here we are able it to view in facebook one not on instagram as it have 
		//spam tag not <a -- /a> tag
		driver.findElement(By.partialLinkText("Forgot")).click();
		//<a href="https//passchange">forget </a> in html tags only works for linktext and partiallinkText
		//xpath and  partialLink have one sll. that it only open on a tag not on spam tag
		
		driver.quit();
		//it helps to close all windows on tab
		driver.close();
		//only close last tab 
		

	}

}
