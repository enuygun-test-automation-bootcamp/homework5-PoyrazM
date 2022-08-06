Feature: Write special character for email field

  Scenario: User wants to write special character in email field
    Given User opens Add Contact mobile App
    When User in to Home Page
    And User taps Add Contact Button
    When User in to Add Contact Page
    And User checks Target Account
    And User writes <Contact Name>
      | Contact Name |
      | special email |
    And User writes <Contact Phone>
      | Contact Phone |
      | 12345647   |
    And User selects home for Contact Phone
    And User writes <Contact Email>
      | Contact Email |
      | test-?*,;@mail.com |
    And User selects home for Contact Email
    And User taps Save Button
    Then User checks new contact

    # Expected Result : User CAN NOT add to special characters in the EMAIL FIELD
    # Actual Result   : User CAN add to special characters in the EMAIL FIELD