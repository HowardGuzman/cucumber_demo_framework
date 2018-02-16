@regression @amazon-home
Feature: AmzHome feature

  Background:
    Given I am on Amazon home page

  @amazon-home-1
  Scenario: Verify hovering on Account and Lists link displays the menu
    When I hover over the Account and Lists link on home screen
    Then I verify Account and Lists menu is displayed


