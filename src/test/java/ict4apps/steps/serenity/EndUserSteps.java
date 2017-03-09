package ict4apps.steps.serenity;

import ict4apps.pages.DictionaryPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps {

    DictionaryPage dictionaryPage;

    @Step
    public void is_the_home_page() {
        dictionaryPage.open();
    }

    @Step
    public void clickLink(String arg0) {
        dictionaryPage.linkWithStr(arg0).click();
    }

    @Step
    public void logoAppear() {
        Assert.assertTrue(dictionaryPage.siteLogoIsAppeares().isDisplayed());
    }

    @Step
    public void titleDisplayed() {
        Assert.assertTrue(dictionaryPage.titleDisplayed().isDisplayed());
        dictionaryPage.getDriver().navigate().back();
    }

    @Step
    public void labelIsDisplayed() {
        Assert.assertTrue(dictionaryPage.labelDisplayed().isDisplayed());
        dictionaryPage.getDriver().navigate().back();
    }

    @Step
    public void rssLinkIsDisplayed() {
        Assert.assertTrue(dictionaryPage.rssDisplayed().isDisplayed());
        dictionaryPage.getDriver().navigate().back();
    }

    @Step
    public void contactsHeaderDisplayed() {
        Assert.assertTrue(dictionaryPage.contactsHeader_displayed().isDisplayed());
    }

}