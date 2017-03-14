package ict4apps.steps.serenity;

import ict4apps.pages.ProductsPage;
import ict4apps.pages.WelcomePage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps {

    private WelcomePage welcomePage;
    ProductsPage productsPage;

    @Step
    public void is_the_home_page() { welcomePage.open(); }

    @Step
    public void clickLink(String arg0) {
        welcomePage.linkWithStr(arg0).click();
    }

    @Step
    public void logoAppear() {
        Assert.assertTrue(welcomePage.siteLogoIsAppeares().isDisplayed());
    }

    @Step
    public void titleDisplayed() {
        Assert.assertTrue(welcomePage.titleDisplayed().isDisplayed());
        welcomePage.getDriver().navigate().back();
    }

    @Step
    public void labelIsDisplayed() {
        Assert.assertTrue(welcomePage.labelDisplayed().isDisplayed());
        welcomePage.getDriver().navigate().back();
    }

    @Step
    public void blogsHeaderIsDisplayed() {
        Assert.assertTrue(welcomePage.blogsHeaderDisplayed().isDisplayed());
        welcomePage.getDriver().navigate().back();
    }

    @Step
    public void contactsHeaderDisplayed() {
        Assert.assertTrue(welcomePage.contactsHeader_displayed().isDisplayed());
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Step
    public void moveMouseToPicture(String arg0) {
        welcomePage.moveAction(arg0);
    }

    @Step
    public void titleIsDisplayed(String arg0,String food) {
        Assert.assertTrue(welcomePage.titleWithStr(arg0,food));
    }

    @Step
    public void moreIsDisplayed(String arg0,String more) {
        Assert.assertTrue(welcomePage.moreIsDisplayed(arg0,more));
    }

    @Step
    public void descriptionIsDisplayed(String arg0) {
        Assert.assertTrue(welcomePage.descriptionIsDisplayed(arg0));
    }

    @Step
    public void clickScrollButton(String direction,String arg0) {
        welcomePage.clickScrollButton(direction,arg0);
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Step
    public void clickOnBlog(String arg0) {
        welcomePage.clickBlog(arg0);
    }

    @Step
    public void linksArePresented(String arg0, String arg1) {
        Assert.assertTrue(welcomePage.viewOriginalPostLinkIsPresented(arg0,arg1));
        Assert.assertTrue(welcomePage.readMoreLinkIsPresented(arg0,arg1));
    }

    @Step
    public void getListOfLanguages() {
        welcomePage.getListOfLanguages();
    }

    @Step
    public void checkCorrectOrderTheLanguages(Map<Integer, String> arg0) {
        Assert.assertTrue(welcomePage.checkCorrectOrderTheLanguages(arg0));
    }

    @Step
    public void moveToPicture(String arg0) {
        welcomePage.moveToPicture(arg0);
    }

    @Step
    public void checkTactTitleIsDisplayed(String arg0,String arg1) {
        Assert.assertTrue(welcomePage.checkThatTitleIsDisplayed(arg0,arg1));
    }

////////////////////////////////////        PRODUCTS PAGE       ////////////////////////////////////////////////////////

    @Step
    public void theUserIsOnTheProductsPage() {productsPage.open();  }

    @Step
    public void getListOfproductBlocks() {
        productsPage.getListOfproductBlocks();
    }

    @Step
    public void checkForTitlePicReadMore() {
        Assert.assertTrue(productsPage.checkForTitlePicReadMore());
    }

    @Step
    public void clickOnTheFirstElement(String arg1) {
        productsPage.clickOnTitle_products(arg1);
        productsPage.clickOnPicture_products(arg1);
        productsPage.clickOnReadMore_products(arg1);
    }
    @Step
    public void clickOnTheSecondElement(String arg1) {
        productsPage.clickOnTitle_products(arg1);
        productsPage.clickOnPicture_products(arg1);
        productsPage.clickOnReadMore_products(arg1);
    }
    @Step
    public void clickOnTheThirdElement(String arg1) {
        productsPage.clickOnTitle_products(arg1);
        productsPage.clickOnPicture_products(arg1);
        productsPage.clickOnReadMore_products(arg1);
    }


}