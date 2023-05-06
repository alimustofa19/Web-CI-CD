@DetailProduct
Feature: Detail product
  As a user
  I want to go detail product
  So that I can detail product

  @DetailProduct
  Scenario: As user, I can see detail product
    Given I am on the login page
    When I enter email "kesatuuser@gmail.com"
    And I enter password
    And I click login button
    And I click detail button
    Then I can see detail product

  @AssignRatings
  Scenario: As user, I can give product
    Given I am on the login page
    When I enter email "kesatuuser@gmail.com"
    And I enter password
    And I click login button
    And I click detail button
    Then I can give rating product