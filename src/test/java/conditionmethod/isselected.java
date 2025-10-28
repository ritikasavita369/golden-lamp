package conditionmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(2000);
		WebElement Female = driver.findElement(By.xpath("//input[@value='1']"));
		Thread.sleep(2000);
		Female.click();
		 WebElement male =driver.findElement(By.xpath("//input[@value='2']"));
		 male.click();
		 System.out.println(male.isSelected());
		System.out.println(Female.isSelected());
		
 
	}

}
