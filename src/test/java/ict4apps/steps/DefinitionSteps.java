package ict4apps.steps;

import cucumber.api.PendingException;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ict4apps.steps.serenity.EndUserSteps;

import java.util.Map;

public class DefinitionSteps {

    @Steps
    EndUserSteps steps;

//TODO://////////////////////////////////      WELCOME PAGE       //////////////////////////////////////////////////////

    @Given("the user is on the Welcome page")
    public void theUserIsOnTheWelcomePage() {
        steps.is_the_home_page();
    }

//TODO://///////////////////////////////////      SITE LOGO       //////////////////////////////////////////////////////

    @When("^click on the \"([^\"]*)\" site logo$")
    public void clickOnTheSiteLogo(String arg0) throws Throwable {
        steps.clickOnTheSiteLogo(arg0);
    }

    @Then("^check that \"([^\"]*)\" page is refreshed$")
    public void checkThatPageIsRefreshed(String arg0) throws Throwable {
        steps.checkThatPageIsRefreshed(arg0);
    }

    @Then("^check that \"([^\"]*)\" site logo is appears$")
    public void checkThatSiteLogoIsAppears(String arg0) throws Throwable {
        steps.checkThatSiteLogoIsAppears(arg0);
    }

//TODO://///////////////////////////////      SRCH BUTTON       //////////////////////////////////////////////////////

    @When("^click on the search button$")
    public void clickOnTheSearchButton() throws Throwable {
        steps.clickOnTheSearch();
    }

    @Then("^check that search page is opened$")
    public void checkThatSearchPageIsOpened() throws Throwable {
        steps.checkThatSearchPageIsOpened();
    }

//TODO:///////////////////////////////////////      SIGN IN       //////////////////////////////////////////////////////

    @When("^click on the \"([^\"]*)\" link$")
    public void clickOnTheLink(String arg0) throws Throwable {
        steps.clickOnTheSignInLink(arg0);
    }

    @Then("^\"([^\"]*)\" page is opened$")
    public void pageIsOpened(String arg0) throws Throwable {
        steps.loginPageIsOpened(arg0);
    }

    @Then("^page contains \"([^\"]*)\" button$")
    public void pageContainsButton(String arg0) throws Throwable {
        steps.pageContainsSignInButton(arg0);
    }

    @When("^click on the \"([^\"]*)\" linked image on the \"([^\"]*)\" box$")
    public void clickOnTheLinkedImageOnTheBox(String arg0, String arg1) throws Throwable {
        steps.clickOnTheLinkedImageOnTheBox(arg0, arg1);
    }

    @Then("^check that page with our app \"([^\"]*)\" is opened$")
    public void checkThatPageWithOurAppIsOpened(String arg0) throws Throwable {
        steps.checkThatPageWithOurAppIsOpened(arg0);
    }

    @Then("^check that app download page page is opened \"([^\"]*)\"$")
    public void checkThatAppDownloadPagePageIsOpened(String arg0) throws Throwable {
        steps.checkThatAppDownloadPagePageIsOpened(arg0);
    }

//TODO://////////////////////////////////     NAVIGATION LINKS       ///////////////////////////////////////////////////

    @When("^click \"([^\"]*)\" link of the \"([^\"]*)\" navigation links list$")
    public void clickLink(String arg0, String arg1) throws Throwable {
        steps.clickLink(arg0, arg1);
    }

    @Then("^check that \"([^\"]*)\" page is opened$")
    public void checkThatPageIsOpened(String arg0) throws Throwable {
        steps.checkThatPageIsOpened(arg0);
    }

//TODO:////////////////////////////////         OUR SPECIAL OFFERS          ////////////////////////////////////////////

    @When("^move mouse to the \"([^\"]*)\" block picture$")
    public void moveMouse(String arg0) throws Throwable {
        steps.moveMouse(arg0);
    }

