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
        | id   | name   |
        | <id> | <name> |
      Then I would see the detail
        | name   | description   | price   | iva   | total   |
        | <name> | <description> | <price> | <iva> | <total> |
      Examples:
        | id        | name           | description                                | price | iva  | total |
        | product-0 | Phone XL       | A large phone with one of the best screens | 79900 | 1500 | 81400 |
        | product-1 | Phone Mini     | A great phone with one of the best cameras | 69900 | 1200 | 71100 |
        | product-2 | Phone Standard |                                            | 29900 | 900  | 30800 |





