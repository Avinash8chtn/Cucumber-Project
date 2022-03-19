package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_adacitin {
	
	public static WebDriver driver;
	
	public Login_adacitin(WebDriver driver2)
	{
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#username")
    private WebElement username;

	public WebElement getUsername() {
		return username;
	}
	
	@FindBy(css = "#password")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(css = "#login")
	private WebElement login_btn;

	public WebElement getLogin_btn() {
		return login_btn;
	}

	

}