    @Then("^check that first block contains \"([^\"]*)\" title$")
    public void checkThatBlockContainsTitle(String arg0) throws Throwable {
        steps.titleIsDisplayed(arg0);
    }

    @Then("^check that \"([^\"]*)\" block contains small description$")
    public void checkThatBlockContainsSmallDescription(String arg0) throws Throwable {
        steps.descriptionIsDisplayed(arg0);
    }

    @Then("^check that \"([^\"]*)\" block contains \"([^\"]*)\" link$")
    public void checkThatBlockContainsLink(String arg0, String arg1) throws Throwable {
        steps.moreIsDisplayed(arg0, arg1);
    }

    @When("^click on the first block contains \"([^\"]*)\" title$")
    public void clickOnTheFirstBlockContainsTitle(String arg0) throws Throwable {
        steps.clickOnTheFirstBlockContainsTitle(arg0);
    }

    @Then("^check that \"([^\"]*)\" page of our product is opened$")
    public void checkThatPageOfOurProductIsOpened(String arg0) throws Throwable {
        steps.checkThatPageOfOurProductIsOpened(arg0);
    }

    @When("^click on the \"([^\"]*)\" link of the \"([^\"]*)\" block$")
    public void clickOnTheLinkOfTheBlock(String arg0, String arg1) throws Throwable {
        steps.clickOnTheLinkOfTheBlock(arg0, arg1);
    }

//TODO://///////////////////////////     CLICK SCROLL BUTTON      //////////////////////////////////////////////////////

    @When("^click on the scroll button \"([^\"]*)\" of the \"([^\"]*)\" picture carousel$")
    public void clickOnTheScrollButton(String direction, String arg0) throws Throwable {
        steps.clickScrollButton(direction, arg0);
    }

//TODO://////////////////////////////////           BLOGS LIST             /////////////////////////////////////////////

    @When("^clicking on the blog links \"([^\"]*)\"$")
    public void clickingOnTheBlogLinks(String arg0) throws Throwable {
        steps.clickOnBlog(arg0);
    }

    @Then("^blog pages contains following links \"([^\"]*)\", \"([^\"]*)\"$")
    public void blogPagesContainsFollowingLinks(String arg0, String arg1) throws Throwable {
        steps.linksArePresented(arg0, arg1);
    }

//TODO://////////////////////////////////           LANGUAGE LIST             //////////////////////////////////////////

    @Then("^the languages should be in the correct order:$")
    public void theLanguagesShouldBeInTheCorrectOrder(Map<Integer, String> arg0) throws Throwable {
        steps.getListOfLanguages();
        steps.checkCorrectOrderTheLanguages(arg0);
    }

//TODO://////////////////////////////////           FOOD DELIVERY BOXES             ////////////////////////////////////

    @When("^moving on the block \"([^\"]*)\"$")
    public void checkingThatElementsChangingPictures(String arg0) throws Throwable {
        steps.moveToPicture(arg0);
    }

    @Then("^checking that elements changing \"([^\"]*)\" and contains \"([^\"]*)\":$")
    public void checkingThatElementsChangingPicturesAndContains(String arg0, String arg1) throws Throwable {
        steps.checkTactTitleIsDisplayed(arg0, arg1);
    }

    @When("^click on the \"([^\"]*)\"$")
    public void clickOnTheProductPic(String arg0) throws Throwable {
        steps.clickOnTheProductPic(arg0);
    }

    @Then("^check that \"([^\"]*)\" page is opened with our chosen category$")
    public void checkThatPageIsOpenedWithOurChosenCategory(String arg0) throws Throwable {
        steps.checkThatPageIsOpenedWithOurChosenCategory(arg0);
    }

//TODO://///////////////////////////////      READ MORE ABOUT US       /////////////////////////////////////////////////

    @Then("^check that page contains \"([^\"]*)\" header$")
    public void checkThatPageContainsHeader(String arg0) throws Throwable {
        steps.checkThatPageContainsHeader(arg0);
    }

//TODO://///////////////////////////////      PRODUCTS PAGE       //////////////////////////////////////////////////////

