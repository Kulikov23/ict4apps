package ict4apps.pages;


import ict4apps.Locators;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://88.198.7.89:8100/web/guest/search")
public class SearchPage extends PageObject {

    String url;

    public boolean checkThatSearchSearchResultsAreAppears() {
        return $(Locators.SEARCH_PAGE_SEARCH_RESULT).isVisible();
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
        return !$(Locators.SEARCH_PAGE_BUTTONS.replace("$1", arg0)).isVisible();
    }

    public void writeInTheTextbox(String arg0) {
        $(Locators.SEARCH_PAGE_TEXTBOX).sendKeys(arg0);
    }

    public void clickOnTheElementOfTheListbox(String arg0) {
        $(Locators.SEARCH_PAGE_SCOPE_LISTBOX.replace("$1", arg0)).click();
    }
}
