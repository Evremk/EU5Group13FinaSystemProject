
  Feature:  logout
    @wip
    Scenario: user able to Logout
      Given the user is logged in
      When the user click avatar dropdown button
      Then the user able to see dropdown menu



    Scenario: user able to Logout
      Given the user is logged in
      When the user click avatar dropdown button
      Then the user click logout button
      And the title contains "502: Bad gateway"

