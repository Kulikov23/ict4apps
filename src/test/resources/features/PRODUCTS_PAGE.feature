Feature: PRODUCTS PAGE

  Background:
    Given the user is on the Products page

  Scenario: PRODUCTS_PAGE_01
    When click on the search button
    Then check that search page is opened

  Scenario Outline: PRODUCTS_PAGE_02
    When clicking on the "<ProductBlock>" product block title
    Then checking that product page contains title,picture and description
    When clicking on the "<ProductBlock>" product block picture
    When clicking on the "<ProductBlock>" product block READ MORE link
    Examples:
      | ProductBlock |
      | 1            |
      | 6            |
      | 12           |

#  Scenario Outline: : PRODUCTS_PAGE_03
#    When clicking on the "VKontakte" social network icon of the "<ProductBlock>" block
#    Then checking that login page is opened and contains "http://oauth.vk.com"
#    When clicking on the "Facebook" social network icon of the "<ProductBlock>" block
#    Then checking that login page is opened and contains "https://www.facebook.com"
#    When clicking on the "Twitter" social network icon of the "<ProductBlock>" block
#    Then checking that login page is opened and contains "https://twitter.com"
#    When clicking on the "LinkedIn" social network icon of the "<ProductBlock>" block
#    Then checking that login page is opened and contains "https://www.linkedin.com"
#    When clicking on the "Pinterest" social network icon of the "<ProductBlock>" block
#    Then checking that login page is opened and contains "https://www.pinterest.com"
#    When clicking on the "Google Plus" social network icon of the "<ProductBlock>" block
#    Then checking that login page is opened and contains "https://accounts.google.com"
#    Examples:
#      | ProductBlock |
#      | 1            |
#      | 6            |
#      | 12           |

  Scenario: PRODUCTS_PAGE_04
    When click on the "th-large" list view
    Then product blocks are changed to grid view


  Scenario: PRODUCTS_PAGE_5
    When click on the "th-large" list view
    When move mouse to the "1" product picture
    Then check that picture of the "1" product block is changed and contains title,small description and "Read More" link

  Scenario: PRODUCTS_PAGE_6
    When click on the "th-large" list view
    When move mouse to the "2" product picture
    Then check that picture of the "2" product block is changed and contains title,small description and "Read More" link

  Scenario: PRODUCTS_PAGE_7
    When click on the "th-large" list view
    When move mouse to the "3" product picture
    Then check that picture of the "3" product block is changed and contains title,small description and "Read More" link

#  Scenario Outline: PRODUCTS_PAGE_08
#    When click on the "th-large" list view
#    When move mouse to the "<ProductBlock>" product picture
#    When clicking on the "<ProductBlock>" product block title
#    Then checking that product page contains title,picture and description
#    When move mouse to the "<ProductBlock>" product picture
#    When clicking on the "<ProductBlock>" product block READ MORE link
#    When move mouse to the "<ProductBlock>" product picture
#    When clicking on the "VKontakte" social network icon of the "<ProductBlock>" block
#    Then checking that login page is opened and contains "http://oauth.vk.com"
#    When clicking on the "Facebook" social network icon of the "<ProductBlock>" block
#    Then checking that login page is opened and contains "https://www.facebook.com"
#    When clicking on the "Twitter" social network icon of the "<ProductBlock>" block
#    Then checking that login page is opened and contains "https://twitter.com"
#    When clicking on the "LinkedIn" social network icon of the "<ProductBlock>" block
#    Then checking that login page is opened and contains "https://www.linkedin.com"
#    When clicking on the "Pinterest" social network icon of the "<ProductBlock>" block
#    Then checking that login page is opened and contains "https://www.pinterest.com"
#    When clicking on the "Google Plus" social network icon of the "<ProductBlock>" block
#    Then checking that login page is opened and contains "https://accounts.google.com"
#    Examples:
#      | ProductBlock |
#      | 1            |
#      | 6            |
#      | 12           |

  Scenario: PRODUCTS_PAGE_09
    When clicking on the "Appetizers" category
    Then "Appetizers" category is active
#        Then "Appetizers" category contains all product blocks from this category

  Scenario: PRODUCTS_PAGE_10
    When click on the "Page 1 Of 9" button
    Then dropdown menu is opened
    Then dropdown menu contains "9" elements

#  Scenario: PRODUCTS_PAGE_11
#    When click on the "Page 1 Of 9" button
#    When click on the "'1'" item
#    Then check that "Showing 1 - 12 Of 98 Results" label is changed to "Showing 1 - 12 Of 98 Results"
#    When click on the "Page 1 Of 9" button
#    When click on the "'5'" item
#    Then check that "Showing 1 - 12 Of 98 Results" label is changed to "Showing 48 - 60 Of 98 Results"
#    When click on the "Page 1 Of 9" button
#    When click on the "'9'" item
#    Then check that "Showing 48 - 60 Of 98 Results" label is changed to "Showing 96 - 98 Of 98 Results"

#  Scenario: PRODUCTS_PAGE_12
#    When click on the "Next" link
#    Then check that "Showing 1 - 12 Of 98 Results" label is changed to "Showing 12 - 24 Of 98 Results"
#    When click on the "First" link
#    Then check that "Showing 12 - 24 Of 98 Results" label is changed to "Showing 1 - 12 Of 98 Results"
#    When click on the "Last" link
#    Then check that "Showing 1 - 12 Of 98 Results" label is changed to "Showing 96 - 98 Of 98 Results"
#    When click on the "Previous" link
#    Then check that "Showing 96 - 98 Of 98 Results" label is changed to "Showing 84 - 96 Of 98 Results"

  Scenario: PRODUCTS_PAGE_13
    When click on the "12 Items Per Page" button
    Then dropdown menu is opened
    When click on the "36" item
    Then page should contains "36" product blocks

  Scenario: PRODUCTS_PAGE_14
    When click on the "th-large" list view
    When click on the "list" list view
    Then product blocks are changed to list view



