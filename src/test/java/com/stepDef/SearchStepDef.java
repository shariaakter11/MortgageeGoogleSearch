package com.stepDef;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.common.Base;
import com.pageObjectModel.GoogleSearchPage;
import com.utility.ScreenCapture;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/*
 * connect with base class and page object model class
 * 
 */
public class SearchStepDef extends Base {
	
	GoogleSearchPage googleSearchPage;
	
	@Given("^I am in \"([^\"]*)\" home page$")
	public void i_am_in_home_page(String arg1) throws Throwable {
		getDriver();
		googleSearchPage = PageFactory.initElements(driver, GoogleSearchPage.class);
	    
	}

	@When("^I enter \"([^\"]*)\" in search bar$")
	public void i_enter_in_search_bar(String arg1) throws Throwable {
		googleSearchPage.getSearchInput().sendKeys(arg1);
	    
	}

	@When("^Click on enter$")
	public void click_on_enter() throws Throwable {
		googleSearchPage.getSubmitSerach().click();;
	}

	@Then("^It display expected \"([^\"]*)\"$")
	public void it_display_expected(String arg1) throws Throwable {
		//System.out.println(googleSearchPage.getMortgageCalculator());
		Assert.assertEquals(googleSearchPage.getMortgageCalculator().contains(arg1),true);
		ScreenCapture.screenS(driver, "PositiveTest");
		driver.close();
	}
	
	@Then("^It should not displays expected \"([^\"]*)\"$")
	public void it_should_not_displays_expected(String arg1) throws Throwable {
		Assert.assertEquals(googleSearchPage.getMortgageCalculator().contains(arg1),false);
		ScreenCapture.screenS(driver, "NegativeTest");
		driver.close();
	}
	

	


}
