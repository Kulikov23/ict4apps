package ict4apps;

public interface Locators {

    //TODO: WELCOME PAGE

    String WELCOME_PAGE_SIGN_IN_LINK = "//a[contains(text(),'$1')]";
    String WELCOME_PAGE_SIGN_IN_BUTTON = "//button[contains(text(),'$1')]";

    String WELCOME_PAGE_DOWNLOAD_MOBILE_VER_BOX_LINKS = "//div[contains(text(),'$1')]//img[@alt='$2']";
    String WELCOME_PAGE_GOOGLE_PLAY_OR_APPSTORE_TITLE = "//div[contains(text(),'$1')]";

    String WELCOME_PAGE_SITE_LOGO = "//img[@alt='$1']";

//    String WELCOME_PAGE_READ_MORE_ABOUT_US = "//a[contains(text(),'$1')]";
    String WELCOME_PAGE_READ_MORE_ABOUT_US_TITLE = "//*[contains(text(),'Read more About us')]";

    //a//span[contains(text(),'Share to Facebook')]

    //TODO: NAVIGATION LINKS

    String WELCOME_PAGE_NAVIGATION_LINKS = "(//ul//span[contains(text(),'$1')])[$2]";

    //TODO: OUR SPECIAL OFFERS PICTURE CAROUSEL

    String WELCOME_PAGE_PRODUCT_BLOCK_PICTURE = "(//div[@aria-hidden='false'])[$1]";
    String WELCOME_PAGE_PRODUCT_BLOCK_TITLE = "//div[@aria-hidden='false']/div//h3/a[contains(text(),'$1')]";
    String WELCOME_PAGE_PRODUCT_BLOCK_DESCRIPTION = "(//div[@aria-hidden='false']//div//div[@class='gallery-product__introtext'])[$1]";
    String WELCOME_PAGE_PRODUCT_BLOCK_MORE_LINK = "(//div[@aria-hidden='false']//div//a[contains(text(),'$1')])[$2]";

    String WELCOME_PAGE_SCROLL_BUTTON = "(//button[contains(text(),'$2')])[$1]";

    //TODO: BLOG LIST

    String WELCOME_PAGE_BLOG_LIST = "(//h3[@class='asset-title']//a)[$1]";
    String LINKS = "//a[contains(text(),'$1')]";

    //TODO: LANGUAGES

    String WELCOME_PAGE_LANGUAGES = "//option[@class='taglib-language-option']";

    //TODO: FOOD DELIVERY BOXES PICTURE CAROUSEL

    String WELCOME_PAGE_FOOD_DELIVERY_PICTURES = "//li[@class='slick-slide slick-active']/div[@class='item_content num_$1']//a";
    String WELCOME_PAGE_FOOD_DELIVERY_PICTURE_TITLE = "//div[@id='column-2']//li[@class!='slick-slide slick-cloned']//div[@class='item_content num_$1']//a";

    //TODO: GENERAL PRODUCTS PAGE

    String PRODUCTS_PAGE_PRODUCT_PICTURE = "(//div[@class='product-item__img product-img-intro product-img-intro__left'])[$1]";
    String PRODUCTS_PAGE_READ_MORE = "(//a[contains(text(),'Read More')])[$1]";
    String PRODUCTS_PAGE_PRODUCT_TITLE = "(//h3[@class='galery-product__title']//a)[$1]";
    String PRODUCTS_PAGE_SOCIAL_NETWORK_LINKS = "(//a[@title='$1'])[$2]";

    //TODO: PRODUCT PAGE

    String PRODUCT_DESCRIPTION_PICTURE = "//a[@class='image-viewer-link']";
    String PRODUCT_DESCRIPTION_TITLE = "//h1/span[contains(text(),*)]";
    String PRODUCT_DESCRIPTION = "//div[@class='info-product table-word-wrap']";

    String PRODUCS_PAGE_PAGINATION_LINKS = "(//a[contains(text(),'$1')])[1]";

    //TODO: CATEGORIES

    String PRODUCTS_PAGE_CATEGORIES = "//a[contains(text(),'$1')]";
    String PRODUCTS_PAGE_ACTIVE_CATEGORY = "//li[@class='jqtree_common active']//span[contains(text(),'$1')]";

    //TODO: DROPDOWN BUTTONS

    String PRODUCTS_PAGE_DROPDOWN_BUTTON = "(//a[@title='$1'])[1]";
    String PRODUCTS_PAGE_DROPDOWN_MENU_ELEMENTS = "(//ul[@class='dropdown-menu lfr-menu-list direction-down'])[1]//li//span[contains(text(),*)]";

    String PRODUCTS_PAGE_PRODUCT_BLOCK = "//ul[@class='b-product-gallery b-gallery b-gallery-list']//li";

    //TODO: LIST VIEW AND GRID VIEW BUTTONS

    String PRODUCTS_PAGE_CHANGE_VIEW_BUTTON = "//i[@class='icon-$1']";

    //TODO: SPECIAL OFFERS PAGE

    String SPECIAL_OFFERS_PAGE_PRODUCT_BLOCK_PICTURE = "(//div[@class='product-item__img product-img-intro'])[$1]";
    String SPECIAL_OFFERS_PAGE_PRODUCT_BLOCK_TITLE = "//a[contains(text(),'$1')]";
    String SPECIAL_OFFERS_PAGE_PRODUCT_BLOCK_SMALL_DESC = "(//div[@class='gallery-product__introtext'])[$1]";
    String SPECIAL_OFFERS_PAGE_PRODUCT_BLOCK_READ_MORE = "(//div[@class='gallery-product__introtext'])[$1]";

    //TODO: BLOGS PAGE

    String BLOGS_PAGE_BLOG_BLOCKS = "//div[@class='entry']";
    String BLOGS_PAGE_BLOG_TITLE = "(//h2/a)[$1]";
    String BLOGS_PAGE_BLOG_PICTURE = "(//img[@class='images img-responsive'])[$1]";
    String BLOGS_PAGE_READ_MORE = "//a[contains(text(),'$1')]";

    //TODO: RSS

    String BLOGS_PAGE_RSS = "//span[contains(text(),'$1')]";
    String BLOGS_PAGE_RSS_SUBSCRIBE_BUTTON = ".//*[@id='subscribeButton']";
    String BLOGS_PAGE_BREADCRUMB = "//ul//li[@class='active last breadcrumb-truncate']";
    String BLOGS_PAGE_NEWS_SITE_HEADER = "//*[contains(text(),'$1')]";

    //TODO: CONTACT US PAGE

    String CONTACT_US_PAGE_SEND_BUTTON = "//button[contains(text(),'$1')]";
    String CONTACT_US_PAGE_ERROR_MSG = "//label[contains(text(),'$2 *')]/../../div[not(@class='hide')]/span[contains(text(),'$1')]";
    String CONTACT_US_PAGE_TEXTBOXES = "//label[contains(text(),'$1 *')]/ancestor::div[@class='control-group']/input";
    String CONTACT_US_PAGE_COMMENTS_TEXT_AREA = "//label[contains(text(),'Comments')]/../textarea";

}
