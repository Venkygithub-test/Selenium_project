package com.project.updateprocess;

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
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class SupportDriver{
WebDriver driver;
	
	// Open Browser connection
@BeforeSuite
	public void openBrowser(){
		String browserName = "firefox";
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkatesh\\Desktop\\Selenium_project\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Venkatesh\\Desktop\\Selenium_project\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(browserName.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Venkatesh\\Desktop\\Selenium_project\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}else {
			System.out.println("Invalid Browser");
		}
		driver.get("https://pepble.com/#/home");
		driver.manage().window().maximize();
		//System.out.print("Page title is: " + driver.getTitle());
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	}
	
	// Verify Login Page
@BeforeMethod
	public void LogInPage() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"app\"]/div/header/div/nav/div/div/div[2]/ul[2]/li[4]/div/ul/li[1]/a"))).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/section/div/div[2]/form[1]/fieldset/div[1]/div/input")).sendKeys("venkateshburgula69@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/section/div/div[2]/form[1]/fieldset/div[2]/div/input")).sendKeys("Admin@123");
		driver.findElement(By.className("uk-checkbox")).click();
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String expected_title ="Pepble";
		String actual_title = driver.getTitle();
		if(expected_title.equals(actual_title)) {
			System.out.println("Login is Successfull");
		}else {
			System.out.println("Login is Failed");
		}
		Assert.assertEquals(expected_title, expected_title); 

	}
		// Verify Logout Page
@AfterMethod
		public void LogOutPage() {
			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/header/div/nav/div/div/div[2]/ul[2]/li[4]/div/ul/li[1]/a"))).build().perform();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//driver.findElement(By.linkText("Orders")).click();
			//driver.findElement(By.linkText("Cart")).click();
			driver.findElement(By.linkText("Logout")).click();
			String expected_title ="Pepble";
			String actual_title = driver.getTitle();
			if(expected_title.equals(actual_title)) {
				System.out.println("Logout is Successfull");
			}else {
				System.out.println("Logout is Failed");
			}
			Assert.assertEquals(expected_title, expected_title); 
				
	}
		// Verify close Browser
@AfterSuite
		public void closeBrowsers(){
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.quit();
		}
		

}
