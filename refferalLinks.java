package com.project.signup;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class refferalLinks extends signupSignin{
	
	// Verifying SignUp page Elements(logos,text fields,text links, )
	public void verifyElementsSignup() {
		driver.findElement(By.className("uk-text-center head-login")).isDisplayed();
		driver.findElement(By.className("uk-flex uk-flex-center soc-login-form")).isDisplayed();
		driver.findElement(By.className("uk-navbar-item uk-logo router-link-active")).isDisplayed();
		driver.findElement(By.linkText("Sign In")).isDisplayed();
	}
	
	// Verifying SignIn page Elements(logos,text fields,text links, )
	public void verifyElementsSignin() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//Display of Pepbel Logo
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/header/div/nav/div/div/div[1]/a[2]/svg")).isDisplayed();
		
		driver.findElement(By.linkText("Boutiques ")).isDisplayed();
	}
}