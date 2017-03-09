package ict4apps;

public interface Locators {

    String SITE_LOGO = "//img[@alt='ict4apps']";
    String TITLE_1ST_BLOCK ="(//h3[@class='galery-product__title']//a)[1]";
    String SHOWING_RESULTS_LABEL ="(//small)[1]";
    String BLOGS_HEADER ="(//span[contains(text(),'Blogs')])[3]";
    String CONTACTS_HEADER ="//span[contains(text(),'Contacts')]";

    String WELCOME_HEADER_NAVIGATION_LINKS = "(//ul//span[contains(text(),'$1')])[1]";
}
