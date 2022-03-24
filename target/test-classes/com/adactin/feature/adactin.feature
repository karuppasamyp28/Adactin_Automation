Feature: Hotel Booking In Adacting Application


Scenario Outline: Login Function
Given user Launches The Application
When user Enters The "<Username>" In Username Field
And user Enters The "<Password>" In Password Field
Then user Clicks The Login Button And It Navigates To The Search Hotel Page
Examples:
|Username|Password|
|karuppasamyp28|karuppu28|

