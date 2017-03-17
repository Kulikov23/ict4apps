package ict4apps.pages;


import ict4apps.Locators;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.interactions.Actions;

@DefaultUrl("http://88.198.7.89:8100/web/guest/special-offers")
public class SpecialOffersPage extends PageObject {

    public void move(String arg0) {
        Actions action = new Actions(getDriver());
        action.moveToElement($(Locators.SPECIAL_OFFERS_PRODUCT_BLOCK_PICTURE.replace("$1",arg0))).build().perform();
        waitABit(1500);
    }

    public boolean checkThatPictureIsChangedAndContainsTitle(String arg0,String arg1) {
        return $(Locators.SPECIAL_OFFERS_PRODUCT_BLOCK_TITLE.replace("$1",arg0)).isVisible();
    }

    public boolean checkThatPictureIsChangedAndContainsSmallDesc(String arg0) {
        return $(Locators.SPECIAL_OFFERS_PRODUCT_BLOCK_SMALL_DESC.replace("$1",arg0)).isVisible();
    }

    public boolean checkThatPictureIsChangedAndContainsReadMore(String arg0, String arg1) {
        return $(Locators.SPECIAL_OFFERS_PRODUCT_BLOCK_READ_MORE.replace("$1",arg0).replace("$2",arg1)).isVisible();
    }
}
