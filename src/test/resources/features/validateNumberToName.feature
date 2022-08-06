Feature: Write number to name text

  Scenario: User wants to write number or digit to name text
    Given User opens Add Contact mobile App
    When User in to Home Page
    And User taps Add Contact Button
    When User in to Add Contact Page
    And User checks Target Account
    And User writes <Contact Name>
      | Contact Name |
      | 25252525 |
    And User writes <Contact Phone>
      | Contact Phone |
      | 56563434   |
    And User selects home for Contact Phone
    And User writes <Contact Email>
      | Contact Email |
      | test5@mail.com |
    And User selects home for Contact Email
    And User taps Save Button
    Then User checks new contact

    # Expected Result : User CAN NOT create only digits in the Name Field
    # Actual Result   : User CAN create only digits in the Name Field