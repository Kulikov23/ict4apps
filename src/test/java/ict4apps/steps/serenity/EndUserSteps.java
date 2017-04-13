package ict4apps.steps.serenity;

import ict4apps.pages.*;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import java.util.Map;

public class EndUserSteps {

    WelcomePage welcomePage;
    ProductsPage productsPage;
    SpecialOffersPage specialOffersPage;
    BlogsPage blogsPage;
    ContactUsPage contactUs;
    Breadcrumb breadcrumb;
    SearchPage searchPage;
    SignInPage signInPage;
    CreateAccountPage createAccount;

//TODO://///////////////////////////////         WELCOME PAGE         //////////////////////////////////////////////////

    @Step
    public void is_the_home_page() {
        welcomePage.open();
    }

//TODO:///////////////////////////////////         SITE LOGO            ////////////////////////////////////////////////

    @Step
    public void clickOnTheSiteLogo(String arg0) {
        welcomePage.clickOnTheSiteLogo(arg0);
    }

    @Step
    public void checkThatPageIsRefreshed(String arg0) {
        Assert.assertTrue(welcomePage.checkThatPageIsRefreshed(arg0));
    }

    @Step
    public void checkThatSiteLogoIsAppears(String arg0) {
        Assert.assertTrue(welcomePage.checkThatSiteLogoIsAppears(arg0));
    }

//TODO://///////////////////////////////      SRCH BUTTON       //////////////////////////////////////////////////////

    @Step
    public void clickOnTheSearch() {
        welcomePage.clickOnTheSearch();
    }

    @Step
    public void checkThatSearchPageIsOpened() {
        Assert.assertTrue(welcomePage.checkThatSearchPageIsOpened());
        Assert.assertTrue(welcomePage.checkThatSearchPageContainsSearchBth());
//        welcomePage.back();
    }

//TODO:///////////////////////////////////////      SIGN IN       //////////////////////////////////////////////////////

    @Step
    public void clickOnTheSignInLink(String arg0) {
        welcomePage.clickOnTheSignInLink(arg0);
    }

    @Step
    public void loginPageIsOpened(String arg0) {
        Assert.assertTrue(welcomePage.loginPageIsOpened(arg0));
    }

    @Step
    public void pageContainsSignInButton(String arg0) {
        Assert.assertTrue(welcomePage.pageContainsSignInButton(arg0));
    }

    @Step
    public void clickOnTheLinkedImageOnTheBox(String arg0, String arg1) {
        welcomePage.clickOnTheLinkedImageOnTheBox(arg0, arg1);
    }

    @Step
    public void checkThatPageWithOurAppIsOpened(String arg0) {
        Assert.assertTrue(welcomePage.checkThatPageWithOurAppIsOpened(arg0));
    }

    @Step
    public void checkThatAppDownloadPagePageIsOpened(String arg0) {
        Assert.assertTrue(welcomePage.checkThatAppDownloadPagePageIsOpened(arg0));
    }


//TODO://////////////////////////////////     NAVIGATION LINKS       ///////////////////////////////////////////////////

    @Step
    public void clickLink(String arg0, String arg1) {
        welcomePage.linkWithStr(arg0, arg1);
    }

    @Step
    public void checkThatPageIsOpened(String arg0) {
        Assert.assertTrue(welcomePage.checkThatPageIsOpened(arg0));
    }

//TODO:////////////////////////////////         OUR SPECIAL OFFERS          ////////////////////////////////////////////

    public void moveMouse(String arg0) {
        welcomePage.moveAction(arg0);
    }

    @Step
    public void titleIsDisplayed(String arg0) {
        Assert.assertTrue(welcomePage.titleWithStr(arg0));
    }

    @Step
    public void descriptionIsDisplayed(String arg0) {
        Assert.assertTrue(welcomePage.descriptionIsDisplayed(arg0));
    }

    @Step
    public void moreIsDisplayed(String arg0, String arg1) {
        Assert.assertTrue(welcomePage.moreIsDisplayed(arg0, arg1));
    }

