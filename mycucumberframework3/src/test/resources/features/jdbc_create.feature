@DBCreate
Feature: Create Data
  Background: connecting to the database
    Given user connects to the application database

  Scenario: Creating new hotel
    And create a new hotel with the new data
    Then verify if the hotel is created