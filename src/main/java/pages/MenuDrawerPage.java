package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BaseClass;

public class MenuDrawerPage {
	
	public MenuDrawerPage() {
        PageFactory.initElements(BaseClass.driver, this);
    }

	@FindBy(id = "react-burger-menu-btn")
	WebElement menuDrawerIcon;
	
	@FindBy(id = "inventory_sidebar_link")
	WebElement allItemsButton;
	
	@FindBy(id = "about_sidebar_link")
	WebElement aboutButton;
	
	@FindBy(id = "logout_sidebar_link")
	WebElement logoutButton;
	
	@FindBy(id = "reset_sidebar_link")
	WebElement resetAppStateButton;
	
	@FindBy(id = "react-burger-cross-btn")
	WebElement crossButton;
	
	public void clickOnMenuDrawer() {
		menuDrawerIcon.click();		
	}

	public boolean verifyAllItemsButton() {
		return allItemsButton.isDisplayed(); 
	}
	
	public void clickOnAllItemsButton() {
		allItemsButton.click();
	}

	public boolean verifyAboutButton() {
		return aboutButton.isDisplayed();
	}

	public void clickOnAboutButton() {
		aboutButton.click();
	}

	public boolean verifyLogoutButton() {
		return logoutButton.isDisplayed();
	}

	public void clickOnLogoutButton() {
		logoutButton.click();
	}

	public boolean verifyResetAppStateButton() {
		return resetAppStateButton.isDisplayed();
	}

	public void clickOnResetAppStateButton() {
		resetAppStateButton.click();		
	}

	public boolean verifyCrossButton() {
		return crossButton.isDisplayed();
	}

	public void clickOnCrossButton() {
		crossButton.click();		
	}
	
	

}
