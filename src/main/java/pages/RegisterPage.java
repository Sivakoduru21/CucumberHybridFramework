package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;
import utils.ElementUtils;

public class RegisterPage {
	
	WebDriver driver;
	ElementUtils elementUtils;
	
	public RegisterPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
		elementUtils = new ElementUtils(driver);
	}
	
	
	@FindBy(id = "input-firstname")
	private WebElement firstNameField;
	
	@FindBy(id ="input-lastname")
	private WebElement lastNameField;
	
	@FindBy(id = "input-email")
	private WebElement emailField;
	
	@FindBy(id = "input-telephone")
	private WebElement telephoneField;
	
	@FindBy(id ="input-password")
	private WebElement passwordField;
	
	@FindBy(id = "input-confirm")
	private WebElement passwordConfirmField;
	
	@FindBy(name="agree")
	private WebElement privacyPolicyOption;
	
	@FindBy(xpath = "//input[@value=\"Continue\"]")
	private WebElement continueButton;
	
	@FindBy(xpath="//input[@name=\"newsletter\"][@value='1']")
	private WebElement yesNewsLetterOption;
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	private WebElement warningMessage;
	
	@FindBy(xpath="//input[@id='input-firstname']/following-sibling::div")
	private WebElement firstNameFieldWarning;
	
	@FindBy(xpath="//input[@id='input-lastname']/following-sibling::div")
	private WebElement lastNameFieldWarning;
	
	@FindBy(xpath="//input[@id='input-email']/following-sibling::div")
	private WebElement emailAddressFieldWarning;
	
	@FindBy(xpath="//input[@id='input-telephone']/following-sibling::div")
	private WebElement telephoneFieldWarning;
	
	@FindBy(xpath="//input[@id='input-password']/following-sibling::div")
	private WebElement passwordFieldWarning;
	
	
	
	public void enterFirstName(String firstNameText) {
		
		elementUtils.typeTextIntoElement(firstNameField, firstNameText,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
	}
	
	public void enterLastName(String lastNameText) {
		
		elementUtils.typeTextIntoElement(lastNameField, lastNameText,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
	}
	
	public void enterEmailAddress(String emailText) {
		
		elementUtils.typeTextIntoElement(emailField, emailText,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public void enterTelephoneNumber(String telephoneText) {
		elementUtils.typeTextIntoElement(telephoneField, telephoneText,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public void enterPassword(String passwordText) {
		elementUtils.typeTextIntoElement(passwordField, passwordText,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public void enterConfirmPassword(String passwordText) {
		
		elementUtils.typeTextIntoElement(passwordConfirmField, passwordText,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
	}

	
	public void selectPrivacyPolicy() {
		
		elementUtils.clickOnElement(privacyPolicyOption,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
	}
	
	public AccountSuccessPage clickOnContinueButton() {
		
		elementUtils.clickOnElement(continueButton,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		return new AccountSuccessPage(driver);
		
	}
	
	public void selectYesNewsLetterOption() {
		elementUtils.clickOnElement(yesNewsLetterOption,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
	}
	
	public String getWarningMessageText() {
		
		return elementUtils.getTextFromElement(warningMessage,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		 
	}
	
	
	public String getFirstNameFieldWarning() {
		
		return elementUtils.getTextFromElement(firstNameFieldWarning,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
	}
	
	public String getLastNameWarning() {
		
		return elementUtils.getTextFromElement(lastNameFieldWarning,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public String getEmailAddressFieldWarning() {
		
		return elementUtils.getTextFromElement(emailAddressFieldWarning,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public String getTelephoneFieldWarning() {
		return elementUtils.getTextFromElement(telephoneFieldWarning,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
	}
	
	public String getPasswordFieldWarning() {
		return elementUtils.getTextFromElement(passwordFieldWarning,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
	}
}
