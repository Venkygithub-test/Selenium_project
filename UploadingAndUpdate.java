package com.project.updateprocess;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class UploadingAndUpdate extends SupportDriver {

	public void ClickOnKurthakurthi() {
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/header/div/nav/div/div/div[2]/ul[1]/div[1]/ul/li/a"))).build().perform();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//click on drop down Elements
			driver.findElement(By.linkText("Kurtha/Kurthi")).click();
			act.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/main/section/div/div[2]/div/div/div/div/a/div/div/label/div[1]/div/div"))).click().build().perform();
			driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div[2]/div/button")).click();
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// driver.findElement(By.xpath("//lable[text() = 'Get this stitched as it is']")).click();
		
		Actions act1 = new Actions(driver);
		act1.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/main/section/div/div/fieldset[1]/section/div/div[2]/div/div[2]/div/label"))).click();
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	}
	public void UploadImages() {
    driver.findElement(By.xpath("//*[@id=\"option.id\"]")).sendKeys("C:\\Users\\Venkatesh\\Downloads\\great-vibes\\GreatVibes-Regular");
	//driver.findElement(By.xpath("//*[@id=\"option.id\"]")).sendKeys("C:\\Users\\Venkatesh\\Desktop\photo-1483985988355-763728e1935b");
	driver.findElement(By.cssSelector("div.uk-padding-small:nth-child(3) > label:nth-child(2)")).click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("/html/body/div[1]/div/main/section/div/div/fieldset[2]/section/div[1]/div[4]/div/div/div[2]/div/div/div[2]/div/div/label")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div/main/section/div/div/fieldset[2]/section/div[1]/div[5]/div/div/div[1]/div[2]/div[1]/label")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div/main/section/div/div/fieldset[2]/section/div[1]/div[6]/div/div/div[1]/div[2]/div[1]/label")).click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("/html/body/div[1]/div/main/section/div/div/fieldset[2]/section/div[1]/div[6]/div/div/div[2]/div/div/div[1]/div/div/label")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div/main/section/div/div/fieldset[2]/section/div[1]/div[6]/div/div/div[4]/div/section/div[2]/div/div/ul/li[2]/div/label/div/div[1]/div")).click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("/html/body/div[1]/div/main/section/div/div/fieldset[2]/section/div[1]/div[7]/div/div/div[1]/div[2]/div[1]/label")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div/main/section/div/div/fieldset[2]/section/div[1]/div[8]/div[2]/textarea")).sendKeys("Hi");
	
	}
	
	

}
