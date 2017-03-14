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

//////////////////////////    EXAMPLE   ////////////////////////////////////////////////////////////////////////////////

    List<WebElement> productBlocks = new ArrayList<>();

    public void getListOfproductBlocks() {
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
       getDriver().navigate().back();
    }

    public void clickOnPicture_products(String arg1) {
        $(Locators.PRODUCT_PICTURE.replace("$1", arg1)).click();
        getDriver().navigate().back();
    }
    public void clickOnReadMore_products(String arg1) {
        $(Locators.READ_MORE.replace("$1", arg1)).click();
        getDriver().navigate().back();
    }

}



