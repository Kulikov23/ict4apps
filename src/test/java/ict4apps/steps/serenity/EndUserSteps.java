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

//TODO:////////////////////////////////         PRODUCTS PAGE         //////////////////////////////////////////////////

    @Step
    public void theUserIsOnTheProductsPage() {productsPage.open(); }

//TODO:////////////////////////////         CHECKING PRODUCT BLOCKS         ////////////////////////////////////////////

    @Step
    public void clickOnTheProductTitle(String arg0) {
        productsPage.clickOnTitle_products(arg0);
    }

    @Step
    public void checkThatProductPageContainsRequiredItems() {
        Assert.assertTrue(productsPage.checkThatTitleIsPresented());
        Assert.assertTrue(productsPage.checkThatPictureIsPresented());
        Assert.assertTrue(productsPage.checkThatDescriptionIsPresented());
        productsPage.getDriver().navigate().back();
    }

    @Step
    public void clickOnTheProductPicture(String arg0) {
        productsPage.clickOnPicture_products(arg0);
        productsPage.getDriver().navigate().back();
    }

    @Step
    public void clickOnTheProductReadMoreLink(String arg0) {
        productsPage.clickOnReadMore_products(arg0);
        productsPage.getDriver().navigate().back();
    }

//TODO:////////////////////////////         SOCIAL NETWORK LINKS         ///////////////////////////////////////////////

    @Step
    public void clickingOnTheSocialLinks(String arg0,String arg1) {
        productsPage.clickingOnTheSocialLinks(arg0,arg1);
    }

    @Step
    public void LoginPageIsOpened(String arg0) {
        Assert.assertTrue(productsPage.checkThatLoginPageIsOpened().contains(arg0));
    }

    @Step
    public void clickOnTheCategory(String arg0) {
        productsPage.clickOnTheCategory(arg0);
    }

    @Step
    public void categoryIsActive(String arg0) {
        Assert.assertTrue(productsPage.categoryIsActive(arg0));
    }

    @Step
    public void clickOnThePageOf(String arg0) {
        productsPage.clickOnThePageOf(arg0);
    }

    @Step
    public void PageOfDropDownMenuIsOpened(String arg0) {
        Assert.assertTrue(productsPage.PageOfDropDownMenuIsOpened(arg0));
    }

    @Step
    public void dropdownMenuIsOpenedAndContainsElements() {
        Assert.assertTrue(productsPage.dropdownMenuIsOpened());
    }

    public void scroll() {
        productsPage.scroll();
    }
}