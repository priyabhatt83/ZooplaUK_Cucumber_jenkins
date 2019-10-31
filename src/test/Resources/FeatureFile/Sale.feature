
@sale
Feature: sale functionality
  Scenario: user should able to see london property sorted in descending order

    Given user is on homepage
    And user enter location
    And user click on search button
    Then user is able to see property list
    When user select descending order to sort property
    Then user is able to see property in descending orde