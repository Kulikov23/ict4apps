Feature: BLOGS PAGE

  Background:
    Given the user is on the Blogs page

  Scenario: 01
    Then page should contain "20" blog blocks

  Scenario: 02
    When click on the search button
    Then check that search page is opened

  Scenario Outline: 03
    When clicking on the "<BlogBlock>" blog block title
    Then blog pages contains following links "View Original Post", "Read More"
    When clicking on the "<BlogBlock>" blog block picture
    When clicking on the "<BlogBlock>" blog block "More" link
    When clicking on the "<BlogBlock>" "0 Comments" link
    Examples:
      | BlogBlock |
      | 1         |
      | 2         |
      | 3         |

  Scenario Outline: 04
    When clicking on the "<BlogBlock>" blog block title
    When clicking on the "View Original Post"
    Then checking that click on the View Original Post is opening news website with our chosen blog in a new tab
    When clicking on the "Read More"
    Then checking that click on the View Original Post is opening news website with our chosen blog

#    When clicking on the "twitter" social network icon of the blog
#    Then checking that login page is opened and contains "https://twitter.com"

#    When clicking on the "facebook" social network icon of the blog
#    Then checking that login page is opened and contains "https://www.facebook.com"
#
#    When clicking on the "plusone" social network icon of the blog
#    Then checking that login page is opened and contains "https://accounts.google.com"
    Examples:
      | BlogBlock |
      | 1         |
      | 11        |
      | 20        |

  Scenario Outline: 05
    When clicking on the "<BlogBlock>" blog block title
    When click on the "Previous" link of the blog page
    Then check that page is changed
    When click on the "Next" link of the blog page
    Then check that page is changed
    Examples:
      | BlogBlock |
      | 1         |
      | 11        |
      | 20        |

  Scenario: 06
    When clicking on the "RSS" link
    Then check that rss subscribe page is opened

  Scenario: 07
    When click on the "Next" link of the BLOGS page
    Then check that page is changed to the next
##    Then check that "Showing 1 - 12 Of 98 Results" label is changed to "Showing 12 - 24 Of 98 Results"
#    When click on the "First" link
##    Then check that "Showing 12 - 24 Of 98 Results" label is changed to "Showing 1 - 12 Of 98 Results"
#    When click on the "Last" link
##    Then check that "Showing 1 - 12 Of 98 Results" label is changed to "Showing 96 - 98 Of 98 Results"
#    When click on the "Previous" link
#    Then check that "Showing 96 - 98 Of 98 Results" label is changed to "Showing 84 - 96 Of 98 Results"

  Scenario: 08
    When click on the "Page 1 of" button of the BLOGS page
#    Then check that drop down menu is opened and contains "26" items