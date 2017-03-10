package ict4apps.steps.serenity;

import ict4apps.Locators;
import ict4apps.pages.DictionaryPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps {

    private DictionaryPage dictionaryPage;

    @Step
    public void is_the_home_page() { dictionaryPage.open(); }

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
    public void blogsHeaderIsDisplayed() {
        Assert.assertTrue(dictionaryPage.blogsHeaderDisplayed().isDisplayed());
        dictionaryPage.getDriver().navigate().back();
    }

    @Step
    public void contactsHeaderDisplayed() {
        Assert.assertTrue(dictionaryPage.contactsHeader_displayed().isDisplayed());
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Step
    public void moveMouseToPicture(String arg0) {
        dictionaryPage.moveAction(arg0);
    }

    @Step
    public void titleIsDisplayed(String arg0,String food) {
        Assert.assertTrue(dictionaryPage.titleWithStr(arg0,food));
    }

    @Step
    public void moreIsDisplayed(String arg0,String more) {
        Assert.assertTrue(dictionaryPage.moreIsDisplayed(arg0,more));
    }

    @Step
    public void descriptionIsDisplayed(String arg0) {
        Assert.assertTrue(dictionaryPage.descriptionIsDisplayed(arg0));
    }

    public void clickScrollButton(String direction,String arg0) {
        dictionaryPage.clickScrollButton(direction,arg0);
    }
}