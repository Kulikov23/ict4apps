Feature: PRODUCTS PAGE

  Background:
    Given the user is on the Products page

  Scenario: EXAMPLE
    Then product blocks contain title

#  Scenario Outline: 02
#    When clicking on the title,picture and read more link of the "<ProductBlock>"
##    Then checking that product page contains title,picture and description
#  Examples:
#  | ProductBlock |
#  |       1      |
#  |       6      |
#  |       12     |

    Scenario: 02
      When clicking on the "1" product block title
      Then checking that product page contains title,picture and description
      When clicking on the "1" product block picture
      When clicking on the "1" product block READ MORE link




    Scenario: 03
      When clicking on the "1" social network icon
      Then checking that VK login page is opened
#      When clicking on the "2" of the product block
#      Then checking that FB login page is opened and contains Login text box
      When clicking on the "3" social network icon
      Then checking that TWIT login page is opened
      When clicking on the "4" social network icon
      Then checking that LINK login page is opened
      When clicking on the "5" social network icon
      Then checking that PIN login page is opened
      When clicking on the "6" social network icon
      Then checking that GOOGLE login page is opened
