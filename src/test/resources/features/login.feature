Feature: : Lambda test login


 Scenario: Verify the login functionality
   Given Lambda test home page is opened
   When User enter 'username' and 'password'
   And User click on SignUp button
   Then User should be able sign up to lambda test application