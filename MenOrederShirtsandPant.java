package com.project.orderprocess;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MenOrederShirtsandPant extends SupportedLogin {

	//Verify Navigation To shirt
	@BeforeTest
	public void navigateToShoppingShirt()  {
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions act = new Actions(Driver);
		act.moveToElement(Driver.findElement(By.linkText("Men"))).build().perform();
		//click on drop down Elements
		Driver.findElement(By.linkText("Shirt")).click();
		//driver.findElement(By.cssSelector(".uk-overlay-primary")).click();		
		act.moveToElement(Driver.findElement(By.xpath("/html/body/div[1]/div/main/section/div/div[2]/div/div/div/div/a/div"))).click().build().perform();
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div[2]/div/button")).click();
	}
	
	// Verify Customer Selected Shirts and Pants
    @Test
	public void CustomizeRadioBtns() {

		// Selecting Options Customize or Get this stitched as it is
		Driver.findElement(By.xpath("/html/body/div[1]/div/main/section/div/div/fieldset[1]/section/div/div[2]/div/div[2]/div/label")).click();
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// driver.findElement(By.xpath("//lable[text() = 'Get this stitched as it is']")).click();
		Driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		Actions act = new Actions(Driver);
		act.moveToElement(Driver.findElement(By.xpath("/html/body/div[1]/div/main/section/div/div/fieldset[2]/section/div[1]/div[1]/div/div/section/div[2]/div/div/ul/li[2]/div/label/div/div[1]/div"))).click();
		Driver.findElement(By.xpath("/html/body/div[1]/div/main/section/div/div/fieldset[2]/section/div[1]/div[2]/div/div/div[1]/div[2]/div[1]/label")).click();
		Driver.findElement(By.xpath("/html/body/div[1]/div/main/section/div/div/fieldset[2]/section/div[1]/div[4]/div/div/div[1]/div[2]/div[2]/label")).click();
		Driver.findElement(By.xpath("/html/body/div[1]/div/main/section/div/div/fieldset[2]/section/div[1]/div[5]/div/div/div[1]/div[2]/div[1]/label")).click();
		Driver.findElement(By.xpath("/html/body/div[1]/div/main/section/div/div/fieldset[2]/section/div[1]/div[6]/div[2]/textarea")).sendKeys("Nice Short"); 
		Driver.findElement(By.xpath("//*[@id=\"step2continue\"]")).click();
		Driver.findElement(By.xpath("/html/body/div[1]/div/main/section/div/div/fieldset[3]/section/div[1]/div[2]/div/div/div/div/div/div[2]/div/button")).click();
	}
	
	// Verify Calender Datepicker
	@Test
	public void CalenderDatepicker() throws InterruptedException {
		Driver.findElement(By.xpath("/html/body/div[1]/div/main/section/div/div/fieldset[3]/section/div[1]/div[1]/div/div[2]/div[1]/div[1]")).click();
		Driver.findElement(By.cssSelector("div.vdatetime-year-picker__item:nth-child(101)")).click();
		Driver.findElement(By.cssSelector(".vdatetime-popup__date")).click();
		Driver.findElement(By.cssSelector("div.vdatetime-month-picker__item:nth-child(3)")).click();
		Driver.findElement(By.cssSelector("div.vdatetime-popup__actions__button:nth-child(2)")).click();
		Driver.findElement(By.cssSelector("div.vdatetime-calendar__month__day:nth-child(29) > span:nth-child(1) > span:nth-child(1)")).click();
		Driver.findElement(By.cssSelector("div.vdatetime-popup__actions__button:nth-child(2)")).click();
		Thread.sleep(3000);
	}
	
	// Verify the order finish
	@Test
	public void OdertoFinisht() {
		Driver.findElement(By.cssSelector("div.uk-padding-small:nth-child(3) > label:nth-child(2)")).click();
		Driver.findElement(By.xpath("/html/body/div[1]/div/main/section/div/div/fieldset[3]/section/div[2]")).click();

	}
	// Verify the Payment Of Order
	@Test
	public void proceedTopay() throws IOException {
		//Driver.findElement(By.xpath("/html/body/div[1]/div/main/section/div/div/fieldset[4]/div/div[3]/div[2]/button")).click();
		Driver.findElement(By.cssSelector("div.uk-visible\\@m:nth-child(4) > div:nth-child(2) > button:nth-child(1)")).click();
		TakesScreenshot Srcshot = ((TakesScreenshot) Driver);
		File Srcfile = Srcshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Srcfile, new File("C:\\Users\\Venkatesh\\Desktop\\Selenium_project\\Springr\\ScreenShoots.png"));
	}
	
	// Verify the Details of Order
	@Test
	public void OpderPlace() {
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Driver.findElement(By.xpath("/html/body/div[1]/div/div/main/section/div/div[3]/button")).click();
	}
	
	// Verify procced to Check out
	@Test
	public void ProceedToCheckout() throws InterruptedException {

		Driver.findElement(By.xpath("/html/body/div[1]/div/div/form/fieldset/div[1]/div[1]/div/div[1]/div/div/input")).sendKeys("raj");
		Driver.findElement(By.xpath("/html/body/div[1]/div/div/form/fieldset/div[1]/div[1]/div/div[2]/div/div/input")).sendKeys("raj");
		Driver.findElement(By.xpath("/html/body/div[1]/div/div/form/fieldset/div[1]/div[2]/div/input")).sendKeys("raj@gmail.com");
		Driver.findElement(By.xpath("/html/body/div[1]/div/div/form/fieldset/div[1]/div[3]/div/input")).sendKeys("newyork");
		Driver.findElement(By.xpath("/html/body/div[1]/div/div/form/fieldset/div[1]/div[4]/div/input")).sendKeys("newyork");
		Driver.findElement(By.xpath("/html/body/div[1]/div/div/form/fieldset/div[1]/div[5]/div/div[2]/div/div/input")).sendKeys("022556");
		Driver.findElement(By.xpath("/html/body/div[1]/div/div/form/fieldset/div[2]/button")).click();
		Thread.sleep(3000);
	}
	
	//Verify the OrderRcorded in cart
	@Test
		public void verifyOrderRcorded(String expectedResult) {

			List<WebElement> orderList = Driver.findElements(By.xpath("/html/body/div[1]/div/header/div/nav/div/div/div[2]/ul[2]/div/ul/li[2]/a"));
			int i;
			String actualResult = null;
			boolean result = false;

			for (i = 0; i < orderList.size(); i++) {

				actualResult = orderList.get(i).getText();

				if (actualResult.equals(expectedResult)) {
					result = true;
					break;
				}
			}

			if (result) {

				System.out.println(actualResult + " is matching with " + expectedResult + "-->Test Pass");

			} else {

				System.out.println(actualResult + " is not matching with " + expectedResult + "-->Test Fail");

			}
		}
		
}
