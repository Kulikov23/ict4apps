Feature: PRODUCTS PAGE

  Background:
    Given the user is on the Products page

    Scenario Outline: 01
      When clicking on the "<ProductBlock>" product block title
      Then checking that product page contains title,picture and description
      When clicking on the "<ProductBlock>" product block picture
      When clicking on the "<ProductBlock>" product block READ MORE link
     Examples:
      | ProductBlock |
      |      1       |
      |      6       |
      |     12       |

    Scenario Outline: : 02
      When clicking on the "VKontakte" social network icon of the "<ProductBlock>" block
      Then checking that login page is opened and contains "http://oauth.vk.com"
#      When clicking on the "Facebook" social network icon of the "<ProductBlock>" block
#      Then checking that login page is opened and contains "https://www.facebook.com"
      When clicking on the "Twitter" social network icon of the "<ProductBlock>" block
      Then checking that login page is opened and contains "https://twitter.com"
      When clicking on the "LinkedIn" social network icon of the "<ProductBlock>" block
      Then checking that login page is opened and contains "https://www.linkedin.com"
      When clicking on the "Pinterest" social network icon of the "<ProductBlock>" block
      Then checking that login page is opened and contains "https://www.pinterest.com"
      When clicking on the "Google Plus" social network icon of the "<ProductBlock>" block
      Then checking that login page is opened and contains "https://accounts.google.com"
     Examples:
      | ProductBlock |
      |       1      |
      |       6      |
      |      12      |

    Scenario: 03
        When clicking on the "Appetizers" category
        Then "Appetizers" category is active
#        Then "Appetizers" category contains all product blocks from this category

    Scenario: 04
      When click on the "Page 1 Of 9" button
      Then dropdown menu is opened
      Then dropdown menu contains "9" elements

    Scenario: 05
      When click on the "12 Items Per Page" button
      Then dropdown menu is opened
      When click on the "36" item
      Then page should contains "36" product blocks

     Scenario: 06
       When click on the "th-large" list view
       Then product blocks are changed to grid view
       When click on the "list" list view
       Then product blocks are changed to list view


