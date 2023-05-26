package com.Aautomation.Test;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass1 {

	public WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().driverVersion("113.0.5672.127").setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test(priority = 1)
	public void Test1() {
		driver.get("https://www.toolsqa.com/");
	}

	@AfterTest
	public void Test2() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
