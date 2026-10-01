# Home work:
#  - load allo.ua
#  - search for something (phone, etc)
#  - phone/etc name must be passed from cucumber scenario

Feature: My demo

#  Scenario: step params
#    Given Generate account first name "Willy" last name "Wonka"
#    Given With age 1
#    Given Data table list example
#      | string_1 |
#      | string_2 |
#      | string_3 |
#      | string_4 |
#      | string_5 |
#      | string_6 |


  Scenario: My scenario 1
    Given I request 3 random people from service
    Given I store these people to DB
    Given I pick random person form DB
    Given I load google page
    When I set google page search to random person's first and last name
    Then Google search has that person's first and last name in search input

  Scenario: My scenario 2
    Given Create custom person
      | FirstName | Billy |
      | LastName  | Kid   |
      | Gender    | male  |
      | Title     | Mr    |
      | Nat       | US    |
    Given I load google page
    When I set google page search to random person's first and last name
    Then Google search has that person's first and last name in search input
