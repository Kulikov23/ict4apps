package ict4apps.pages;

import ict4apps.Locators;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

@DefaultUrl("http://88.198.7.89:8100/web/guest/products")
public class ProductsPage extends PageObject {

    public void back(){ getDriver().navigate().back(); }

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

    public boolean checkThatTitleIsPresented() { return $(Locators.PRODUCT_DESCRIPTION_TITLE).isPresent(); }

    public boolean checkThatPictureIsPresented() { return $(Locators.PRODUCT_DESCRIPTION_PICTURE).isPresent(); }

    public boolean checkThatDescriptionIsPresented() { return $(Locators.PRODUCT_DESCRIPTION).isPresent(); }

//TODO://///////////////////////////////        LOGIN PAGE IS OPENED          //////////////////////////////////////////

    public void clickingOnTheSocialLinks(String arg0,String arg1) { $(Locators.SOCIAL_NETWORK_LINKS.replace("$1",arg0).replace("$2",arg1)).click(); }

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

//TODO://///////////////////////////////        SCROLL      ////////////////////////////////////////////////////////////

//    public void scroll() {
//        JavascriptExecutor js = (JavascriptExecutor)getDriver();
//        for (int i=0;i<1000;i++) {
//            js.executeScript("window.scrollBy(0,1500)");
//            js.executeScript("window.scrollBy(0,-1500)");
//        }
//    }

    public void scroll() {
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        for (int i=0;i<1000;i++) {
            waitABit(10);
            js.executeScript("window.scrollBy(0,1)");
         //   js.executeScript("window.scrollBy(0,-1500)");
        }
    }

//TODO:////////////////////////////////     CATEGORIES      ////////////////////////////////////////////////////////////

    public void clickOnTheCategory(String arg0) {
        $(Locators.CATEGORIES.replace("$1",arg0)).click();
    }

    public boolean categoryIsActive(String arg0) {
        return $(Locators.ACTIVE_CATEGORY.replace("$1",arg0)).isVisible();

    }

    public void clickOnThePageOf(String arg0) {
        $(Locators.PAGE_OF_BUTTON.replace("$1",arg0)).click();
        waitABit(1500);
    }

    public boolean PageOfDropDownMenuIsOpened(String arg0) {
        return $(Locators.PAGE_OF_DROPDOWN_MENU.replace("$1", arg0)).isVisible();
    }

    public boolean dropdownMenuIsOpened() {
        return $(Locators.PAGE_OF_DROPDOWN_MENU).isVisible();
    }

}




