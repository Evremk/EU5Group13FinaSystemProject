Feature: User should be able to login

  Background:

    Given The user is on the login Page_aysegul


  Scenario Outline: Login as a different user under different valid credentials

    When   "<usertype>" enters valid "<username>" and valid "<password>"
    Then the user should be able to login
    Examples:
      | usertype               | username                | password            |
      | sales manager          | salesmanager15@info.com | salesmanager        |
      | sales manager          | salesmanager15@info.com | salesmanager        |
      | sales manager          | salesmanager15@info.com | salesmanager        |
      | Point Of Sales manager | posmanager5@info.com    |  posmanager         |
      | Point Of Sales manager | posmanager35@info.com   |  posmanager         |
      | Point Of Sales manager | posmanager155@info.com  |  posmanager         |
      | Inventory Manager      | imm10@info.com          |  inventorymanager   |
      | Inventory Manager      | imm160@info.com         | inventorymanager    |
      | Inventory Manager      | imm100@info.com         |  inventorymanager   |
      | Expenses Manager       | expensesmanager10@info.com | expensesmanager  |
      | Expenses Manager       | expensesmanager10@info.com | expensesmanager  |
      | Expenses Manager       |  expensesmanager10@info.com | expensesmanager |
      | Manufacturing Manager  |   manuf user10@info.com     |  manufuser      |
      | Manufacturing Manager  | manuf user110@info.com      | manufuser       |
      | Manufacturing Manager  |manuf user35@info.com         | manufuser      |

  Scenario Outline:Login as a different user under different invalid credentials
    When "<usertype>"enters invalid "<username>" or "<password>"
    Then the user is on the login page
    Examples:
      | usertype               | username               | password               |
      | sales manager          |                        |  abc                   |
      | sales manager          |salesmanager@info.com   |                        |
      | sales manager          |                        |                        |
      | Point Of Sales manager |posmanager@info.com     |  posmanager            |
      | Point Of Sales manager | posmanager55@info.com  |                        |
      | Point Of Sales manager |12345@info.com          |   ***                  |
      | Inventory Manager      | imm10@info.com         | manager                |
      | Inventory Manager      |                        |                        |
      | Inventory Manager      | melih@info.com         | inventorymanager       |
      | Expenses Manager       |                        |                        |
      | Expenses Manager       |expenses@info.com       | expensesmanager        |
      | Expenses Manager       | semih@info.com         |  123                   |
      | Manufacturing Manager  |   betul@info.com       |  manufuser             |
      | Manufacturing Manager  |                        |                        |
      | Manufacturing Manager  |  manuf user35@info.com |  MANUFUSER             |

