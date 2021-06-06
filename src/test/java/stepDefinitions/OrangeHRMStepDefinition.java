package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;

import com.Pages.FinalSubmit;
import com.Pages.OrangeHRMHomePage;
import com.Pages.OrangeHRMLoginPage;
import com.Pages.SearchPerformanceReviewsPage;
import com.base.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRMStepDefinition extends TestBase{
	
	public OrangeHRMStepDefinition() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	//OrangeHRMLoginPage OR = new OrangeHRMLoginPage(driver);
	
	@Given("User is on login page {string}")
	public void user_is_on_login_page(String string) {
	    
		driver=initialization("TestCase2");
	}

	@When("User enters username as {string}")
	public void user_enters_username_as(String Username) {
	    
		new OrangeHRMLoginPage(driver).Username().sendKeys(Username);
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String Password) {
	    
		new OrangeHRMLoginPage(driver).Password().sendKeys(Password);
		
	}

	@Then("login should be successful and home page should be displayed")
	public void login_should_be_successful_and_home_page_should_be_displayed() {
		new OrangeHRMLoginPage(driver).LoginButton().click();
	}

	@Given("User is on home page")
	public void user_is_on_home_page() {
		
		OrangeHRMHomePage homepage= new OrangeHRMHomePage(driver);
		
		Actions a = new Actions(driver);
		
		a.moveToElement(homepage.Performance()).build().perform();
		
		a.moveToElement(homepage.ManageReviews()).build().perform();
		
		homepage.ManageReviews2().click();
		
		//System.out.println("AAAA");
	    
	}

	@When("User click on Performance tab and Manage Reviews button")
	public void user_click_on_performance_tab_and_manage_reviews_button() throws InterruptedException {
	    
		SearchPerformanceReviewsPage searchPage = new SearchPerformanceReviewsPage(driver);
		
		driver=searchPage.enterEmployeeDetails(driver);
		
	}

	@Then("User can search the employee")
	public void user_can_search_the_employee() {
		
		FinalSubmit FS= new FinalSubmit(driver);
		
		FS.enterCommentsAndSaveData();
	    
	}


}