    @Given("^the user is on the Products page$")
    public void theUserIsOnTheProductsPage() throws Throwable {
        steps.theUserIsOnTheProductsPage();
    }

//TODO:////////////////////////////          CHECKING PRODUCT BLOCKS          //////////////////////////////////////////

    @When("^clicking on the \"([^\"]*)\" product block title$")
    public void clickingOnTheProductBlockTitle(String arg0) throws Throwable {
        steps.clickOnTheProductTitle(arg0);
    }

    @Then("^checking that product page contains title,picture and description$")
    public void checkingThatProductPageContainsTitlePictureAndDescription() throws Throwable {
        steps.checkThatProductPageContainsRequiredItems();
    }

    @When("^clicking on the \"([^\"]*)\" product block picture$")
    public void clickingOnTheProductBlockPicture(String arg0) throws Throwable {
        steps.clickOnTheProductBlockPicture(arg0);
    }

    @When("^clicking on the \"([^\"]*)\" product block READ MORE link$")
    public void clickingOnTheProductBlockREADMORELink(String arg0) throws Throwable {
        steps.clickOnTheProductReadMoreLink(arg0);
    }

    @Then("^check that picture of the \"([^\"]*)\" product block is changed and contains social network links$")
    public void checkThatPictureOfTheProductBlockIsChangedAndContainsSocialNetworkLinks(String arg0) throws Throwable {
        steps.checkThatPictureOfTheProductBlockIsChangedAndContainsSocialNetworkLinks(arg0);
    }

    @When("^click on the product picture$")
    public void clickOnTheProductPicture() throws Throwable {
        steps.clickOnTheProductPicture();
    }

    @Then("^check that full screen picture is opened$")
    public void checkThatFullScreenPictureIsOpened() throws Throwable {
        steps.checkThatFullScreenPictureIsOpened();
    }

    @When("^click on the close \"([^\"]*)\" button$")
    public void clickOnTheCloseButton(String arg0) throws Throwable {
        steps.clickOnTheCloseButton(arg0);
    }

    @Then("^check that full screen picture is closed$")
    public void checkThatFullScreenPictureIsClosed() throws Throwable {
        steps.checkThatFullScreenPictureIsClosed();
    }

//TODO:////////////////////////////         SOCIAL NETWORK LINKS         ///////////////////////////////////////////////

    @When("^clicking on the \"([^\"]*)\" social network icon of the \"([^\"]*)\" block$")
    public void clickingOnTheSocialLinks(String arg0, String arg1) throws Throwable {
        steps.clickingOnTheSocialLinks(arg0, arg1);
    }

    @Then("^checking that login page is opened and contains \"([^\"]*)\"$")
    public void checkingThatVKLoginPageIsOpenedAndContains(String arg0) throws Throwable {
        steps.LoginPageIsOpened(arg0);
    }

//TODO:////////////////////////////////     CATEGORIES      ////////////////////////////////////////////////////////////

    @When("^clicking on the \"([^\"]*)\" category$")
    public void clickingOnTheCategory(String arg0) throws Throwable {
        steps.clickOnTheCategory(arg0);
    }

    @Then("^\"([^\"]*)\" category is active$")
    public void categoryIsActive(String arg0) throws Throwable {
        steps.categoryIsActive(arg0);
    }

//TODO://////////////////////////////           DROPDOWN BUTTONS         ///////////////////////////////////////////////

    @When("^click on the \"([^\"]*)\" button$")
    public void clickOnTheButton(String arg0) throws Throwable {
        steps.clickOnTheButton(arg0);
    }

    @Then("^dropdown menu is opened$")
    public void dropdownMenuIsOpened() throws Throwable {
        steps.dropdownMenuIsOpened();
    }

    @Then("^dropdown menu contains \"([^\"]*)\" elements$")
    public void dropdownMenuContainsElements(String arg0) throws Throwable {
        steps.dropDownMenuContains(arg0);
    }

