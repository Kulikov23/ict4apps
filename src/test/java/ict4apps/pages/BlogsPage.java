package ict4apps.pages;

import ict4apps.Locators;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import java.util.ArrayList;

@DefaultUrl("http://88.198.7.89:8100/web/guest/blogs")
public class BlogsPage extends PageObject {

    String title;

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
        waitABit(1500);
    }

    public void clickOnTheBlockPicture(String arg0) {
        $(Locators.BLOGS_PAGE_BLOG_PICTURE.replace("$1", arg0)).click();
        waitABit(1500);
    }

    public void clickOnTheBlockMoreLink(String arg0) {
        $(Locators.BLOGS_PAGE_READ_MORE.replace("$1", arg0)).click();
        waitABit(1500);
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
        waitABit(1500);
        return x;
    }

//TODO:///////////////////        CLICK ON THE VIEW ORIGINAL POST IS OPENING OUR CHOSEN BLOG        ////////////////////

    public void clickingOnTheViewOriginalPost(String arg0) {
        title = $(Locators.BLOGS_PAGE_BREADCRUMB).getText();
        $(Locators.LINKS.replace("$1", arg0)).click();
        waitABit(1500);
    }

    public boolean checkThatClickOnTheViewOriginalPostIsOpeningCorrectPage() {
        switchWindow(1);
        boolean x = ($(Locators.BLOGS_PAGE_NEWS_SITE_HEADER.replace("$1", title))).isPresent();
        getDriver().close();
        switchWindow(0);
        waitABit(1500);
        return x;
    }


}


