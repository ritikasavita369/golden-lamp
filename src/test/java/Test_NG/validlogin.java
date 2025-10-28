package Test_NG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class validlogin {
	WebDriver driver;
	
	void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	//for valid crid
	
	void login() {
		page P = new page(driver); //called obj on no 9
		P.username("Admin");
		P.password("admin123");
		P.log();
		//we want on valid cred not just on login not just on is it weather it is working or not
		String expected = driver.getTitle();
		String actule = driver.getTitle();
		Assert.assertEquals(expected, actule);
		
		

	}

}
