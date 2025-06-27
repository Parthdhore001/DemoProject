Feature: Menu Items Section

  @TC007 @regression 
  Scenario: Verify the presence of All Items button in menu drawer
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on menu drawer icon
    Then All items button should be displayed
    
	@TC008 @regression 
  Scenario: Verify the functionality of All Items button in menu drawer
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on menu drawer icon
    Then User clicks on All Items button
    
  @TC009 @regression
  Scenario: Verify the presence of About button in menu drawer
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on menu drawer icon
    Then About button should be displayed
    
 	@TC010 @regression
  Scenario: Verify the fuctionality of About button in menu drawer
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on menu drawer icon
    Then User clicks on About button
    
  @TC011 @regression
  Scenario: Verify the presence of Logout button in menu drawer
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on menu drawer icon
    Then Logout button should be displayed
    
  @TC012 @regression
  Scenario: Verify the fuctionality of Logout button in menu drawer
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on menu drawer icon
    Then User clicks on Logout button
    
  @TC013 @regression
  Scenario: Verify the presence of Reset App State button in menu drawer
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on menu drawer icon
    Then Reset App State button should be displayed 
    
  @TC014 @regression
  Scenario: Verify the fuctionality of Reset App State button in menu drawer
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on menu drawer icon
    Then User clicks on Reset App State button
    
  @TC015 @regression
  Scenario: Verify the presence of Cross button in menu drawer
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on menu drawer icon
    Then Cross button should be displayed
   
  @TC016 @regression
  Scenario: Verify the fuctionality of Cross button in menu drawer
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on menu drawer icon
    Then User clicks on Cross button 
    
    @TC017 @regression
  Scenario: Verify Reset App State is in enabled state
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on menu drawer icon
    Then Verify Reset App State button is enabled
    
    