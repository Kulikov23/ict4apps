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
    private EndUserSteps steps;

/////////////////////////////           WELCOME PAGE IS OPENED          ////////////////////////////////////////////////

    @Given("the user is on the Welcome page")
    public void givenTheUserIsOnTheWelcomePage() {
        steps.is_the_home_page();
    }

/////////////////////////////           CLICK               ////////////////////////////////////////////////////////////

    @When("^click \"([^\"]*)\" link$")
    public void clickLink(String arg0) throws Throwable {
        steps.clickLink(arg0);
    }

/////////////////////////////          1ST TEST CASE         ///////////////////////////////////////////////////////////

    @Then("^check that site logo is presented$")
    public void checkThatSiteLogoIsPresented() throws Throwable {
        steps.logoAppear();
    }

/////////////////////////////          2ND TEST CASE         ////////////////////////////////////////

    @Then("^check that title of the first product block is presented$")
    public void checkThatTitleOfTheFirstProductBlockIsPresented() throws Throwable {
        steps.titleDisplayed();
    }

/////////////////////////////          3RD TEST CASE         ////////////////////////////////////////

    @Then("^check that Showing results labes is appears$")
    public void checkThatShowingResultsLabesIsAppears() throws Throwable {
        steps.labelIsDisplayed();
    }

/////////////////////////////          4th TEST CASE         ////////////////////////////////////////

    @Then("check that BLOGS header is appears")
    public void checkThatBlogsHeaderDisplayed() throws Throwable {
        steps.blogsHeaderIsDisplayed();
    }
/////////////////////////////          5th TEST CASE         ///////////////////////////////////////////////////////////

    @Then("^check that CONTACTS header is appears$")
    public void checkThatCONTACTSHeaderIsAppears() throws Throwable {
        steps.contactsHeaderDisplayed();
    }

    /////////////////////////////          6th TEST CASE         ////////////////////////////////////////////////////////

    @When("^move mouse to the \"([^\"]*)\" block picture$")
    public void moveMouseToTheFirstBlockPicture(String arg0) throws Throwable {
        steps.moveMouseToPicture(arg0);
    }

    @Then("^check that \"([^\"]*)\" block contains \"([^\"]*)\" title$")
    public void checkThatBlockContainsTitle(String arg0, String food) throws Throwable {
        steps.titleIsDisplayed(arg0,food);
    }

    @Then("^check that \"([^\"]*)\" block contains \"([^\"]*)\" link$")
    public void checkThatBlockContainsLink(String arg0,String more) throws Throwable {
        steps.moreIsDisplayed(arg0,more);
    }

    @Then("^check that \"([^\"]*)\" block contains small description$")
    public void checkThatBlockContainsSmallDescription(String arg0) throws Throwable {
        steps.descriptionIsDisplayed(arg0);
    }
///////////////////////////////     CLICK SCROLL BUTTON      ///////////////////////////////////////////////////////////

    @When("^click on the scroll button \"([^\"]*)\" of the \"([^\"]*)\" picture carousel$")
    public void clickOnTheScrollButton(String direction,String arg0) throws Throwable {
        steps.clickScrollButton(direction,arg0);
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @When("^clicking on the blog links \"([^\"]*)\"$")
    public void clickingOnTheBlogLinks(String arg0) throws Throwable {
        steps.clickOnBlog(arg0);
    }

    @Then("^blog pages contains following links \"([^\"]*)\", \"([^\"]*)\"$")
    public void blogPagesContainsFollowingLinks(String arg0, String arg1) throws Throwable {
        steps.linksArePresented(arg0,arg1);
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


}
