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
#    Then check that search search results are appears

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

#  Scenario: SEARCH_PAGE_06
#    When the user is on the Welcome page
#    When click on the search button
#    When click on the Scope dropdown menu
#    When click on the "product" element of the listbox
#    When write "meat" in the textbox
#    When click on the search button
#    Then check that "meat" search results are appears
#    When click on the title of the "1" result block
#    Then check that click on the result title is moving us to chosen blog page

  Scenario: SEARCH_PAGE_07
    When the user is on the Welcome page
    When click on the search button
    When click on the Scope dropdown menu
    When click on the "blogs" element of the listbox
    When write "test" in the textbox
    When click on the search button
    Then check that "test" search results are appears
    When click on the title of the "1" result block
    Then check that click on the result title is moving us to chosen blog page

  Scenario: SEARCH_PAGE_08
    When the user is on the Welcome page
    When click on the search button
    When click on the Scope dropdown menu
    When click on the "global" element of the listbox
    When write "test" in the textbox
    When click on the search button
    Then check that "test" search results are appears
    When click on the title of the "1" result block
    Then check that click on the result title is moving us to chosen blog page

  Scenario: : SEARCH_PAGE_09
    When the user is on the Products page
    When click on the "Search" button of the search page
    Then check that search page is opened

  Scenario: : SEARCH_PAGE_10
    When the user is on the Products page
    When click on the "Search" button of the search page
#    Then check that search search results are appears

  Scenario Outline: SEARCH_PAGE_11
    When the user is on the Products page
    When click on the "Search" button of the search page
    When click on the Scope dropdown menu
    Then check that list box is opened and contains following "<Elements>"
    Examples:
      | Elements |
      | global   |
      | product  |
      | blogs    |

  Scenario: SEARCH_PAGE_12
    When the user is on the Products page
    When click on the search button
    When click on the "Search" button of the search page
    Then check that page is not changing

  Scenario: SEARCH_PAGE_13
    When the user is on the Products page
    When click on the search button
    When click on the "Clear" button of the search page
    Then check that "Clear" button is hidden

#  Scenario: SEARCH_PAGE_14
#    When the user is on the Products page
#    When click on the search button
#    When click on the Scope dropdown menu
#    When click on the "product" element of the listbox
#    When write "meat" in the textbox
#    When click on the search button
#    Then check that "meat" search results are appears
#    When click on the title of the "1" result block
#    Then check that click on the result title is moving us to chosen blog page


  Scenario: SEARCH_PAGE_15
    When the user is on the Products page
    When click on the search button
    When click on the Scope dropdown menu
    When click on the "blogs" element of the listbox
    When write "test" in the textbox
    When click on the search button
    Then check that "test" search results are appears
    When click on the title of the "1" result block
    Then check that click on the result title is moving us to chosen blog page

  Scenario: SEARCH_PAGE_16
    When the user is on the Products page
    When click on the search button
    When click on the Scope dropdown menu
    When click on the "global" element of the listbox
    When write "test" in the textbox
    When click on the search button
    Then check that "test" search results are appears
    When click on the title of the "1" result block
    Then check that click on the result title is moving us to chosen blog page


  Scenario: : SEARCH_PAGE_17
    When the user is on the Blogs page
    When click on the "Search" button of the search page
    Then check that search page is opened

  Scenario: : SEARCH_PAGE_18
    When the user is on the Blogs page
    When click on the "Search" button of the search page
#    Then check that "apple" search results are appears

  Scenario Outline: SEARCH_PAGE_19
    When the user is on the Blogs page
    When click on the "Search" button of the search page
    When click on the Scope dropdown menu
    Then check that list box is opened and contains following "<Elements>"
    Examples:
      | Elements |
      | global   |
      | product  |
      | blogs    |

  Scenario: SEARCH_PAGE_20
    When the user is on the Blogs page
    When click on the search button
    When click on the "Search" button of the search page
    Then check that page is not changing

  Scenario: SEARCH_PAGE_21
    When the user is on the Blogs page
    When click on the search button
    When click on the "Clear" button of the search page
    Then check that "Clear" button is hidden

#  Scenario: SEARCH_PAGE_22
#    When the user is on the Blogs page
#    When click on the search button
#    When click on the Scope dropdown menu
#    When click on the "product" element of the listbox
#    When write "meat" in the textbox
#    When click on the search button
#    Then check that "meat" search results are appears
#    When click on the title of the "1" result block
#    Then check that click on the result title is moving us to chosen blog page

  Scenario: SEARCH_PAGE_23
    When the user is on the Blogs page
    When click on the search button
    When click on the Scope dropdown menu
    When click on the "blogs" element of the listbox
    When write "test" in the textbox
    When click on the search button
    Then check that "test" search results are appears
    When click on the title of the "1" result block
    Then check that click on the result title is moving us to chosen blog page

  Scenario: SEARCH_PAGE_24
    When the user is on the Blogs page
    When click on the search button
    When click on the Scope dropdown menu
    When click on the "global" element of the listbox
    When write "test" in the textbox
    When click on the search button
    Then check that "test" search results are appears
    When click on the title of the "1" result block
    Then check that click on the result title is moving us to chosen blog page

  Scenario: SEARCH_PAGE_25
    When the user is on the Blogs page
    When click on the search button
    When click on the "More" link
    Then check that "Showing 1 - 20" label is changed to "Showing 21 - 40"
    When click on the "More" link
    When click on the "Previous" link
    Then check that "Showing 41 - 60" label is changed to "Showing 21 - 40"
    When click on the "First" link
    Then check that "Showing 21 - 40" label is changed to "Showing 1 - 20"