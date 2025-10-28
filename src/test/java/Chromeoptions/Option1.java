package Chromeoptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Option1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		//opt.addArguments("--headless=new");//excetue  all things at back end
		
		//opt.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		//to remove "Chrome is controled automated Test software"
		
		opt.addArguments("--incognito");
		//to open the incognito version on Chrome
		
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.medimention.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());

	}

}
