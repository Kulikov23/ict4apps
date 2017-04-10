Feature: SIGN PAGE

  Background:
    Given the user is on the Sign in page

  Scenario: SIGN_IN_PAGE_01
    When click on the "Sign In" button on the content part
    Then check that "This field is required." error massage appears near "Email Address" text box
    Then check that "This field is required." error massage appears near "Password" text box

  Scenario: SIGN_IN_PAGE_02
    When click on the Remember Me checkbox
    Then check that Remember Me checkbox is checked
    When click on the Remember Me checkbox
    Then check that Remember Me checkbox is unchecked

  Scenario: SIGN_IN_PAGE_03
    When click on the "Return to Full Page" link
    Then check that page is changed to Welcome page


  Scenario: SIGN_IN_PAGE_03
    When click on the "LinkedIn" linked image
#    Then check that "LinkedIn" login page is opened
    When click on the "Twitter" linked image
#    Then check that "LinkedIn" login page is opened
    When click on the "Google+" linked image
#    Then check that "LinkedIn" login page is opened
    When click on the "Facebook" linked image