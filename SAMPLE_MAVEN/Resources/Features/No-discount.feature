 @No-Discount
Feature: Title of your feature
  Scenario Outline: Title of your scenario outline
    Given I want to navigate to the "<url>"
    When I pass the value "<weight>" and "<height>" to the page
    Then I verify the "<extectedStatement>" as result

    Examples: 
      | url                                                            | weight | height | extectedStatement                         |
      | http://apps.qa2qe.cognizant.e-box.co.in/CompanyOffersDiscount/ |     60 |    110 | Datax shipping company offers no discount |
      | http://apps.qa2qe.cognizant.e-box.co.in/CompanyOffersDiscount/ |     50 |    150 | Datax shipping company offers no discount |
