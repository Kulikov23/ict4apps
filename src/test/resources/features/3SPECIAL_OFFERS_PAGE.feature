Feature: SPECIAL OFFERS PAGE

  Background:
    Given the user is on the Special offers page

  Scenario: 01
    When click on the "th-large" list view
    Then product blocks are changed to grid view

  Scenario Outline: 02
    When move mouse to the "<ProductBlock>" product picture
    Then check that picture of the "<ProductBlock>" product block is changed and contains "Grilled Vegetable Tortilla Roll" title
    Then check that picture of the "<ProductBlock>" product block is changed and contains small description
    Then check that picture of the "<ProductBlock>" product block is changed and contains "Read More" link
    Examples:
      | ProductBlock |
      | 1            |
      | 6            |
      | 12           |

  Scenario: 03
    When click on the "list" list view
    Then product blocks are changed to list view

  Scenario: 04
    When click on the "Page 1 Of 2" button
    Then dropdown menu is opened
    Then dropdown menu contains "2" elements

  Scenario: 05
    When click on the "12 Items Per Page" button
    Then dropdown menu is opened
    When click on the "24" item
    Then page should contains "15" product blocks

  Scenario Outline: 06
    When clicking on the "<ProductBlock>" product block title
    Then checking that product page contains title,picture and description
    When clicking on the "<ProductBlock>" product block picture
    When clicking on the "<ProductBlock>" product block READ MORE link
    Examples:
      | ProductBlock |
      | 1            |
      | 6            |
      | 12           |

