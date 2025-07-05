package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.LoginPage;
import utils.BaseClass;

import static org.junit.Assert.assertTrue;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @Given("User is on SauceDemo login page")
    public void user_is_on_login_page() {
        BaseClass.driver.get("https://www.saucedemo.com/");
    }

    @When("User enters username {string} and password {string}")
    public void user_enters_credentials(String username, String password) throws InterruptedException {
        loginPage.login(username, password);
    }

    @Then("User should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        assertTrue(BaseClass.driver.getCurrentUrl().contains("inventory"));
    }
    
    @Then("Error message should be displayed for invalid Username")
    public void error_message_should_be_displayed_for_invalid_username () {
    		assertTrue(loginPage.errorMessageIsDisplayedForInvalidUsername());
    }
    
    @Then("Error message should be displayed for invalid Password")
    public void error_message_should_be_displayed_for_invalid_password () {
    		assertTrue(loginPage.errorMessageIsDisplayedForInvalidPassword());
    }
    
    @Then("Error message should be displayed for both invalid Username and Password")
    public void error_message_should_be_displayed_for_both_invalid_username_and_password () {
    		assertTrue(loginPage.errorMessageIsDisplayedForBothInvalidUsernameAndPassword());
    }
    @When("User clicks on login button")
    public void user_clicks_on_login_button() {
    		loginPage.clickOnLoginButton();
    }
    
    @Then("Username is required error message is displayed")
    public void username_is_required_error_message_is_displayed() {
    	 	assertTrue(loginPage.errorMessageForEmptyFields());
    }
    
    @Then("Verify title of the login page")
    public void verify_title_of_the_login_page() {
    		assertTrue(loginPage.verifyTitleOfLoginPage());
    }
}