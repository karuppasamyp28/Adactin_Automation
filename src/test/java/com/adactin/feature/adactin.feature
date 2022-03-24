Feature: Hotel Booking In Adacting Application


Scenario: Login Function
Given user Launches The Application
When user  Enters The Usernamee In UsernameField
And user Enters The Password In PasswordField
Then user Clicks The Login Button And It Navigates To The Search Hotel Page

Scenario: search Hotel
Given user Selects The Location
Then user Selects The Hotel
And user Selects RoomType
And user Selects Number Of Rooms Required
And user Enters The Checkin Date
And user Enters The Checkout Date
And user Selects Number Of Adult Rooms
And user Enters NUmber Of Children
Then user Clicks The Search Button And It Navigates To the Hotel page
