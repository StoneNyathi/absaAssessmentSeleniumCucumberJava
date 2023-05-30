Feature: Home page for Way2automation

  @FunctionalTests
  Scenario Outline: Way2automation User Web tables
   Given A user navigates to HomePage
    When Validate that you are on the User List Table
    And click add user
    And user provide reg details <firstname>,<lastname>,<username>,<password>,<customer>,<role>,<email>,<cell>
    Then verify created users exist on page

    Examples:
      |firstname|lastname|username|password|customer   |role    |email            |cell           |
      |FName1   |LName1  |User1   |Pass1   |Company AAA|Admin   |admin@mail.com   | 825555        |
      |FName2   |LName2  |User2   |Pass2   |Company BBB|Customer|customer@mail.com| 083444        |
