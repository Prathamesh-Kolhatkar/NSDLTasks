package stepDefinitions;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Pages.PaytmPage;
import com.base.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class PaytmMetroCardStepDefinition extends TestBase{
	
	public PaytmMetroCardStepDefinition() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	@Given("User navigate to {string}")
	public void user_navigate_to(String url) {
		
		
	    driver=initialization("TestCase1");
	    
	}

	@When("User clicks on {string} tab")
	public void user_clicks_on_tab(String string) {
	    
		
		
		new PaytmPage(driver).metroTab().click();
	    
	}

	@Then("User Should be able to select {string} in Metro, {string} in Ticket Type and enter {string} card number")
	public void user_should_be_able_to_select_in_metro_in_ticket_type_and_enter_card_number(String metro, String ticketType, String cardNumber) throws InterruptedException {
		
		
		
		new PaytmPage(driver).metroName().sendKeys(metro + Keys.ENTER);
		
		Thread.sleep(4000);
		
		//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//label[text()='Ticket Type']//parent::div/input"))));
		
		new PaytmPage(driver).ticketType().sendKeys(ticketType + Keys.ENTER);
		
		Thread.sleep(4000);
		
		//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//label[text()='Card number']//parent::div/input"))));
		
		new PaytmPage(driver).cardNumber().sendKeys(cardNumber);
	}

	@Then("User click on Get Card balance button")
	public void user_click_on_get_card_balance_button() {
		new PaytmPage(driver).getCardBalBtn().click();
	}

	@SuppressWarnings("deprecation")
	@Then("Paytm Login popup is displayed")
	public void paytm_login_popup_is_displayed() throws InterruptedException {
		
		Thread.sleep(4000);
		
		//driver.switchTo().alert().dismiss();
	  
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		
		Assert.assertTrue(new PaytmPage(driver).getQRCode().isDisplayed());
		
		driver.quit();
		
		
	    
	}

}
