Feature: user should be able to login

  Background: Navigate to url
    Given the user is on the login page

  @login
  Scenario: login as a expenses manager
    When the user enters expenses manager information
    Then the user should be able to login

  Scenario: login as a sales manager
    When the user enters sales manager information
    Then the user should be able to login

  Scenario: login as a store manager
    When the user enters store manager information
    Then the user should be able to login

  Scenario Outline: login with different userTypes
    When the user enters "<userType>"
    And the user enters "<password>"

    Examples:
      | userType         | password |
      | expenses manager |          |
  @wip
  Scenario Outline: User can not login with invalid credentials

    When the user enters "<wrongUser name>"
    And the user enters password "<password>"

    Examples:
      | wrongUser name | password |
      | wrongemail     | 2345     |

