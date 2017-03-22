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
    public void clickLink(String arg0,String arg1) throws Throwable {
        steps.clickLink(arg0,arg1);
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
      steps.clickOnTheLinkOfTheBlock(arg0,arg1);
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
        steps.clickOnTheProductPicture(arg0);
    }

    @When("^clicking on the \"([^\"]*)\" product block READ MORE link$")
    public void clickingOnTheProductBlockREADMORELink(String arg0) throws Throwable {
        steps.clickOnTheProductReadMoreLink(arg0);
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

    @Then("^check that picture of the \"([^\"]*)\" product block is changed and contains \"([^\"]*)\" title$")
    public void checkThatPictureIsChangedAndContainsTitle(String arg0, String arg1) throws Throwable {
        steps.checkThatPictureIsChangedAndContainsTitle(arg0, arg1);
    }

    @Then("^check that picture of the \"([^\"]*)\" product block is changed and contains small description$")
    public void checkThatPictureOfTheProductBlockIsChangedAndContainsSmallDescription(String arg0) throws Throwable {
        steps.checkThatPictureIsChangedAndContainsSmallDesc(arg0);
    }

    @Then("^check that picture of the \"([^\"]*)\" product block is changed and contains \"([^\"]*)\" link$")
    public void checkThatPictureOfTheProductBlockIsChangedAndContainsLink(String arg0, String arg1) throws Throwable {
        steps.checkThatPictureIsChangedAndContainsReadMore(arg0, arg1);
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

    @When("^clicking on the \"([^\"]*)\" blog block MORE link$")
    public void clickingOnTheBlogBlockREADMORELink(String arg0) throws Throwable {
        steps.clickOnTheBlockMoreLink(arg0);
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

//TODO://////////////////////////////////         RSS LINK        //////////////////////////////////////////////////////

    @When("^clicking on the \"([^\"]*)\"$")
    public void clickingOnTheIsOpeningNewsWebsiteWithOurChosenBlog(String arg0) throws Throwable {
        steps.clickingOnTheViewOriginalPost(arg0);
    }

//TODO:///////////////////        CLICK ON THE VIEW ORIGINAL POST IS OPENING OUR CHOSEN BLOG        ////////////////////

    @Then("^checking that click on the View Original Post is opening news website with our chosen blog$")
    public void checkingThatClickOnTheViewOriginalPostIsOpeningCorrectPageOfTheNewsSite() throws Throwable {
        steps.checkingThatClickOnTheViewOriginalPostIsOpeningCorrectPage();
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




//TODO:////////////////////////////////////////      FOOTER       //////////////////////////////////////////////////////

}







