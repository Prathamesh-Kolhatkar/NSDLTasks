package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMLoginPage {
	
	public WebDriver driver;

	public OrangeHRMLoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	
	@FindBy(id="txtUsername")
	private WebElement Username;
	
	@FindBy(id="txtPassword")
	private WebElement Password;
	
	@FindBy(id="btnLogin")
	private WebElement LoginButton;


	public WebElement Username() {

		return Username;

	}

	public WebElement Password() {
		return Password;
	}

	public WebElement LoginButton() {
		return LoginButton;
	}

}
