package com.pageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {
	
	WebDriver driver;
	
	public GoogleSearchPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@class='gLFyf gsfi']")
	private WebElement searchInput;
	
	@FindBy(xpath="(//input[@class='gNO89b'])[1]")
		private WebElement serachResult;
	
	@FindBy(xpath="(//*[contains(text(),'Mortgage calculator')])[1]")
	private WebElement mortgageCalculator;
	
	
	public WebElement getSearchInput() {
		return searchInput;
	}
	
	public WebElement getSubmitSerach() {
		return serachResult;
	}
	
		
    public String getMortgageCalculator() {
    	String y = "not visible";
        try {
            this.mortgageCalculator.getText();
            return mortgageCalculator.getText();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return y;
        }
    }
}
