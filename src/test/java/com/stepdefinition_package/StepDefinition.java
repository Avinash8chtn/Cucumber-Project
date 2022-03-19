package com.stepdefinition_package;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Cucumber_Base_Class.base_class;
import com.pom.Login_adacitin;
import com.pom.Search_adacitin;
import com.pom.select_hotel_adacitin;
import com.runner_package.Test_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends base_class{
	
	public static WebDriver driver = Test_Runner.driver;
	
	public static Login_adacitin l = new Login_adacitin(driver);
	
	public static Search_adacitin s = new Search_adacitin(driver);
	
	public static select_hotel_adacitin se = new select_hotel_adacitin(driver);

	//private WebElement location;
	
	@Given("^user Launches The Application$")
	public void user_Launches_The_Application() throws Throwable {
	    
		getUrl("https://adactinhotelapp.com/");
		
	}

	@When("^user Enters The \"([^\"]*)\" In Username Field$")
	public void user_Enters_The_In_Username_Field(String username) throws Throwable {
		
		inputValue(l.getUsername() , username);
		assertEquals(true, true);
	    
	}

	@When("^user Enters The \"([^\"]*)\" In Password Field$")
	public void user_Enters_The_In_Password_Field(String password) throws Throwable {
		
		inputValue(l.getPassword() , password);
		assertEquals(true, true);
	}

	@Then("^user Click On The Login Button And Navigate To Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_Navigate_To_Search_Hotel_Page() throws Throwable {
	   
		clickOnElement(l.getLogin_btn());
		
	}
	
	@When("^user Search For Location$")
	public void user_Search_For_Location() throws Throwable {
	    
		Thread.sleep(5000);
		Select sel = new Select(s.getLocation());
		
		sel.selectByValue("Melbourne");
	}

	
	@When("^user Search for Hotels$")
	public void user_Search_for_Hotels() throws Throwable {
		
		Select sel2 = new Select(s.getHotels());
		
		sel2.selectByValue("Hotel Sunshine");
	    
		
	}

	@When("^user Search for Room Type$")
	public void user_Search_for_Room_Type() throws Throwable {
		
		Select sel3 = new Select(s.getRoom_type());
		
		sel3.selectByValue("Deluxe");
	    
	}

	@When("^user Search for Number Of Rooms$")
	public void user_Search_for_Number_Of_Rooms() throws Throwable {
		
		Select sel4 = new Select(s.getRoom_nos());
		
		sel4.selectByValue("2");
	    
	}

	@When("^user Check In Date$")
	public void user_Check_In_Date() throws Throwable {
		
		inputValue(s.getDate(), "08/03/2022");
	    
	}

	@When("^user Check Out Date$")
	public void user_Check_Out_Date() throws Throwable {
		
		inputValue(s.getDate_out(), "09/03/2022");
	    
	}

	@When("^adults Per Room$")
	public void adults_Per_Room() throws Throwable {
		
		Select sel5 = new Select(s.getAdult_room());
		
		sel5.selectByValue("4");
	    
	}

	@When("^children Per Room$")
	public void children_Per_Room() throws Throwable {
	    
		Select sel6 = new Select(s.getChild_room());
		
		sel6.selectByValue("2");
	}

	@Then("^user Click On Search$")
	public void user_Click_On_Search() throws Throwable {
		
		clickOnElement(s.getSubmit());
	}
	
	@When("^user Select For Hotel$")
	public void user_Select_For_Hotel() throws Throwable {
		
		clickOnElement(se.getRadio());
	    
	}

	@Then("^user Click On Continue Button$")
	public void user_Click_On_Continue_Button() throws Throwable {
		
		
		clickOnElement(se.getContinue_btn());
	}
	

}
