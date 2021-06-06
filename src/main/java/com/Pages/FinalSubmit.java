package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinalSubmit {
	
	public WebDriver driver;

	public FinalSubmit(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	//Rating = ("//table[@class='evaluateBy']/tbody/tr[1]/td[4]/center/input")
	//text area("//table[@class='evaluateBy']/tbody/tr[1]/td[5]/textarea")

	
	@FindBy(xpath="//*[@id='rating_58']")
	private WebElement firstrowtext;
	
	@FindBy(xpath="//*[@id='comment_58']")
	private WebElement firstcomment;
	
	@FindBy(xpath="//*[@id='rating_59']")
	private WebElement secondrowtext;
	
	@FindBy(xpath="//*[@id='comment_59']")
	private WebElement secondcomment;
	
	@FindBy(xpath="//*[@id='rating_60']")
	private WebElement thirdrowtext;
	
	@FindBy(xpath="//*[@id='comment_60']")
	private WebElement thirdcomment;
	
	@FindBy(xpath="//*[@id='rating_61']")
	private WebElement fourthrowtext;
	
	@FindBy(xpath="//*[@id='comment_61']")
	private WebElement fourthcomment;
	
	@FindBy(xpath="//*[@id='rating_62']")
	private WebElement lastrowtext;
	
	@FindBy(xpath="//*[@id='comment_62']")
	private WebElement lastcomment;
	
	@FindBy(id="reviewEvaluation_hrAdminComments")
	private WebElement finalcomment;
	
	@FindBy(id="reviewEvaluation_finalRating")
	private WebElement finalrating;
	
	@FindBy(id="saveReview360Form_workPeriodStartDate")
	private WebElement datepicker;
	
	@FindBy(id="saveBtn")
	private WebElement savebutton;
	
	
	public void enterCommentsAndSaveData()
	{
		firstrowtext.sendKeys("90");
		firstcomment.sendKeys("test");
		
		secondrowtext.sendKeys("90");
		secondcomment.sendKeys("test");
		
		thirdrowtext.sendKeys("90");
		thirdcomment.sendKeys("test");
		
		fourthrowtext.sendKeys("90");
		fourthcomment.sendKeys("test");
		
		lastrowtext.sendKeys("90");
		lastcomment.sendKeys("test");
		
		finalcomment.sendKeys("Test");
		
		finalrating.sendKeys("90");
		
		datepicker.click();
		
		datepicker.sendKeys("2021-06-03");
		
		savebutton.click();
		
	}
	
	
}
