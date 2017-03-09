package ict4apps.pages;

import  ict4apps.Locators;
import ch.lambdaj.function.convert.Converter;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static ch.lambdaj.Lambda.convert;

@DefaultUrl("http://88.198.7.89:8100/")
public class DictionaryPage extends PageObject {

    public WebElement clickWelcome() {
        return  $(Locators.WELCOME_LINK);
    }

    public WebElement siteLogoIsAppeares() {
        return $(Locators.SITE_LOGO);
    }

    public WebElement clickProducts() {
        return $(Locators.PRODUCTS_LINK);
    }

    public WebElement titleDisplayed(){
        return $(Locators.TITLE_1ST_BLOCK);
    }

    public WebElement clickSpecial() {
        return $(Locators.SPECIAL_OFFERS_LINK);
    }

    public WebElement labelDisplayed() {
        return $(Locators.SHOWING_RESULTS_LABEL);
    }

    public WebElement clickBlogs() {
        return $(Locators.BLOGS_LINK);
    }

    public WebElement rssDisplayed() {
        return $(Locators.BLOGS_HEADER);
    }

    public WebElement clickContacts() {
        return $(Locators.CONTACT_US_LINK);
    }

    public WebElement contactsHeader_displayed() {
        return $(Locators.CONTACTS_HEADER);
    }
}