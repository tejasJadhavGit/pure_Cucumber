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
@tagLogin
Feature: User wanto log in on landing Page
  I want to use this template for my feature file
  
  #Background: User log into web Application
      #Given User opens Url and login into web application
      #When User clicks on sign in button
      #And User insert valid Credentials as <Username> and <Password>
      #And Clicks on login button
      #Then User gets logged in and lands on home page <PageTitle>
      #Examples:
        #| Username                  | Password    |PageTitle |
        #| tejasjadhav8888@gmail.com | Practice123 |Let's Shop |
  #
  
  Scenario Outline: User log into web Application with valid creds
      Given User opens Url and login into web application
      When User clicks on sign in button
      And User insert valid Credentials as <Username> and <Password>
      And Clicks on login button
      Then User gets logged in and lands on home page <PageTitle>
      Examples:
        | Username                  | Password    |PageTitle |
        | tejasjadhav8888@gmail.com | Practice123 |Let's Shop |
        
  #@tag1
  #Scenario Outline: User select item from available items
      #Given User is on homePage 
      #When User check for item <ItemName>
      #And If user finds required items
      #And User Clicks on add to cart
      #Then User validates items added to cart
      #Examples:
        #| ItemName        | 
        #| ADIDAS ORIGINAL |

 

  