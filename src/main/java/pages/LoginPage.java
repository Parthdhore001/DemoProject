package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseClass;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(BaseClass.driver, this);
    }

    @FindBy(id = "user-name")
    WebElement usernameField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(id = "login-button")
    WebElement loginButton;
    
    @FindBy(xpath = "//h3[@data-test='error']")
    WebElement errorMessage;

    @FindBy(xpath = "//div[@class='error-message-container error']")
    WebElement errorMessageForEmptyFields;
    
    public void login(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }

	public boolean errorMessageIsDisplayedForInvalidUsername () {
		return errorMessage.isDisplayed();
	}

	public boolean errorMessageIsDisplayedForInvalidPassword () {
		return errorMessage.isDisplayed();
	}

	public boolean errorMessageIsDisplayedForBothInvalidUsernameAndPassword() {
		return errorMessage.isDisplayed();
	}

	public void clickOnLoginButton() {
		loginButton.click();		
	}

	public boolean errorMessageForEmptyFields() {
		return errorMessageForEmptyFields.isDisplayed();				
	}

	public boolean verifyTitleOfLoginPage() {
		String expectedTitle = "Swag Labs";
		String actualTitle = BaseClass.driver.getTitle();
		return expectedTitle.equals(actualTitle);
				
	}
}