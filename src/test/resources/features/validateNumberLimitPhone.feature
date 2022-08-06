Feature: Check Number Limit

  Scenario: User wants to typing limitless phone numbers
    Given User opens Add Contact mobile App
    When User in to Home Page
    And User taps Add Contact Button
    When User in to Add Contact Page
    And User checks Target Account
    And User writes <Contact Name>
      | Contact Name |
      | number limit |
    And User writes <Contact Phone>
      | Contact Phone |
      | for loop = 100 digits   |
    And User writes <Contact Email>
      | Contact Email |
      | test4@mail.com |
    And User taps Save Button
    Then User checks new contact

    # Expected Result : User CAN create max 11 digits number
    # Actual Result   : User CAN create 100 digits number