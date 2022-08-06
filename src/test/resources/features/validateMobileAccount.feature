Feature: Mobile Account create

  Scenario: Mobile Account was  created successfully
    Given User opens Add Contact mobile App
    When User in to Home Page
    And User taps Add Contact Button
    When User in to Add Contact Page
    And User checks Target Account
    And User writes <Contact Name>
      | Contact Name |
      | i am tester   |
    And User writes <Contact Phone>
      | Contact Phone |
      | 0587412532    |
    And User selects mobile for Contact Phone
    And User writes <Contact Email>
      | Contact Email |
      | test2@mail.com |
    And User selects mobile for Contact Email
    And User taps Save Button
    Then User checks new contact

    # Expected Result : User CAN add to new contact for MOBILE ACCOUNT
    # Actual Result   : User CAN add to new contact for MOBILE ACCOUNT