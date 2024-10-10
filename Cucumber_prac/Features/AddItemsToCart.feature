#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  Background: User is already logged in
    Given User is logged in and on landing Page

  @addingItem
  Scenario Outline: User select item from available items
    Given User is on homePage
    When User check for item <ItemName>
    And If user finds required items
    And User Clicks on add to cart
    Then User validates items added to cart

    Examples: 
      | ItemName        |
      | ADIDAS ORIGINAL |
