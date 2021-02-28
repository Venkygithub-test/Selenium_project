package com.project.orderprocess;

import java.io.IOException;

public class MainOrderFuction {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		MenOrederShirtsandPant Start = new MenOrederShirtsandPant();
		Start.openBrowser();
		Start.LogInPage();
		Start.navigateToShoppingShirt();
		Start.CustomizeRadioBtns();
		Start.CalenderDatepicker();
		Start.OdertoFinisht();
		Start.proceedTopay();
		Start.OpderPlace();
	    Start.ProceedToCheckout();
		//String expectedResult = null;
		//Start.verifyOrderRcorded(expectedResult);
		Start.LogOutPage();
		Start.closeBrowsers();
		

	}

}
