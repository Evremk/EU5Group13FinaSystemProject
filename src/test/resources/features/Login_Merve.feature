Feature: Login

  Given the user is on the login page


  Scenario: Login with valid credentials
    When the "usertype" enters valid credentials
    Then the user should be able to login

    Scenario: Login with invalid email
      When the user enters invalid "email"
      And the user enters valid "password"
      Then the user is not able to login



      Scenario: Login with invalid password
        When the user enters valid "email"
        And the user enters invalid "password"
        Then the user is not able to login


        Scenario: empty login
          When the user clicks enter
          Then the user is not able to login

          Scenario: Login with empty email
            When the user enters valid "password"
            Then the user is not able to login


            Scenario: Login with empty password
              When the user enters valid "email"
              Then the user is not able to login



