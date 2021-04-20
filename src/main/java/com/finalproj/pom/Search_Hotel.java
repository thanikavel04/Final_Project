package com.finalproj.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	public WebDriver driver;
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement roomType;

	public Search_Hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);

	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSearch_btn() {
		return search_btn;
	}

	@FindBy(id="room_nos")
	private WebElement roomno;

	@FindBy(id="datepick_in")
	private WebElement checkin;

	@FindBy(id="datepick_out")
	private WebElement checkout;

	@FindBy(id="adult_room")
	private WebElement adultroom;

	@FindBy(id="child_room")
	private WebElement childroom;

	@FindBy(id="Submit")
	private WebElement search_btn;


}
