package com.project.updateprocess;

public class MainUpdated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UploadingAndUpdate startWeb = new UploadingAndUpdate();
		startWeb.openBrowser();
		startWeb.LogInPage();
		//startWeb.Women();
		startWeb.ClickOnKurthakurthi();
		startWeb.UploadImages();
		startWeb.LogOutPage();
		startWeb.closeBrowsers();

	}

}
