package ict4apps.steps;

import cucumber.api.PendingException;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import ict4apps.steps.serenity.EndUserSteps;

public class DefinitionSteps {

    @Steps
    private EndUserSteps anna;

/////////////////////////////           WELCOME PAGE IS OPENED          //////////////////////////////

    @Given("the user is on the Welcome page")
    public void givenTheUserIsOnTheWelcomePage() {
        anna.is_the_home_page();
    }

/////////////////////////////           CLICK               /////////////////////////////////////////

    @When("^click \"([^\"]*)\" link$")
    public void clickLink(String arg0) throws Throwable {
        anna.clickLink(arg0);
    }

/////////////////////////////          1ST TEST CASE         ////////////////////////////////////////

    @Then("^check that site logo is presented$")
    public void checkThatSiteLogoIsPresented() throws Throwable {
        anna.logoAppear();
    }

/////////////////////////////          2ND TEST CASE         ////////////////////////////////////////

    @Then("^check that title of the first product block is presented$")
    public void checkThatTitleOfTheFirstProductBlockIsPresented() throws Throwable {
        anna.titleDisplayed();
    }

/////////////////////////////          3RD TEST CASE         ////////////////////////////////////////

    @Then("^check that Showing results labes is appears$")
    public void checkThatShowingResultsLabesIsAppears() throws Throwable {
        anna.labelIsDisplayed();
    }

/////////////////////////////          4th TEST CASE         ////////////////////////////////////////

    @Then("check that BLOGS header is appears")
    public void checkThatBlogsHeaderDisplayed() throws Throwable {
        anna.blogsHeaderIsDisplayed();
    }
/////////////////////////////          5th TEST CASE         ////////////////////////////////////////

    @Then("^check that CONTACTS header is appears$")
    public void checkThatCONTACTSHeaderIsAppears() throws Throwable {
        anna.contactsHeaderDisplayed();
    }

    /////////////////////////////          6th TEST CASE         ////////////////////////////////////////

    @When("^move mouse to the first block picture$")
    public void moveMouseToTheFirstBlockPicture() throws Throwable {
      anna.moveMouseToPicture();
    }

    @Then("^check that block contains \"([^\"]*)\" title$")
    public void checkThatBlockContainsTitleDescriptionAndMoreLink(String food) throws Throwable {
        anna.titleDescMoreIsDisplayed(food);
    }




}
