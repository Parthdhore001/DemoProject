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
		
	@TC021 @regression
  Scenario: Verify the functionality of Menu Drawer Icon
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on Menu Drawer Icon
    Then Menu Drawer features should be displayed

	@TC022 @regression
  Scenario: Verify the presence of Cart Icon
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    Then Cart Icon should be displayed

	@TC023 @regression
  Scenario: Verify the functionality of Cart Icon
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on Cart Icon
    Then User should see the Cart page with title "Your Cart"
    
  @TC024 @regression
  Scenario: Verify the presence of Product Sort Container
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    Then Product Sort Container should be displayed  
    
  @TC025 @regression
  Scenario: Verify the functionality of Product Sort Container
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on Product Sort Container
    Then User should see "NameAtoZ" and "NameZtoA" and "PriceLowtoHigh" and "PriceHightoLow" dropdown buttons inside the Product Sort Container
    
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
  
  @TC028 @regression
  Scenario: Verify the presence of Price low to high Sort feature inside PSC
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on Product Sort Container
    Then Price low to high Sort feature should be displayed  
    
  @TC029 @regression
  Scenario: Verify the functionality of Price low to high Sort feature inside PSC
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on Product Sort Container
    Then User clicks on Price low to high Sort feature
    
  @TC030 @regression
  Scenario: Verify the presence of Price high to low Sort feature inside PSC
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on Product Sort Container
    Then Price high to low Sort feature should be displayed  
    
  @TC031 @regression
  Scenario: Verify the functionality of Price high to low Sort feature inside PSC
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    Then User clicks on Price high to low Sort feature
    
  @TC032 @regression
  Scenario: Verify the presence of all the features of Sauce Labs Backpack product
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    Then All the features of Sauce Labs Backpack product should be displayed
    
  @TC033 @regression
  Scenario: Verify the fuctionality of all the features of Sauce Labs Backpack product
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
		Then User clicks on Sauce Labs Backpack product "expectedTitle2" and image "expectedTitle3" and add to cart button

  @TC044 @sanity
  Scenario: Verify the presence of Twitter logo on inventory page
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    Then Twitter logo should be displayed  
    
  @TC045 @sanity
  Scenario: Verify the functionality of Twitter logo on inventory page
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on Twitter logo on inventory page
    Then User should navigate to the X profile page of Sauce labs
    
  @TC046 @sanity
  Scenario: Verify the presence of Facebook logo on inventory page
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    Then Facebook logo should be displayed  
    
  @TC047 @sanity
  Scenario: Verify the functionality of Facebook logo on inventory page
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on Facebook logo on inventory page
    Then User should navigate to the Facebook profile page of Sauce labs
    
  @TC048 @sanity
  Scenario: Verify the presence of Linkedin logo on inventory page
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    Then Linkedin logo should be displayed  
    
  @TC049 @sanity
  Scenario: Verify the functionality of Linkedin logo on inventory page
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on Linkedin logo on inventory page
    Then User should navigate to the Linkedin profile page of Sauce labs
    
  @TC050 @sanity
  Scenario: Verify that the presence of Footer Section Statement is as per requirements
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    Then Footer Section Statement should be displayed as per the requirements