    @Then("^click on the \"([^\"]*)\" item$")
    public void clickOnTheItem(String arg0) throws Throwable {
        steps.clickOnTheDropDownMenuItem(arg0);
    }

    @Then("^page should contains \"([^\"]*)\" product blocks$")
    public void pageShouldContainsProductBlocks(String arg0) throws Throwable {
        steps.pageContainsRequiredQuanityOfTheBlocks(arg0);
    }

//TODO://///////////////////////////////      GRID-LIST VIEW BUTTONS       /////////////////////////////////////////////

    @When("^click on the \"([^\"]*)\" list view$")
    public void clickOnTheListView(String arg0) throws Throwable {
        steps.clickChangeViewButton(arg0);
    }

    @Then("^product blocks are changed to grid view$")
    public void productBlocksAreChangedToGridView() throws Throwable {
        steps.productBlocksAreChangedToGridView();
    }

    @Then("^product blocks are changed to list view$")
    public void productBlocksAreChangedToListView() throws Throwable {
        steps.productBlocksAreChangedToListView();
    }

//TODO://///////////////////////////////      SPECIAL OFFERS PAGE       ////////////////////////////////////////////////

    @Given("^the user is on the Special offers page$")
    public void theUserIsOnTheSpecialOffersPage() throws Throwable {
        steps.theUserIsOnTheSpecialOffersPage();
    }

    @When("^move mouse to the \"([^\"]*)\" product picture$")
    public void moveMouseToTheProductPicture(String arg0) throws Throwable {
        steps.move(arg0);
    }

    @Then("^check that picture of the \"([^\"]*)\" product block is changed and contains title$")
    public void checkThatPictureIsChangedAndContainsTitle(String arg0) throws Throwable {
        steps.checkThatPictureIsChangedAndContainsTitle(arg0);
    }

    @Then("^check that picture of the \"([^\"]*)\" product block is changed and contains small description$")
    public void checkThatPictureOfTheProductBlockIsChangedAndContainsSmallDescription(String arg0) throws Throwable {
        steps.checkThatPictureIsChangedAndContainsSmallDesc(arg0);
    }

    @Then("^check that picture of the \"([^\"]*)\" product block is changed and contains \"([^\"]*)\" link$")
    public void checkThatPictureOfTheProductBlockIsChangedAndContainsLink(String arg0, String arg1) throws Throwable {
        steps.checkThatPictureIsChangedAndContainsReadMore(arg0, arg1);
    }

    @Then("^check that \"([^\"]*)\" label is changed to \"([^\"]*)\"$")
    public void checkThatLabelIsChangedTo(String arg0, String arg1) throws Throwable {
        steps.checkThatLabelIsChanged(arg0, arg1);
    }

//TODO:////////////////////////////////         BLOGS PAGE           ///////////////////////////////////////////////////

    @Given("^the user is on the Blogs page$")
    public void theUserIsOnTheBlogsPage() throws Throwable {
        steps.theUserIsOnTheBlogsPage();
    }

//TODO://////////////////////////////////         BLOG BLOCKS        ///////////////////////////////////////////////////

    @Then("^page should contain \"([^\"]*)\" blog blocks$")
    public void pageShouldContainsBlogBlocks(String arg0) throws Throwable {
        steps.pageContainsRequiredQuanityOfTheBlogBlocks(arg0);
    }

    @When("^clicking on the \"([^\"]*)\" blog block title$")
    public void clickingOnTheBlogBlockTitle(String arg0) throws Throwable {
        steps.clickOnTheBlockTitle(arg0);
    }

    @When("^clicking on the \"([^\"]*)\" blog block picture$")
    public void clickingOnTheBlogBlockPicture(String arg0) throws Throwable {
        steps.clickOnTheBlogPicture(arg0);
    }

    @When("^clicking on the \"([^\"]*)\" blog block \"([^\"]*)\" link$")
    public void clickingOnTheBlogBlockREADMORELink(String arg0, String arg1) throws Throwable {
        steps.clickOnTheBlockMoreLink(arg0, arg1);
    }

