#autor: Stiven Pineda
@stories
Feature: SwagLabs
  As a user, I want to buy several products from Swag Labs

  @scenario1
  Scenario: login
    Given Stiven wants to log in Swag Labs
    When enter the credentials
    Then Enter the main page

  @scenario2
  Scenario: Add product to the shopping cart
    Given Stiven visualizes the products
    When Select the products you want to add to the shopping cart
    Then View the shopping cart

  @scenatio3
  Scenario: Buy products
    Given Steven enters the shopping cart
    When  Complete the personal data
    When Successful purchase