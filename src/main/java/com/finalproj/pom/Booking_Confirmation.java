package com.finalproj.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirmation {

	public WebDriver driver;
	
	@FindBy(id="my_itinerary")
	private WebElement Itinerary_btn;

	public Booking_Confirmation(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	
	}

	public WebElement getItinerary_btn() {
		return Itinerary_btn;
	}
	
	
	
}
