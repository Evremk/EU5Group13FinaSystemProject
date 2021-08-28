
@loginMerve
Feature: Login

  Background:
    Given the user is on the login page Merve

  @validLoginMerve
  Scenario Outline: Login with valid credentials
    When the "<usertype>" enters valid credentials Merve
    Then the user should be able to login Merve
    Examples:
      | usertype         |
      | expenses manager |
      | sales manager    |
      | store manager    |

  @invalidLoginMerve
  Scenario Outline: Login with invalid email
    When the user enters invalid email "<email>" Merve
    And the user enters valid password "<password>" Merve
    And the user clicks login Merve
    Then the user is not able to login Merve
    Examples:
      | email                        | password        |
      | merve-2007@hotmail.de        | expensesmanager |
      | inventedEmail@gml.com        | salesmanager    |
      | TestingVytrack@hotmail.com   | posmanager      |
      | jamesBond@gmx.com            | expensesmanager |
      | testingIsmyHobby@outlook.com | posmanager      |

  @invalidLoginMerve
  Scenario Outline: Login with invalid password
    When the user enters valid email "<email>" Merve
    And the user enters invalid password "<password>" Merve
    And the user clicks login Merve
    Then the user is not able to login Merve
    Examples:
      | email                      | password         |
      | expensesmanager10@info.com | test122          |
      | salesmanager15@info.com    | inventedPassword |
      | posmanager85@info.com      | SeeIfItWorks007  |

  @emptyLoginMerve
  Scenario: empty login
    When the user clicks login Merve
    Then the user is not able to login Merve

  @emptyLoginMerve
  Scenario Outline: Login with empty email
    When the user enters valid password "<password>" Merve
    And the user clicks login Merve
    Then the user is not able to login Merve
    Examples:
      | password        |
      | expensesmanager |
      | salesmanager    |
      | posmanager      |

  @emptyLoginMerve
  Scenario Outline: Login with empty password
    When the user enters valid email "<email>" Merve
    And the user clicks login Merve
    Then the user is not able to login Merve
    Examples:
      | email                      |
      | expensesmanager10@info.com |
      | salesmanager15@info.com    |
      | posmanager85@info.com      |



