Feature: HRM Orange Website User Page

  Scenario: User should be able to login and open user page

    Given The user is on login page
    When  The user logins with valid credentials
    And   The user opens user page
    Then  User is on user page successfully

