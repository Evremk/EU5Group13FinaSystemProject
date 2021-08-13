
             @login
  Feature: user should be able to login

    Scenario: login as a expenses manager
      Given the user is on the login page
     When the user enters expenses manager information
     Then the user should be able to login

      Scenario: login as a sales manager
        Given the user is on the login page
        When the user enters sales manager information
        Then the user should be able to login

        Scenario: login as a store manager
          Given the user is on the login page
          When the user enters store manager information
          Then the user should be able to login
