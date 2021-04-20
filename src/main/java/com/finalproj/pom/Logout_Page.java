package com.finalproj.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_Page {
	
	public WebDriver driver;
	
	@FindBy(id="logout")
	private WebElement logout_btn;

	public Logout_Page(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	
	}

	public WebElement getLogout_btn() {
		return logout_btn;
	}

}
