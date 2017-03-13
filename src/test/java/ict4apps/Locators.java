package ict4apps;

public interface Locators {

    String SITE_LOGO = "//img[@alt='ict4apps']";
    String TITLE_1ST_BLOCK ="(//h3[@class='galery-product__title']//a)[1]";
    String SHOWING_RESULTS_LABEL ="(//small)[1]";
    String BLOGS_HEADER ="(//span[contains(text(),'Blogs')])[3]";
    String CONTACTS_HEADER ="//span[contains(text(),'Contacts')]";

//////////////////////////////////      NAVIGATION LINKS        //////////////////////////////////

    String WELCOME_HEADER_NAVIGATION_LINKS = "(//ul//span[contains(text(),'$1')])[1]";


/////////////////////////////////   PICTURE CAROUSEL   /////////////////////////////////////////

    String BLOCK_PICTURE  = "(//div[@class='product-item__img product-img-intro'])[$1]";

    String TITLE = "(//h3//a[contains(text(),'$1')])[$2]";

    String MORE_LINK  = "(//div//a[contains(text(),'$1')])[$2]";

    String DESCRIPTION  = "(//div[@class='gallery-product__introtext'])[$1]";

    String SCROLL_BUTTON = "(//div//button[contains(text(),'$2')])[$1]";

//////////////////////////////      BLOGS   LIST        ////////////////////////////////////////////////////////////////

    String BLOG_LIST = "(//h3[@class='asset-title']//a)[$1]";

    String LINKS = "//a[contains(text(),'$1')]";

//////////////////////////////      LANGUAGES       ////////////////////////////////////////////////////////////////////

    String LANGUAGES = "//option[@class='taglib-language-option']";

//////////////////////////      FOOD DELIVERY BOXES PICTURE CAROUSEL      //////////////////////////////////////////////

    String FOOD_DELIVERY_PICTURES = "//li[@class='slick-slide slick-active']/div[@class='item_content num_$1']//a";

   String PICTURE_TITLE = "//div[@id='column-2']//li[@class!='slick-slide slick-cloned']//div[@class='item_content num_$1']//a";

}
