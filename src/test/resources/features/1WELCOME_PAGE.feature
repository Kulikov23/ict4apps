Feature: WELCOME PAGE

  Background:
    Given the user is on the Welcome page

  Scenario: 01
    When click "Welcome" link
    Then check that "welcome" page is opened
    When click "Products" link
    Then check that "products" page is opened
    When click "Special Offers" link
    Then check that "special-offers" page is opened
    When click "Blogs" link
    Then check that "blogs" page is opened
    When click "Contact Us" link
    Then check that "contact-us" page is opened

  Scenario: 02
    When click on the "Sign In" link
    Then "login" page is opened
    Then page contains "Sign In" button

  Scenario: 03
    When click on the "Android app on Google Play" linked image on the "DOWNLOAD MOBILE VERSION" box
    Then check that app download page page is opened "https://play.google.com"
    Then check that page with our app "Demo ICT4APPS SERIES BASIC" is opened
    When click on the "Available on the App Store" linked image on the "DOWNLOAD MOBILE VERSION" box
    Then check that "http://www.apple.com" page is opened
    Then check that page with our app "Demo ICT4APPS SERIES BASIC" is opened

  Scenario: 04
    When move mouse to the "1" block picture
    Then check that first block contains "Bacon and Tomato Sandwich" title
    Then check that "1" block contains small description
    Then check that "1" block contains "More" link

  Scenario: 05
    When move mouse to the "1" block picture
    When click on the first block contains "Bacon and Tomato Sandwich" title
    Then check that "special-offers" page of our product is opened
#    Then checking that product page contains title,picture and description
    When click on the "More" link of the "1" block

  Scenario: 06
    When move mouse to the "3" block picture
    Then check that first block contains "Deviled Eggs with Bacon" title
    Then check that "3" block contains small description
    Then check that "3" block contains "More" link

  Scenario: 07
    When move mouse to the "3" block picture
    When click on the first block contains "Deviled Eggs with Bacon" title
    Then check that "special-offers" page of our product is opened
#    Then checking that product page contains title,picture and description
    When click on the "More" link of the "3" block

  Scenario: 08
    When click on the scroll button "Next" of the "1" picture carousel
#    Then check that pictures are changed

  Scenario: 09
    When move mouse to the "3" block picture
    Then check that first block contains "Classic Mushroom Soup" title
    Then check that "3" block contains small description
    Then check that "3" block contains "More" link

  Scenario: 10
    When move mouse to the "3" block picture
    When click on the first block contains "Classic Mushroom Soup" title
    Then check that "special-offers" page of our product is opened
#    Then checking that product page contains title,picture and description
    When click on the "More" link of the "3" block

  Scenario: 11
    When click on the scroll button "Previous" of the "1" picture carousel
#    Then check that pictures are changed

  Scenario Outline: 12
    When clicking on the blog links "<blogNumber>"
    Then blog pages contains following links "View Original Post", "Read More"
    Examples:
      | blogNumber |
      | 1          |
      | 3          |
      | 5          |

  Scenario: 13
    Then the languages should be in the correct order:
      | 1 | English    |
      | 2 | italiano   |
      | 3 | українська |
      | 4 | русский    |

  Scenario Outline: 14
    When moving on the block "<pictures>"
    Then checking that elements changing "<pictures>" and contains "<titles>":
    Examples:
      | pictures | titles       |
      | 0        | Appetizers   |
      | 1        | Soup menu    |
      | 2        | Salads       |
      | 3        | Seafood      |
      | 4        | Main Courses |
      | 5        | Desserts     |

