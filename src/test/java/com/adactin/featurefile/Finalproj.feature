Feature: Hotel booking in Adactin Application 


Scenario: 
Given user Launch The Application 
When user Enter The username in username Textbox 
And user Enter The password in Password Textbox 
Then user Click On Login Button and It Navigates To Select Hotel Page 
	
Scenario: 

When user Select The Location 
And user Select The Hotels 
And user Select The RoomType 
And user Select The NoOfRooms 
And user Select The CheckInDate 
And user Select The CheckOutDate 
And user Select The childrenPerRoom 
And user Select The AdultPerRoom 
Then user Click on Search Button and It Navigates To Select Hotel Page
	
	
Scenario: 

When user Select The Hotel 
Then user Click On Continue Button and It navigates to BookHotel Page 
	
Scenario: 
When user Enter The FirstName on TextBox 
And user Enter The LastName on TextBox 
And user Enter The Address on TextBox 
And user Enter The CreditNo on TextBox 
And user Select The CreditCard Type 
And user Select The ExpiryMonth 
And user Select The ExpiryYear 
And user Enter The CVV Number on TextBox 
Then user click On BookNow Button and It Navigates To ConfirmationBooking 
	
Scenario: 

Then user Click on The My Itinerary Button And It Navigates to Booked Itinerary Page 
	
Scenario: 

Then user Click on Logout Button 
	
	
	
	