    @Step
    public void clickOnTheFirstBlockContainsTitle(String arg0) {
        welcomePage.clickOnTheFirstBlockContainsTitle(arg0);
    }

    @Step
    public void clickOnTheLinkOfTheBlock(String arg0, String arg1) {
        welcomePage.back();
        welcomePage.moveAction(arg1);
        welcomePage.clickOnTheLinkOfTheBlock(arg0, arg1);
    }

    @Step
    public void checkThatPageOfOurProductIsOpened(String arg0) {
        Assert.assertTrue(welcomePage.checkThatPageOfOurProductIsOpened(arg0));
    }

//TODO://///////////////////////////     CLICK SCROLL BUTTON      //////////////////////////////////////////////////////

    @Step
    public void clickScrollButton(String direction, String arg0) {
        welcomePage.clickScrollButton(direction, arg0);
    }

//TODO://////////////////////////////////           BLOGS LIST             /////////////////////////////////////////////

    @Step
    public void clickOnBlog(String arg0) {
        welcomePage.clickBlog(arg0);
    }

    @Step
    public void linksArePresented(String arg0, String arg1) {
        Assert.assertTrue(welcomePage.viewOriginalPostLinkIsPresented(arg0, arg1));
        Assert.assertTrue(welcomePage.readMoreLinkIsPresented(arg0, arg1));
    }

//TODO://////////////////////////////////           LANGUAGE LIST             //////////////////////////////////////////

    @Step
    public void getListOfLanguages() {
        welcomePage.getListOfLanguages();
    }

    @Step
    public void checkCorrectOrderTheLanguages(Map<Integer, String> arg0) {
        Assert.assertTrue(welcomePage.checkCorrectOrderTheLanguages(arg0));
    }

//TODO://////////////////////////////////           FOOD DELIVERY BOXES             ////////////////////////////////////

    @Step
    public void moveToPicture(String arg0) {
        welcomePage.moveToPicture(arg0);
    }

    @Step
    public void checkTactTitleIsDisplayed(String arg0, String arg1) {
        Assert.assertTrue(welcomePage.checkThatTitleIsDisplayed(arg0, arg1));
    }

    @Step
    public void clickOnTheProductPic(String arg0) {
        welcomePage.clickOnTheProductPic(arg0);
    }

    @Step
    public void checkThatPageIsOpenedWithOurChosenCategory(String arg0) {
        Assert.assertTrue(welcomePage.checkThatPageIsOpenedWithOurChosenCategory(arg0));
        welcomePage.back();
    }

//TODO://///////////////////////////////      READ MORE ABOUT US       /////////////////////////////////////////////////

    @Step
    public void checkThatPageContainsHeader(String arg0) {
        Assert.assertTrue(welcomePage.checkThatPageContainsHeader(arg0));
    }

//TODO:////////////////////////////////         PRODUCTS PAGE         //////////////////////////////////////////////////

    @Step
    public void theUserIsOnTheProductsPage() {
        productsPage.open();
    }

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
    }

    @Step
    public void clickOnTheProductBlockPicture(String arg0) {
        productsPage.clickOnPicture_products(arg0);
    }

    @Step
    public void clickOnTheProductReadMoreLink(String arg0) {
        productsPage.clickOnReadMore_products(arg0);
    }

    @Step
    public void checkThatPictureOfTheProductBlockIsChangedAndContainsSocialNetworkLinks(String arg0) {
        Assert.assertTrue(productsPage.checkThatPictureOfTheProductBlockIsChangedAndContainsSocialNetworkLinks(arg0));
    }

    @Step
    public void clickOnTheProductPicture() {
        productsPage.clickOnTheProductPicture();
    }

    @Step
    public void checkThatFullScreenPictureIsOpened() {
        Assert.assertTrue(productsPage.checkThatFullScreenPictureIsOpened());
    }

    @Step
    public void clickOnTheCloseButton(String arg0) {
        productsPage.clickOnTheCloseButton(arg0);
    }

    @Step
    public void checkThatFullScreenPictureIsClosed() {
        Assert.assertFalse(productsPage.checkThatFullScreenPictureIsClosed());
    }

    @Step
    public void clickOnTheCircleArrowLink() {
        productsPage.clickOnTheCircleArrowLink();
    }

