package newTestng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Test_NG.page;

public class validlogin1 {
WebDriver driver;
@BeforeMethod
	void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	//for valid crid
	@Test
	void login() {
		page1 P = new page1(driver); //called obj on no 9
		P.username("Admin");
		P.password("admin123");
		P.log();
		//we want on valid cred not just on login not just on is it weather it is working or not
		String expected = driver.getTitle();
		String actule = driver.getTitle();
		Assert.assertEquals(expected, actule);
		
	}
	@Test
	void invalidlogin() {
		page1 P = new page1(driver); //called obj on no 9
		P.username("Admin");
		P.password("admin123");
		P.log();
		String expected = driver.getTitle();
		String actule = driver.getTitle();
		Assert.assertNotEquals(expected, actule);
		
	}
	@AfterMethod
	void quit() {
	driver.quit();
	}


}
