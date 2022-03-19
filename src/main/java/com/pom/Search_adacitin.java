package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_adacitin {
	
	public static WebDriver driver;
	
	public Search_adacitin(WebDriver driver3)
	{
		this.driver = driver3;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(css = "select#location")
	private WebElement location;

	public WebElement getLocation() {
		return location;
	}
	
	@FindBy(css="select#hotels")
	private WebElement hotels;

	public WebElement getHotels() {
		return hotels;
	}

	@FindBy(css="select#room_type")
	private WebElement room_type;

	public WebElement getRoom_type() {
		return room_type;
	}

	@FindBy(css="select#room_nos")
	private WebElement room_nos;

	public WebElement getRoom_nos() {
		return room_nos;
	}

	@FindBy(css="input#datepick_in")
	private WebElement datein;

	public WebElement getDate() {
		return datein;
	}
	
	
	@FindBy(id="datepick_out")
	private WebElement date_out;

	public WebElement getDate_out() {
		return date_out;
	}

	@FindBy(css="select#adult_room")
	private WebElement adult_room;

	public WebElement getAdult_room() {
		return adult_room;
	}

	@FindBy(css="select#child_room")
	private WebElement child_room;

	public WebElement getChild_room() {
		return child_room;
	}


	@FindBy(css="input#Submit")
	private WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}

	
	
	}
