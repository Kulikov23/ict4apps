Feature: SPECIAL OFFERS PAGE

  Background:
    Given the user is on the Special offers page

  Scenario: SPECIAL_OFFERS_PAGE_01
    When click on the "th-large" list view
    Then product blocks are changed to grid view

  Scenario: SPECIAL_OFFERS_PAGE_02
    When click on the "th-large" list view
    When move mouse to the "1" product picture
    Then check that picture of the "1" product block is changed and contains title
    Then check that picture of the "1" product block is changed and contains small description
    Then check that picture of the "1" product block is changed and contains "Read More" link

  Scenario: SPECIAL_OFFERS_PAGE_03
    When click on the "th-large" list view
    When move mouse to the "2" product picture
    Then check that picture of the "2" product block is changed and contains title
    Then check that picture of the "2" product block is changed and contains small description
    Then check that picture of the "2" product block is changed and contains "Read More" link

  Scenario: SPECIAL_OFFERS_PAGE_04
    When click on the "th-large" list view
    When move mouse to the "3" product picture
    Then check that picture of the "3" product block is changed and contains title
    Then check that picture of the "3" product block is changed and contains small description
    Then check that picture of the "3" product block is changed and contains "Read More" link

  Scenario Outline: SPECIAL_OFFERS_PAGE_05
    When click on the "th-large" list view
    When move mouse to the "<ProductBlock>" product picture
    When clicking on the "<ProductBlock>" product block title
    Then checking that product page contains title,picture and description
    When move mouse to the "<ProductBlock>" product picture
    When clicking on the "<ProductBlock>" product block READ MORE link
    Examples:
      | ProductBlock |
      | 1            |
      | 6            |
      | 12           |

  Scenario: SPECIAL_OFFERS_PAGE_06
    When click on the "th-large" list view
    When click on the "list" list view
    Then product blocks are changed to list view

  Scenario: SPECIAL_OFFERS_PAGE_07
    When click on the "Page 1 Of 2" button
    Then dropdown menu is opened
    Then dropdown menu contains "2" elements

  Scenario: SPECIAL_OFFERS_PAGE_08
    When click on the "Page 1 Of 2" button
    When click on the "1" item
    Then check that "Showing 1 - 12 Of 15 Results" label is changed to "Showing 1 - 12 Of 15 Results"
    When click on the "Page 1 Of 2" button
    When click on the "2" item
    Then check that "Showing 1 - 12 Of 15 Results" label is changed to "Showing 13 - 24 Of 15 Results"

  Scenario: SPECIAL_OFFERS_PAGE_09
    When click on the "12 Items Per Page" button
    Then dropdown menu is opened
    When click on the "24" item
    Then page should contains "15" product blocks

  Scenario: SPECIAL_OFFERS_PAGE_10
    When click on the "Next" link
    Then check that "Showing 1 - 12 Of 15 Results" label is changed to "Showing 13 - 24 Of 15 Results"
    When click on the "First" link
    Then check that "Showing 13 - 24 Of 15 Results" label is changed to "Showing 1 - 12 Of 15 Results"
    When click on the "Last" link
    Then check that "Showing 1 - 12 Of 15 Results" label is changed to "Showing 13 - 24 Of 15 Results"
    When click on the "Previous" link
    Then check that "Showing 13 - 24 Of 15 Results" label is changed to "Showing 1 - 12 Of 15 Results"

  Scenario Outline: SPECIAL_OFFERS_PAGE_11
    When clicking on the "<ProductBlock>" product block title
    Then checking that product page contains title,picture and description
    When clicking on the "<ProductBlock>" product block picture
    When clicking on the "<ProductBlock>" product block READ MORE link
    Examples:
      | ProductBlock |
      | 1            |
      | 6            |
      | 12           |

