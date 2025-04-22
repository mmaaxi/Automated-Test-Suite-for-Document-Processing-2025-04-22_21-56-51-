Feature: Validate automatic extraction of compressed files

  Scenario: Upload a compressed file and verify its contents are listed
    Given I am on the file upload page
    When I upload a compressed file containing multiple documents
    Then the system should automatically extract the file
    And list each document for validation