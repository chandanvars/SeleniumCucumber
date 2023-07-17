Feature:  Lambda test login
# This feature file is created to explain cucumber functionality

  Background: Given Lambda test home page is opened

  @Scenario1 @taggedHook
  Scenario: Verify the login functionality
    When User enter 'test' and 'pass'
    And User click on SignUp button
    Then User should be able sign up to lambda test application

  @Scenario2
  Scenario Outline: Verify the login functionality using multiple sets
    When User enter '<username>' and '<password>'
    And User click on SignUp button
    Then User should be able sign up to lambda test application
    Examples:
      | username | password |
      | test     | pass     |
      | test1    | pass1    |

  Scenario: Datatable test
    When I enter valid data on the page
      | Fields                 | Values              |
      | First Name             | Tom                 |
      | Last Name              | Kenny               |
      | Email Address          | someone@someone.com |
      | Re-enter Email Address | someone@someone.com |
      | Password               | Password1           |
      | Birthdate              | 01                  |