package stepDefinitions;

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
    public void Verify_title_of_the_Inventory_page() throws InterruptedException
    {
    		assertTrue(inventoryPage.verifyTitle());
        Thread.sleep(2000);
    }
    
    @Then("Cart Icon should be displayed")
    public void Cart_Icon_should_be_displayed() throws InterruptedException
    {
    	 	assertTrue(inventoryPage.verifyCartIcon());
        Thread.sleep(2000);
    }
    
    @Then("User clicks on Cart Icon")
    public void User_clicks_on_Cart_Icon() throws InterruptedException
    {
    		inventoryPage.cartIconCTA();
        Thread.sleep(2000);
    }
    
    @Then("Product Sort Container should be displayed")
    public void Product_Sort_Container_should_be_displayed() throws InterruptedException
    {
    		assertTrue(inventoryPage.verifyProductSortContainer());
    		Thread.sleep(2000);
    }
    
    @Then("User clicks on Product Sort Container")
    public void User_clicks_on_Product_Sort_Container() throws InterruptedException
    {
    		inventoryPage.productSortCTA();
    		Thread.sleep(2000);
    }
    
    @Then("Name A to Z Sort feature should be displayed")
    public void Name_A_to_Z_Sort_feature_should_be_displayed() throws InterruptedException
    {
    		assertTrue(inventoryPage.verifyNameAToZSort());
    		Thread.sleep(2000);
    }
    
    @Then("User clicks on Name A to Z Sort feature")
    public void User_clicks_on_Name_A_to_Z_Sort_feature() throws InterruptedException
    {
    		inventoryPage.NameAToZSortCTA();
    		Thread.sleep(2000);
    }
    
    @Then("Name Z to A Sort feature should be displayed")
    public void Name_Z_to_A_Sort_feature_should_be_displayed() throws InterruptedException
    {
    		assertTrue(inventoryPage.verifyNameZToASort());
    		Thread.sleep(2000);
    }
    
    @Then("User clicks on Name Z to A Sort feature")
    public void User_clicks_on_Name_Z_to_A_Sort_feature() throws InterruptedException
    {
    		inventoryPage.NameZToASortCTA();
    		Thread.sleep(2000);
    }
}