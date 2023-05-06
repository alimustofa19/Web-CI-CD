@login
Feature: login
  As a user
  I want to login in my account
  So that I can login with my account

  @ValidLogin
  Scenario: As user, I login with account registered
    Given I am on the login page
    When I enter email "kesatuuser@gmail.com"
    And I enter password
    And I click login button
    Then I am on the home page

  @InvisiblePasswordLogin
  Scenario: As user, I login Invisible password
    Given I am on the login page
    When I enter email "kesatuuser@gmail.com"
    And I enter password
    Then My password is invisible

  @InvalidEmail
  Scenario: As user, I login with invalid email
    Given I am on the login page
    When I enter invalid email "kesatuuser321@gmail.com"
    And I enter password
    And I click login button
    Then I see error message "record not found"

  @InvalidPassword
  Scenario: As user, I login with invalid password
    Given I am on the login page
    When I enter email "kesatuuser@gmail.com"
    And I enter invalid password
    And I click login button
    Then I see error message "email or password invalid"

  @InvalidEmailPassword
  Scenario: As user, I login with invalid email and password
    Given I am on the login page
    When I enter invalid email "kesatuuser321@gmail.com"
    And I enter invalid password
    And I click login button
    Then I see error message "record not found"
