@REST_Assured
Feature: Verify all the opearation of the API

  @Get
  Scenario: Verify the Get Operation of the API
    Given I want to perform Get ops for the ApI
    When I get value for the address "https://localhost:3000/address"
    Then I validate the address has "plano"
