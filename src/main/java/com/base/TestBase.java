package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {

	public static WebDriverWait wait;

	public static WebDriver driver;

	public static Properties prop;

	public TestBase() throws IOException {

		try {
			prop = new Properties();

			FileInputStream ip = new FileInputStream(
					"C:\\Java selenium programs\\NSDLCucumberTaskProject\\src\\test\\resources\\config\\config.properties");

			prop.load(ip);

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		}
	}

	public static WebDriver initialization(String TestCase) {
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\PRACHI\\Chrome\\ChromeDriver.exe");
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		if(TestCase.equals("TestCase2"))

		{
			driver.get(prop.getProperty("url2"));
		}

		else
			driver.get(prop.getProperty("url"));

		return driver;
	}

}
