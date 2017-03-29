Feature: PRODUCTS PAGE

  Background:
    Given the user is on the Products page

  Scenario: 01
    When click on the "ict4apps" site logo
    Then check that "welcome" page is refreshed
    Then check that "ict4apps" site logo is appears

  Scenario: 02
    When click "Welcome" link of the "1" navigation links list
    Then check that "welcome" page is opened
#    When click "Products" link of the "1" navigation links list
#    Then check that "products" page is opened
    When click "Special Offers" link of the "1" navigation links list
    Then check that "special-offers" page is opened
    When click "Blogs" link of the "1" navigation links list
    Then check that "blogs" page is opened
    When click "Contact Us" link of the "1" navigation links list
    Then check that "contact-us" page is opened

  Scenario: 03
    When click on the "Sign In" link
    Then "login" page is opened
    Then page contains "Sign In" button

  Scenario: 04
    Then the languages should be in the correct order:
      | 1 | English    |
      | 2 | italiano   |
      | 3 | українська |
      | 4 | русский    |