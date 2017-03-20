Feature: WELCOME PAGE

  Background:
    Given the user is on the Blogs page

  Scenario Outline: : 01
    Then page should contain "20" blog blocks
    When clicking on the "<BlogBlock>" blog block title
    Then blog pages contains following links "View Original Post", "Read More"
    When clicking on the "<BlogBlock>" blog block picture
    When clicking on the "<BlogBlock>" blog block MORE link
    Examples:
      | BlogBlock |
      | 1         |
      | 10        |
      | 20        |

  Scenario: 02
    When clicking on the "RSS" link
    Then check that rss subscribe page is opened