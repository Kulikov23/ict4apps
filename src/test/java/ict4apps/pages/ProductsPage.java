package ict4apps.pages;

import ict4apps.Locators;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

@DefaultUrl("http://88.198.7.89:8100/web/guest/products")
public class ProductsPage extends PageObject {

    public void back(){ getDriver().navigate().back(); }

//TODO://///////////////////////////////            EXAMPLE          ///////////////////////////////////////////////////

    List<WebElement> productBlocks = new ArrayList<>();

    public void getListOfProductBlocks() {
        productBlocks.addAll(findAll(Locators.PRODUCT_BLOCKS));
    }

    public boolean checkForTitlePicReadMore() {
        int countOfTitles = 0;
        for (WebElement element : productBlocks) {
            if (element.findElement(By.xpath(Locators.PRODUCT_TITLE)).isDisplayed()) {
                countOfTitles += 1;
            }
        }
        return productBlocks.size() == countOfTitles;
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

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

    public void clickingOnTheSocialLinks(String arg0) { $(Locators.SOCIAL_NETWORK_LINKS.replace("$1",arg0)).click(); }

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

}




