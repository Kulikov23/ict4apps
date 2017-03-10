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
    When move mouse to the "first" block picture
    Then check that "first" block contains "Bacon and Tomato Sandwich" title
    Then check that "first" block contains small description
    Then check that "first" block contains "More" link

  Scenario: Checking that third block of the "OUR SPECIAL OFFERS" is changing picture
    Given the user is on the Welcome page
    When move mouse to the "third" block picture
    Then check that "third" block contains "Classic Canapes" title
    Then check that "third" block contains small description
    Then check that "third" block contains "More" link

  Scenario: Checking that "OUR SPECIAL OFFERS" scroll button right is scrolling picture carousel
    Given the user is on the Welcome page
    When click on the scroll button "right" of the "OUR SPECIAL OFFERS" picture carousel
#    Then check that pictures are changed

  Scenario: Checking that second block of the "OUR SPECIAL OFFERS" is changing picture
    Given the user is on the Welcome page
    When move mouse to the "fifth" block picture
    Then check that "fifth" block contains "Deviled Eggs with Bacon" title
    Then check that "fifth" block contains small description
    Then check that "fifth" block contains "More" link

  Scenario: Checking that "OUR SPECIAL OFFERS" scroll button left is scrolling picture carousel
    Given the user is on the Welcome page
    When click on the scroll button "left" of the "OUR SPECIAL OFFERS" picture carousel
#    Then check that pictures are changed