Feature: my allo.ua

  @allo
  Scenario: store goods in database
    Given I load allo.ua page
    When I search allo.ua for "IPhone 16 Pro Max"
    When I get first 3 goods as "phones"
    Then I check "phones" goods in database