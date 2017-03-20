package ict4apps;

public interface Locators {

    //TODO: NAVIGATION LINKS

    String WELCOME_PAGE_NAVIGATION_LINKS = "(//ul//span[contains(text(),'$1')])[1]";

    //TODO: OUR SPECIAL OFFERS PICTURE CAROUSEL

    String WELCOME_PAGE_PRODUCT_BLOCK_PICTURE = "(//div[@class='product-item__img product-img-intro'])[$1]";
    String TITLE = "(//h3//a[contains(text(),'$1')])[$2]";
    String MORE_LINK = "(//div//a[contains(text(),'$1')])[$2]";
    String DESCRIPTION = "(//div[@class='gallery-product__introtext'])[$1]";
    String SCROLL_BUTTON = "(//div//button[contains(text(),'$2')])[$1]";

    //TODO: BLOG LIST

    String WELCOME_PAGE_BLOG_LIST = "(//h3[@class='asset-title']//a)[$1]";
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

    //TODO: CATEGORIES

    String CATEGORIES = "//a[contains(text(),'$1')]";
    String ACTIVE_CATEGORY = "//li[@class='jqtree_common active']//span[contains(text(),'$1')]";

    //TODO: DROPDOWN BUTTONS

    String DROPDOWN_BUTTON = "(//a[@title='$1'])[1]";
    String DROPDOWN_MENU_ELEMENTS = "(//ul[@class='dropdown-menu lfr-menu-list direction-down'])[1]//li//span[contains(text(),*)]";

    String PRODUCT_BLOCK = "//ul[@class='b-product-gallery b-gallery b-gallery-list']//li";

    //TODO: LIST VIEW AND GRID VIEW BUTTONS

    String CHANGE_VIEW_BUTTON = "//i[@class='icon-$1']";

    String SPECIAL_OFFERS_PRODUCT_BLOCK_PICTURE = "(//div[@class='product-item__img product-img-intro'])[$1]";
    String SPECIAL_OFFERS_PRODUCT_BLOCK_TITLE = "//a[contains(text(),'$1')]";
    String SPECIAL_OFFERS_PRODUCT_BLOCK_SMALL_DESC = "(//div[@class='gallery-product__introtext'])[$1]";
    String SPECIAL_OFFERS_PRODUCT_BLOCK_READ_MORE = "(//div[@class='gallery-product__introtext'])[$1]";

    //TODO: BLOGS PAGE

    String BLOGS_PAGE_BLOG_BLOCKS = "//div[@class='entry']";
    String BLOGS_PAGE_BLOG_TITLE = "(//h2/a)[$1]";
    String BLOGS_PAGE_BLOG_PICTURE = "(//img[@class='images img-responsive'])[$1]";

    //TODO: RSS

    String BLOGS_PAGE_RSS = "//span[contains(text(),'$1')]";
    String BLOGS_PAGE_RSS_SUBSCRIBE_BUTTON = ".//*[@id='subscribeButton']";
    String BLOGS_PAGE_BREADCRUMB = "//ul//li[@class='active last breadcrumb-truncate']";
    String BLOGS_PAGE_NEWS_SITE_HEADER = "//*[contains(text(),'$1')]";

    //*[contains(text(),'Online giants must bolster free speech against abuse, or watch innovation die')]


}
