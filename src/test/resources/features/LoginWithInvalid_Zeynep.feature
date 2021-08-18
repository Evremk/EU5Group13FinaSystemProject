

Feature: user should not able to login

  Background: Navigate to url
    Given the user is on the login page



  Scenario Outline: User can not login with invalid credentials

    When the user enters "<wrongUser name>"
    And the user enters password "<password>"
    Then the user sees wrong message

    Examples:
      | wrongUser name   | password        |
      | wrongemail       | posmanager      |
      | error            | expensesmanager |
      | posmanager       | nosuch          |
      | expenses manager | salesmanager    |


    Scenario Outline: User login with invalid credentials

      When the user enters invalid "<username>" or "<password>"
      Then the user sees wrong message

      Examples:
        | username                   | password     |
        | posmanager90@info.com      | posman       |
        | salesmanager10@info.com    | sale         |
        | posmanager15@info.com      | salesmanager |
        | expensesmanager40@info.com | posman       |
        | manager90@info.com         | posman       |
        | salesmanager5@info.com     | expenses     |
        | posmanager46@info.com      | teacher      |
        | expensesmanager88@info.com | accept       |
        | posmanager20@info.com      | expert       |