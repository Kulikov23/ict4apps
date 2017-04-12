Feature: BLOGS PAGE

  Background:
    Given the user is on the Blogs page

  Scenario: BLOGS_PAGE_01
    Then page should contain "20" blog blocks

  Scenario: BLOGS_PAGE_02
    When click on the search button
    Then check that search page is opened

  Scenario Outline: BLOGS_PAGE_03
    When clicking on the "<BlogBlock>" blog block title
    Then blog pages contains following links "View Original Post", "Read More"
    When clicking on the "<BlogBlock>" blog block picture
    Then blog pages contains following links "View Original Post", "Read More"
    When clicking on the "<BlogBlock>" blog block "More" link
    Then blog pages contains following links "View Original Post", "Read More"
    When clicking on the "<BlogBlock>" "0 Comments" link
    Then blog pages contains following links "View Original Post", "Read More"
    Examples:
      | BlogBlock |
      | 1         |
      | 2         |
      | 3         |

  Scenario Outline: BLOGS_PAGE_04
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
      | 2         |
      | 3         |

  Scenario Outline: BLOGS_PAGE_05
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

#  Scenario: BLOGS_PAGE_06
#    When clicking on the "RSS" link
#    Then check that rss subscribe page is opened

#  Scenario: BLOGS_PAGE_07
#    When click on the "Next" link of the BLOGS page
#    Then check that page is changed to the next
#    Then check that "Showing 1 - 20 Of  Results" label is changed to "Showing 21 - 40 Of  Results"
#    When click on the "First" link
#    Then check that "Showing 21 - 40 Of  Results" label is changed to "Showing 1 - 20 Of  Results"
#    When click on the "Last" link
#    Then check that "Showing 1 - 12 Of  Results" label is changed to "Showing 96 - 98 Of  Results"
#    When click on the "Previous" link
#    Then check that "Showing 96 - 98 Of  Results" label is changed to "Showing 84 - 96 Of  Results"

#  Scenario: BLOGS_PAGE_08
#    When click on the "Page 1 of" button of the BLOGS page
#    Then check that drop down menu is opened and contains "26" items