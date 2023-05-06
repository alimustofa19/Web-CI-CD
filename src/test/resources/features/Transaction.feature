@transactions
Feature: transactions
  As a user
  I want to buy product
  So that I can detail transaction

  @transaction
  Scenario: As user, can see detail transaction
    Given I am on the login page
    When I enter email "kesatuuser@gmail.com"
    And I enter password
    And I click login button
    And I click buy button
    And I click icon cart
    And I click payment button
    Then I can see detail transactions