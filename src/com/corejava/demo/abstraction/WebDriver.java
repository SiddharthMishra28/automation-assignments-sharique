package com.corejava.demo.abstraction;

public interface WebDriver {
	
	public void launchBrowser(String browserType);
	
	public void navigate(String url);
	
	public void clickElement(String elementType);
	
	public void sendKeys(String elementType, String text);
}
