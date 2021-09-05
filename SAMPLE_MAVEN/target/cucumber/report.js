$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Resources/Features/RestAssuredAPI.feature");
formatter.feature({
  "line": 2,
  "name": "Verify all the opearation of the API",
  "description": "",
  "id": "verify-all-the-opearation-of-the-api",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@REST_Assured"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Verify the Get Operation of the API",
  "description": "",
  "id": "verify-all-the-opearation-of-the-api;verify-the-get-operation-of-the-api",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Get"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I want to perform Get ops for the ApI",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I get value for the address \"https://localhost:3000/address\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I validate the address has \"plano\"",
  "keyword": "Then "
});
formatter.match({
  "location": "REST_Assured.i_want_to_perform_Get_ops_for_the_ApI()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "https://localhost:3000/address",
      "offset": 29
    }
  ],
  "location": "REST_Assured.i_get_value_for_the_address(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "plano",
      "offset": 28
    }
  ],
  "location": "REST_Assured.i_validate_the_address_has(String)"
});
formatter.result({
  "status": "skipped"
});
});