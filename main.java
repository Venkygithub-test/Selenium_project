package com.project.signin;

public class main {

	public static void main(String[] args) throws InterruptedException {
		
		//process of open browser to login and sign up
		
		navigationPages startbrowser = new navigationPages();
		startbrowser.openBrowser();
		startbrowser.LogInPage();
		startbrowser.BoutiquesPage();
		startbrowser.WomenPage();
		startbrowser.MenPage();
		startbrowser.ContactusPage();
		startbrowser.FaqPage();
		startbrowser.AboutUs();
		startbrowser.CustomerSupportPageRedirection();
		startbrowser.TermsofUseRedirection();
		startbrowser.privacyPolicyPageRedirection();
		startbrowser.RefundShippingPolicyPage();
		startbrowser.LogOutPage();
		startbrowser.closeBrowsers();
	}

}
