Feature: Hotel Booking In Adacitin Application

 
Scenario Outline: Login

Given user Launches The Application
When user Enters The "<Username>" In Username Field
And user Enters The "<Password>" In Password Field
Then user Click On The Login Button And Navigate To Search Hotel Page

Examples:

|Username|Password|
|avinash8|U9C4M1|

Scenario: search page

When user Search For Location
And user Search for Hotels
And user Search for Room Type
And user Search for Number Of Rooms
And user Check In Date
And user Check Out Date
And adults Per Room
And children Per Room
Then user Click On Search

Scenario: select hotel

When user Select For Hotel
Then user Click On Continue Button

