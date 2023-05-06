@product
Feature: product
  As a user
  I want to go on product
  So that I can see all product

  Background:
    Given I am on the login page
    When I enter email "kesatuuser@gmail.com"
    And I enter password

  @SeeProduct
  Scenario: As user, I can see all product
    And I click login button
    Then I can see all product

  @SeeCategoryProduct
  Scenario: As user, I can see all category product
    And I click login button
    And I click icon triangle
    Then I can see category product

  @SeeProductByCategory
  Scenario: As user, I can see product by category
    And I click login button
    And I click icon triangle
    Then I can see product by category

  @addItemToCart
  Scenario: As user, Add items to cart
    And I click login button
    And I click buy button
    Then I can add item to cart