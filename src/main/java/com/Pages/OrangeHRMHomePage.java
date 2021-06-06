package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMHomePage {
	
	public WebDriver driver;

	public OrangeHRMHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(id="menu__Performance")
	private WebElement Performance;
	
	@FindBy(id="menu_performance_ManageReviews")
	private WebElement ManageReviews;
	
	@FindBy(id="menu_performance_searchPerformancReview")
	private WebElement ManageReviews2;
	
	



public WebElement Performance() {

	return Performance;
	
	}

public WebElement ManageReviews() {

	return ManageReviews;
	
	}

public WebElement ManageReviews2() {

	return ManageReviews2;
	
	}

}



