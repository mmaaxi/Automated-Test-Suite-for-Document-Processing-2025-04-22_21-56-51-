Feature: Validate generation of 'Output Slip' and storage in history

  Scenario: Successfully generate 'Output Slip' and store in request history
    Given I have completed the document upload and processing
    When the system processes the request
    Then the system should generate an 'Output Slip'
    And the original documents should be saved in the request history
    And the extracted data should be stored in the request history