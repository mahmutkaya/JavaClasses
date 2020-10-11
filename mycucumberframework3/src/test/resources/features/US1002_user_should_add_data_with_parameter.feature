@datatablewithparams
Feature: US1002_user_should_add_data_with_parameter
  @test1
  Scenario: TC01_Testing_the_data_tables_web_page
    Given user is on the datatables page
    And user clicks on the new button
    When user enters the firstname "fake1"
    And user enters the lastname "fake2"
    And user enters the position "QA"
    When user enters the office "dll"
    When user enters the extension "123456"
    When user enters the startdate "2020-10-10"
    When user enters the salary "1234567"
    And user clicks on the create button
    And search for the first name "fake1"
    Then verify the name fields contains first name "fake1"
  @test1 @test2
  Scenario: TC02_Testing_the_data_tables_web_page
    Given user is on the datatables page
    And user clicks on the new button
    When user enters the firstname "fakename"
    And user enters the lastname "fakelast"
    And user enters the position "abc"
    When user enters the office "def"
    When user enters the extension "123"
    When user enters the startdate "2020-10-10"
    When user enters the salary "4523462"
    And user clicks on the create button
    And search for the first name "fakename"
    Then verify the name fields contains first name "fakename"
  Scenario: TC03_Testing_the_data_tables_web_page_with_feature_date
    Given user is on the datatables page
    And user clicks on the new button
    When user enters the firstname "fakename3"
    And user enters the lastname "fakelast3"
    And user enters the position "abc3"
    When user enters the office "def3"
    When user enters the extension "1233"
    When user enters the startdate "2020-10-11"
    When user enters the salary "45234623"
    And user clicks on the create button
    And search for the first name "fakename3"
    Then verify the name fields contains first name "fakename3"
  Scenario: TC04_Testing_the_data_tables_web_page_with_feature_date
    Given user is on the datatables page
    And user clicks on the new button
    When user enters the firstname "fakename4"
    And user enters the lastname "fakelast4"
    And user enters the position "abc3"
    When user enters the office "def3"
    When user enters the extension "1233"
    When user enters the startdate "2020-10-11"
    When user enters the salary "45234623"
    And user clicks on the create button
    And search for the first name "fakename4"
    Then verify the name fields contains first name "fakename4"
  Scenario: TC05_Testing_the_data_tables_web_page_with_feature_date
    Given user is on the datatables page
    And user clicks on the new button
    When user enters the firstname "fakename5"
    And user enters the lastname "fakelast5"
    And user enters the position "abc5"
    When user enters the office "def5"
    When user enters the extension "1233"
    When user enters the startdate "2020-10-11"
    When user enters the salary "45234623"
    And user clicks on the create button
    And search for the first name "fakename5"
    Then verify the name fields contains first name "fakename5"