    @When("^clicking on the \"([^\"]*)\" \"([^\"]*)\" link$")
    public void clickingOnThe0CommentsLink(String arg0, String arg1) throws Throwable {
        steps.clickingOnThe0CommentsLink(arg0, arg1);
    }

    @When("^click on the \"([^\"]*)\" link of the blog page$")
    public void clickOnTheNextPervLinkOfTheBlogPage(String arg0) throws Throwable {
        steps.clickOnTheNextPervLinkOfTheBlogPage(arg0);
    }

    @Then("^check that page is changed$")
    public void checkThatPageIsChanged() throws Throwable {
        steps.checkThatPageIsChanged();
    }

    @When("^clicking on the \"([^\"]*)\" social network icon of the blog$")
    public void clickingOnTheSocialNetworkIconOfTheBlog(String arg0) throws Throwable {
        steps.clickingOnTheSocialNetworkIconOfTheBlog(arg0);
    }

    @When("^click on the \"([^\"]*)\" link of the BLOGS page$")
    public void clickOnTheLinkOfTheBLOGSPage(String arg0) throws Throwable {
        steps.clickOnTheLinkOfTheBLOGSPage(arg0);
    }

    @Then("^check that page is changed to the next$")
    public void checkThatPageIsChangedToTheNext() throws Throwable {
        steps.checkThatPageIsChangedToTheNext();
    }

    @When("^click on the \"([^\"]*)\" button of the BLOGS page$")
    public void clickOnTheButtonOfTheBLOGSPage(String arg0) throws Throwable {
        steps.clickOnTheButtonOfTheBLOGSPage(arg0);
    }

    @When("^clicking on the \"([^\"]*)\"$")
    public void clickingOnTheIsOpeningNewsWebsiteWithOurChosenBlog(String arg0) throws Throwable {
        steps.clickingOnTheViewOriginalPost(arg0);
    }

//TODO://////////////////////////////////         RSS LINK        //////////////////////////////////////////////////////

    @When("^clicking on the \"([^\"]*)\" link$")
    public void clickingOnTheLink(String arg0) throws Throwable {
        steps.clickOnTheRssLink(arg0);
    }

    @Then("^check that rss subscribe page is opened$")
    public void checkThatRssSubscribePageIsOpened() throws Throwable {
        steps.checkThatRssSubscribePageIsOpened();
    }

//TODO:///////////////////        CLICK ON THE VIEW ORIGINAL POST IS OPENING OUR CHOSEN BLOG        ////////////////////

    @Then("^checking that click on the View Original Post is opening news website with our chosen blog in a new tab$")
    public void checkingThatClickOnTheViewOriginalPostIsOpeningCorrectPageOfTheNewsSite() throws Throwable {
        steps.checkingThatClickOnTheViewOriginalPostIsOpeningCorrectPage();
    }

    @Then("^checking that click on the View Original Post is opening news website with our chosen blog$")
    public void checkingThatClickOnTheViewOriginalPostIsOpeningNewsWebsiteWithOurChosenBlog() throws Throwable {
        steps.checkingThatClickOnTheViewOriginalPostIsOpeningNewsWebsiteWithOurChosenBlog();
    }

//TODO://////////////////////////////////         CONTACT US PAGE        ///////////////////////////////////////////////

    @Given("^the user is on the Contact Us page$")
    public void theUserIsOnTheContactUsPage() throws Throwable {
        steps.theUserIsOnTheContactUsPage();
    }

    @When("^clicking on the \"([^\"]*)\" button$")
    public void clickingOnTheButton(String arg0) throws Throwable {
        steps.clickOnTheSendButton(arg0);
    }

    @Then("^check that \"([^\"]*)\" error messages are appears near all \"([^\"]*)\" text boxes$")
    public void checkThatErrorMessagesAreAppears(String arg0, String arg1) throws Throwable {
        steps.checkThatErrorMessagesAreAppearsAboveAllTextBoxes(arg0, arg1);
    }

