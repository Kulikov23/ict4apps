package ict4apps.steps;

import cucumber.api.PendingException;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import ict4apps.steps.serenity.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps anna;

    /////////////////////////////          1ST TEST CASE         ////////////////////////////////////////

    @Given("the user is on the Welcome page")
    public void givenTheUserIsOnTheWelcomePage() {
        anna.is_the_home_page();
    }

    @When("^click Welcome link$")
    public void clickWelcomeLink() throws Throwable {
        anna.click_welcome();
    }

    @Then("^check that site logo is presented$")
    public void checkThatSiteLogoIsPresented() throws Throwable {
        anna.logoAppear();
    }

/////////////////////////////          2ND TEST CASE         ////////////////////////////////////////

    @When("^click Products link$")
    public void clickProductsLink() throws Throwable {
        anna.click_products();
    }

    @Then("^check that title of the first product block is presented$")
    public void checkThatTitleOfTheFirstProductBlockIsPresented() throws Throwable {
        anna.titleDisplayed();
    }

/////////////////////////////          3RD TEST CASE         ////////////////////////////////////////

    @When("^click Special offers link$")
    public void clickSpecialOffersLink() throws Throwable {
        anna.click_special();
    }

    @Then("^check that Showing results labes is appears$")
    public void checkThatShowingResultsLabesIsAppears() throws Throwable {
        anna.labelIsDisplayed();
    }

/////////////////////////////          4th TEST CASE         ////////////////////////////////////////

    @When("^click Blogs link$")
    public void clickBlogsLink() throws Throwable {
        anna.click_blogs();
    }

    @Then("^check that RSS link is appears$")
    public void checkThatRSSLinkIsAppears() throws Throwable {
        anna.rssLinkIsDisplayed();
    }
/////////////////////////////          5th TEST CASE         ////////////////////////////////////////


    @When("^click Contact us link$")
    public void clickContactUsLink() throws Throwable {
        anna.click_contacts();
    }

    @Then("^check that CONTACTS header is appears$")
    public void checkThatCONTACTSHeaderIsAppears() throws Throwable {
        anna.contactsHeaderDisplayed();
    }
}
