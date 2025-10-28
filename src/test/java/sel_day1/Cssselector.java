package sel_day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselector {

	public static void main(String[] args) {
		// CSS Selector
		//we have multiple  css selectors, they have different selectors or writting style
		/* 1.tag id 
		 * 2.tag class
		 * 3.tag attribute
		 * 4.tag class attribute
		 */
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//how to use css selector tag id:-
		//o locate an element using its class name, 
		//you use the dot (.) notation followed by the class name.
		//"tagname#idname" there should be no space in between
		driver.findElement(By.cssSelector("input#email")).sendKeys("ruhfvjh");
		
		//how to use tag class
		//To locate an element using its class name,
		//you use the dot (.) notation followed by the class name.
		//it have very less effincency to find the pirticular element 
	//	driver.findElement(By.cssSelector(".inputtext _55r1 _6luy _9npi")).sendKeys("455156");
		
		//how to use tag attribute
		//tagName: This represents the HTML tag of the element you are trying to locate (e.g., div, input, button, a).
		//#: This symbol is the CSS selector for an ID.
		//idValue: This is the actual value of the id attribute of the HTML element.
		//tag name[attribute name='attribute value']
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("45415");
		
		
		// how to use tag class attribute
		//tagname.classname[attribute name='attributevalue']
		driver.findElement(By.cssSelector("input._42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy[name='login']"));
		
		

	}

}
