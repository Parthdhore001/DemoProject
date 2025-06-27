Feature: SauceDemo Login

	@TC001 @smoke
  Scenario: Successful login with valid credentials
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    Then User should be logged in successfully

	@TC002 @smoke
	Scenario: Verify error message upon invalid Username
		Given User is on SauceDemo login page
		When User enters username "standard" and password "secret_sauce"
		Then Error message should be displayed for invalid Username 
		
	@TC003 @smoke
	Scenario: Verify error message upon invalid Password
	  Given User is on SauceDemo login page
		When User enters username "standard_user" and password "secret"
		Then Error message should be displayed for invalid Password
		
	@TC004 @smoke
	Scenario: Verify error message upon both invalid Username and Password
		Given User is on SauceDemo login page
		When User enters username "standard" and password "secret"
		Then Error message should be displayed for both invalid Username and Password 
		
	@TC005 @smoke
	Scenario: Verify error message with empty fields
	  Given User is on SauceDemo login page
		When User clicks on login button
		Then Username is required error message is displayed
		
	@TC006 @regression
	Scenario: Verify the title of login page 
		Given User is on SauceDemo login page
		Then Verify title of the login page
		
	
		
		