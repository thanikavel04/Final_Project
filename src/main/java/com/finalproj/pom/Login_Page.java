package com.finalproj.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	public WebDriver driver;
	
	@FindBy(id="username")
	private WebElement user_name;
	
	@FindBy(id="password")
	private WebElement pwd;
	
	@FindBy(id="login")
	private WebElement login_btn;

	public Login_Page(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getUser_name() {
		return user_name;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLogin_btn() {
		return login_btn;
	}
	
	

}
