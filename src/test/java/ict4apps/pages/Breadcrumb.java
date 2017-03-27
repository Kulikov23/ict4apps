package ict4apps.pages;

import ict4apps.Locators;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;


@DefaultUrl("http://88.198.7.89:8100/web/guest/products")
public class Breadcrumb extends PageObject {

    String title;

    public void clickOnTheCategoryWithSubCategory(String arg0) {
        $(Locators.PRODUCTS_PAGE_CATEGORY_WITH_SUB_CATEGORY.replace("$1", arg0)).click();
    }

    public boolean categoryWithSubCategoryIsActive(String arg0) {
        waitABit(1000);
        return $(Locators.PRODUCTS_PAGE_ACTIVE_CATEGORY_WITH_SUB_CATEGORY.replace("$1", arg0)).isVisible();
    }

    public boolean breadcrumbAddedLink(String arg0) {
        waitABit(1000);
        return $(Locators.PRODUCTS_PAGE_BREADCRUMB_1.replace("$1", arg0)).isVisible();
    }

    public void clickOnTheOfTheActiveLink(String arg0) {
        $(Locators.PRODUCTS_PAGE_OPN_SUB_LINK.replace("$1", arg0)).click();
        waitABit(1000);
    }

    public boolean checkThatSubCategoryAppears(String arg0) {
        return $(Locators.PRODUCTS_PAGE_CATEGORY_WITH_SUB_CATEGORY.replace("$1", arg0)).isVisible();
    }

    public void clickOnTheTitleOfProduct(String arg0) {
        $(Locators.LINKS.replace("$1", arg0)).click();
    }

    public void clickOnTheBreadcrumbLink(String arg0) {
        $(Locators.PRODUCTS_PAGE_BREADCRUMB_2.replace("$1", arg0)).click();
    }

    public boolean pageIsChangedAndShouldContain(String arg0) {
        return getDriver().getCurrentUrl().contains(arg0);
    }

    public boolean checkThatWelcomePageIsOpenedAndContains(String arg0) {
        return $(Locators.WELCOME_PAGE_HEADER.replace("$1", arg0)).isVisible();
    }

    public boolean breadcrumbAddedLinkWithNameOfTheFirstBlogBlock(String arg0) {
        return $(Locators.PRODUCTS_PAGE_BREADCRUMB_3).getText().equalsIgnoreCase(title);
    }

    public void clickingOnTheBlogBlockTitleOnTheBlogsPage(String arg0) {
        title = $(Locators.BLOGS_PAGE_BLOG_TITLE.replace("$1", arg0)).getText();
        $(Locators.BLOGS_PAGE_BLOG_TITLE.replace("$1", arg0)).click();
    }
}
