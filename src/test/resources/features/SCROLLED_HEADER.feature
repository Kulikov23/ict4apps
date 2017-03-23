Feature: SCROLLED HEADER

  Background:
    Given the user is on the Products page

  Scenario: 01
    When scroll down page
    Then check that scrolled header is appears

  Scenario: 02
    When scroll down page
    When click "Welcome" link of the "1" navigation links list
    Then check that "welcome" page is opened
#    When scroll down page
#    When click "Products" link of the "1" navigation links list
#    Then check that "products" page is opened
    When scroll down page
    When click "Special Offers" link of the "1" navigation links list
    Then check that "special-offers" page is opened
    When scroll down page
    When click "Blogs" link of the "1" navigation links list
    Then check that "blogs" page is opened
    When scroll down page
    When click "Contact Us" link of the "1" navigation links list
    Then check that "contact-us" page is opened