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
    When move mouse to the "4" block picture
    Then check that "4" block contains "Bacon and Tomato Sandwich" title
#    Then check that "1" block contains small description
#    Then check that "1" block contains "More" link



  Scenario: 08
    When click on the scroll button "right" of the "OUR SPECIAL OFFERS" picture carousel
#    Then check that pictures are changed



  Scenario: 10
    When click on the scroll button "left" of the "OUR SPECIAL OFFERS" picture carousel
#    Then check that pictures are changed

  Scenario Outline: 11
    When clicking on the blog links "<blogNumber>"
    Then blog pages contains following links "View Original Post", "Read More"
    Examples:
      | blogNumber |
      | First      |
      | Third      |
      | Fifth      |

  Scenario: 12
    Then the languages should be in the correct order:
      |1| English    |
      |2| italiano   |
      |3| українська |
      |4| русский    |

  Scenario Outline: 13
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

