package com.max.ObjectRepo;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class StoreLocatorPage {

	AndroidDriver driver;
	public StoreLocatorPage() {
		PageFactory.initElements( driver, this);
	}
	
	public void store() {

	}
}
