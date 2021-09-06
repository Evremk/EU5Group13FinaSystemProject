
Feature: logout

  @wips
  Scenario: Users should be able to logout
    Given The user logged in as "expenses manager"
    When The user clicks the avatar dropdown button
    And The user clicks logout button
    Then The user should see signIn link on the login page


