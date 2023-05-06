@register
Feature: register
  As a user
  I want to register
  So that I can login with my account

  @successRegister
  Scenario: As user, I register with valid credential
    Given I am on the register page
    When I input full name
    And I input email "newaccount@gmail.com"
    And I input password
    And I click register button
    Then I am direct on the login page

  @InvisiblePassword
  Scenario: As user, I register invisible password
    Given I am on the register page
    When I input full name
    And I input email "ali@gmail.com"
    And I input password
    Then Invisible password
    
  @withoutEmail
  Scenario: As user, I register without email
    Given I am on the register page
    When I input full name
    And I input password
    And I click register button
    Then I can see error message "email is required"

  @withoutFullName
  Scenario: As user, I register without FullName
    Given I am on the register page
    When I input email "ali@gmail.com"
    And I input password
    And I click register button
    Then I can see error message "fullname is required"

  @withoutPassword
  Scenario: As user, I register without password
    Given I am on the register page
    When I input full name
    And I input email "kesatuuser@gmail.com"
    And I click register button
    Then I can see error message "password is required"

  @alreadyAccount
  Scenario: As user, I register with already account
    Given I am on the register page
    When I input full name
    And I input email "kesatuuser@gmail.com"
    And I input password
    And I click register button
    Then I can see error message "duplicate key value violates unique constraint users_email_key (SQLSTATE 23505)"