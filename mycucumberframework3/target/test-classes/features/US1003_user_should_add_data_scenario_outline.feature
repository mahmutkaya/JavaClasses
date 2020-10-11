@scenario_outline
Feature: US1003_user_should_add_data_scenario_outline

  Scenario Outline: TC01_Testing_the_data_tables_web_page
    Given user is on the datatables page
    And user clicks on the new button
    When user enters the firstname "<firstname>"
    And user enters the lastname "<lastname>"
    And user enters the position "<position>"
    When user enters the office "<office>"
    When user enters the extension "<extension>"
    When user enters the startdate "<startdate>"
    When user enters the salary "<salary>"
    And user clicks on the create button
    And search for the first name "<firstname>"
    Then verify the name fields contains first name "<firstname>"

    Examples: test data for the data table test
      | firstname | lastname | position | office        | extension | startdate  | salary     |
      | +_jon     | sam      | doctor   | LA            | 456       | 2020-10-10 | 78900.000  |
      | ihsan     | kim      | nurse    | TX            | 899       | 2020-10-11 | 789000009  |
      | bugra     | cam      | qa       | AR            | 23462     | 2020-10-12 | 789000006  |
      | fatih     | york     | lawyer   | NY            | 5613      | 2020-10-13 | 6100000    |
      | can       | berati   | dev      | san francisco | 400       | 2020-10-14 | 10000000   |
