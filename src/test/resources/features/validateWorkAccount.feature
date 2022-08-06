Feature: Work Account create

  Scenario: Work Account created was successfully
    Given User opens Add Contact mobile App
    When User in to Home Page
    And User taps Add Contact Button
    When User in to Add Contact Page
    And User checks Target Account
    And User writes <Contact Name>
    | Contact Name |
    | work account    |
    And User writes <Contact Phone>
    | Contact Phone |
    | 0525252525    |
    And User selects work for Contact Phone
    And User writes <Contact Email>
    | Contact Email |
    | test@mail.com |
    And User selects work for Contact Email
    And User taps Save Button
    Then User checks new contact

    # Expected Result : User CAN add to new contact for WORK ACCOUNT
    # Actual Result   : User CAN add to new contact for WORK ACCOUNT