//TODO:////////////////////////////         SOCIAL NETWORK LINKS         ///////////////////////////////////////////////

    @Step
    public void clickingOnTheSocialLinks(String arg0, String arg1) {
        productsPage.clickingOnTheSocialLinks(arg0, arg1);
    }

    @Step
    public void LoginPageIsOpened(String arg0) {
        Assert.assertTrue(productsPage.checkThatLoginPageIsOpened(arg0));
    }

//TODO:////////////////////////////////     CATEGORIES      ////////////////////////////////////////////////////////////

    @Step
    public void clickOnTheCategory(String arg0) {
        productsPage.clickOnTheCategory(arg0);
    }

    @Step
    public void categoryIsActive(String arg0) {
        Assert.assertTrue(productsPage.categoryIsActive(arg0));
    }

//TODO://////////////////////////////           DROPDOWN BUTTONS         ///////////////////////////////////////////////

    @Step
    public void clickOnTheButton(String arg0) {
        productsPage.clickOnTheButton(arg0);
    }

    @Step
    public void dropdownMenuIsOpened() {
        Assert.assertTrue(productsPage.dropdownMenuIsOpened());
    }

    @Step
    public void dropDownMenuContains(String arg0) {
        Assert.assertTrue(productsPage.dropDownMenuContains(arg0));
    }

    @Step
    public void clickOnTheDropDownMenuItem(String arg0) {
        productsPage.clickOnTheDropDownMenuItem(arg0);
    }

    @Step
    public void pageContainsRequiredQuanityOfTheBlocks(String arg0) {
        Assert.assertTrue(productsPage.pageContainsRequiredQuanityOfBlocks(arg0));
    }

    @Step
    public void clickChangeViewButton(String arg0) {
        productsPage.clickChangeViewButton(arg0);
    }

//TODO://///////////////////////////////      GRID-LIST VIEW BUTTONS       /////////////////////////////////////////////

    @Step
    public void productBlocksAreChangedToGridView() {
        Assert.assertFalse(productsPage.productBlocksAreChangedView());
    }

    @Step
    public void productBlocksAreChangedToListView() {
        Assert.assertTrue(productsPage.productBlocksAreChangedView());
    }

//TODO://///////////////////////////////      SPECIAL OFFERS PAGE       ////////////////////////////////////////////////

    @Step
    public void theUserIsOnTheSpecialOffersPage() {
        specialOffersPage.open();
    }

    @Step
    public void move(String arg0) {
        specialOffersPage.move(arg0);
    }

    @Step
    public void checkThatPictureIsChangedAndContainsTitle(String arg0) {
        Assert.assertTrue(specialOffersPage.checkThatPictureIsChangedAndContainsTitle(arg0));
    }

    @Step
    public void checkThatPictureIsChangedAndContainsSmallDesc(String arg0) {
        Assert.assertTrue(specialOffersPage.checkThatPictureIsChangedAndContainsSmallDesc(arg0));
    }

    @Step
    public void checkThatPictureIsChangedAndContainsReadMore(String arg0, String arg1) {
        Assert.assertTrue(specialOffersPage.checkThatPictureIsChangedAndContainsReadMore(arg0, arg1));
    }

    @Step
    public void checkThatLabelIsChanged(String arg0, String arg1) {
        Assert.assertTrue(specialOffersPage.checkThatLabelIsChanged(arg0, arg1));
    }

