package sel_day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class finders {

	public static void main(String[] args) {
		// how to open the browser in selelium ?
		WebDriver driver = new ChromeDriver();
		//how to open any website on browser with the help of sel.
		driver.get("https://www.facebook.com/");

	


//how to max the browser
driver.manage().window().maximize();
//how to find out the element with the help of id
driver.findElement(By.id("<div class=\"_9axz\">Log in to Facebook</div>"));
//
	}
}
