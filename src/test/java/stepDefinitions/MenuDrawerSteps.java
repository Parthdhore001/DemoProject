package stepDefinitions;

import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.MenuDrawerPage;

public class MenuDrawerSteps {
	
	MenuDrawerPage menuDrawerPage = new MenuDrawerPage();
	
	@And("User clicks on menu drawer icon")
	public void User_clicks_on_menu_drawer_icon() throws InterruptedException
	{
		menuDrawerPage.clickOnMenuDrawer(); 
	Thread.sleep(2000);
	}
	

	@Then("All items button should be displayed")
	public void All_items_button_should_be_displayed() throws InterruptedException
	{
		assertTrue(menuDrawerPage.verifyAllItemsButton());
		Thread.sleep(2000);
}
	
	@Then("User clicks on All Items button")
	public void User_clicks_on_All_Items_button() throws InterruptedException
	{
		menuDrawerPage.clickOnAllItemsButton();
		Thread.sleep(2000);
}
	
	@Then("About button should be displayed")
	public void About_button_should_be_displayed() throws InterruptedException
	{
		assertTrue(menuDrawerPage.verifyAboutButton());
		Thread.sleep(2000);
}
	
	@Then("User clicks on About button")
	public void User_clicks_on_About_button() throws InterruptedException
	{
		menuDrawerPage.clickOnAboutButton();
		Thread.sleep(2000);
}
	
	@Then("Logout button should be displayed")
	public void Logout_button_should_be_displayed() throws InterruptedException
	{
		assertTrue(menuDrawerPage.verifyLogoutButton());
		Thread.sleep(2000);
}
	
	@Then("User clicks on Logout button")
	public void User_clicks_on_Logout_button() throws InterruptedException
	{
		menuDrawerPage.clickOnLogoutButton();
		Thread.sleep(2000);
	}
	
	@Then("Reset App State button should be displayed")
	public void Reset_App_State_button_should_be_displayed() throws InterruptedException
	{
		assertTrue(menuDrawerPage.verifyResetAppStateButton());
		Thread.sleep(2000);
}
	
	@Then("User clicks on Reset App State button")
	public void User_clicks_on_Reset_App_State_button() throws InterruptedException
	{
		menuDrawerPage.clickOnResetAppStateButton();
		Thread.sleep(2000);
}
	@Then("Cross button should be displayed")
	public void Cross_button_should_be_displayed() throws InterruptedException
	{
		assertTrue(menuDrawerPage.verifyCrossButton());
		Thread.sleep(2000);
}
	@Then("User clicks on Cross button")
	public void User_clicks_on_Cross_button() throws InterruptedException
	{
		menuDrawerPage.clickOnCrossButton();
		Thread.sleep(2000);
}
	@Then("Verify Reset App State button is enabled")
	public void Verify_Reset_App_State_button_is_enabled()
	{
		assertTrue(menuDrawerPage.verifyResetAppStateButton());
	}
	
}
 