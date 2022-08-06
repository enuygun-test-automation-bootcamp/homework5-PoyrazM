Feature: Write special character for name field

  Scenario: User wants to write special character in name field
    Given User opens Add Contact mobile App
    When User in to Home Page
    And User taps Add Contact Button
    When User in to Add Contact Page
    And User checks Target Account
    And User writes <Contact Name>
      | Contact Name |
      | *&%-_ |
    And User writes <Contact Phone>
      | Contact Phone |
      | 636363647   |
    And User selects home for Contact Phone
    And User writes <Contact Email>
      | Contact Email |
      | test6@mail.com |
    And User selects home for Contact Email
    And User taps Save Button
    Then User checks new contact

    # Expected Result : User CAN NOT create special characters in the NAME FIELD
    # Actual Result   : User CAN create special characters in the NAME FIELD