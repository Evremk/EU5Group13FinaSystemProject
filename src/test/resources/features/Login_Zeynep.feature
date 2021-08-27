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



    Scenario: user able to login with this credentials
      When the user logs in using following credentials
         |username |posmanager90@info.com |
         |password |posmanager            |
       Then  the user should be able to login

  Scenario Outline: user able to login
    When the user enters valid "<userName>" and "<passWord>"
    Then the user is on the login page
    Examples:
      | userName                   | passWord        |
      | expensesmanager9@info.com  | expensesmanager |
      | expensesmanager14@info.com | expensesmanager |
      | expensesmanager66@info.com | expensesmanager |
      | salesmanager10@info.com    | salesmanager    |
      | salesmanager77@info.com    | salesmanager    |
      | salesmanager99@info.com    | salesmanager    |
      | salesmanager50@info.com    | salesmanager    |
      | posmanager22@info.com      | posmanager      |
      | posmanager33@info.com      | posmanager      |
      | posmanager44@info.com      | posmanager      |
      | posmanager11@info.com      | posmanager      |




#invalid  with credentials


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