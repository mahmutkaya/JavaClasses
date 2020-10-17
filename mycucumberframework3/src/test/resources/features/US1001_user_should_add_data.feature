@datatable
Feature: US1001_user_should_add_data
  Scenario: TC01_Testing_the_data_tables_web_page
    Given user is on the datatables page
    And user clicks on the new button
    When user enters the firstname
    When user enters the lastname
    When user enters the position
    When user enters the office
    When user enters the extension
    When user enters the startdate
    When user enters the salary
    And user clicks on the create button
    And search for the first name
    Then verify the name fields contains first name
