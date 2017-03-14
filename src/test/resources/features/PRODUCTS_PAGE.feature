Feature: PRODUCTS PAGE


  Scenario: 01
    Given the user is on the Products page
    Then product blocks contain title



  Scenario Outline: 02
    Given the user is on the Products page
    When clicking on the first "<ProductBlock>"
    When clicking on the second "<ProductBlock>"
    When clicking on the third "<ProductBlock>"
#    Then check that product page contains "Title","Picture" and "Description"
  Examples:
  | ProductBlock |
  |       1      |
  |       6      |
  |       12     |