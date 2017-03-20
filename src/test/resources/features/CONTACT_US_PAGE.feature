Feature: CONTACT US PAGE

  Background:
    Given the user is on the Contact Us page

  Scenario: 01
    When clicking on the "Send" button
    Then check that "This field is mandatory." error message is appears

    Scenario: 02
      When write "Name" in the "Name" text box
      When clicking on the "Send" button
      Then check that "This field is mandatory." error message is appears
      When write "Name" in the "Email" text box
      When clicking on the "Send" button
      Then check that "This field is mandatory." error message is appears
      When write "Name" in the "Subject" text box
      When clicking on the "Send" button
      Then check that "This field is mandatory." error message is appears