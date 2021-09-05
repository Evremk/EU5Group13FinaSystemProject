
Feature: Users should be able to login

  Background: Navigate to url
    Given the user is on the loginPage

  @wips
  Scenario Outline: Login with different user types and valid credentials
    When the user enters valid "<UserName>" and "<PassWord>" credentials
    Then the user should be able to login to mainPage

    Examples:
    | UserName                   | PassWord                   |
    | expensesmanager10@info.com | expensesmanager            |
    | salesmanager15@info.com    | salesmanager               |
    | posmanager85@info.com      | posmanagerexpenses_manager |
