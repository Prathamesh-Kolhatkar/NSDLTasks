package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class PaytmPage {

	
	public WebDriver driver;

	public PaytmPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(xpath="//canvas[@class='qrcode']")
	private WebElement QRCode;
	
	@FindBy(xpath="//label[text()='Metro']//parent::div/input")
	private WebElement metroName;
	
	@FindBy(xpath="//label[text()='Ticket Type']//parent::div/input")
	private WebElement ticketType;
	
	@FindBy(xpath="//label[text()='Card number']//parent::div/input")
	private WebElement cardNumber;
	
	@FindBy(xpath="//button[text()='Get Card Balance']")
	private WebElement getCardBalBtn;
	
	@FindBy(xpath="//img[@alt='Metro']")
	private WebElement metroTab;
	
	public WebElement metroTab()
	{
		return metroTab;
	}
	
	public WebElement metroName()
	{
		return metroName;
	}
	
	public WebElement ticketType()
	{
		return ticketType;
	}
	
	public WebElement cardNumber()
	{
		return cardNumber;
	}
	
	public WebElement getCardBalBtn()
	{
		return getCardBalBtn;
	}
	
	public WebElement getQRCode() {
		
		return QRCode;
	}
}
