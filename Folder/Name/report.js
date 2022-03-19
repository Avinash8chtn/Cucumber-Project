$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adacitin Application",
  "description": "",
  "id": "hotel-booking-in-adacitin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login",
  "description": "",
  "id": "hotel-booking-in-adacitin-application;login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user Launches The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enters The Username In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enters The Password In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And Navigate To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Launches_The_Application()"
});
formatter.result({
  "duration": 4179628000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enters_The_Username_In_Username_Field()"
});
formatter.result({
  "duration": 3594286200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enters_The_Password_In_Password_Field()"
});
formatter.result({
  "duration": 3081816900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_On_The_Login_Button_And_Navigate_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 4869703200,
  "status": "passed"
});
});