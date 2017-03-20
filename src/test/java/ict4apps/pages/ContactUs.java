package ict4apps.pages;

import ict4apps.Locators;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.List;

@DefaultUrl("http://88.198.7.89:8100/web/guest/contact-us")
public class ContactUs extends PageObject {

    public void clickOnTheSendButton(String arg0) {
        $(Locators.CONTACT_US_PAGE_SEND_BUTTON.replace("$1", arg0)).click();
        waitABit(1500);
    }

    public boolean checkThatErrorMessageIsAppears(String arg0) {
//        List<WebElementFacade> list = findAll(Locators.CONTACT_US_PAGE_ERROR_MSG);
//        for (WebElement element : list) {
//         String s = element.getText();
//         waitABit(1000);
//         s.equals(arg0);
//        }
//        return true;
        List<WebElementFacade> list = findAll(Locators.CONTACT_US_PAGE_ERROR_MSG);
        for (WebElement element : list) {
            element.getText().equals(arg0);
        }
        return true;
    }

    public void writeInTheTextBox(String arg0, String arg1) {
        $(Locators.CONTACT_US_PAGE_TEXTBOX.replace("$1", arg1)).sendKeys(arg0);
        waitABit(1500);
    }
}

