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
        | name   |
        | <name> |
      Then I would see the detail
        | name   | description   | price   | iva   | total   |
        | <name> | <description> | <price> | <iva> | <total> |
      Examples:
        | name           | description                                | price | iva | total |
        | Phone XL       | A large phone with one of the best screens | 799   | 15  | 814   |
        | Phone Mini     | A great phone with one of the best cameras | 699   | 12  | 613   |
        | Phone Standard |                                            | 299   | 9   | 308   |





