package ict4apps.pages;

import ict4apps.Locators;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://88.198.7.89:8100/web/guest/contact-us")
public class ContactUs extends PageObject {

    public void clickOnTheSendButton(String arg0) {
        $(Locators.CONTACT_US_PAGE_SEND_BUTTON.replace("$1", arg0)).click();
        waitABit(500);
    }

    public void writeInTheTextBox(String arg0, String arg1) {
        $(Locators.CONTACT_US_PAGE_TEXTBOXES.replace("$1", arg1)).sendKeys(arg0);
        waitABit(500);
    }

    public boolean checkThatErrorMessageIsAppears(String arg0, String arg1) {
        try {
            $(Locators.CONTACT_US_PAGE_ERROR_MSG.replace("$1", arg0).replace("$2", arg1)).isVisible();
            $(Locators.CONTACT_US_PAGE_TEXTBOXES.replace("$1", arg1)).clear();
            waitABit(500);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {

            return false;
        }
    }

    public void writeInTheTextarea(String arg0, String arg1) {
        $(Locators.CONTACT_US_PAGE_COMMENTS_TEXT_AREA.replace("$1", arg1)).sendKeys(arg0);
        waitABit(500);
    }

    public boolean checkThatErrorMessageIsNotAppearsAboveTextArea(String arg0, String arg1) {
        try {
            $(Locators.CONTACT_US_PAGE_ERROR_MSG.replace("$1", arg0).replace("$2", arg1)).isVisible();
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }


}