    @When("^write \"([^\"]*)\" in the \"([^\"]*)\" text box$")
    public void writeInTheTextBox(String arg0, String arg1) throws Throwable {
        steps.writeInTheTextBox(arg0, arg1);
    }

    @Then("^check that \"([^\"]*)\" error message is not appears above the \"([^\"]*)\" text box$")
    public void checkThatErrorMessageIsNotAppearsAboveTheTextBox(String arg0, String arg1) throws Throwable {
        steps.checkThatErrorMessageIsNotAppears(arg0, arg1);
    }

    @When("^write \"([^\"]*)\" in the \"([^\"]*)\" textarea$")
    public void writeInTheTextarea(String arg0, String arg1) throws Throwable {
        steps.writeInTheTextarea(arg0, arg1);
    }

    @Then("^check that \"([^\"]*)\" error message is not appears above the \"([^\"]*)\" textarea$")
    public void checkThatErrorMessageIsNotAppearsAboveTheTextarea(String arg0, String arg1) throws Throwable {
        steps.checkThatErrorMessageIsNotAppearsAboveTextArea(arg0, arg1);
    }

//TODO://////////////////////////////////         SCROLLED HEADER        ///////////////////////////////////////////////

    @When("^scroll down page$")
    public void scrollDownPage() throws Throwable {
        steps.scrollDownPage();
    }

    @Then("^check that scrolled header is appears$")
    public void checkThatScrolledHeaderIsAppears() throws Throwable {
        steps.checkThatScrolledHeaderIsAppears();
    }

//TODO:////////////////////////////////////////      FOOTER       //////////////////////////////////////////////////////

    @When("^clicking on the \"([^\"]*)\" social network icon$")
    public void clickingOnTheSocialNetworkIcon(String arg0) throws Throwable {
        steps.clickingOnTheSocialNetworkIcon(arg0);
    }

    @Then("^check that back to top link is appears$")
    public void checkThatBackToTopLinkIsAppears() throws Throwable {
        steps.checkThatBackToTopLinkIsAppears();
    }

    @When("^click on the back to top link$")
    public void clickOnTheBackToTopLink() throws Throwable {
        steps.clickOnTheBackToTopLink();
    }

//TODO:////////////////////////////////////////      BREADCRUMB       //////////////////////////////////////////////////

    @When("^click on the \"([^\"]*)\" category$")
    public void clickOnTheCategory(String arg0) throws Throwable {
        steps.clickOnTheCategoryWithSubCategory(arg0);
    }

    @Then("^\"([^\"]*)\" category with sub category is active$")
    public void categoryWithSubCategoryIsActive(String arg0) throws Throwable {
        steps.categoryWithSubCategoryIsActive(arg0);
    }

    @Then("^breadcrumb added \"([^\"]*)\" link$")
    public void breadcrumbAddedLink(String arg0) throws Throwable {
        steps.breadcrumbAddedLink(arg0);
    }

    @When("^click on the \"([^\"]*)\" of the active link$")
    public void clickOnTheOfTheActiveLink(String arg0) throws Throwable {
        steps.clickOnTheOfTheActiveLink(arg0);
    }

    @Then("^check that \"([^\"]*)\" sub category appears$")
    public void checkThatSubCategoryAppears(String arg0) throws Throwable {
        steps.checkThatSubCategoryAppears(arg0);
    }

    @When("^click on the \"([^\"]*)\" title of product$")
    public void clickOnTheTitleOfProduct(String arg0) throws Throwable {
        steps.clickOnTheTitleOfProduct(arg0);
    }

    @When("^click on the \"([^\"]*)\" breadcrumb link$")
    public void clickOnTheBreadcrumbLink(String arg0) throws Throwable {
        steps.clickOnTheBreadcrumbLink(arg0);
    }

