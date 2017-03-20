package ict4apps.pages;

import ict4apps.Locators;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://88.198.7.89:8100/web/guest/blogs")
public class ContactUs extends PageObject {

    public void clickOnTheSendButton(String arg0) {
        $(Locators.CONTACT_US_PAGE_SEND_BUTTON).click();
    }
}
