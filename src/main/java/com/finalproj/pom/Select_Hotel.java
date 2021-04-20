package com.finalproj.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	
public WebDriver driver;
	
	
	public Select_Hotel(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	
	}

	public WebElement getRadio_btn() {
		return radio_btn;
	}

	public WebElement getContinue_btn() {
		return continue_btn;
	}

	@FindBy(id="radiobutton_0")
	private WebElement radio_btn;
	
	@FindBy(id="continue")
	private WebElement continue_btn;

}
