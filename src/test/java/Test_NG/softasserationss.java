package Test_NG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softasserationss {
	WebDriver driver;
	@Test
	void soft() {
		System.out.println("Testing Strat");
		SoftAssert sa =new SoftAssert();
		sa.assertEquals(120, 123);
		System.out.println("Test Case end");
		sa.assertAll();
	}

}
