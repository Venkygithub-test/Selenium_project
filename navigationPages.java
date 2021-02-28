package com.project.signin;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class navigationPages extends loginLogout {

	// Verifying Boutiques link page
	@Test
	public void BoutiquesPage() {
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Boutiques"))).click();
		driver.findElement(By.linkText("Boutiques")).click();
		Set <String> allWindows = driver.getWindowHandles(); 
		for(String handle : allWindows)
		{
			driver.switchTo().window(handle);
		} 
		String expectedURL = "https://pepble.com/#/boutiques";
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		//Assert.assertEquals(actualURL, expectedURL);
		String expectedTitle = "pepble | Boutiques";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		//Assert.assertEquals(actualTitle, expectedTitle);
	}

	// Verifying Women Link Drop Down page
	@Test
	public void WomenPage() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/header/div/nav/div/div/div[2]/ul[1]/div[1]/ul/li/a"))).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//click on drop down Elements
		driver.findElement(By.linkText("Kurtha/Kurthi")).click();
		driver.findElement(By.linkText("Blouse")).click();
		driver.findElement(By.linkText("Salwar/Churidar")).click();
		driver.findElement(By.linkText("Drees Minor Works")).click();
		Thread.sleep(3000);
	}

	// Verify of Men Drop down Page
	@Test
	public void MenPage() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions act2 = new Actions(driver);
		act2.moveToElement(driver.findElement(By.linkText("Men"))).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//click on drop down Elements
		driver.findElement(By.linkText("Shirt")).click();
		driver.findElement(By.linkText("Pant")).click();
	}
		// Verify of ContactUs Page
	@Test
	public void ContactusPage() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Contact Us")).click();
	}


	// Verify of FAQ's Page
	@Test
	public void FaqPage() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("FAQ's")).click();

	}

	// Verify of AboutUs Textlink
	@Test
	public void AboutUs() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("About Us")).click();

	}

	//Verify Customer Support Page Redirection
	@Test
	public void CustomerSupportPageRedirection() {
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Customer Support"))).click();
		driver.findElement(By.linkText("Customer Support")).click();
		Set <String> allWindows = driver.getWindowHandles(); 
		for(String handle : allWindows)
		{
			driver.switchTo().window(handle);
		} 
		String expectedURL = "https://pepble.com/#/";
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		//Assert.assertEquals(actualURL, expectedURL);
		String expectedTitle = "Terms Of Use | pepble";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		//Assert.assertEquals(actualTitle, expectedTitle);
	}

	//Verify TermsofUse Page Redirection
	@Test
	public void TermsofUseRedirection() {
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Terms Of Use"))).click();
		driver.findElement(By.linkText("Terms Of Use")).click();
		Set <String> allWindows = driver.getWindowHandles(); 
		for(String handle : allWindows)
		{
			driver.switchTo().window(handle);
		} 
		String expectedURL = "https://pepble.com/#/termsOfuse";
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		//Assert.assertEquals(actualURL, expectedURL);
		String expectedTitle = "Terms Of Use | pepble";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		//Assert.assertEquals(actualTitle, expectedTitle);
	}

	// Verify privacyPolicy Page Redirection
	@Test
	public void privacyPolicyPageRedirection() {

		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Privacy Policy"))).click();
		//driver.findElement(By.linkText("Privacy Policy")).click();
		Set <String> allWindows = driver.getWindowHandles(); 
		for(String handle : allWindows)
		{
			driver.switchTo().window(handle);
		} 
		String expectedURL = "https://pepble.com/#/privacyPolicy";
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		//Assert.assertEquals(actualURL, expectedURL);
		String expectedTitle = "privacyPolicy | pepble";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		//Assert.assertEquals(actualTitle, expectedTitle);
	}

	//Verify Refund & Shipping Policy Page Redirection
	@Test
	public void RefundShippingPolicyPage() {
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Refund & Shipping Policy"))).click();
		driver.findElement(By.linkText("Refund & Shipping Policy")).click();
		Set <String> allWindows = driver.getWindowHandles(); 
		for(String handle : allWindows)
		{
			driver.switchTo().window(handle);
		} 
		String expectedURL = "https://pepble.com/#/refundAndShippingPolicy";
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		//Assert.assertEquals(actualURL, expectedURL);
		String expectedTitle = "Terms Of Use | pepble";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		//Assert.assertEquals(actualTitle, expectedTitle);
	}

}
