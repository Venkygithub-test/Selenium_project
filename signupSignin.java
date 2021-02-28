package com.project.signup;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class signupSignin {

	// Browser's open configuration
	WebDriver driver;
	
	// Open Browser connection
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
	
	//Verifying SignUp page
	public void signUp() throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"app\"]/div/header/div/nav/div/div/div[2]/ul[2]/li[4]/div/ul/li[1]/a"))).build().perform();
		//WebDriverWait wait = new WebDriverWait(driver,60);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Login/Signup")));
		driver.findElement(By.linkText("Signup")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/section/div/div[2]/form/fieldset/div[1]/div[1]/input")).sendKeys("Venkatesh");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/section/div/div[2]/form/fieldset/div[1]/div[2]/input")).sendKeys("9943402771");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/section/div/div[2]/form/fieldset/div[2]/div/input")).sendKeys("venkateshburgula69@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/section/div/div[2]/form/fieldset/div[3]/div/input")).sendKeys("Admin@123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/section/div/div[2]/form/fieldset/div[4]/div/input")).sendKeys("Admin@123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/section/div/div[2]/form/fieldset/div[5]/button")).click();
		//System.out.print("The message is: " + driver.findElement(By.className("uk-text-danger")));
	}
	// Verify close Browser
	public void closeBrowsers(){
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.quit();
	}
	
}


