package Test_NG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependencyes {
	@Test(priority=1, groups= {"Regression"})
	void login() {
		System.out.println("login");
		Assert.assertEquals(121, 130);		
	}
	@Test(priority=2, groups = {"Smoke"})
	void addtoCart() {
		System.out.println("addtoCart");
		Assert.assertEquals(110, 120);	
	}
	@Test(priority=3, groups = {"Sanity"})
	void payament () {
		System.out.println("payament");
		Assert.assertEquals(119, 119);
	}

}
