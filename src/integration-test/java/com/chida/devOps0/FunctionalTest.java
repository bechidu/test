package com.chida.devOps0;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.*;
import static org.junit.Assert.*;

import org.junit.experimental.categories.Category;

@Category(FunctionalTest.class)
public class FunctionalTest {

	static WebDriver driver;

	@BeforeClass
	public static void setup() {
		driver = new FirefoxDriver();
	}

	@AfterClass
	public static void cleanUp() {
		driver.quit();
	}

	@Test
	public void welcome() {
		driver.get("http://localhost:8080/devOps0");
		WebElement we = driver.findElement(By.xpath("html/head/title[1]"));
		if (we.getText().contains("Welcome")) {
			System.out.println("### Home Page Successful ###");
		} else {
			System.out.println("Home Page Unsuccessful");
		}
		assertEquals("Welcome", we.getText());
	}
}

