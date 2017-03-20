package ict4apps.pages;

import ict4apps.Locators;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.codehaus.groovy.runtime.powerassert.SourceText;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;

import java.util.ArrayList;
import java.util.Set;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@DefaultUrl("http://88.198.7.89:8100/web/guest/products")
public class ProductsPage extends PageObject {

    public void back() {
        getDriver().navigate().back();
    }

//TODO:////////////////////////////          CHECKING PRODUCT BLOCKS          //////////////////////////////////////////

    public void clickOnTitle_products(String arg1) {
        $(Locators.TITLE_PRODUCTS.replace("$1", arg1)).click();
        waitABit(1500);
    }

    public void clickOnPicture_products(String arg1) {
        $(Locators.PRODUCT_PICTURE.replace("$1", arg1)).click();
        waitABit(1500);
    }

    public void clickOnReadMore_products(String arg1) {
        $(Locators.READ_MORE.replace("$1", arg1)).click();
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

//TODO://///////////////////////////////        LOGIN PAGE IS OPENED          //////////////////////////////////////////

    public void clickingOnTheSocialLinks(String arg0, String arg1) {
        $(Locators.SOCIAL_NETWORK_LINKS.replace("$1", arg0).replace("$2", arg1)).click();
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
        for (int i = 0; i < 1000; i++) {
            waitABit(10);
            jsExecutor().executeScript("window.scrollBy(0,1)");
        }
    }

    public void alert() {
        jsExecutor().executeScript("alert('SAMPLE TEXT');");
        waitABit(3000);
    }

    public void dom() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        String sDomain = js.executeScript("return document.domain;").toString();
        System.out.println("Domain = " + sDomain);
    }

    public void getCoockie() {
        Cookie cookie = new Cookie("key", "value");
        getDriver().manage().addCookie(cookie);
        Set<Cookie> allCookies = getDriver().manage().getCookies();
        for (Cookie loadedCookie : allCookies) {

            System.out.println(String.format("%s -> %s", loadedCookie.getName(), loadedCookie.getValue()));
        }

    }

//TODO:////////////////////////////////     CATEGORIES      ////////////////////////////////////////////////////////////

    public void clickOnTheCategory(String arg0) {
        $(Locators.CATEGORIES.replace("$1", arg0)).click();
    }

    public boolean categoryIsActive(String arg0) {
        return $(Locators.ACTIVE_CATEGORY.replace("$1", arg0)).isVisible();
    }

//TODO://////////////////////////////           DROPDOWN BUTTONS         ///////////////////////////////////////////////

    public void clickOnTheButton(String arg0) {
        $(Locators.DROPDOWN_BUTTON.replace("$1", arg0)).click();
        waitABit(1500);
    }

    public boolean dropdownMenuIsOpened() {
        return $(Locators.DROPDOWN_MENU_ELEMENTS).isVisible();
    }

    public boolean dropDownMenuContains(String arg0) {
        int i = findAll(Locators.DROPDOWN_MENU_ELEMENTS).size();
        Integer b = Integer.parseInt(arg0);
        return i == b;
    }

    public void clickOnTheDropDownMenuItem(String arg0) {
        $(Locators.DROPDOWN_MENU_ELEMENTS.replace("*", arg0)).click();
        waitABit(3000);
    }

    public boolean pageContainsRequiredQuanityOfBlocks(String arg0) {
        int i = findAll(Locators.PRODUCT_BLOCK).size();
        Integer b = Integer.parseInt(arg0);
        return i == b;
    }

//TODO://///////////////////////////////      GRID-LIST VIEW BUTTONS       /////////////////////////////////////////////

    public void clickChangeViewButton(String arg0) {
        $(Locators.CHANGE_VIEW_BUTTON.replace("$1", arg0)).click();
        waitABit(2000);
    }

    public boolean productBlocksAreChangedView() {
        return $(Locators.TITLE_PRODUCTS.replace("$1", "1")).isVisible();
    }


}




