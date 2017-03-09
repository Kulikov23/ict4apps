Feature: WELCOME PAGE

  Scenario: Clicking on the "WELCOME" link
    Given the user is on the Welcome page
    When click "Welcome" link
    Then check that site logo is presented

  Scenario: Clicking on the "PRODUCTS" link
    Given the user is on the Welcome page
    When click "Products" link
    Then check that title of the first product block is presented

  Scenario: Clicking on the "SPECIAL OFFERS" link
    Given the user is on the Welcome page
    When click "Special Offers" link
    Then check that Showing results labes is appears

  Scenario: Clicking on the "BLOGS" link
    Given the user is on the Welcome page
    When click "Blogs" link
    Then check that BLOGS header is appears

  Scenario: Clicking on the "CONTACT US" link
    Given the user is on the Welcome page
    When click "Contact Us" link
    Then check that CONTACTS header is appears

  Scenario: Checking that first block of the "OUR SPECIAL OFFERS" is changing picture
    Given the user is on the Welcome page
    When move mouse to the first block picture
    Then check that block contains "Bacon and Tomato Sandwich" title