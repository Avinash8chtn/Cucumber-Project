package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class select_hotel_adacitin {
	
	
public static WebDriver driver;
	
	public select_hotel_adacitin(WebDriver driver4)
	{
		this.driver = driver4;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css ="input#radiobutton_0")
	private WebElement radio;

	public WebElement getRadio() {
		return radio;
	}

	@FindBy(css = "input#continue")
	private WebElement continue_btn;

	public WebElement getContinue_btn() {
		return continue_btn;
	}

}