//TODO:////////////////////////////////         BLOGS PAGE           ///////////////////////////////////////////////////

    @Step
    public void theUserIsOnTheBlogsPage() {
        blogsPage.open();
    }

    @Step
    public void pageContainsRequiredQuanityOfTheBlogBlocks(String arg0) {
        Assert.assertTrue(blogsPage.pageContainsRequiredQuanityOfBlogBlocks(arg0));
    }

    @Step
    public void clickOnTheBlockTitle(String arg0) {
        blogsPage.clickOnTheBlockTitle(arg0);
    }

    @Step
    public void clickOnTheBlogPicture(String arg0) {
        blogsPage.back();
        blogsPage.clickOnTheBlockPicture(arg0);
    }

    @Step
    public void clickOnTheBlockMoreLink(String arg0, String arg1) {
        blogsPage.back();
        blogsPage.clickOnTheBlockMoreLink(arg0, arg1);
    }

    @Step
    public void checkingThatClickOnTheViewOriginalPostIsOpeningNewsWebsiteWithOurChosenBlog() {
        Assert.assertTrue(blogsPage.checkingThatClickOnTheViewOriginalPostIsOpeningNewsWebsiteWithOurChosenBlog());
    }

    @Step
    public void clickingOnThe0CommentsLink(String arg0, String arg1) {
        blogsPage.back();
        blogsPage.clickingOnThe0CommentsLink(arg0, arg1);
    }

    @Step
    public void clickOnTheNextPervLinkOfTheBlogPage(String arg0) {
        blogsPage.clickOnTheNextPervLinkOfTheBlogPage(arg0);
    }

    @Step
    public void checkThatPageIsChanged() {
        Assert.assertTrue(blogsPage.checkThatPageIsChanged());
    }

    @Step
    public void clickingOnTheSocialNetworkIconOfTheBlog(String arg0) {
        blogsPage.clickingOnTheSocialNetworkIconOfTheBlog(arg0);
    }

    @Step
    public void clickOnTheLinkOfTheBLOGSPage(String arg0) {
        blogsPage.clickOnTheLinkOfTheBLOGSPage(arg0);
    }

    @Step
    public void checkThatPageIsChangedToTheNext() {
        Assert.assertTrue(blogsPage.checkThatPageIsChangedToTheNext());
    }

    @Step
    public void clickOnTheButtonOfTheBLOGSPage(String arg0) {
        blogsPage.clickOnTheButtonOfTheBLOGSPage(arg0);
    }

//TODO://////////////////////////////////         RSS LINK        //////////////////////////////////////////////////////

    @Step
    public void clickOnTheRssLink(String arg0) {
        blogsPage.clickOnTheRssLink(arg0);
    }

    @Step
    public void checkThatRssSubscribePageIsOpened() {
        Assert.assertFalse(blogsPage.checkThatRssSubscribePageIsOpened());
    }

    @Step
    public void clickingOnTheViewOriginalPost(String arg0) {
        blogsPage.clickingOnTheViewOriginalPost(arg0);
    }

    @Step
    public void checkingThatClickOnTheViewOriginalPostIsOpeningCorrectPage() {
        Assert.assertTrue(blogsPage.checkThatClickOnTheViewOriginalPostIsOpeningCorrectPage());
    }

//TODO://////////////////////////////////         CONTACT US PAGE        ///////////////////////////////////////////////

    @Step
    public void theUserIsOnTheContactUsPage() {
        contactUs.open();
    }

    @Step
    public void clickOnTheSendButton(String arg0) {
        contactUs.clickOnTheSendButton(arg0);
    }

    @Step
    public void checkThatErrorMessagesAreAppearsAboveAllTextBoxes(String arg0, String arg1) {
        Assert.assertTrue(contactUs.checkThatErrorMessageIsAppears(arg0, arg1));
    }

    @Step
    public void writeInTheTextBox(String arg0, String arg1) {
        contactUs.writeInTheTextBox(arg0, arg1);
    }

    @Step
    public void checkThatErrorMessageIsNotAppears(String arg0, String arg1) {
        Assert.assertTrue(contactUs.checkThatErrorMessageIsAppears(arg0, arg1));
    }

    @Step
    public void writeInTheTextarea(String arg0, String arg1) {
        contactUs.writeInTheTextarea(arg0, arg1);
    }

    @Step
    public void checkThatErrorMessageIsNotAppearsAboveTextArea(String arg0, String arg1) {
        Assert.assertTrue(contactUs.checkThatErrorMessageIsNotAppearsAboveTextArea(arg0, arg1));
    }

