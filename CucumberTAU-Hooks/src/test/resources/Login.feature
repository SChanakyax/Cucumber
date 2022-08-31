Feature: Login Functionality

  Scenario Outline: Login Successful

    Given I am in the login page of the para bank application
    When I enter valid <username> and <password>
    Then I should be taken to the overview page

    Examples:
      |username|password|
      |"samantha123"|"password123"|
