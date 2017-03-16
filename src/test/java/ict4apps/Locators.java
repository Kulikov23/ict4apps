package ict4apps;

public interface Locators {

    //TODO: SITE LOGO

    String SITE_LOGO = "//img[@alt='ict4apps']";

    //TODO: REVISE

    String TITLE_1ST_BLOCK ="(//h3[@class='galery-product__title']//a)[1]";
    String SHOWING_RESULTS_LABEL ="(//small)[1]";
    String BLOGS_HEADER ="(//span[contains(text(),'Blogs')])[3]";
    String CONTACTS_HEADER ="//span[contains(text(),'Contacts')]";

    //TODO: NAVIGATION LINKS

    String WELCOME_HEADER_NAVIGATION_LINKS = "(//ul//span[contains(text(),'$1')])[1]";

    //TODO: OUR SPECIAL OFFERS PICTURE CAROUSEL

    String BLOCK_PICTURE  = "(//div[@class='product-item__img product-img-intro'])[$1]";
    String TITLE = "(//h3//a[contains(text(),'$1')])[$2]";
    String MORE_LINK  = "(//div//a[contains(text(),'$1')])[$2]";
    String DESCRIPTION  = "(//div[@class='gallery-product__introtext'])[$1]";
    String SCROLL_BUTTON = "(//div//button[contains(text(),'$2')])[$1]";

    //TODO: BLOG LIST

    String BLOG_LIST = "(//h3[@class='asset-title']//a)[$1]";
    String LINKS = "//a[contains(text(),'$1')]";

    //TODO: LANGUAGES

    String LANGUAGES = "//option[@class='taglib-language-option']";

    //TODO: FOOD DELIVERY BOXES PICTURE CAROUSEL

    String FOOD_DELIVERY_PICTURES = "//li[@class='slick-slide slick-active']/div[@class='item_content num_$1']//a";
    String PICTURE_TITLE = "//div[@id='column-2']//li[@class!='slick-slide slick-cloned']//div[@class='item_content num_$1']//a";

    //TODO: GENERAL PRODUCTS PAGE

    String PRODUCT_PICTURE = "(//div[@class='product-item__img product-img-intro product-img-intro__left'])[$1]";
    String READ_MORE = "(//a[contains(text(),'Read More')])[$1]";
    String TITLE_PRODUCTS = "(//h3[@class='galery-product__title']//a)[$1]";
    String SOCIAL_NETWORK_LINKS = "(//a[@title='$1'])[$2]";

    //TODO: PRODUCT PAGE

    String PRODUCT_DESCRIPTION_PICTURE = "//a[@class='image-viewer-link']";
    String PRODUCT_DESCRIPTION_TITLE = "//h1/span[contains(text(),*)]";
    String PRODUCT_DESCRIPTION = "//div[@class='info-product table-word-wrap']";


    String CATEGORIES = "//a[contains(text(),'$1')]";

    String ACTIVE_CATEGORY = "//li[@class='jqtree_common active']//span[contains(text(),'$1')]";

    String PAGE_OF_BUTTON = "(//a[@title='$1'])[1]";
    String PAGE_OF_DROPDOWN_MENU = "(//ul[@class='dropdown-menu lfr-menu-list direction-down'])[1]";
}
