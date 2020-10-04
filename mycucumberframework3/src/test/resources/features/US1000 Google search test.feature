@wip
Feature: US1000 Google search test

  Background: google home page
    Given user is on the google page

  Scenario: TC01 Verify iphone search
    And user search for "iphone"
    Then verify the result has "iphone"

  Scenario: TC02 Verify tea pot search
    And user search for "tea pot"
    Then verify the result has "tea pot"

  Scenario: TC03 Verify flower search
    And user search for "flower"
    Then verify the result has "flower"
