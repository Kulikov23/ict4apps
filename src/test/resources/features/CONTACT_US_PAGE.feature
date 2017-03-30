Feature: CONTACT US PAGE

  Background:
    Given the user is on the Contact Us page

  Scenario: CONTACT_US_PAGE_01
    When clicking on the "Send" button
    Then check that "This field is mandatory." error messages are appears near all "" text boxes

  Scenario: CONTACT_US_PAGE_02
    When write "qwe" in the "Name" text box
    When clicking on the "Send" button
    Then check that "This field is mandatory." error message is not appears above the "Name" text box
    When write "qwe" in the "Email" text box
    When clicking on the "Send" button
    Then check that "This field is mandatory." error message is not appears above the "Email" text box
    When write "qwe" in the "Subject" text box
    When clicking on the "Send" button
    Then check that "This field is mandatory." error message is not appears above the "Subject" text box
    When write "qwe" in the "Comments" textarea
    When clicking on the "Send" button
    Then check that "This field is mandatory." error message is not appears above the "Comments" textarea