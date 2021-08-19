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