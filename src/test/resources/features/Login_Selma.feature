
Feature: Users should be able to login

  Background: Navigate to url
    Given the user is on the loginPage


  Scenario Outline: Login with different user types and valid credentials
    When the user enters valid "<UserName>" and "<PassWord>" credentials
    Then the user should be able to login to mainPage

    Examples:
    | UserName                   | PassWord                   |
    | expensesmanager10@info.com | expensesmanager            |
    | salesmanager15@info.com    | salesmanager               |
    | posmanager85@info.com      | posmanagerexpenses_manager |

  @wips
  Scenario Outline: Login with invalid credentials
    When the user enters invalid "<UserName>" and "<PassWord>" credentials
    Then the user should not be able to login and should be see error message.

    Examples:
      | UserName                   | PassWord                   |
      | salesmanager15@info        | salesmanager               |
      | posmanager80@info          | expensesmanager543535353   |
      | posmanager80@info          | expensesmanager543535353   |