//TODO://////////////////////////////////         SCROLLED HEADER        ///////////////////////////////////////////////

    @Step
    public void scrollDownPage() {
        productsPage.scrollDownPage();
    }

    @Step
    public void checkThatScrolledHeaderIsAppears() {
        Assert.assertTrue(productsPage.checkThatScrolledHeaderIsAppears());
    }

//TODO:////////////////////////////////////////      FOOTER       //////////////////////////////////////////////////////

    @Step
    public void clickingOnTheSocialNetworkIcon(String arg0) {
        welcomePage.clickingOnTheSocialNetworkIcon(arg0);
    }

    @Step
    public void checkThatBackToTopLinkIsAppears() {
        Assert.assertTrue(welcomePage.checkThatBackToTopLinkIsAppears());
    }

    @Step
    public void clickOnTheBackToTopLink() {
        welcomePage.clickOnTheBackToTopLink();
    }

//TODO:////////////////////////////////////////      BREADCRUMB       //////////////////////////////////////////////////

    @Step
    public void clickOnTheCategoryWithSubCategory(String arg0) {
        breadcrumb.clickOnTheCategoryWithSubCategory(arg0);
    }

    @Step
    public void categoryWithSubCategoryIsActive(String arg0) {
        Assert.assertTrue(breadcrumb.categoryWithSubCategoryIsActive(arg0));
    }

    @Step
    public void breadcrumbAddedLink(String arg0) {
        Assert.assertTrue(breadcrumb.breadcrumbAddedLink(arg0));
    }

    @Step
    public void clickOnTheOfTheActiveLink(String arg0) {
        breadcrumb.clickOnTheOfTheActiveLink(arg0);
    }

    @Step
    public void checkThatSubCategoryAppears(String arg0) {
        Assert.assertTrue(breadcrumb.checkThatSubCategoryAppears(arg0));
    }

    @Step
    public void clickOnTheTitleOfProduct(String arg0) {
        breadcrumb.clickOnTheTitleOfProduct(arg0);
    }

    @Step
    public void clickOnTheBreadcrumbLink(String arg0) {
        breadcrumb.clickOnTheBreadcrumbLink(arg0);
    }

    @Step
    public void pageIsChangedAndShouldContain(String arg0) {
        Assert.assertTrue(breadcrumb.pageIsChangedAndShouldContain(arg0));
    }

    @Step
    public void checkThatWelcomePageIsOpenedAndContains(String arg0) {
        Assert.assertTrue(breadcrumb.checkThatWelcomePageIsOpenedAndContains(arg0));
    }

    @Step
    public void breadcrumbAddedLinkWithNameOfTheFirstBlogBlock(String arg0) {
        Assert.assertTrue(breadcrumb.breadcrumbAddedLinkWithNameOfTheFirstBlogBlock(arg0));
    }

    @Step
    public void clickingOnTheBlogBlockTitleOnTheBlogsPage(String arg0) {
        breadcrumb.clickingOnTheBlogBlockTitleOnTheBlogsPage(arg0);
    }

