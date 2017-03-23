package ict4apps.pages;

import ict4apps.Locators;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;

import java.util.ArrayList;
import java.util.Set;

@DefaultUrl("http://88.198.7.89:8100/web/guest/products")
public class ProductsPage extends PageObject {

    public void back() {
        getDriver().navigate().back();
    }

//TODO:////////////////////////////          CHECKING PRODUCT BLOCKS          //////////////////////////////////////////

    public void clickOnTitle_products(String arg1) {
        $(Locators.PRODUCTS_PAGE_PRODUCT_TITLE.replace("$1", arg1)).click();
        waitABit(1500);
    }

    public void clickOnPicture_products(String arg1) {
        $(Locators.PRODUCTS_PAGE_PRODUCT_PICTURE.replace("$1", arg1)).click();
        waitABit(1500);
    }

    public void clickOnReadMore_products(String arg1) {
        $(Locators.PRODUCTS_PAGE_READ_MORE.replace("$1", arg1)).click();
        waitABit(1500);
    }

    public boolean checkThatTitleIsPresented() {
        return $(Locators.PRODUCT_DESCRIPTION_TITLE).isPresent();
    }

    public boolean checkThatPictureIsPresented() {
        return $(Locators.PRODUCT_DESCRIPTION_PICTURE).isPresent();
    }

    public boolean checkThatDescriptionIsPresented() {
        return $(Locators.PRODUCT_DESCRIPTION).isPresent();
    }

    public boolean checkThatPictureOfTheProductBlockIsChangedAndContainsSocialNetworkLinks(String arg0) {
        return $(Locators.PRODUCTS_PAGE_GRID_VIEW_SOCIAL_NETWORK_LINKS.replace("$1", arg0)).isVisible();
    }

//TODO://///////////////////////////////        LOGIN PAGE IS OPENED          //////////////////////////////////////////

    public void clickingOnTheSocialLinks(String arg0, String arg1) {
        $(Locators.PRODUCTS_PAGE_SOCIAL_NETWORK_LINKS.replace("$1", arg0).replace("$2", arg1)).click();
    }

    public String checkThatLoginPageIsOpened() {
        switchWindow(1);
        String url = getDriver().getCurrentUrl();
        getDriver().close();
        switchWindow(0);
        waitABit(1500);
        return url;
    }

//TODO://///////////////////////////////        SWITCH WINDOW - TAB          ///////////////////////////////////////////

    public void switchWindow(int x) {
        ArrayList<String> windows = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(windows.get(x));
    }

//TODO://///////////////////////////////        JavascriptExecutor      ////////////////////////////////////////////////

    public JavascriptExecutor jsExecutor() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        return js;
    }

    public void scroll() {
        for (int i = 0; i < 75; i++) {
            waitABit(5);
            jsExecutor().executeScript("window.scrollBy(0,05)");
        }
    }

//TODO:////////////////////////////////     CATEGORIES      ////////////////////////////////////////////////////////////

    public void clickOnTheCategory(String arg0) {
        $(Locators.PRODUCTS_PAGE_CATEGORIES.replace("$1", arg0)).click();
    }

    public boolean categoryIsActive(String arg0) {
        return $(Locators.PRODUCTS_PAGE_ACTIVE_CATEGORY.replace("$1", arg0)).isVisible();
    }

//TODO://////////////////////////////           DROPDOWN BUTTONS         ///////////////////////////////////////////////

    public void clickOnTheButton(String arg0) {
        $(Locators.PRODUCTS_PAGE_DROPDOWN_BUTTON.replace("$1", arg0)).click();
        waitABit(1500);
    }

    public boolean dropdownMenuIsOpened() {
        return $(Locators.PRODUCTS_PAGE_DROPDOWN_MENU_ELEMENTS).isVisible();
    }

    public boolean dropDownMenuContains(String arg0) {
        int i = findAll(Locators.PRODUCTS_PAGE_DROPDOWN_MENU_ELEMENTS).size();
        Integer b = Integer.parseInt(arg0);
        return i == b;
    }

    public void clickOnTheDropDownMenuItem(String arg0) {
        $(Locators.PRODUCTS_PAGE_DROPDOWN_MENU_ELEMENTS.replace("*", arg0)).click();
        waitABit(3000);
    }

    public boolean pageContainsRequiredQuanityOfBlocks(String arg0) {
        int i = findAll(Locators.PRODUCTS_PAGE_PRODUCT_BLOCK).size();
        Integer b = Integer.parseInt(arg0);
        return i == b;
    }

//TODO://///////////////////////////////      GRID-LIST VIEW BUTTONS       /////////////////////////////////////////////

    public void clickChangeViewButton(String arg0) {
        $(Locators.PRODUCTS_PAGE_CHANGE_VIEW_BUTTON.replace("$1", arg0)).click();
        waitABit(2000);
    }

    public boolean productBlocksAreChangedView() {
        return $(Locators.PRODUCTS_PAGE_PRODUCT_TITLE.replace("$1", "1")).isVisible();
    }

//TODO://////////////////////////////////         SCROLLED HEADER        ///////////////////////////////////////////////

    public void scrollDownPage() {
        scroll();
    }

    public boolean checkThatScrolledHeaderIsAppears() {
        return $(Locators.SCROLLED_HEADER).isVisible();
    }
}




