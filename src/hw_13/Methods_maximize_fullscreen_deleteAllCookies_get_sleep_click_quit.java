package hw_13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Methods_maximize_fullscreen_deleteAllCookies_get_sleep_click_quit {
		
	
	WebDriver driver;
	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/sananaeem/eclipse-workspace/NewHomework/driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		driver.manage().window().fullscreen();
		Thread.sleep(5000);
	}
	@Test
	public void signInButtonTest() throws InterruptedException {
		driver.findElement(By.className("action-inner")).click();
		Thread.sleep(5000);

	}

@AfterTest
	public void tearUp() {
		driver.quit();
	}
}
