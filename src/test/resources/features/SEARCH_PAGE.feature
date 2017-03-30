Feature: SEARCH PAGE

#  Background:
#    Given the user is on the Search page

  Scenario: : SEARCH_PAGE_01
    When the user is on the Welcome page
    When click on the "Search" button of the search page
    Then check that search page is opened

  Scenario: : SEARCH_PAGE_02
    When the user is on the Welcome page
    When click on the "Search" button of the search page
    Then check that search search results are appears

  Scenario Outline: SEARCH_PAGE_03
    When the user is on the Welcome page
    When click on the "Search" button of the search page
    When click on the Scope dropdown menu
    Then check that list box is opened and contains following "<Elements>"
    Examples:
      | Elements |
      | global   |
      | product  |
      | blogs    |

  Scenario: SEARCH_PAGE_04
    When the user is on the Welcome page
    When click on the search button
    When click on the "Search" button of the search page
    Then check that page is not changing

  Scenario: SEARCH_PAGE_05
    When the user is on the Welcome page
    When click on the search button
    When click on the "Clear" button of the search page
    Then check that "Clear" button is hidden
