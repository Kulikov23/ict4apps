package ict4apps;

public interface Locators {

    String WELCOME_LINK = "(//*[@id='layout_18']/a)[1]";
    String PRODUCTS_LINK = "(//*[@id='layout_21']//a)[1]";
    String SPECIAL_OFFERS_LINK = "(//*[@id='layout_3']//a)[1]";
    String BLOGS_LINK = "(//*[@id='layout_4']/a)[1]";
    String SITE_LOGO = "//img[@alt='ict4apps']";
    String TITLE_1ST_BLOCK ="(//h3[@class='galery-product__title']//a)[1]";
    String SHOWING_RESULTS_LABEL ="(//small)[1]";
    String BLOGS_HEADER ="(//span[contains(text(),'Blogs')])[3]";
    String CONTACT_US_LINK ="(//*[@id='layout_5'])[1]";
    String CONTACTS_HEADER ="//span[contains(text(),'Contacts')]";
}
