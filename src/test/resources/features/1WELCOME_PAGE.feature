Feature: WELCOME PAGE

  Background:
    Given the user is on the Welcome page

    Scenario: 01
      When click on the "ict4apps" site logo
      Then check that "welcome" page is refreshed
      Then check that "ict4apps" site logo is appears

  Scenario: 02
    When click "Welcome" link of the "1" navigation links list
    Then check that "welcome" page is opened
    When click "Products" link of the "1" navigation links list
    Then check that "products" page is opened
    When click "Special Offers" link of the "1" navigation links list
    Then check that "special-offers" page is opened
    When click "Blogs" link of the "1" navigation links list
    Then check that "blogs" page is opened
    When click "Contact Us" link of the "1" navigation links list
    Then check that "contact-us" page is opened

  Scenario: 03
    When click on the "Sign In" link
    Then "login" page is opened
    Then page contains "Sign In" button

  Scenario: 04
    When click on the "Android app on Google Play" linked image on the "DOWNLOAD MOBILE VERSION" box
    Then check that app download page page is opened "https://play.google.com"
    Then check that page with our app "Demo ICT4APPS SERIES BASIC" is opened
    When click on the "Available on the App Store" linked image on the "DOWNLOAD MOBILE VERSION" box
    Then check that "http://www.apple.com" page is opened
    Then check that page with our app "Demo ICT4APPS SERIES BASIC" is opened

  Scenario: 05
    When move mouse to the "1" block picture
    Then check that first block contains "Bacon and Tomato Sandwich" title
    Then check that "1" block contains small description
    Then check that "1" block contains "More" link

  Scenario: 06
    When move mouse to the "1" block picture
    When click on the first block contains "Bacon and Tomato Sandwich" title
    Then check that "special-offers" page of our product is opened
#    Then checking that product page contains title,picture and description
    When click on the "More" link of the "1" block

  Scenario: 07
    When move mouse to the "3" block picture
    Then check that first block contains "Classic Canapes" title
    Then check that "3" block contains small description
    Then check that "3" block contains "More" link

  Scenario: 08
    When move mouse to the "3" block picture
    When click on the first block contains "Classic Canapes" title
    Then check that "special-offers" page of our product is opened
#    Then checking that product page contains title,picture and description
    When click on the "More" link of the "3" block

  Scenario: 09
    When click on the scroll button "Next" of the "1" picture carousel
#    Then check that pictures are changed

  Scenario: 10
    When move mouse to the "3" block picture
    Then check that first block contains "Classic Mushroom Soup" title
    Then check that "3" block contains small description
    Then check that "3" block contains "More" link

  Scenario: 11
    When move mouse to the "3" block picture
    When click on the first block contains "Classic Mushroom Soup" title
    Then check that "special-offers" page of our product is opened
#    Then checking that product page contains title,picture and description
    When click on the "More" link of the "3" block

  Scenario: 12
    When click on the scroll button "Previous" of the "1" picture carousel
#    Then check that pictures are changed

  Scenario Outline: 13
    When clicking on the blog links "<blogNumber>"
    Then blog pages contains following links "View Original Post", "Read More"
    Examples:
      | blogNumber |
      | 1          |
      | 3          |
      | 5          |

  Scenario: 14
    Then the languages should be in the correct order:
      | 1 | English    |
      | 2 | italiano   |
      | 3 | українська |
      | 4 | русский    |

  Scenario Outline: 15
    When moving on the block "<pictures>"
    Then checking that elements changing "<pictures>" and contains "<titles>":
    When click on the "<pictures>"
#    Then check that "products" page is opened with our chosen category
    When click on the scroll button "Next" of the "2" picture carousel
    When click on the scroll button "Previous" of the "2" picture carousel
    Examples:
      | pictures | titles     |
      | 0        | Appetizers |
      | 5        | Desserts   |

  Scenario: 16
    When click on the "Read more About us »" link
    Then "about-us" page is opened
    Then check that page contains "Read more About us" header