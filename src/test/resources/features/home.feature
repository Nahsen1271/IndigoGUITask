Feature: Homepage
  @nahsen
  Scenario: Navigating to homepage
    Given User is on the login page
    And User can navigate to home page using "IntQA19" and "Me13357691."
    And User is on the home page
    When User clicks the Tax Profiles
    Then User can navigate to  Tax Profile Page