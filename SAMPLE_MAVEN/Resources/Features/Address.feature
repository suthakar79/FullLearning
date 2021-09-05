@address
Feature: Title of your feature
 @Add
  Scenario Outline: validate the shipping details
    Given I want to launch the application with the URL  "<URL>"
    When I enter the values for Address Book
      | Name    | contactno  | company | city  | Country | Type |
      | Shamili | 9224158877 | cts     | plano | USA     | HOME |
    And I click the Add Button
    Then I verify the Address book page displayed

    Examples: 
      | URL                                                   | 
      | https://apps.qa2qe.cognizant.e-box.co.in/AddressBook/ |  
      
@Delete
   Scenario Outline: validate the shipping details
    Given I want to launch the application with the URL  "<URL>"
    When I click the delete button from the Address Book table
    Then I verify the Address book records are deleted 
    Examples: 
      | URL                                                   | 
      | https://apps.qa2qe.cognizant.e-box.co.in/AddressBook/ |  
      
 @Edit
   Scenario Outline: validate the Edit details
    Given I want to launch the application with the URL  "<URL>"
    When I click the Editbutton from the Address Book table
    Then I verify data are populated in the table
    And I update the data "<contactname>"
    Then I verify the edited data are displayed on the Address Book Table  
    Examples: 
      | URL                                                   |contactname| 
      | https://apps.qa2qe.cognizant.e-box.co.in/AddressBook/ |   editName|    