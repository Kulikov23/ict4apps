Feature: WELCOME PAGE

  Scenario: 01
    Given the user is on the Welcome page
    When click "Welcome" link
    Then check that site logo is presented

  Scenario: 02
    Given the user is on the Welcome page
    When click "Products" link
    Then check that title of the first product block is presented

  Scenario: 03
    Given the user is on the Welcome page
    When click "Special Offers" link
    Then check that Showing results labes is appears

  Scenario: 04
    Given the user is on the Welcome page
    When click "Blogs" link
    Then check that BLOGS header is appears

  Scenario: 05
    Given the user is on the Welcome page
    When click "Contact Us" link
    Then check that CONTACTS header is appears

  Scenario: 06
    Given the user is on the Welcome page
    When move mouse to the "first" block picture
    Then check that "first" block contains "Bacon and Tomato Sandwich" title
    Then check that "first" block contains small description
    Then check that "first" block contains "More" link

  Scenario: 07
    Given the user is on the Welcome page
    When move mouse to the "third" block picture
    Then check that "third" block contains "Classic Canapes" title
    Then check that "third" block contains small description
    Then check that "third" block contains "More" link

  Scenario: 08
    Given the user is on the Welcome page
    When click on the scroll button "right" of the "OUR SPECIAL OFFERS" picture carousel
#    Then check that pictures are changed

  Scenario: 09
    Given the user is on the Welcome page
    When move mouse to the "fifth" block picture
    Then check that "fifth" block contains "Classic Mushroom Soup" title
    Then check that "fifth" block contains small description
    Then check that "fifth" block contains "More" link

  Scenario: 10
    Given the user is on the Welcome page
    When click on the scroll button "left" of the "OUR SPECIAL OFFERS" picture carousel
#    Then check that pictures are changed

  Scenario Outline: 11
    Given the user is on the Welcome page
    When clicking on the blog links "<blogNumber>"
    Then blog pages contains following links "View Original Post", "Read More"
    Examples:
      | blogNumber |
      | First      |
      | Third      |
      | Fifth      |

  Scenario: 12
    Given the user is on the Welcome page
    Then the languages should be in the correct order:
      |1| English    |
      |2| italiano   |
      |3| українська |
      |4| русский    |

  Scenario Outline: 13
    Given the user is on the Welcome page
    When moving on the block "<pictures>"
    Then checking that elements changing "<pictures>" and contains "<titles>":
    Examples:
      |   pictures   |    titles     |
      |      0       |  Appetizers   |
      |      1       |  Soup menu    |
      |      2       |  Salads       |
      |      3       |  Seafood      |
      |      4       |  Main Courses |
      |      5       |  Desserts     |

