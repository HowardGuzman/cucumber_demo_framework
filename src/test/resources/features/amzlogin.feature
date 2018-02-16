@regression @amazon-login
Feature: AmzLogin feature

  Background:
    Given I am on Amazon login page

  @amazon-login-1
  Scenario: Verify Invalid Login
    When I enter howardguzman@gmail.com into username text field on login screen
    And I click on Continue button on login screen
    Then I verify error message on login page


