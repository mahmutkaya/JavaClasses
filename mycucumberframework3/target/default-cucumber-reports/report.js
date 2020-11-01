$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/jdbc_create.feature");
formatter.feature({
  "name": "Create Data",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@DBCreate"
    }
  ]
});
formatter.background({
  "name": "connecting to the database",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user connects to the application database",
  "keyword": "Given "
});
formatter.match({
  "location": "database_stepdefinition.DBUpdate_stepDefinitions.user_connects_to_the_application_database()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Creating new hotel",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@DBCreate"
    }
  ]
});
formatter.step({
  "name": "create a new hotel with the new data",
  "keyword": "And "
});
formatter.match({
  "location": "database_stepdefinition.DBCreate_stepDefinitions.create_a_new_hotel_with_the_new_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify if the hotel is created",
  "keyword": "Then "
});
formatter.match({
  "location": "database_stepdefinition.DBCreate_stepDefinitions.verify_if_the_hotel_is_created()"
});
formatter.result({
  "status": "passed"
});
});