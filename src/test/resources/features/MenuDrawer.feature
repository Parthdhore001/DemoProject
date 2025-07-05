Feature: Menu Items Section

	@TC007 @Regression
  Scenario: Verify the presence of Menu Drawer Icon on Inventory page
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    Then Menu Drawer Icon is displayed

  @TC008 @Regression 
  Scenario: Verify the presence of All Items button in menu drawer
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on menu drawer icon
    Then All items button should be displayed
    
	@TC009 @Regression 
  Scenario: Verify the functionality of All Items button in menu drawer
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on menu drawer icon
    Then User clicks on All Items button
    
  @TC010 @Regression
  Scenario: Verify the presence of About button in menu drawer
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on menu drawer icon
    Then About button should be displayed
    
 	@TC011 @Regression
  Scenario: Verify the fuctionality of About button in menu drawer
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on menu drawer icon
    Then User clicks on About button
    
  @TC012 @Regression
  Scenario: Verify the presence of Logout button in menu drawer
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on menu drawer icon
    Then Logout button should be displayed
    
  @TC013 @Regression
  Scenario: Verify the fuctionality of Logout button in menu drawer
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on menu drawer icon
    Then User clicks on Logout button
    
  @TC014 @Regression
  Scenario: Verify the presence of Reset App State button in menu drawer
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on menu drawer icon
    Then Reset App State button should be displayed 
    
  @TC015 @Regression
  Scenario: Verify the fuctionality of Reset App State button in menu drawer
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on menu drawer icon
    Then User clicks on Reset App State button
    
  @TC016 @Regression
  Scenario: Verify the presence of Cross button in menu drawer
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on menu drawer icon
    Then Cross button should be displayed
   
  @TC017 @Regression
  Scenario: Verify the fuctionality of Cross button in menu drawer
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on menu drawer icon
    Then User clicks on Cross button 
    
  @TC018 @Regression
  Scenario: Verify Reset App State is in enabled state
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on menu drawer icon
    Then Verify Reset App State button is enabled
    
    