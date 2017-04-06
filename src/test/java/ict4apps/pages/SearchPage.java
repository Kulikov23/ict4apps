package ict4apps.pages;


import ict4apps.Locators;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://88.198.7.89:8100/web/guest/search")
public class SearchPage extends PageObject {

    String url;
    String title;

    public boolean checkThatSearchSearchResultsAreAppears(String arg0) {
        return $(Locators.SEARCH_PAGE_SEARCH_RESULT.replace("$1", arg0)).isVisible();
    }

    public void clickOnTheScopeDropdownMenu() {
        $(Locators.SEARCH_PAGE_SCOPE_DROPDOWN).click();
    }

    public boolean checkThatListBoxIsOpenedAndContainsFollowing(String arg0) {
        return $(Locators.SEARCH_PAGE_SCOPE_LISTBOX.replace("$1", arg0)).isVisible();
    }

    public void clickOnTheSearchButtonOfTheSearchPage(String arg0) {
        url = getDriver().getCurrentUrl();
        $(Locators.SEARCH_PAGE_BUTTONS.replace("$1", arg0)).click();
    }

    public boolean checkThatPageIsNotChanging() {
        return getDriver().getCurrentUrl().equals(url);
    }

    public boolean checkThatButtonIsHidden(String arg0) {
        try {
            $(Locators.SEARCH_PAGE_BUTTONS.replace("$1", arg0)).isVisible();
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public void writeInTheTextbox(String arg0) {
        $(Locators.SEARCH_PAGE_TEXTBOX).sendKeys(arg0);
    }

    public void clickOnTheElementOfTheListbox(String arg0) {
        $(Locators.SEARCH_PAGE_SCOPE_LISTBOX.replace("$1", arg0)).click();
    }

    public void clickOnTheTitleOfTheResultBlock(String arg0) {
        title = $(Locators.SEARCH_PAGE_RESULT_TITLE.replace("$1", arg0)).getText();
        $(Locators.SEARCH_PAGE_RESULT_TITLE.replace("$1", arg0)).click();
    }

    public boolean checkThatClickOnTheFirstResultIsMovingUsToChosenBlogPage() {
        return $(Locators.PRODUCTS_PAGE_BREADCRUMB_3).getText().equalsIgnoreCase(title);
    }
}