//TODO:///////////////////////////////////////      SEARCH PAGE       //////////////////////////////////////////////////

    @Step
    public void theUserIsOnTheSearchPage() {
        searchPage.open();
    }

    @Step
    public void clickOnTheScopeDropdownMenu() {
        searchPage.clickOnTheScopeDropdownMenu();
    }

    @Step
    public void checkThatListBoxIsOpenedAndContainsFollowing(String arg0) {
        Assert.assertTrue(searchPage.checkThatListBoxIsOpenedAndContainsFollowing(arg0));
    }

    @Step
    public void checkThatSearchSearchResultsAreAppears(String arg0) {
        Assert.assertTrue(searchPage.checkThatSearchSearchResultsAreAppears(arg0));
    }

    @Step
    public void checkThatPageIsNotChanging() {
        Assert.assertTrue(searchPage.checkThatPageIsNotChanging());
    }

    @Step
    public void clickOnTheButtonOfTheSearchPage(String arg0) {
        searchPage.clickOnTheSearchButtonOfTheSearchPage(arg0);
    }

    @Step
    public void checkThatButtonIsHidden(String arg0) {
        Assert.assertTrue(searchPage.checkThatButtonIsHidden(arg0));
    }

    @Step
    public void writeInTheTextbox(String arg0) {
        searchPage.writeInTheTextbox(arg0);
    }

    @Step
    public void clickOnTheElementOfTheListbox(String arg0) {
        searchPage.clickOnTheElementOfTheListbox(arg0);
    }

    @Step
    public void clickOnTheTitleOfTheResultBlock(String arg0) {
        searchPage.clickOnTheTitleOfTheResultBlock(arg0);
    }

    @Step
    public void checkThatClickOnTheFirstResultIsMovingUsToChosenBlogPage() {
        Assert.assertTrue(searchPage.checkThatClickOnTheFirstResultIsMovingUsToChosenBlogPage());
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Step
    public void checkThatPictureOfTheProductBlockIsChangedAndContainsTitleSmallDescriptionAndLink(String arg0, String arg1) {
        Assert.assertTrue(productsPage.checkThatPictureOfTheProductBlockIsChangedAndContainsTitleSmallDescriptionAndLink(arg0, arg1));
    }

//TODO:///////////////////////////////////////      SIGN IN PAGE       /////////////////////////////////////////////////

    @Step
    public void theUserIsOnTheSignInPage() {
        signInPage.open();
    }

    @Step
    public void clickOnTheButtonOnTheContentPart(String arg0) {
        signInPage.clickOnTheButtonOnTheContentPart(arg0);
    }

    @Step
    public void checkThatErrorMassageAppearsNearAndTextBoxes(String arg0, String arg1) {
        Assert.assertTrue(signInPage.checkThatErrorMassageAppearsNearAndTextBoxes(arg0, arg1));
    }

    @Step
    public void clickOnTheRememberMeCheckbox() {
        signInPage.clickOnTheRememberMeCheckbox();
    }

    @Step
    public void checkThatRememberMeCheckboxIsChecked() {
        Assert.assertTrue(signInPage.checkThatRememberMeCheckboxIsChecked());
    }

    @Step
    public void checkThatRememberMeCheckboxIsNotChecked() {
        Assert.assertTrue(signInPage.checkThatRememberMeCheckboxIsNotChecked());
    }

    @Step
    public void checkThatPageIsChangedToWelcomePage() {
        Assert.assertTrue(signInPage.checkThatPageIsChangedToWelcomePage());
    }

    @Step
    public void clickOnTheLinkedImage(String arg0) {
        signInPage.clickOnTheLinkedImage(arg0);
    }

    @Step
    public void checkThatLoginPageIsOpened(String arg0) {
        productsPage.checkThatLoginPageIsOpened(arg0);
    }

    @Step
    public void writeIntoTheTextBox(String arg0, String arg1) {
        signInPage.writeIntoTheTextBox(arg0, arg1);
    }

    @Step
    public void clearAllTestBoxes() {
        signInPage.clearAllTestBoxes();
    }

    @Step
    public void checkThatErrorMassageAppears(String arg0) {
        signInPage.checkThatErrorMassageAppears(arg0);
    }

//TODO:///////////////////////////////////////      CREATE ACCOUNT PAGE       //////////////////////////////////////////

//    @Step
//    public void theUserIsOnTheCreateAccountPage() {
//        createAccount.open();
//    }
}

