package ict4apps.pages;

import ict4apps.Locators;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://88.198.7.89:8100/web/guest/welcome/-/login/login?saveLastPath=false")
public class SignInPage extends PageObject {

    public void clickOnTheButtonOnTheContentPart(String arg0) {
        $(Locators.WELCOME_PAGE_SIGN_IN_BUTTON.replace("$1", arg0)).click();
    }

    public boolean checkThatErrorMassageAppearsNearAndTextBoxes(String arg0, String arg1) {
        return $(Locators.SIGN_IN_PAGE_ERROR_MSG.replace("$1", arg0).replace("$2", arg1)).isVisible();
    }

    public void clickOnTheRememberMeCheckbox() {
        $(Locators.SIGN_IN_PAGE_CHECKBOX).click();
        waitABit(1000);
    }

    public boolean checkThatRememberMeCheckboxIsChecked() {
        return $(Locators.SIGN_IN_PAGE_CHECKBOX).isSelected();
    }

    public boolean checkThatRememberMeCheckboxIsNotChecked() {
        return !$(Locators.SIGN_IN_PAGE_CHECKBOX).isSelected();
    }

    public boolean checkThatPageIsChangedToWelcomePage() {
        return !$(Locators.SIGN_IN_PAGE_CHECKBOX).isVisible();
    }

    public void clickOnTheLinkedImage(String arg0) {
        $(Locators.SIGN_IN_PAGE_LINKS.replace("$1", arg0)).click();
    }

    public void writeIntoTheTextBox(String arg0, String arg1) {
        $(Locators.SIGN_IN_PAGE_LOGIN_AND_PASS_TEXT_BOX.replace("$1", arg1)).sendKeys(arg0);
    }

    public void clearAllTestBoxes() {
        $(Locators.ALL_TEXT_BOXES).clear();
    }

    public void checkThatErrorMassageAppears(String arg0) {
        $(Locators.SIGN_IN_PAGE_ERR_MSG.replace("$1", arg0)).isVisible();
    }
}
