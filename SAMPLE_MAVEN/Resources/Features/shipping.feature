@shipping
Feature: validate the shipping details

  Scenario Outline: validate the shipping details
    Given I want to launch the application with the URL  "<URL>"
    When I click  the "<LinkText>" in shipping table
    Then I verify the "<customerName>" shipping page

    Examples: 
      | URL                                                       | LinkText | customerName |
      | http://apps.qa2qe.cognizant.e-box.co.in/shippingDetails/  |  6543217 | Maya         |