    @Then("^page is changed and should contain \"([^\"]*)\"$")
    public void pageIsChangedAndShouldContain(String arg0) throws Throwable {
        steps.pageIsChangedAndShouldContain(arg0);
    }

    @Then("^check that Welcome page is opened and contains \"([^\"]*)\"$")
    public void checkThatWelcomePageIsOpenedAndContains(String arg0) throws Throwable {
        steps.checkThatWelcomePageIsOpenedAndContains(arg0);
    }

    @Then("^breadcrumb added link with name of the \"([^\"]*)\" blog block$")
    public void breadcrumbAddedLinkWithNameOfTheFirstBlogBlock(String arg0) throws Throwable {
        steps.breadcrumbAddedLinkWithNameOfTheFirstBlogBlock(arg0);
    }

    @When("^clicking on the \"([^\"]*)\" blog block title on the Blogs page$")
    public void clickingOnTheBlogBlockTitleOnTheBlogsPage(String arg0) throws Throwable {
        steps.clickingOnTheBlogBlockTitleOnTheBlogsPage(arg0);
    }

//TODO:///////////////////////////////////////      SEARCH PAGE       //////////////////////////////////////////////////

    @Given("^the user is on the Search page$")
    public void theUserIsOnTheSearchPage() throws Throwable {
        steps.theUserIsOnTheSearchPage();
    }

    @Then("^check that \"([^\"]*)\" search results are appears$")
    public void checkThatSearchSearchResultsAreAppears(String arg0) throws Throwable {
        steps.checkThatSearchSearchResultsAreAppears(arg0);
    }

    @When("^click on the Scope dropdown menu$")
    public void clickOnTheScopeDropdownMenu() throws Throwable {
        steps.clickOnTheScopeDropdownMenu();
    }

    @Then("^check that list box is opened and contains following \"([^\"]*)\"$")
    public void checkThatListBoxIsOpenedAndContainsFollowing(String arg0) throws Throwable {
        steps.checkThatListBoxIsOpenedAndContainsFollowing(arg0);
    }

    @Then("^check that page is not changing$")
    public void checkThatPageIsNotChanging() throws Throwable {
        steps.checkThatPageIsNotChanging();
    }

    @When("^click on the \"([^\"]*)\" button of the search page$")
    public void clickOnTheButtonOfTheSearchPage(String arg0) throws Throwable {
        steps.clickOnTheButtonOfTheSearchPage(arg0);
    }

    @Then("^check that \"([^\"]*)\" button is hidden$")
    public void checkThatButtonIsHidden(String arg0) throws Throwable {
        steps.checkThatButtonIsHidden(arg0);
    }

    @When("^click on the \"([^\"]*)\" element of the listbox$")
    public void clickOnTheElementOfTheListbox(String arg0) throws Throwable {
        steps.clickOnTheElementOfTheListbox(arg0);
    }

    @When("^write \"([^\"]*)\" in the textbox$")
    public void writeInTheTextbox(String arg0) throws Throwable {
        steps.writeInTheTextbox(arg0);
    }

    @When("^click on the title of the \"([^\"]*)\" result block$")
    public void clickOnTheTitleOfTheResultBlock(String arg0) throws Throwable {
        steps.clickOnTheTitleOfTheResultBlock(arg0);
    }

    @Then("^check that click on the result title is moving us to chosen blog page$")
    public void checkThatClickOnTheFirstResultIsMovingUsToChosenBlogPage() throws Throwable {
        steps.checkThatClickOnTheFirstResultIsMovingUsToChosenBlogPage();
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Then("^check that picture of the \"([^\"]*)\" product block is changed and contains title,small description and \"([^\"]*)\" link$")
    public void checkThatPictureOfTheProductBlockIsChangedAndContainsTitleSmallDescriptionAndLink(String arg0, String arg1) throws Throwable {
     steps.checkThatPictureOfTheProductBlockIsChangedAndContainsTitleSmallDescriptionAndLink(arg0,arg1);
    }


}







