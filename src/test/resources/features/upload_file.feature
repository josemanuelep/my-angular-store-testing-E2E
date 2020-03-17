  # Autor
  # Jose Manuel Echeverri Palacio
  # Java and Test developer
  @regresion
  Feature: Checkout in my Store angular app

    Checkout in my Store angular app As programmer I
    wold like to implement E2E tests with the finally
    that assurance of quality of my first frontend
    and basic API project in Angular

    Scenario Outline: Detail of product
      Given I am out shopping online
      When I open details of phone
        | id   | phone   |
        | <id> | <phone> |
      Then I would see the detail
        | total   | price   |
        | <total> | <price> |
      Examples:
        | id | phone          | price | total |
        | 0  | Phone XL       | 799   | 814   |
        | 1  | Phone Mini     | 699   | 613   |
        | 2  | Phone Standard | 299   | 308   |





