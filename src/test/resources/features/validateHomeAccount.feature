Feature: Home Account create


  Scenario: Home Account was created successfully
    Given User opens Add Contact mobile App
    When User in to Home Page
    And User taps Add Contact Button
    When User in to Add Contact Page
    And User checks Target Account
    And User writes <Contact Name>
      | Contact Name |
      | home user |
    And User writes <Contact Phone>
      | Contact Phone |
      | 98928929829   |
    And User selects home for Contact Phone
    And User writes <Contact Email>
      | Contact Email |
      | test3@mail.com |
    And User selects home for Contact Email
    And User taps Save Button
    Then User checks new contact

    # Expected Result : User CAN add to new contact for HOME ACCOUNT
    # Actual Result   : User CAN add to new contact for HOME ACCOUNT