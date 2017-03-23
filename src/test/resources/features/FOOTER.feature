Feature: FOOTER

  Background:
    Given the user is on the Welcome page

  Scenario: 01
    When click "Welcome" link of the "2" navigation links list
    Then check that "welcome" page is opened
    When click "Products" link of the "2" navigation links list
    Then check that "products" page is opened
    When click "Special Offers" link of the "2" navigation links list
    Then check that "special-offers" page is opened
    When click "Blogs" link of the "2" navigation links list
    Then check that "blogs" page is opened
    When click "Contact Us" link of the "2" navigation links list
    Then check that "contact-us" page is opened

    Scenario: 02
      When clicking on the "Facebook" social network icon
      Then checking that login page is opened and contains "https://www.facebook.com"
      When clicking on the "Twitter" social network icon
      Then checking that login page is opened and contains "https://twitter.com"
      When clicking on the "LinkedIn" social network icon
      Then checking that login page is opened and contains "https://www.linkedin.com"
      When clicking on the "Google+" social network icon
      Then checking that login page is opened and contains "https://accounts.google.com"

