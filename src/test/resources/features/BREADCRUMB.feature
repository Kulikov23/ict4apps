Feature: BREADCRUMB

  Scenario: 01
    Given the user is on the Products page
    When click on the "Desserts" category
    Then "Desserts" category with sub category is active
    Then breadcrumb added "Desserts" link
    When click on the "►" of the active link
    Then check that "Cakes" sub category appears
    When click on the "Cakes" category
    Then breadcrumb added "Cakes" link
    When click on the "Coffee cupcake" title of product
    Then breadcrumb added "Coffee cupcake" link

    When click on the "Cakes" breadcrumb link
    Then page is changed and should contain "cakes"
    When click on the "Desserts" breadcrumb link
    Then page is changed and should contain "desserts"
    When click on the "Products" breadcrumb link
    Then page is changed and should contain "products"
    When click on the "ict4apps" breadcrumb link
    Then check that Welcome page is opened and contains "OUR SPECIAL OFFERS"

  Scenario: 02
    Given the user is on the Special offers page
    When click on the "Grilled Vegetable Tortilla Roll" title of product
    Then breadcrumb added "Grilled Vegetable Tortilla Roll" link
    When click on the "Special Offers" breadcrumb link
    Then page is changed and should contain "special-offers"
    When click on the "ict4apps" breadcrumb link
    Then check that Welcome page is opened and contains "OUR SPECIAL OFFERS"

  Scenario: 03
    Given the user is on the Blogs page
    When clicking on the "1" blog block title on the Blogs page
    Then breadcrumb added link with name of the "1" blog block
    When click on the "Blogs" breadcrumb link
    Then page is changed and should contain "blogs"
    When click on the "ict4apps" breadcrumb link
    Then check that Welcome page is opened and contains "OUR SPECIAL OFFERS"