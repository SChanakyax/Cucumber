Feature: Login Functionality

  Scenario: Login Successful

    Given I am in the login page of the para bank application
    When I enter valid credentials
      |"samantha123"|"password123"|
    Then I should be taken to the overview page

