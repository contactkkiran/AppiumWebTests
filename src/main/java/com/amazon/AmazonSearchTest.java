package com.amazon;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class AmazonSearchTest {
	
	private WebDriver driver;

	@Test
	public void f() {
	}

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.amazon.com");
	}

	@AfterClass
	public void afterClass() {
		driver.close();
		driver.quit();
	}

}
