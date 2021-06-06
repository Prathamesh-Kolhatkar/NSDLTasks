package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPerformanceReviewsPage {
	
	public WebDriver driver;
	
	public WebDriverWait wait;

	public SearchPerformanceReviewsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	
	@FindBy(id="performanceReview360SearchForm_employeeName")
	private WebElement EmployeeName;
	
	@FindBy(id="performanceReview360SearchForm_jobTitleCode")
	private WebElement JobTitle;
	
	@FindBy(id="performanceReview360SearchForm_status")
	private WebElement Status;
	
	@FindBy(id="fromDate")
	private WebElement FromDate;
	
	@FindBy(id="toDate")
	private WebElement ToDate;
	
	@FindBy(id="performanceReview360SearchForm_reviwerName")
	private WebElement reviewer;
	
	@FindBy(id="btnSearch") 
	private WebElement searchbutton;
	
	@FindBy(xpath="//*[@id='resultTable']/tbody/tr/td[2]")
	private WebElement resultName;
	
	@FindBy(xpath="//a[text()='Evaluate']")
	private WebElement evaluatelink;
	
	@FindBy(xpath="//*[@id='resultTable']/tbody/tr/td")
	private WebElement noresult;
	
	public WebElement EmployeeName() {

		return EmployeeName;
		
		}
	
	public WebElement JobTitle() {

		return JobTitle;
		
		}
	
	public WebElement Status() {

		return Status;
		
		}
	
	public WebElement FromDate() {

		return FromDate;
		
		}
	
	public WebElement ToDate() {

		return ToDate;
		
		}
	
	public WebDriver enterEmployeeDetails(WebDriver driver) throws InterruptedException
	{
		EmployeeName.sendKeys("Rebecca Harmony");
		
		Select s= new Select(JobTitle);
		
		s.selectByVisibleText("QA Engineer");
		
		Select s1= new Select(Status);
		
		s1.selectByVisibleText("Activated");
		
		FromDate.click();   
		FromDate.sendKeys("2019-06-04");
		ToDate.click();   
		ToDate.sendKeys("2021-06-09");
		reviewer.click();
		
		Thread.sleep(3000);
		 //wait.until(ExpectedConditions.elementToBeClickable(searchbutton));
		searchbutton.click();
		Thread.sleep(3000);
		if (noresult.getText().contains("No Records Found"))
			
		{  	
			EmployeeName.click();
			EmployeeName.clear();
			EmployeeName.sendKeys("Cecil Bonaparte");
			s.selectByVisibleText("All");
			s1.selectByVisibleText("All");
			reviewer.click();
			
			Thread.sleep(3000);
			searchbutton.click();
			evaluatelink.click();
		}
			
		else if(resultName.getText().equalsIgnoreCase("Rebecca Harmony"))
		{
			
			evaluatelink.click();
		}
		
		
		return driver;
		
	}
	
	
	
	
}
