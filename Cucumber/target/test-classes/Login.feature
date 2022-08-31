Feature: Login Functionality

  Scenario: Login Successful

    Given I am in the login page of the para bank application
    When I enter valid credentials
    Then I should be taken to the overview page