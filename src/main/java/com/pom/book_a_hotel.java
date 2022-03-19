package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class book_a_hotel {
	
public static WebDriver driver;
	
	public book_a_hotel(WebDriver driver4)
	{
		this.driver = driver4;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="first_name")
	private WebElement first_name;

	public WebElement getFirst_name() {
		return first_name;
	}

	@FindBy(name = "last_name")
	private WebElement last_name;

	public WebElement getLast_name() {
		return last_name;
	}

	
	

}
