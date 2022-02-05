@nahsen
Feature: Tax Profile

   Background:
    Given User is on the login page
    And User can navigate to home page using "IntQA19" and "Me13357691."
    When User clicks the Tax Profiles

  Scenario: Create a tax profile
    Given User can navigate to  Tax Profile Page
    When User can click plus button
    And User can create a new profile
    Then User can save the new input
    And User check if there is a new profile

    Scenario: Create a new rate
      Given User can navigate to the rate page
      When User can click plus button
      And User can create a new rate
      And User can save the new input
      Then User checks if there is a new rate

  Scenario: Editing an existing Tax Profile
    Given User can navigate to the rate page
    When User can edit new changes
    And User can save the new input
    Then User checks if there is a new rate

  Scenario: Deleting an existing Tax Profile
    Given User can navigate to  Tax Profile Page
    When User can delete the profile
    Then User checks if it is deleted
