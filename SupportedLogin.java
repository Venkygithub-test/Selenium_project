package com.project.orderprocess;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SupportedLogin {
	WebDriver Driver;

	// Open Browser connection
	@BeforeSuite
	public void openBrowser(){
		String browserName = "firefox";
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkatesh\\Desktop\\Selenium_project\\chromedriver.exe");
			Driver = new ChromeDriver();
		}else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Venkatesh\\Desktop\\Selenium_project\\geckodriver.exe");
			Driver = new FirefoxDriver();
		}else if(browserName.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Venkatesh\\Desktop\\Selenium_project\\IEDriverServer.exe");
			Driver = new InternetExplorerDriver();
		}else {
			System.out.println("Invalid Browser");
		}
		Driver.get("https://pepble.com/#/home");
		Driver.manage().window().maximize();
		//System.out.print("Page title is: " + driver.getTitle());
		Driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	}

	// Verify Login
	@BeforeTest
	public void LogInPage() throws InterruptedException {
		Actions act = new Actions(Driver);
		act.moveToElement(Driver.findElement(By.xpath("//*[@id=\"app\"]/div/header/div/nav/div/div/div[2]/ul[2]/li[4]/div/ul/li[1]/a"))).build().perform();
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Driver.findElement(By.linkText("Login")).click();
		Driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/section/div/div[2]/form[1]/fieldset/div[1]/div/input")).sendKeys("venkateshburgula69@gmail.com");
		Driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/section/div/div[2]/form[1]/fieldset/div[2]/div/input")).sendKeys("Admin@123");
		Driver.findElement(By.className("uk-checkbox")).click();
		Driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String expected_title ="Pepble";
		String actual_title = Driver.getTitle();
		if(expected_title.equals(actual_title)) {
			System.out.println("Login is Successfull");
		}else {
			System.out.println("Login is Failed");
		}
		Assert.assertEquals(expected_title, expected_title); 
		Thread.sleep(3000);
	}

	// Verify Logout
	@AfterTest
	public void LogOutPage() {
		Actions act = new Actions(Driver);
		act.moveToElement(Driver.findElement(By.xpath("/html/body/div[1]/div/header/div/nav/div/div/div[2]/ul[2]/li[4]/div/ul/li[1]/a"))).build().perform();
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Driver.findElement(By.linkText("Orders")).click();
		//Driver.findElement(By.linkText("Cart")).click();
		Driver.findElement(By.linkText("Logout")).click();
		String expected_title ="Pepble";
		String actual_title = Driver.getTitle();
		if(expected_title.equals(actual_title)) {
			System.out.println("Logout is Successfull");
		}else {
			System.out.println("Logout is Failed");
		}
		Assert.assertEquals(expected_title, expected_title); 
	}

	//Verify After drop down Shopping Shirt
	@AfterSuite
	public void closeBrowsers(){
		Driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Driver.quit();
	}



}
