package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;
import utils.ElementUtils;

public class LoginPage {
	
	WebDriver driver;
	ElementUtils elementUtils;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		elementUtils = new ElementUtils(driver);
	}

	
	
	@FindBy(id="input-email")
	private WebElement emailField;
	
	public void enterEmailAddress(String emailText) {
		elementUtils.typeTextIntoElement(emailField, emailText, 30);
		
	}
	
	@FindBy(id="input-password")
	private WebElement passwordField;
	
	public void enterPassword(String passWordText) {
		elementUtils.typeTextIntoElement(passwordField, passWordText, 30);
		 
	}
	@FindBy(xpath="//input[@value='Login']")
	private WebElement loginButton;
	
	public AccountPage clickLoginButton() {
		elementUtils.clickOnElement(loginButton,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		return new AccountPage(driver);
	}
	
	@FindBy(xpath="//div[contains(text(), 'Warning: No match for E-Mail Address and/or Password.')]")
	private WebElement warningMessage;
	
	public String getWarningMessageText() {
		
		return elementUtils.getTextFromElement(warningMessage,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
}
