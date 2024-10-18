@login
Feature: Login
  Test login of orangehrmlive.com 

  @successlogin
  Scenario Outline: (Positive) Success login
    Given I navigate to login page
    When I login with username "admin" and password "Admin123"
    Then I shoud arrive at dashboard page

    Examples: 
      | username  | password | 
      | admin |     Admin123 | 
      