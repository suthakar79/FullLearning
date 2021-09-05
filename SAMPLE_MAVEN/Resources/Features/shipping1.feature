@shippingcost
Feature: calculate shipping costs
  I want to calculate shipping costs

  Background:
  Given I want to launch Application with "http://apps.qa2qe.cognizant.e-box.co.in/CostCalculation/"
  
  @Air
  Scenario: calculate the shipping costs of Air
  	Given I want to select the Transport mode as "air"
    When I calcualte the cost of the total shipping
    Then I validate cost of the travel with the Message "Dear Customer,your total shipping cost is $100"


  @Ship
  Scenario: calculate the shipping costs of Ship
  	Given I want to select the Transport mode as "ship"
    When I calcualte the cost of the total shipping
    Then I validate cost of the travel with the Message "Dear Customer,your total shipping cost is $70"
    
  @Road
  Scenario: calculate the shipping costs of Road
  	Given I want to select the Transport mode as "road"
    When I calcualte the cost of the total shipping
    Then I validate cost of the travel with the Message "Dear Customer,your total shipping cost is $50"  