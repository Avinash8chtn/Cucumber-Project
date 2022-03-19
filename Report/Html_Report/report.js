$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adacitin Application",
  "description": "",
  "id": "hotel-booking-in-adacitin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Login",
  "description": "",
  "id": "hotel-booking-in-adacitin-application;login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "user Launches The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enters The \"\u003cUsername\u003e\" In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Enters The \"\u003cPassword\u003e\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user Click On The Login Button And Navigate To Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adacitin-application;login;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 13,
      "id": "hotel-booking-in-adacitin-application;login;;1"
    },
    {
      "cells": [
        "avinash8",
        "U9C4M1"
      ],
      "line": 14,
      "id": "hotel-booking-in-adacitin-application;login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Login",
  "description": "",
  "id": "hotel-booking-in-adacitin-application;login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "user Launches The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enters The \"avinash8\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Enters The \"U9C4M1\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user Click On The Login Button And Navigate To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Launches_The_Application()"
});
formatter.result({
  "duration": 8449518400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "avinash8",
      "offset": 17
    }
  ],
  "location": "StepDefinition.user_Enters_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 4724212800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "U9C4M1",
      "offset": 17
    }
  ],
  "location": "StepDefinition.user_Enters_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 3113766100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_On_The_Login_Button_And_Navigate_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 8510654600,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "search page",
  "description": "",
  "id": "hotel-booking-in-adacitin-application;search-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "user Search For Location",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user Search for Hotels",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Search for Room Type",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Search for Number Of Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Check In Date",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Check Out Date",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "adults Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "children Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user Click On Search",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Search_For_Location()"
});
formatter.result({
  "duration": 5348074900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Search_for_Hotels()"
});
formatter.result({
  "duration": 95982100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Search_for_Room_Type()"
});
formatter.result({
  "duration": 113515300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Search_for_Number_Of_Rooms()"
});
formatter.result({
  "duration": 101302900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Check_In_Date()"
});
formatter.result({
  "duration": 3075345600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Check_Out_Date()"
});
formatter.result({
  "duration": 3082516700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.adults_Per_Room()"
});
formatter.result({
  "duration": 65527500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.children_Per_Room()"
});
formatter.result({
  "duration": 65547100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_On_Search()"
});
formatter.result({
  "duration": 4242053400,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "select hotel",
  "description": "",
  "id": "hotel-booking-in-adacitin-application;select-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 30,
  "name": "user Select For Hotel",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "user Click On Continue Button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Select_For_Hotel()"
});
formatter.result({
  "duration": 3081696800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_On_Continue_Button()"
});
formatter.result({
  "duration": 3670110800,
  "status": "passed"
});
});