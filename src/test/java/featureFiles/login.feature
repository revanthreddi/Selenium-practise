# Created by rgopavarapu at 2/1/20
Feature: Automate part of Heroku app
  # Framework by revanth to publish on Git
  # Enter feature description here

  Scenario: login into Heroku app
    # Enter steps here
    Given User opens Application
    When User provide username and Password
    Then User is able to login

# Created by rgopavarapu on 02/20/2020
  Scenario: login into Heroku digestAuthentication page
    Given user opens application page
    When user switch to popup
    And User enters username and Password
    Then User is able to signin and verify that user is landed in correct page
