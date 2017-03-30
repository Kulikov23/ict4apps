package ict4apps;

public interface Locators {

    //TODO: WELCOME PAGE

    String WELCOME_PAGE_SIGN_IN_LINK = "//a[contains(text(),'$1')]";
    String WELCOME_PAGE_SIGN_IN_BUTTON = "//button[contains(text(),'$1')]";

    String WELCOME_PAGE_DOWNLOAD_MOBILE_VER_BOX_LINKS = "//div[contains(text(),'$1')]//img[@alt='$2']";
    String WELCOME_PAGE_GOOGLE_PLAY_OR_APPSTORE_TITLE = "//div[contains(text(),'$1')]";

    String WELCOME_PAGE_SITE_LOGO = "//img[@alt='$1']";

    String WELCOME_PAGE_READ_MORE_ABOUT_US_TITLE = "//*[contains(text(),'Read more About us')]";

    String WELCOME_PAGE_SEARCH_BUTTON = "//button[contains(text(),'Search')]";

    String WELCOME_PAGE_HEADER = "//span[contains(text(),'$1')]";

    String WELCOME_PAGE_REVIEW_PICTURE_CAROUSEL_HEADER = "//li[@class='slick-slide slick-active']//h4";

    //TODO: FOOTER

    String WELCOME_PAGE_FOOTER = "//span[contains(text(),'Share to $1')]/..";

    String WELCOME_PAGE_BACK_TO_TOP = "//a[@href='#']";

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

    String PRODUCTS_PAGE_GRID_VIEW_SOCIAL_NETWORK_LINKS = "(//span[@class='b-share'])[$1]";

    //TODO: PRODUCT PAGE

    String PRODUCT_DESCRIPTION_PICTURE = "//a[@class='image-viewer-link']";
    String PRODUCT_DESCRIPTION_TITLE = "//h1/span[contains(text(),*)]";
    String PRODUCT_DESCRIPTION = "//div[@class='info-product table-word-wrap']";

    //TODO: CATEGORIES

    String PRODUCTS_PAGE_CATEGORIES = "//a[contains(text(),'$1')]";
    String PRODUCTS_PAGE_ACTIVE_CATEGORY = "//li[@class='jqtree_common active']//span[contains(text(),'$1')]";

    //TODO: DROPDOWN BUTTONS

    String PRODUCTS_PAGE_DROPDOWN_BUTTON = "(//a[@title='$1'])[1]";
    String PRODUCTS_PAGE_DROPDOWN_MENU_ELEMENTS = "(//ul[@class='dropdown-menu lfr-menu-list direction-down'])[1]//li//span[contains(text(),*)]";

    String PRODUCTS_PAGE_PRODUCT_BLOCK = "//ul[@class='b-product-gallery b-gallery b-gallery-list']//li";

    //TODO: LIST VIEW AND GRID VIEW BUTTONS

    String PRODUCTS_PAGE_CHANGE_VIEW_BUTTON = "//a//i[@class='icon-$1']";

    //TODO: SPECIAL OFFERS PAGE

    String SPECIAL_OFFERS_PAGE_PRODUCT_BLOCK_PICTURE = "(//div[@class='product-item__img product-img-intro'])[$1]";
    String SPECIAL_OFFERS_PAGE_PRODUCT_BLOCK_TITLE = "(//h3[@class='galery-product__title']/a)[$1]";
    String SPECIAL_OFFERS_PAGE_PRODUCT_BLOCK_SMALL_DESC = "(//div[@class='gallery-product__introtext']/div)[$1]";
    String SPECIAL_OFFERS_PAGE_PRODUCT_BLOCK_READ_MORE = "(//a[contains(text(),'$1')])[$2]";

    String SHOWING_RESULTS_LABEL = "(//small[contains(text(),'$1')])[1]";

    //TODO: BLOGS PAGE

    String BLOGS_PAGE_BLOG_BLOCKS = "//div[@class='entry']";
    String BLOGS_PAGE_BLOG_TITLE = "(//h2/a)[$1]";
    String BLOGS_PAGE_BLOG_PICTURE = "(//img[@class='images img-responsive'])[$1]";
    String BLOGS_PAGE_READ_MORE = "(//a[contains(text(),'$1')])[$2]";

    String BLOGS_PAGE_0_COMMENTS_LINK = "(//span[contains(text(),'$2')])[$1]";

    String BLOGS_PAGE_NEXT_PERV_LINKS = "//a[contains(text(),'$1')]";

    //TODO: PAGE OF DROPDOWN MENU

    String BLOGS_PAGE_PAGE_OF_BUTTON = "//span[contains(text(),'$1')]";
    String BLOGS_PAGE_PAGE_OF_LISTBOX = "//div[@class='open']";
    String BLOGS_PAGE_PAGE_OF_TEXTBOX = "//input[@class='lfr-menu-list-search']";
    String BLOGS_PAGE_PAGE_OF_ITEMS = "(//span[@class='taglib-text-icon'])[$1]";

    //TODO: FRAMES

    String BLOGS_PAGE_TWITTER_FRAME = "//iframe[@id='twitter-widget-0']";
    String BLOGS_PAGE_TWITTER_LINK = ".//*[@id='l']";

    String BLOGS_PAGE_FACEBOOK_FRAME = "//iframe[@title='fb:like Facebook Social Plugin']";
    String BLOGS_PAGE_FACEBOOK_LINK = "    //div[@title='Like']";

    String BLOGS_PAGE_GOOGLE_FRAME = "//iframe[@id='I0_1490342396275']";
    String BLOGS_PAGE_GOOGLE_LINK = ".//*[@id='button']";


    String BLOGS_PAGE_SHOWING_RESULTS_LABEL = "//small[@class = 'search-results']";

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

    //TODO: SCROLLED HEADER

    String SCROLLED_HEADER = "//div[@class='text-right menu-wrapper affix-header lfr-hudcrumbs']";

    //TODO: BREADCRUMB

    String PRODUCTS_PAGE_CATEGORY_WITH_SUB_CATEGORY = "//li//a[text()='$1']";
    String PRODUCTS_PAGE_ACTIVE_CATEGORY_WITH_SUB_CATEGORY = "//li[@class='jqtree_common jqtree-folder jqtree-closed active']//span[contains(text(),'$1')]";
    String PRODUCTS_PAGE_BREADCRUMB_1 = "//ul[@aria-label='Breadcrumb']//li[contains(text(),'$1')]";
    String PRODUCTS_PAGE_BREADCRUMB_2 = "//li/span/../a[contains(text(),'$1')]";
    String PRODUCTS_PAGE_BREADCRUMB_3 = "//ul[@aria-label='Breadcrumb']//li[@class='active last breadcrumb-truncate']";

    String PRODUCTS_PAGE_OPN_SUB_LINK = "//span[contains(text(),*)]/../a[contains(text(),'$1')]";

//TODO:///////////////////////////////////////      SEARCH PAGE       //////////////////////////////////////////////////

    String SEARCH_PAGE_SCOPE_DROPDOWN = "//select[@name='_3_selected_scope']";
    String SEARCH_PAGE_SCOPE_LISTBOX = " //option[@value='$1']";
    String SEARCH_PAGE_BUTTONS = "//button[contains(text(),'$1')]";

    String SEARCH_PAGE_TEXTBOX = "//input[@name='_3_keywords']";

    String SEARCH_PAGE_SEARCH_RESULT = "//span[contains(text(),'$1')]";

    String SEARCH_PAGE_RESULT_TITLE = "(//span[@class='asset-entry-title']/a)[$1]";


}
