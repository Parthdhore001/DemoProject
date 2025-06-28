Feature: Inventory Page Verification

	@TC019 @regression
  Scenario: Verify user is on inventory page after login
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    Then User should see the product listing page with title "Products"
    
  @TC020 @regression
	Scenario: Verify the title of Inventory page 
		Given User is on SauceDemo login page
		Then Verify title of the Inventory page

	@TC022 @regression
  Scenario: Verify the presence of Cart Icon
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    Then Cart Icon should be displayed

	@TC023 @regression
  Scenario: Verify the functionality of Cart Icon
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    Then User clicks on Cart Icon
  
  @TC024 @regression
  Scenario: Verify the presence of Product Sort Container
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    Then Product Sort Container should be displayed  
    
  @TC025 @regression
  Scenario: Verify the functionality of Product Sort Container
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    Then User clicks on Product Sort Container 
    
  @TC026 @regression
  Scenario: Verify the presence of Name A to Z Sort feature inside PSC
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on Product Sort Container
    Then Name A to Z Sort feature should be displayed
        
  @TC027 @regression
  Scenario: Verify the functionality of Name A to Z Sort feature inside PSC
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on Product Sort Container
    Then User clicks on Name A to Z Sort feature
    
  @TC028 @regression
  Scenario: Verify the presence of Name Z to A Sort feature inside PSC
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on Product Sort Container
    Then Name Z to A Sort feature should be displayed
    
  @TC029 @regression
  Scenario: Verify the functionality of Name Z to A Sort feature inside PSC
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on Product Sort Container
    Then User clicks on Name Z to A Sort feature