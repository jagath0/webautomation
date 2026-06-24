package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class today {

	@Test
	public void openvbrowser(){
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.youtube.com/");
		  System.out.println("Browser Opened");

	}
}
