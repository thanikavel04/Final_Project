package com.project.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Sleeper;

import com.baseclass.proj.BaseClass;
import com.finalproj.pom.Book_Hotel;
import com.finalproj.pom.Booking_Confirmation;
import com.finalproj.pom.Login_Page;
import com.finalproj.pom.Logout_Page;
import com.finalproj.pom.Search_Hotel;
import com.finalproj.pom.Select_Hotel;
import com.project.testrunner.Test_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends BaseClass {
	
	public static WebDriver driver= Test_Runner.driver;

	
	public static Login_Page login = new Login_Page(driver);

	public static Search_Hotel search = new Search_Hotel(driver);

	
	public static Select_Hotel select = new Select_Hotel(driver);

	public static Book_Hotel book = new Book_Hotel(driver);
	
	public static Booking_Confirmation confirm=new Booking_Confirmation(driver);
	
	public static Logout_Page log=new Logout_Page(driver);

	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		getUrl("http://adactinhotelapp.com/");

	}

	@When("^user Enter The username in username Textbox$")
	public void user_Enter_The_username_in_username_Textbox() throws Throwable {
		inputvaluemethod(login.getUser_name(), "Thanikavk");
	}

	@When("^user Enter The password in Password Textbox$")
	public void user_Enter_The_password_in_Password_Textbox() throws Throwable {
		inputvaluemethod(login.getPwd(), "5U273C");

	}

	@Then("^user Click On Login Button and It Navigates To Select Hotel Page$")
	public void user_Click_On_Login_Button_and_It_Navigates_To_Select_Hotel_Page() throws Throwable {

		clickonelement(login.getLogin_btn());
	}

	@When("^user Select The Location$")
	public void user_Select_The_Location() throws Throwable {

		dropdownselect(search.getLocation(), "byIndex", "2");
	}

	@When("^user Select The Hotels$")
	public void user_Select_The_Hotels() throws Throwable {

		dropdownselect(search.getHotels(), "byIndex", "3");

	}

	@When("^user Select The RoomType$")
	public void user_Select_The_RoomType() throws Throwable {

		dropdownselect(search.getRoomType(), "byIndex", "2");

	}

	@When("^user Select The NoOfRooms$")
	public void user_Select_The_NoOfRooms() throws Throwable {

		dropdownselect(search.getRoomType(), "byIndex", "3");
	}

	@When("^user Select The CheckInDate$")
	public void user_Select_The_CheckInDate() throws Throwable {


		inputvaluemethod(search.getCheckin(), "18/04/2021");
	}

	@When("^user Select The CheckOutDate$")
	public void user_Select_The_CheckOutDate() throws Throwable {

		inputvaluemethod(search.getCheckout(),  "18/04/2021");

	}

	@When("^user Select The childrenPerRoom$")
	public void user_Select_The_childrenPerRoom() throws Throwable {

		dropdownselect(search.getChildroom(), "byIndex", "2");

	}

	@When("^user Select The AdultPerRoom$")
	public void user_Select_The_AdultPerRoom() throws Throwable {

		dropdownselect(search.getAdultroom(), "byIndex", "3");
		
		
	}

	@Then("^user Click on Search Button and It Navigates To Select Hotel Page$")
	public void user_Click_on_Search_Button_and_It_Navigates_To_Select_Hotel_Page() throws Throwable {

		clickonelement(search.getSearch_btn());
	
	}
	

	
	@When("^user Select The Hotel$")
	public void user_Select_The_Hotel() throws Throwable {

		clickonelement(select.getRadio_btn());

	}

	@Then("^user Click On Continue Button and It navigates to BookHotel Page$")
	public void user_Click_On_Continue_Button_and_It_navigates_to_BookHotel_Page() throws Throwable {

		clickonelement(select.getContinue_btn());

	}

	@When("^user Enter The FirstName on TextBox$")
	public void user_Enter_The_FirstName_on_TextBox() throws Throwable {

		inputvaluemethod(book.getFname(), "goutham");

	}

	@When("^user Enter The LastName on TextBox$")
	public void user_Enter_The_LastName_on_TextBox() throws Throwable {

		inputvaluemethod(book.getLname(), "moh");
	}

	@When("^user Enter The Address on TextBox$")
	public void user_Enter_The_Address_on_TextBox() throws Throwable {
		inputvaluemethod(book.getAddress(), "thayjhsfu");

	}

	@When("^user Enter The CreditNo on TextBox$")
	public void user_Enter_The_CreditNo_on_TextBox() throws Throwable {

		inputvaluemethod(book.getCredit_No(), "1254478558966523");
	
	}

	@When("^user Select The CreditCard Type$")
	public void user_Select_The_CreditCard_Type() throws Throwable {

		dropdownselect(book.getCard_Type(), "byIndex", "2");
	
	}

	@When("^user Select The ExpiryMonth$")
	public void user_Select_The_ExpiryMonth() throws Throwable {

		dropdownselect(book.getExp_Month(), "byIndex", "2");
	}

	@When("^user Select The ExpiryYear$")
	public void user_Select_The_ExpiryYear() throws Throwable {

		dropdownselect(book.getExp_Yr(), "byValue", "2021");
	
	}

	@When("^user Enter The CVV Number on TextBox$")
	public void user_Enter_The_CVV_Number_on_TextBox() throws Throwable {

		inputvaluemethod(book.getCcv_No(), "458");
	
	}

	@Then("^user click On BookNow Button and It Navigates To ConfirmationBooking$")
	public void user_click_On_BookNow_Button_and_It_Navigates_To_ConfirmationBooking() throws Throwable {

	clickonelement(book.getBook_Now());	
	sleep(10000);
		
	
	}

	@Then("^user Click on The My Itinerary Button And It Navigates to Booked Itinerary Page$")
	public void user_Click_on_The_My_Itinerary_Button_And_It_Navigates_to_Booked_Itinerary_Page() throws Throwable {

		clickonelement(confirm.getItinerary_btn());
		sleep(3000);
	}
	
	@Then("^user Click on Logout Button$")
	public void user_Click_on_Logout_Button() throws Throwable {

		clickonelement(log.getLogout_btn());
	
	}



}
