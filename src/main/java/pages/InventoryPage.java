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
	
	@FindBy(id = "react-burger-menu-btn")
	WebElement menuDrawerButton;
	
	@FindBy(id = "inventory_sidebar_link")
	WebElement allItemsButton;
	
	@FindBy(xpath = "//a[@data-test='shopping-cart-link']")
	WebElement cartButton;
	
	@FindBy(className = "title")
	WebElement yourCart;

	@FindBy(className = "product_sort_container")
	WebElement productSortButton;

	@FindBy(xpath = "//option[@value='az']")
	WebElement nameAToZSortButton;

	@FindBy(xpath = "//option[@value='za']")
	WebElement nameZToASortButton;

	@FindBy(xpath = "//option[@value='lohi']")
	WebElement priceLowToHighSortButton;

	@FindBy(xpath = "//option[@value='hilo']")
	WebElement priceHighToLowSortButton;

	@FindBy(className = "inventory_item_name")
	WebElement sauceLabsBackpackButton;

	@FindBy(className = "inventory_item_desc")
	WebElement productInformation;

	@FindBy(className = "inventory_item_price")
	WebElement productCost;

	@FindBy(className = "inventory_item_img")
	WebElement productImageButton;

	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	WebElement addToCartButton;

	@FindBy(id = "back-to-products")
	WebElement specificationPageTitle;

	@FindBy(className = "shopping_cart_badge")
	WebElement cartBadgeNo1;

	@FindBy(xpath = "//a[@href='https://twitter.com/saucelabs']")
	WebElement twitterLogoButton;
	
	@FindBy(className = "css-175oi2r r-xoduu5 r-1awozwy r-18u37iz r-dnmrzs")
	WebElement xPage;
	
	@FindBy(xpath  = "//a[@href='https://www.facebook.com/saucelabs']")
	WebElement facebookLogoButton;
	
	@FindBy(className = "x1lliihq x6ikm8r x10wlt62 x1n2onr6 xg8j3zb")
	WebElement facebookPage;
	
	@FindBy(xpath  = "//a[@href=https://www.linkedin.com/company/sauce-labs/']")
	WebElement linkedinLogoButton;
	
	@FindBy(className = "authwall-join-form__title")
	WebElement linkedinPage;
	
	@FindBy(className = "footer_copy")
	WebElement footerSection;
	
	
	public String getPageTitle() {
		return title.getText();
	}

	public boolean verifyTitle() {
		return pageTitle.isDisplayed();
	}

	public void menuDrawerIcon() {
		menuDrawerButton.click();		
	}

	public boolean menuDrawerFeatures() {
		return allItemsButton.isDisplayed();
	}
	
	public boolean verifyCartIcon() {
		return cartButton.isDisplayed();
	}

	public void cartIconCTA() {
		cartButton.click();
	}

	public String getCartPageTitle() {
		return yourCart.getText();
	}

	public boolean verifyProductSortContainer() {
		return productSortButton.isDisplayed();
	}

	public void productSortCTA() {
		productSortButton.click();
		productSortButton.click();
	}

	public void productSortContainer(String nameAtoZ, String nameZtoA, String priceLowtoHigh, String priceHightoLow) {
		nameAToZSortButton.isDisplayed();
		nameZToASortButton.isDisplayed();
		priceLowToHighSortButton.isDisplayed();
		priceHighToLowSortButton.isDisplayed();
	}

	public boolean verifyNameAToZSort() {
		return nameAToZSortButton.isDisplayed();
	}

	public void nameAToZSortCTA() {
		nameAToZSortButton.click();
	}

	public boolean verifyNameZToASort() {
		return nameZToASortButton.isDisplayed();
	}

	public void nameZToASortCTA() {
		nameZToASortButton.click();
	}

	public boolean verifyPriceLowToHighSort() {
		return priceLowToHighSortButton.isDisplayed();
	}

	public void priceLowToHighSortCTA() {
		priceLowToHighSortButton.click();
	}

	public boolean verifyPriceHighToLowSort() {
		return priceHighToLowSortButton.isDisplayed();
	}

	public void priceHighToLowSortCTA() {
		priceHighToLowSortButton.click();
	}

	public boolean sauceLabsBackpack() {
		return sauceLabsBackpackButton.isDisplayed();
	}

	public boolean productDescription() {
		return productInformation.isDisplayed();
	}

	public boolean productPrice() {
		return productCost.isDisplayed();
	}

	public boolean productImage() {
		return productImageButton.isDisplayed();
	}

	public boolean addToCartProduct() {
		return addToCartButton.isDisplayed();
	}

	public void productSpecificationPage1() {
		sauceLabsBackpackButton.click();
	}

	public String verifyproductSpecificationPage1() {
		return specificationPageTitle.getText();
	}

	public void productSpecificationImage1() {
		productImageButton.click();
	}

	public String verifyproductSpecificationImage1() {
		return specificationPageTitle.getText();
	}

	public void cartBadgeUpdate1() {
		addToCartButton.click();
	}

	public boolean verifycartBadgeUpdate1() {
		return cartBadgeNo1.isDisplayed();
	}

	public boolean verifyTwitterLogo() {
		return twitterLogoButton.isDisplayed();
	}

	public void twitterLogoCTA() {
		twitterLogoButton.click();		
	}

	public String getXPageText() {
		return xPage.getText();
	}
	
	public boolean verifyFacebookLogo() {
		return facebookLogoButton.isDisplayed();
	}

	public void facebookLogoCTA() {
		facebookLogoButton.click();		
	}

	public String getFacebookPageText() {
		return facebookPage.getText();
	}
		
	public boolean verifyLinkedinLogo() {
		return linkedinLogoButton.isDisplayed();
	}

	public void linkedinLogoCTA() {
		facebookLogoButton.click();		
	}

	public String getLinkedinPageText() {
		return linkedinPage.getText();
	}

	public boolean verifyFooterSection() {
		return footerSection.isDisplayed();
	}

}