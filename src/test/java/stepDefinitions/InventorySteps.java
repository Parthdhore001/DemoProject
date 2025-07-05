package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.InventoryPage;
import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class InventorySteps {
	InventoryPage inventoryPage = new InventoryPage();

	@Then("User should see the product listing page with title {string}")
	public void user_should_see_inventory_page(String expectedTitle) throws InterruptedException {
		String actualTitle = inventoryPage.getPageTitle();
		assertEquals(expectedTitle, actualTitle);
		Thread.sleep(2000);
	}

	@Then("Verify title of the Inventory page")
	public void Verify_title_of_the_Inventory_page() throws InterruptedException {
		assertTrue(inventoryPage.verifyTitle());
		Thread.sleep(2000);
	}
	
	@And("User clicks on Menu Drawer Icon")
	public void User_clicks_on_Menu_Drawer_Icon() throws InterruptedException
	{
		inventoryPage.menuDrawerIcon();
		Thread.sleep(2000);
	}
	
	@Then("User should see the Cart page with title {string}")
	public void User_should_see_Cart_page_with_title (String expectedTitle) throws InterruptedException {
		String actualTitle = inventoryPage.getCartPageTitle();
		assertEquals(expectedTitle, actualTitle);
		Thread.sleep(2000);
	}
	
	@Then("Menu Drawer features should be displayed")
	public void Menu_Drawer_features_should_be_displayed() throws InterruptedException
	{
		assertTrue(inventoryPage.menuDrawerFeatures());
		Thread.sleep(2000);
	}
	
	@Then("Cart Icon should be displayed")
	public void Cart_Icon_should_be_displayed() throws InterruptedException {
		assertTrue(inventoryPage.verifyCartIcon());
		Thread.sleep(2000);
	}

	@And("User clicks on Cart Icon")
	public void User_clicks_on_Cart_Icon() throws InterruptedException {
		Thread.sleep(3000);
		inventoryPage.cartIconCTA();
		Thread.sleep(2000);
	}

	@Then("Product Sort Container should be displayed")
	public void Product_Sort_Container_should_be_displayed() throws InterruptedException {
		assertTrue(inventoryPage.verifyProductSortContainer());
		Thread.sleep(2000);
	}

	@And("User clicks on Product Sort Container")
	public void User_clicks_on_Product_Sort_Container() throws InterruptedException {
		inventoryPage.productSortCTA();
		Thread.sleep(2000);
	}
	
	@Then ("User should see {string} and {string} and {string} and {string} dropdown buttons inside the Product Sort Container")
    public void User_should_see_dropdown_buttons_inside_the_Product_Sort_Container(String NameAtoZ, String NameZtoA, String PriceLowtoHigh, String PriceHightoLow) throws InterruptedException
    {
		inventoryPage.productSortContainer(NameAtoZ, NameZtoA, PriceLowtoHigh, PriceHightoLow);
		Thread.sleep(2000);
    }
    
	@Then("Name A to Z Sort feature should be displayed")
	public void Name_A_to_Z_Sort_feature_should_be_displayed() throws InterruptedException {
		assertTrue(inventoryPage.verifyNameAToZSort());
		Thread.sleep(2000);
	}

	@Then("User clicks on Name A to Z Sort feature")
	public void User_clicks_on_Name_A_to_Z_Sort_feature() throws InterruptedException {
		inventoryPage.nameAToZSortCTA();
		Thread.sleep(2000);
	}

	@Then("Name Z to A Sort feature should be displayed")
	public void Name_Z_to_A_Sort_feature_should_be_displayed() throws InterruptedException {
		assertTrue(inventoryPage.verifyNameZToASort());
		Thread.sleep(2000);
	}

	@Then("User clicks on Name Z to A Sort feature")
	public void User_clicks_on_Name_Z_to_A_Sort_feature() throws InterruptedException {
		inventoryPage.nameZToASortCTA();
		Thread.sleep(2000);
	}

	@Then("Price low to high Sort feature should be displayed")
	public void Price_low_to_high_Sort_feature_should_be_displayed() throws InterruptedException {
		assertTrue(inventoryPage.verifyPriceLowToHighSort());
		Thread.sleep(2000);
	}

	@Then("User clicks on Price low to high Sort feature")
	public void User_clicks_on_Price_low_to_high_Sort_feature() throws InterruptedException {
		inventoryPage.priceLowToHighSortCTA();
		Thread.sleep(2000);
	}

	@Then("Price high to low Sort feature should be displayed")
	public void Price_high_to_low_Sort_feature_should_be_displayed() throws InterruptedException {
		assertTrue(inventoryPage.verifyPriceHighToLowSort());
		Thread.sleep(2000);
	}

	@Then("User clicks on Price high to low Sort feature")
	public void User_clicks_on_Price_high_to_low_Sort_feature() throws InterruptedException {
		inventoryPage.priceHighToLowSortCTA();
		Thread.sleep(2000);
	}

	@Then("All the features of Sauce Labs Backpack product should be displayed")
	public void All_the_features_of_Sauce_Labs_Backpack_product_should_be_displayed() throws InterruptedException {
		assertTrue(inventoryPage.sauceLabsBackpack());
		Thread.sleep(1000);
		assertTrue(inventoryPage.productDescription());
		Thread.sleep(1000);
		assertTrue(inventoryPage.productPrice());
		Thread.sleep(1000);
		assertTrue(inventoryPage.productImage());
		Thread.sleep(1000);
		assertTrue(inventoryPage.addToCartProduct());
		Thread.sleep(1000);
	}

	@Then("User clicks on Sauce Labs Backpack product {string} and image {string} and add to cart button")
	public void User_clicks_on_Sauce_Labs_Backpack_product_image_add_to_cart_button(String expectedTitle2,
			String expectedTitle3) throws InterruptedException {
		inventoryPage.productSpecificationPage1();
		Thread.sleep(1000);

		String actualTitle2 = inventoryPage.verifyproductSpecificationPage1();
		assertEquals(expectedTitle2, actualTitle2);
		Thread.sleep(2000);

		inventoryPage.productSpecificationImage1();
		Thread.sleep(1000);

		String actualTitle3 = inventoryPage.verifyproductSpecificationImage1();
		assertEquals(expectedTitle3, actualTitle3);
		Thread.sleep(2000);

		inventoryPage.cartBadgeUpdate1();
		Thread.sleep(1000);

		assertTrue(inventoryPage.verifycartBadgeUpdate1());
		Thread.sleep(1000);
	}
	
	@Then("Twitter logo should be displayed")
	public void Twitter_logo_should_be_displayed() throws InterruptedException
	{
		assertTrue(inventoryPage.verifyTwitterLogo());
		Thread.sleep(1000);
	}
	
	@And("User clicks on Twitter logo on inventory page")
	public void User_clicks_on_Twitter_logo_on_inventory_page() throws InterruptedException
	{
		inventoryPage.twitterLogoCTA();
		Thread.sleep(1000);
	}
	
	@Then("User should navigate to the X profile page of Sauce labs")
	public void User_should_navigate_to_the_X_profile_page_of_Sauce_labs(String expectedTitle) throws InterruptedException
	{
		String actualTitle = inventoryPage.getXPageText();
		assertEquals(expectedTitle, actualTitle);
		Thread.sleep(1000);		
	}
	
	@Then("Facebook logo should be displayed")
	public void Facebook_logo_should_be_displayed() throws InterruptedException
	{
		assertTrue(inventoryPage.verifyFacebookLogo());
		Thread.sleep(1000);
	}
	
	@And("User clicks on Facebook logo on inventory page")
	public void User_clicks_on_Facebook_logo_on_inventory_page() throws InterruptedException
	{
		inventoryPage.facebookLogoCTA();
		Thread.sleep(1000);
	}
	
	@Then("User should navigate to the Facebook profile page of Sauce labs")
	public void User_should_navigate_to_the_Facebook_profile_page_of_Sauce_labs(String expectedTitle) throws InterruptedException
	{
		String actualTitle = inventoryPage.getFacebookPageText();
		assertEquals(expectedTitle, actualTitle);
		Thread.sleep(1000);		
	}
	
	@Then("Linkedin logo should be displayed")
	public void Linkedin_logo_should_be_displayed() throws InterruptedException
	{
		assertTrue(inventoryPage.verifyLinkedinLogo());
		Thread.sleep(1000);
	}
	
	@And("User clicks on Linkedin logo on inventory page")
	public void User_clicks_on_Linkedin_logo_on_inventory_page() throws InterruptedException
	{
		inventoryPage.linkedinLogoCTA();
		Thread.sleep(1000);
	}
	
	@Then("User should navigate to the Linkedin profile page of Sauce labs")
	public void User_should_navigate_to_the_Linkedin_profile_page_of_Sauce_labs(String expectedTitle) throws InterruptedException
	{
		String actualTitle = inventoryPage.getLinkedinPageText();
		assertEquals(expectedTitle, actualTitle);
		Thread.sleep(1000);		
	}
	
	@Then("Footer Section Statement should be displayed as per the requirements")
	public void Footer_Section_Statement_should_be_displayed_as_per_the_requirements() throws InterruptedException
	{
		assertTrue(inventoryPage.verifyFooterSection());
		Thread.sleep(2000);		
	}
	
}