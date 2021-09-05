Feature: Search userdetaila
  I want to use this template for my feature file

  @userSearch
  Scenario: Search userdetails
    Given I want to navigate to the url "http://apps.qa2qe.cognizant.e-box.co.in/Handling_Reg_Expression"
    When I enter username into searchbox
    And I click the search Button
    Then I validate the userdetails
      | Name    | shipmentID | phoneNumber | E-mail              |
      | Shamili | SHIP1236   |  9224158877 | shamili93@gamil.com |
