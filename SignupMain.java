package com.project.signup;

import com.project.signin.navigationPages;

public class SignupMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		refferalLinks startbrowser = new refferalLinks();
		startbrowser.openBrowser();
		startbrowser.signUp();
		startbrowser.verifyElementsSignup();
		startbrowser.closeBrowsers();
		startbrowser.verifyElementsSignin();
	}

}
