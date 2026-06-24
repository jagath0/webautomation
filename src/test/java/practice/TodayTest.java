package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TodayTest {

	@Test
	public void openvbrowser() throws InterruptedException{
		  WebDriver dr = new ChromeDriver();

		    dr.get("https://www.youtube.com/");
		    System.out.println("Browser Opened");

		    // Thread.sleep(90000); // wait AFTER opening page

		    dr.quit();

	}
}
