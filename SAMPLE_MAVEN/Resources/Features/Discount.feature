@Discount
Feature: Test the Features
  Scenario Outline: Title of your scenario outline
    Given I want to navigate to the "<url>"
    When I pass the value "<weight>" and "<height>" to the page
    Then I verify the "<extectedStatement>" as result

    Examples: 
      | url                                                            | weight | height | extectedStatement                      |
      | http://apps.qa2qe.cognizant.e-box.co.in/CompanyOffersDiscount/ |    100 |    200 | Datax shipping company offers discount |
      #| http://apps.qa2qe.cognizant.e-box.co.in/CompanyOffersDiscount/ |     80 |    500 | Datax shipping company offers discount |
      #| http://apps.qa2qe.cognizant.e-box.co.in/CompanyOffersDiscount/ |    120 |    520 | Datax shipping company offers discount |
      #| http://apps.qa2qe.cognizant.e-box.co.in/CompanyOffersDiscount/ |    300 |    200 | Datax shipping company offers discount |
