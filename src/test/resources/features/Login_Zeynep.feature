Feature: user should be able to login

  Background: Navigate to url
    Given the user is on the login page

  @login
  Scenario Outline: login with different userTypes
    When the user enters "<userType>"
    And the user enters "<password>"


    Examples:
      | userType         | password        |
      | expenses manager | expensesmanager |
      | store manager    | storemanager    |
      | sales manager    | salesmanager    |

  @wip
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

