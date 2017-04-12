package ict4apps.pages;

import ict4apps.Locators;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

@DefaultUrl("http://88.198.7.89:8100/web/guest/blogs")
public class BlogsPage extends PageObject {

    String title;
    String numb1;

    public void back() {
        getDriver().navigate().back();
    }

//TODO://///////////////////////////////        SWITCH WINDOW - TAB          ///////////////////////////////////////////

    public void switchWindow(int x) {
        ArrayList<String> windows = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(windows.get(x));
    }

//TODO:////////////////////////////          CHECKING BLOG BLOCKS          /////////////////////////////////////////////

    public boolean pageContainsRequiredQuanityOfBlogBlocks(String arg0) {
        int i = findAll(Locators.BLOGS_PAGE_BLOG_BLOCKS).size();
        Integer b = Integer.parseInt(arg0);
        return i == b;
    }

    public void clickOnTheBlockTitle(String arg0) {
        $(Locators.BLOGS_PAGE_BLOG_TITLE.replace("$1", arg0)).click();
    }

    public void clickOnTheBlockPicture(String arg0) {
        $(Locators.BLOGS_PAGE_BLOG_PICTURE.replace("$1", arg0)).click();
    }

    public void clickOnTheBlockMoreLink(String arg0, String arg1) {
        $(Locators.BLOGS_PAGE_READ_MORE.replace("$1", arg1).replace("$2", arg0)).click();
        waitABit(750);
    }

    public void clickingOnThe0CommentsLink(String arg0, String arg1) {
        $(Locators.BLOGS_PAGE_0_COMMENTS_LINK.replace("$1", arg0).replace("$2", arg1)).click();
    }

    public void clickOnTheNextPervLinkOfTheBlogPage(String arg0) {
        title = $(Locators.BLOGS_PAGE_BREADCRUMB).getText();
        $(Locators.BLOGS_PAGE_NEXT_PERV_LINKS.replace("$1", arg0)).click();
    }

    public boolean checkThatPageIsChanged() {
        return !$(Locators.BLOGS_PAGE_BREADCRUMB).getText().equalsIgnoreCase(title);
    }

    public void clickingOnTheSocialNetworkIconOfTheBlog(String arg0) {
        getDriver().switchTo().frame(getDriver().findElement((By) $(Locators.BLOGS_PAGE_FACEBOOK_FRAME)));
        $(Locators.BLOGS_PAGE_FACEBOOK_LINK).click();
    }

//TODO://////////////////////////////////         RSS LINK        //////////////////////////////////////////////////////

    public void clickOnTheRssLink(String arg0) {
        $(Locators.BLOGS_PAGE_RSS.replace("$1", arg0)).click();
    }

    public boolean checkThatRssSubscribePageIsOpened() {
        switchWindow(1);
        boolean x = $(Locators.BLOGS_PAGE_RSS_SUBSCRIBE_BUTTON).isVisible();
        getDriver().close();
        switchWindow(0);
        waitABit(750);
        return x;
    }

//TODO:///////////////////        CLICK ON THE VIEW ORIGINAL POST IS OPENING OUR CHOSEN BLOG        ////////////////////

    public void clickingOnTheViewOriginalPost(String arg0) {
        title = $(Locators.BLOGS_PAGE_BREADCRUMB).getText();
        withTimeoutOf(5000, TimeUnit.SECONDS).waitFor(ExpectedConditions.elementToBeClickable(By.xpath(Locators.LINKS.replace("$1", arg0))));
        $(Locators.LINKS.replace("$1", arg0)).click();
    }

    public boolean checkThatClickOnTheViewOriginalPostIsOpeningCorrectPage() {
        switchWindow(1);
        withTimeoutOf(5000, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfElementLocated(By.xpath(Locators.BLOGS_PAGE_NEWS_SITE_HEADER.replace("$1", title))));
        boolean y = ($(Locators.BLOGS_PAGE_NEWS_SITE_HEADER.replace("$1", title))).isPresent();
        getDriver().close();
        switchWindow(0);
        return y;
    }

    public boolean checkingThatClickOnTheViewOriginalPostIsOpeningNewsWebsiteWithOurChosenBlog() {
        withTimeoutOf(5000, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfElementLocated(By.xpath(Locators.BLOGS_PAGE_NEWS_SITE_HEADER.replace("$1", title))));
        boolean y = ($(Locators.BLOGS_PAGE_NEWS_SITE_HEADER.replace("$1", title))).isPresent();
        getDriver().navigate().back();
        return y;
    }

    public void clickOnTheLinkOfTheBLOGSPage(String arg0) {
        String text = $(Locators.BLOGS_PAGE_SHOWING_RESULTS_LABEL).getText();
        numb1 = text.substring(text.lastIndexOf("of") + 2, text.indexOf("results"));
        $(Locators.WELCOME_PAGE_SIGN_IN_LINK.replace("$1", arg0)).click();
    }

    public boolean checkThatPageIsChangedToTheNext() {
        return $(Locators.BLOGS_PAGE_SHOWING_RESULTS_LABEL).getText().contains(numb1);
    }

    public void clickOnTheButtonOfTheBLOGSPage(String arg0) {
        $(Locators.BLOGS_PAGE_PAGE_OF_BUTTON.replace("$1", arg0)).click();
        waitABit(750);
    }
}


