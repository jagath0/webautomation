package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class todaytest {

	@Test
	public void openvbrowser() throws InterruptedException{
		WebDriver dr=new ChromeDriver();
		Thread.sleep(90000);
		dr.get("https://www.youtube.com/");
		  System.out.println("Browser Opened");

	}
}
