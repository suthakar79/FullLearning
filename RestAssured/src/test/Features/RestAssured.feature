Feature:verify the RestAssured Api usage
#  @Get
#  Scenario: verify the Get Operation of API
#    Given I want to get value of primary address
#    When I want to get primary address of the "http://localhost:3000/author/1"
#
  @Post
  Scenario:verify the POST with Body parameter
    Given I perform POST opeartion for the URL "http://localhost:3000/author"

  @PostDataTable
  Scenario:verify the POST with Body parameter
    Given  I perform POST opeartion for the URL "http://localhost:3000/author" with Datatable
      | id | title  | author5 |
      | 8  | title8 | dhanam2  |
    Then I want to print the response for the URL "http://localhost:3000/author" on the console

  @Delete
  Scenario:perform delete operation
    Given I perform delete operation for the URL "1" with Datatable
    Then I want to print the response for the URL "http://localhost:3000/author" on the console

  @put
  Scenario:perform put operation
    Given  I perform PUT opeartion for the URL "http://localhost:3000/author" with Datatable
      | id | title  | author5 |
      | 7  | title7 | dhanam7  |
    Then I want to print the response for the URL "http://localhost:3000/author" on the console

  @CRUD
  Scenario Outline: Perform CRUD Operation
    Given I want to perform Get Operation for the "<url>"
    When I perform Post opertions for the "<url>","<id>","<title>","<author6>"
    And I want to perform PUT operations for the "<url>","<id>","<title>","<author7>"
    And I delete
