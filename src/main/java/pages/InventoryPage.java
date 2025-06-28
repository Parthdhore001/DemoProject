package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseClass;

public class InventoryPage {
    public InventoryPage() {
        PageFactory.initElements(BaseClass.driver, this);
    }

    @FindBy(className = "title")
    WebElement title;
    
    @FindBy(className = "app_logo")
    WebElement pageTitle;
    
    @FindBy(className = "shopping_cart_link")
    WebElement cartButton;

    @FindBy(className = "product_sort_container")
    WebElement productSortButton;
    
    @FindBy(xpath ="//option[@value='az']")
    WebElement NameAToZSortButton;
    
    @FindBy(xpath ="//option[@value='za']")
    WebElement NameZToASortButton;

    public String getPageTitle() {
        return title.getText();
    }

	public boolean verifyTitle() {
		return pageTitle.isDisplayed();
	}

	public boolean verifyCartIcon() {
	return cartButton.isDisplayed();
	}

	public void cartIconCTA() {
		cartButton.click();		
	}

	public boolean verifyProductSortContainer() {
		return productSortButton.isDisplayed();
	}

	public void productSortCTA() {
		productSortButton.click();		
	}

	public boolean verifyNameAToZSort() {
		return NameAToZSortButton.isDisplayed();
	}

	public void NameAToZSortCTA() {
		productSortButton.click();
	}

	public boolean verifyNameZToASort() {
		return NameAToZSortButton.isDisplayed();
	}

	public void NameZToASortCTA() {
		productSortButton.click();
	}

}