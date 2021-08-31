package com.automation;

import org.openqa.selenium.WebDriver;

public class FaceBookLogin extends BaseClass {
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		driver=getDriver("chrome");
		getUrl("https://www.facebook.com/");
		
		
		LoginPageWebElements lp=new LoginPageWebElements(driver);
		setkey(lp.getEmail(),"renujyo2@gmail.com");
		setkey(lp.getPass(),"ttttttt");
		clickElement(lp.getLogin());
		
	}

}
