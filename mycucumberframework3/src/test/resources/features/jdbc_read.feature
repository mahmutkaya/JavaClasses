@dbtest
Feature: Read Data
  Background: User connected to the database
    Given user connects to the database

  Scenario: Reading Hotel Reservations
    And user gets "Name" the "Hotel" table
    And user reads all rows in the "Name" column
    And user gets the value in row 15 in "Name" column and verifies the value is "LILLE"
    And user gets the value in row 1 in "Name" column and verifies the value is "Rodisson Demo"
    And user gets the value in row 10 in "Name" column and verifies the value is "SUNSET"